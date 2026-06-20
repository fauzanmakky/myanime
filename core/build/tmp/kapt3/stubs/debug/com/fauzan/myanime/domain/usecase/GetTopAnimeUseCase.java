package com.fauzan.myanime.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u0004H\u0096B\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fauzan/myanime/domain/usecase/GetTopAnimeUseCase;", "Lcom/fauzan/myanime/utils/UseCase;", "", "Lcom/fauzan/myanime/domain/model/Anime;", "Lcom/fauzan/myanime/utils/NoParams;", "animeRepository", "Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "(Lcom/fauzan/myanime/domain/repository/AnimeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/fauzan/myanime/utils/Failure;", "params", "(Lcom/fauzan/myanime/utils/NoParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class GetTopAnimeUseCase extends com.fauzan.myanime.utils.UseCase<java.util.List<? extends com.fauzan.myanime.domain.model.Anime>, com.fauzan.myanime.utils.NoParams> {
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.domain.repository.AnimeRepository animeRepository = null;
    
    @javax.inject.Inject()
    public GetTopAnimeUseCase(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.repository.AnimeRepository animeRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.utils.NoParams params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends arrow.core.Either<? extends com.fauzan.myanime.utils.Failure, ? extends java.util.List<com.fauzan.myanime.domain.model.Anime>>>> $completion) {
        return null;
    }
}