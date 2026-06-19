package com.fauzan.myanime.utils

import arrow.core.Either
import kotlinx.coroutines.flow.Flow

abstract class UseCase<ResultType, Params> {
    abstract suspend operator fun invoke(params: Params): Flow<Either<Failure, ResultType>>
}

object NoParams
