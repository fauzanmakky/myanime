package com.fauzan.myanime.presentation.anime_detail

sealed class AnimeDetailIntent {
    object AddFavorite : AnimeDetailIntent()
    object RemoveFavorite : AnimeDetailIntent()
    object NavigateBack : AnimeDetailIntent()
}
