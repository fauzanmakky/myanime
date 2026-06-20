package com.fauzan.myanime.domain.usecase

import com.fauzan.myanime.domain.repository.AnimeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CheckFavoriteUseCase @Inject constructor(
    private val animeRepository: AnimeRepository,
) {
    operator fun invoke(malId: Int): Flow<Boolean> {
        return animeRepository.checkFavoriteAnime(malId)
    }
}
