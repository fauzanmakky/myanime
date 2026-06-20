package com.fauzan.myanime.presentation.anime_detail

import com.fauzan.myanime.presentation.model.AnimeUiModel

data class AnimeDetailState(
    val anime: AnimeUiModel? = null,
    val isFavorite: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
)
