package com.fauzan.myanime.domain.usecase

import arrow.core.Either
import com.fauzan.myanime.domain.repository.AnimeRepository
import com.fauzan.myanime.utils.Failure
import com.fauzan.myanime.utils.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoveFavoriteUseCase @Inject constructor(
    private val animeRepository: AnimeRepository,
) : UseCase<Unit, Int>() {

    override suspend fun invoke(params: Int): Flow<Either<Failure, Unit>> {
        return animeRepository.removeFavoriteAnime(params)
    }
}
