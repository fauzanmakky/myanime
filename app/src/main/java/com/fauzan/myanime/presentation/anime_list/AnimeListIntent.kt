package com.fauzan.myanime.presentation.anime_list

import com.fauzan.myanime.domain.model.Anime

sealed class AnimeListIntent {
    data class OpenDetail(val anime: Anime) : AnimeListIntent()
}
