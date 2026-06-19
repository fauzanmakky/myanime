package com.fauzan.myanime.presentation.anime_list

data class AnimeListState(
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val isEmpty: Boolean = false,
    val error: String? = null,
) {
    companion object {
        fun initial() = AnimeListState(isLoading = true)
    }
}
