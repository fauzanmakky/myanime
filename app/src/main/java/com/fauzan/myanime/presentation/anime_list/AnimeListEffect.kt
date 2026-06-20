package com.fauzan.myanime.presentation.anime_list

import com.fauzan.myanime.presentation.model.AnimeUiModel

sealed class AnimeListEffect {
    data class NavigateToDetail(val anime: AnimeUiModel) : AnimeListEffect()
    data class ShowError(val message: String) : AnimeListEffect()
}
