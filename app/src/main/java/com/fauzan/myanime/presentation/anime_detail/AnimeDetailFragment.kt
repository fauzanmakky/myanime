package com.fauzan.myanime.presentation.anime_detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import coil.load
import com.fauzan.myanime.R
import com.fauzan.myanime.databinding.FragmentAnimeDetailBinding
import com.fauzan.myanime.domain.model.Anime
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AnimeDetailFragment : Fragment() {

    private val viewModel: AnimeDetailViewModel by viewModels()
    private var _binding: FragmentAnimeDetailBinding? = null
    private val binding get() = checkNotNull(_binding) { "Binding is null" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAnimeDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        observeState()
        observeEffect()
    }

    private fun setupToolbar() {
        binding.toolbar.setNavigationOnClickListener {
            viewModel.processIntent(AnimeDetailIntent.NavigateBack)
        }
    }

    private fun observeState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.state.collect { state ->
                    state.anime?.let { bindAnime(it) }
                    updateFavoriteButton(state.isFavorite)
                }
            }
        }
    }

    private fun observeEffect() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.effect.collect { effect ->
                    when (effect) {
                        is AnimeDetailEffect.NavigateBack -> findNavController().navigateUp()
                        is AnimeDetailEffect.ShowSnackbar -> {
                            Snackbar.make(binding.root, effect.message, Snackbar.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    private fun bindAnime(anime: Anime) {
        with(binding) {
            ivPoster.load(anime.imageUrl) {
                crossfade(true)
                placeholder(R.drawable.ic_launcher_foreground)
            }
            tvTitle.text = anime.title
            tvTitleJapanese.text = anime.titleJapanese ?: "-"
            tvSynopsis.text = anime.synopsis ?: getString(R.string.no_synopsis)
            tvScore.text = getString(R.string.score_format, anime.score ?: 0.0)
            tvRank.text = getString(R.string.rank_format, anime.rank ?: 0)
            tvPopularity.text = getString(R.string.popularity_format, anime.popularity ?: 0)
            tvEpisodes.text = getString(R.string.episodes_format, anime.episodes?.toString() ?: "?")
            tvStatus.text = anime.status ?: "-"
            tvGenres.text = if (anime.genres.isNotEmpty()) anime.genres.joinToString(", ") else "-"
            tvStudios.text = if (anime.studios.isNotEmpty()) anime.studios.joinToString(", ") else "-"
            tvYear.text = anime.year?.toString() ?: "-"
        }
    }

    private fun updateFavoriteButton(isFavorite: Boolean) {
        if (isFavorite) {
            binding.fabFavorite.setImageResource(R.drawable.ic_favorite_filled)
            binding.fabFavorite.setOnClickListener {
                viewModel.processIntent(AnimeDetailIntent.RemoveFavorite)
            }
        } else {
            binding.fabFavorite.setImageResource(R.drawable.ic_favorite_outline)
            binding.fabFavorite.setOnClickListener {
                viewModel.processIntent(AnimeDetailIntent.AddFavorite)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
