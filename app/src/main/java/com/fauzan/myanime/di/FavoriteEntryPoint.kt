package com.fauzan.myanime.di

import com.fauzan.myanime.domain.usecase.GetFavoriteAnimeUseCase
import com.fauzan.myanime.domain.usecase.RemoveFavoriteUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FavoriteEntryPoint {
    fun getFavoriteAnimeUseCase(): GetFavoriteAnimeUseCase
    fun removeFavoriteUseCase(): RemoveFavoriteUseCase
}
