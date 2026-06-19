package com.fauzan.myanime.presentation.anime_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.domain.usecase.GetPagedAnimeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
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
class AnimeListViewModel @Inject constructor(
    private val getPagedAnimeUseCase: GetPagedAnimeUseCase,
) : ViewModel() {

    val animeList: Flow<PagingData<Anime>> = getPagedAnimeUseCase()
        .cachedIn(viewModelScope)

    private val _state = MutableStateFlow(AnimeListState.initial())
    val state: StateFlow<AnimeListState> = _state.asStateFlow()

    private val _effect = MutableSharedFlow<AnimeListEffect>()
    val effect: SharedFlow<AnimeListEffect> = _effect.asSharedFlow()

    fun processIntent(intent: AnimeListIntent) {
        when (intent) {
            is AnimeListIntent.OpenDetail -> {
                viewModelScope.launch {
                    _effect.emit(AnimeListEffect.NavigateToDetail(intent.anime))
                }
            }
        }
    }

    fun setLoading(isLoading: Boolean) {
        _state.update { it.copy(isLoading = isLoading, isRefreshing = false) }
    }

    fun setRefreshing(isRefreshing: Boolean) {
        _state.update { it.copy(isRefreshing = isRefreshing, isLoading = false) }
    }

    fun setEmpty(isEmpty: Boolean) {
        _state.update { it.copy(isEmpty = isEmpty, isLoading = false, isRefreshing = false) }
    }

    fun setError(message: String) {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = false, isRefreshing = false, error = message) }
            _effect.emit(AnimeListEffect.ShowError(message))
        }
    }

    fun clearError() {
        _state.update { it.copy(error = null) }
    }
}
