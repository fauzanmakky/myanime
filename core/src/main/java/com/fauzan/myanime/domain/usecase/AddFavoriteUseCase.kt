package com.fauzan.myanime.domain.usecase

import arrow.core.Either
import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.domain.repository.AnimeRepository
import com.fauzan.myanime.utils.Failure
import com.fauzan.myanime.utils.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddFavoriteUseCase @Inject constructor(
    private val animeRepository: AnimeRepository,
) : UseCase<Unit, Anime>() {

    override suspend fun invoke(params: Anime): Flow<Either<Failure, Unit>> {
        return animeRepository.addFavoriteAnime(params)
    }
}
