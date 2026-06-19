package com.fauzan.myanime.domain.usecase

import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.domain.repository.AnimeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetFavoriteAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository,
) {
    operator fun invoke(): Flow<List<Anime>> {
        return animeRepository.getFavoriteAnime()
    }
}
