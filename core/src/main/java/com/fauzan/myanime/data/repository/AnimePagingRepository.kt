package com.fauzan.myanime.data.repository

import androidx.paging.PagingData
import com.fauzan.myanime.domain.model.Anime
import kotlinx.coroutines.flow.Flow

interface AnimePagingRepository {
    fun getPagedAnime(): Flow<PagingData<Anime>>
}
