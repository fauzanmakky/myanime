package com.fauzan.myanime.presentation.favorite

import com.fauzan.myanime.presentation.model.AnimeUiModel

sealed class FavoriteEffect {
    data class NavigateToDetail(val anime: AnimeUiModel) : FavoriteEffect()
    data class ShowSnackbar(val message: String) : FavoriteEffect()
}
