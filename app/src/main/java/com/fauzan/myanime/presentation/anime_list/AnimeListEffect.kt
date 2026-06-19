package com.fauzan.myanime.presentation.anime_list

import com.fauzan.myanime.domain.model.Anime

sealed class AnimeListEffect {
    data class NavigateToDetail(val anime: Anime) : AnimeListEffect()
    data class ShowError(val message: String) : AnimeListEffect()
}
