package com.fauzan.myanime.presentation.anime_detail

import com.fauzan.myanime.domain.model.Anime

data class AnimeDetailState(
    val anime: Anime? = null,
    val isFavorite: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
)
