package com.fauzan.myanime.presentation.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fauzan.myanime.domain.usecase.GetFavoriteAnimeUseCase
import com.fauzan.myanime.domain.usecase.RemoveFavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val getFavoriteAnimeUseCase: GetFavoriteAnimeUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(FavoriteState())
    val state: StateFlow<FavoriteState> = _state.asStateFlow()

    private val _effect = MutableSharedFlow<FavoriteEffect>()
    val effect: SharedFlow<FavoriteEffect> = _effect.asSharedFlow()

    init {
        processIntent(FavoriteIntent.LoadFavorites)
    }

    fun processIntent(intent: FavoriteIntent) {
        when (intent) {
            is FavoriteIntent.LoadFavorites -> loadFavorites()
            is FavoriteIntent.RemoveFavorite -> removeFavorite(intent.malId)
            is FavoriteIntent.OpenDetail -> {
                viewModelScope.launch {
                    _effect.emit(FavoriteEffect.NavigateToDetail(intent.anime))
                }
            }
        }
    }

    private fun loadFavorites() {
        viewModelScope.launch {
            try {
                getFavoriteAnimeUseCase().collect { animeList ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            favoriteList = animeList,
                            isEmpty = animeList.isEmpty(),
                            error = null,
                        )
                    }
                }
            } catch (e: Exception) {
                _state.update {
                    it.copy(isLoading = false, error = e.message ?: "Terjadi kesalahan")
                }
            }
        }
    }

    private fun removeFavorite(malId: Int) {
        viewModelScope.launch {
            removeFavoriteUseCase(malId).collect { either ->
                either.fold(
                    { _effect.emit(FavoriteEffect.ShowSnackbar("Gagal menghapus favorit")) },
                    { _effect.emit(FavoriteEffect.ShowSnackbar("Anime dihapus dari favorit")) },
                )
            }
        }
    }
}
