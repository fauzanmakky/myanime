package com.fauzan.myanime.presentation.anime_detail

sealed class AnimeDetailEffect {
    object NavigateBack : AnimeDetailEffect()
    data class ShowSnackbar(val message: String) : AnimeDetailEffect()
}
