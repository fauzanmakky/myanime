package com.fauzan.myanime.presentation.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fauzan.myanime.domain.usecase.GetFavoriteAnimeUseCase
import com.fauzan.myanime.domain.usecase.RemoveFavoriteUseCase

class FavoriteViewModelFactory(
    private val getFavoriteAnimeUseCase: GetFavoriteAnimeUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FavoriteViewModel(getFavoriteAnimeUseCase, removeFavoriteUseCase) as T
    }
}
