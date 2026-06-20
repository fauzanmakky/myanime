package com.fauzan.myanime.di

import com.fauzan.myanime.data.repository.AnimePagingRepository
import com.fauzan.myanime.data.repository.AnimeRepositoryImpl
import com.fauzan.myanime.domain.repository.AnimeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class BindingModule {

    @Binds
    @Singleton
    abstract fun bindAnimeRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimeRepository

    @Binds
    @Singleton
    abstract fun bindAnimePagingRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimePagingRepository
}
