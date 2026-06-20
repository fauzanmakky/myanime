package com.fauzan.myanime.presentation.anime_list

import com.fauzan.myanime.presentation.model.AnimeUiModel

sealed class AnimeListIntent {
    data class OpenDetail(val anime: AnimeUiModel) : AnimeListIntent()
}
