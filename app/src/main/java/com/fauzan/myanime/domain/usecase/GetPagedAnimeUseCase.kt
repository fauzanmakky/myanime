package com.fauzan.myanime.domain.usecase

import androidx.paging.PagingData
import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.domain.repository.AnimeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPagedAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository,
) {
    operator fun invoke(): Flow<PagingData<Anime>> = animeRepository.getPagedAnime()
}
