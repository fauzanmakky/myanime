package com.fauzan.myanime.data.paging

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.fauzan.myanime.data.local.AnimeDatabase
import com.fauzan.myanime.data.local.entity.AnimeEntity
import com.fauzan.myanime.data.local.entity.RemoteKeysEntity
import com.fauzan.myanime.data.mapper.toEntity
import com.fauzan.myanime.data.remote.AnimeApi

@OptIn(ExperimentalPagingApi::class)
class AnimeRemoteMediator(
    private val animeApi: AnimeApi,
    private val animeDatabase: AnimeDatabase,
) : RemoteMediator<Int, AnimeEntity>() {

    override suspend fun initialize(): InitializeAction = InitializeAction.LAUNCH_INITIAL_REFRESH

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, AnimeEntity>,
    ): MediatorResult {
        val page = when (loadType) {
            LoadType.REFRESH -> {
                val remoteKeys = getRemoteKeyClosestToCurrentPosition(state)
                remoteKeys?.nextKey?.minus(1) ?: INITIAL_PAGE_INDEX
            }
            LoadType.PREPEND -> {
                val remoteKeys = getRemoteKeyForFirstItem(state)
                    ?: return MediatorResult.Success(endOfPaginationReached = true)
                remoteKeys.prevKey ?: return MediatorResult.Success(endOfPaginationReached = true)
            }
            LoadType.APPEND -> {
                val remoteKeys = getRemoteKeyForLastItem(state)
                    ?: return MediatorResult.Success(endOfPaginationReached = true)
                remoteKeys.nextKey ?: return MediatorResult.Success(endOfPaginationReached = true)
            }
        }

        return try {
            val response = animeApi.getTopAnime(page = page, limit = state.config.pageSize)
            if (!response.isSuccessful) return MediatorResult.Error(Exception("HTTP ${response.code()}"))

            val body = response.body()
            val animeList = body?.data?.filterNotNull() ?: emptyList()
            val hasNextPage = body?.pagination?.hasNextPage ?: false
            val endOfPaginationReached = !hasNextPage

            animeDatabase.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    animeDatabase.remoteKeysDao().deleteAll()
                    animeDatabase.animeTopDao().deleteAll()
                }
                val prevKey = if (page == INITIAL_PAGE_INDEX) null else page - 1
                val nextKey = if (endOfPaginationReached) null else page + 1
                val remoteKeys = animeList.map { RemoteKeysEntity(it.malId ?: 0, prevKey, nextKey) }
                animeDatabase.remoteKeysDao().insertAll(remoteKeys)
                animeDatabase.animeTopDao().insertAll(animeList.map { it.toEntity() })
            }
            MediatorResult.Success(endOfPaginationReached = endOfPaginationReached)
        } catch (e: Exception) {
            MediatorResult.Error(e)
        }
    }

    private suspend fun getRemoteKeyClosestToCurrentPosition(
        state: PagingState<Int, AnimeEntity>,
    ): RemoteKeysEntity? {
        return state.anchorPosition?.let { position ->
            state.closestItemToPosition(position)?.malId?.let { malId ->
                animeDatabase.remoteKeysDao().getRemoteKeyById(malId)
            }
        }
    }

    private suspend fun getRemoteKeyForFirstItem(
        state: PagingState<Int, AnimeEntity>,
    ): RemoteKeysEntity? {
        return state.pages.firstOrNull { it.data.isNotEmpty() }?.data?.firstOrNull()
            ?.let { animeDatabase.remoteKeysDao().getRemoteKeyById(it.malId) }
    }

    private suspend fun getRemoteKeyForLastItem(
        state: PagingState<Int, AnimeEntity>,
    ): RemoteKeysEntity? {
        return state.pages.lastOrNull { it.data.isNotEmpty() }?.data?.lastOrNull()
            ?.let { animeDatabase.remoteKeysDao().getRemoteKeyById(it.malId) }
    }

    companion object {
        const val INITIAL_PAGE_INDEX = 1
    }
}
