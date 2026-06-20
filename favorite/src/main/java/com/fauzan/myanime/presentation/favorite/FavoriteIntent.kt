package com.fauzan.myanime.presentation.favorite

import com.fauzan.myanime.presentation.model.AnimeUiModel

sealed class FavoriteIntent {
    object LoadFavorites : FavoriteIntent()
    data class RemoveFavorite(val malId: Int) : FavoriteIntent()
    data class OpenDetail(val anime: AnimeUiModel) : FavoriteIntent()
}
