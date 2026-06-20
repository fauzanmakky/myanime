package com.fauzan.myanime.domain.usecase

import arrow.core.Either
import com.fauzan.myanime.domain.model.Anime
import com.fauzan.myanime.domain.repository.AnimeRepository
import com.fauzan.myanime.utils.Failure
import com.fauzan.myanime.utils.NoParams
import com.fauzan.myanime.utils.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTopAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository,
) : UseCase<List<Anime>, NoParams>() {

    override suspend fun invoke(params: NoParams): Flow<Either<Failure, List<Anime>>> {
        return animeRepository.getTopAnime()
    }
}
