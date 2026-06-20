package com.fauzan.myanime.domain.repository

import androidx.paging.PagingData
import arrow.core.Either
import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.utils.Failure
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun getTopAnime(): Flow<Either<Failure, List<Anime>>>
    fun getPagedAnime(): Flow<PagingData<Anime>>
    fun getFavoriteAnime(): Flow<List<Anime>>
    fun addFavoriteAnime(anime: Anime): Flow<Either<Failure, Unit>>
    fun removeFavoriteAnime(malId: Int): Flow<Either<Failure, Unit>>
    fun checkFavoriteAnime(malId: Int): Flow<Boolean>
}
