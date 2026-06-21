package com.fauzan.myanime.presentation.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.fauzan.myanime.di.FavoriteEntryPoint
import com.fauzan.myanime.favorite.databinding.FragmentFavoriteBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.EntryPointAccessors
import kotlinx.coroutines.launch

class FavoriteFragment : Fragment() {

    private val viewModel: FavoriteViewModel by viewModels {
        val entryPoint = EntryPointAccessors.fromApplication(
            requireContext().applicationContext,
            FavoriteEntryPoint::class.java,
        )
        FavoriteViewModelFactory(
            entryPoint.getFavoriteAnimeUseCase(),
            entryPoint.removeFavoriteUseCase(),
        )
    }

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = checkNotNull(_binding) { "Binding is null" }

    private val adapter by lazy {
        FavoriteAdapter(
            onItemClick = { anime ->
                viewModel.processIntent(FavoriteIntent.OpenDetail(anime))
            },
            onRemoveClick = { malId ->
                viewModel.processIntent(FavoriteIntent.RemoveFavorite(malId))
            },
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        observeState()
        observeEffect()
    }

    private fun setupRecyclerView() {
        binding.rvFavorite.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            this.adapter = this@FavoriteFragment.adapter
        }
    }

    private fun observeState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.state.collect { state ->
                    binding.progressBar.isVisible = state.isLoading
                    binding.tvEmpty.isVisible = state.isEmpty && !state.isLoading
                    binding.tvError.isVisible = state.error != null && !state.isLoading
                    binding.tvError.text = state.error
                    adapter.submitList(state.favoriteList)
                }
            }
        }
    }

    private fun observeEffect() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.effect.collect { effect ->
                    when (effect) {
                        is FavoriteEffect.NavigateToDetail -> {
                            findNavController().navigate(
                                FavoriteFragmentDirections
                                    .actionFavoriteFragmentToAnimeDetailFragment(effect.anime)
                            )
                        }
                        is FavoriteEffect.ShowSnackbar -> {
                            Snackbar.make(binding.root, effect.message, Snackbar.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.rvFavorite.adapter = null
        _binding = null
    }
}
