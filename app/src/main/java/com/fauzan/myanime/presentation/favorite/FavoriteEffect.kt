package com.fauzan.myanime.presentation.favorite

import com.fauzan.myanime.domain.model.Anime

sealed class FavoriteEffect {
    data class NavigateToDetail(val anime: Anime) : FavoriteEffect()
    data class ShowSnackbar(val message: String) : FavoriteEffect()
}
