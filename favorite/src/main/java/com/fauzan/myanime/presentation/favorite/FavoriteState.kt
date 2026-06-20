package com.fauzan.myanime.presentation.favorite

import com.fauzan.myanime.domain.model.Anime

data class FavoriteState(
    val favoriteList: List<Anime> = emptyList(),
    val isLoading: Boolean = true,
    val isEmpty: Boolean = false,
    val error: String? = null,
)
