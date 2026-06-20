package com.fauzan.myanime.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import arrow.core.Either
import com.fauzan.myanime.data.local.AnimeDao
import com.fauzan.myanime.data.local.AnimeDatabase
import com.fauzan.myanime.data.local.entity.toDomain
import com.fauzan.myanime.data.local.entity.toEntity
import com.fauzan.myanime.data.mapper.toDomain
import com.fauzan.myanime.data.paging.AnimeRemoteMediator
import com.fauzan.myanime.data.remote.AnimeApi
import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.domain.repository.AnimeRepository
import com.fauzan.myanime.utils.Failure
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApi: AnimeApi,
    private val animeDao: AnimeDao,
    private val animeDatabase: AnimeDatabase,
) : AnimeRepository, AnimePagingRepository {

    override fun getTopAnime(): Flow<Either<Failure, List<Anime>>> = flow {
        try {
            val response = animeApi.getTopAnime()
            if (response.isSuccessful) {
                val animeList = response.body()?.data
                    ?.mapNotNull { it?.toDomain() }
                    ?: emptyList()
                emit(Either.Right(animeList))
            } else {
                emit(Either.Left(Failure.NetworkFailure("Gagal memuat data: ${response.code()}")))
            }
        } catch (e: Exception) {
            emit(Either.Left(Failure.UnexpectedFailure(e.message)))
        }
    }

    @OptIn(ExperimentalPagingApi::class)
    override fun getPagedAnime(): Flow<PagingData<Anime>> {
        return Pager(
            config = PagingConfig(pageSize = 25, enablePlaceholders = false),
            remoteMediator = AnimeRemoteMediator(animeApi, animeDatabase),
            pagingSourceFactory = { animeDatabase.animeTopDao().getAllAnime() },
        ).flow.map { pagingData -> pagingData.map { it.toDomain() } }
    }

    override fun getFavoriteAnime(): Flow<List<Anime>> {
        return animeDao.getAllFavorites().map { entities -> entities.map { it.toDomain() } }
    }

    override fun addFavoriteAnime(anime: Anime): Flow<Either<Failure, Unit>> = flow {
        try {
            animeDao.insertFavorite(anime.toEntity())
            emit(Either.Right(Unit))
        } catch (e: Exception) {
            emit(Either.Left(Failure.UnexpectedFailure(e.message)))
        }
    }

    override fun removeFavoriteAnime(malId: Int): Flow<Either<Failure, Unit>> = flow {
        try {
            animeDao.deleteFavorite(malId)
            emit(Either.Right(Unit))
        } catch (e: Exception) {
            emit(Either.Left(Failure.UnexpectedFailure(e.message)))
        }
    }

    override fun checkFavoriteAnime(malId: Int): Flow<Boolean> {
        return animeDao.isFavorite(malId)
    }
}
