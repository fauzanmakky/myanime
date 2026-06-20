package com.fauzan.myanime.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096B\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fauzan/myanime/domain/usecase/AddFavoriteUseCase;", "Lcom/fauzan/myanime/utils/UseCase;", "", "Lcom/fauzan/myanime/domain/model/Anime;", "animeRepository", "Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "(Lcom/fauzan/myanime/domain/repository/AnimeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/fauzan/myanime/utils/Failure;", "params", "(Lcom/fauzan/myanime/domain/model/Anime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class AddFavoriteUseCase extends com.fauzan.myanime.utils.UseCase<kotlin.Unit, com.fauzan.myanime.domain.model.Anime> {
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.domain.repository.AnimeRepository animeRepository = null;
    
    @javax.inject.Inject()
    public AddFavoriteUseCase(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.repository.AnimeRepository animeRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.model.Anime params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends arrow.core.Either<? extends com.fauzan.myanime.utils.Failure, kotlin.Unit>>> $completion) {
        return null;
    }
}