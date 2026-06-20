package com.fauzan.myanime.presentation.favorite

import com.fauzan.myanime.presentation.model.AnimeUiModel

data class FavoriteState(
    val favoriteList: List<AnimeUiModel> = emptyList(),
    val isLoading: Boolean = true,
    val isEmpty: Boolean = false,
    val error: String? = null,
)
