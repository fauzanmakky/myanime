package com.fauzan.myanime.presentation.favorite;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/fauzan/myanime/presentation/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "getFavoriteAnimeUseCase", "Lcom/fauzan/myanime/domain/usecase/GetFavoriteAnimeUseCase;", "removeFavoriteUseCase", "Lcom/fauzan/myanime/domain/usecase/RemoveFavoriteUseCase;", "(Lcom/fauzan/myanime/domain/usecase/GetFavoriteAnimeUseCase;Lcom/fauzan/myanime/domain/usecase/RemoveFavoriteUseCase;)V", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteEffect;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteState;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadFavorites", "", "processIntent", "intent", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent;", "removeFavorite", "malId", "", "favorite_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.domain.usecase.GetFavoriteAnimeUseCase getFavoriteAnimeUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.domain.usecase.RemoveFavoriteUseCase removeFavoriteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.fauzan.myanime.presentation.favorite.FavoriteState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.fauzan.myanime.presentation.favorite.FavoriteState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.fauzan.myanime.presentation.favorite.FavoriteEffect> _effect = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.fauzan.myanime.presentation.favorite.FavoriteEffect> effect = null;
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.usecase.GetFavoriteAnimeUseCase getFavoriteAnimeUseCase, @org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.usecase.RemoveFavoriteUseCase removeFavoriteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.fauzan.myanime.presentation.favorite.FavoriteState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.fauzan.myanime.presentation.favorite.FavoriteEffect> getEffect() {
        return null;
    }
    
    public final void processIntent(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.presentation.favorite.FavoriteIntent intent) {
    }
    
    private final void loadFavorites() {
    }
    
    private final void removeFavorite(int malId) {
    }
}