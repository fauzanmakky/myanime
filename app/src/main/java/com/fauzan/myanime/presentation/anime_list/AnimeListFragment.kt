package com.fauzan.myanime.presentation.anime_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.fauzan.myanime.databinding.FragmentAnimeListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AnimeListFragment : Fragment() {

    private val viewModel: AnimeListViewModel by viewModels()
    private var _binding: FragmentAnimeListBinding? = null
    private val binding get() = checkNotNull(_binding) { "Binding is null" }

    private val adapter by lazy {
        AnimeAdapter { anime ->
            viewModel.processIntent(AnimeListIntent.OpenDetail(anime))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAnimeListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupSwipeRefresh()
        observePagingData()
        observeLoadState()
        observeState()
        observeEffect()
    }

    private fun setupRecyclerView() {
        binding.rvAnime.apply {
            layoutManager = LinearLayoutManager(requireContext())
            this.adapter = this@AnimeListFragment.adapter.withLoadStateFooter(
                footer = AnimeLoadStateAdapter { this@AnimeListFragment.adapter.retry() }
            )
        }
    }

    private fun setupSwipeRefresh() {
        binding.swipeRefresh.setOnRefreshListener {
            adapter.refresh()
        }
    }

    private fun observePagingData() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.animeList.collectLatest { pagingData ->
                    adapter.submitData(pagingData)
                }
            }
        }
    }

    private fun observeLoadState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                adapter.loadStateFlow.collectLatest { loadState ->
                    val refresh = loadState.refresh
                    val append = loadState.append
                    val isLoading = refresh is LoadState.Loading && adapter.itemCount == 0
                    val isRefreshing = refresh is LoadState.Loading && adapter.itemCount > 0

                    viewModel.setLoading(isLoading)
                    viewModel.setRefreshing(isRefreshing)

                    if (refresh is LoadState.NotLoading) {
                        viewModel.setEmpty(adapter.itemCount == 0)
                        viewModel.clearError()
                    }

                    if (refresh is LoadState.Error) {
                        val message = refresh.error.localizedMessage ?: "Terjadi kesalahan"
                        viewModel.setError(message)
                    }

                    if (append is LoadState.Error) {
                        val message = append.error.localizedMessage ?: "Gagal memuat halaman berikutnya"
                        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun observeState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.state.collect { state ->
                    binding.progressBar.isVisible = state.isLoading
                    binding.swipeRefresh.isRefreshing = state.isRefreshing
                    binding.tvEmpty.isVisible = state.isEmpty
                    binding.tvError.isVisible = state.error != null && !state.isLoading
                    binding.tvError.text = state.error
                }
            }
        }
    }

    private fun observeEffect() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.effect.collect { effect ->
                    when (effect) {
                        is AnimeListEffect.NavigateToDetail -> {
                            findNavController().navigate(
                                AnimeListFragmentDirections
                                    .actionAnimeListFragmentToAnimeDetailFragment(effect.anime)
                            )
                        }
                        is AnimeListEffect.ShowError -> {
                            Toast.makeText(requireContext(), effect.message, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
