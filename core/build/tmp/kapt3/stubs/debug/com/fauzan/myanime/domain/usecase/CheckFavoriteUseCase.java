package com.fauzan.myanime.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fauzan/myanime/domain/usecase/CheckFavoriteUseCase;", "", "animeRepository", "Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "(Lcom/fauzan/myanime/domain/repository/AnimeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "malId", "", "core_debug"})
public final class CheckFavoriteUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.domain.repository.AnimeRepository animeRepository = null;
    
    @javax.inject.Inject()
    public CheckFavoriteUseCase(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.repository.AnimeRepository animeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> invoke(int malId) {
        return null;
    }
}