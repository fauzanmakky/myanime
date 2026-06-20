package com.fauzan.myanime.presentation.anime_detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fauzan.myanime.domain.usecase.AddFavoriteUseCase
import com.fauzan.myanime.domain.usecase.CheckFavoriteUseCase
import com.fauzan.myanime.domain.usecase.RemoveFavoriteUseCase
import com.fauzan.myanime.presentation.model.AnimeUiModel
import com.fauzan.myanime.presentation.model.toDomain
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
class AnimeDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val addFavoriteUseCase: AddFavoriteUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
    private val checkFavoriteUseCase: CheckFavoriteUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(AnimeDetailState())
    val state: StateFlow<AnimeDetailState> = _state.asStateFlow()

    private val _effect = MutableSharedFlow<AnimeDetailEffect>()
    val effect: SharedFlow<AnimeDetailEffect> = _effect.asSharedFlow()

    init {
        val anime: AnimeUiModel? = savedStateHandle["anime"]
        anime?.let {
            _state.update { state -> state.copy(anime = it) }
            observeFavoriteStatus(it.malId)
        }
    }

    fun processIntent(intent: AnimeDetailIntent) {
        when (intent) {
            is AnimeDetailIntent.AddFavorite -> addFavorite()
            is AnimeDetailIntent.RemoveFavorite -> removeFavorite()
            is AnimeDetailIntent.NavigateBack -> {
                viewModelScope.launch { _effect.emit(AnimeDetailEffect.NavigateBack) }
            }
        }
    }

    private fun observeFavoriteStatus(malId: Int) {
        viewModelScope.launch {
            checkFavoriteUseCase(malId).collect { isFav ->
                _state.update { it.copy(isFavorite = isFav) }
            }
        }
    }

    private fun addFavorite() {
        val anime = _state.value.anime?.toDomain() ?: return
        viewModelScope.launch {
            addFavoriteUseCase(anime).collect { either ->
                either.fold(
                    { _effect.emit(AnimeDetailEffect.ShowSnackbar("Gagal menambahkan favorit")) },
                    { _effect.emit(AnimeDetailEffect.ShowSnackbar("${anime.title} ditambahkan ke favorit")) },
                )
            }
        }
    }

    private fun removeFavorite() {
        val anime = _state.value.anime?.toDomain() ?: return
        viewModelScope.launch {
            removeFavoriteUseCase(anime.malId).collect { either ->
                either.fold(
                    { _effect.emit(AnimeDetailEffect.ShowSnackbar("Gagal menghapus favorit")) },
                    { _effect.emit(AnimeDetailEffect.ShowSnackbar("${anime.title} dihapus dari favorit")) },
                )
            }
        }
    }
}
