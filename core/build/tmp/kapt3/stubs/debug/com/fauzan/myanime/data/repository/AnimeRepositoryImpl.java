package com.fauzan.myanime.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\nH\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\nH\u0016J \u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\u000b0\nH\u0016J\"\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/fauzan/myanime/data/repository/AnimeRepositoryImpl;", "Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "animeApi", "Lcom/fauzan/myanime/data/remote/AnimeApi;", "animeDao", "Lcom/fauzan/myanime/data/local/AnimeDao;", "animeDatabase", "Lcom/fauzan/myanime/data/local/AnimeDatabase;", "(Lcom/fauzan/myanime/data/remote/AnimeApi;Lcom/fauzan/myanime/data/local/AnimeDao;Lcom/fauzan/myanime/data/local/AnimeDatabase;)V", "addFavoriteAnime", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/fauzan/myanime/utils/Failure;", "", "anime", "Lcom/fauzan/myanime/domain/model/Anime;", "checkFavoriteAnime", "", "malId", "", "getFavoriteAnime", "", "getPagedAnime", "Landroidx/paging/PagingData;", "getTopAnime", "removeFavoriteAnime", "core_debug"})
public final class AnimeRepositoryImpl implements com.fauzan.myanime.domain.repository.AnimeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.data.remote.AnimeApi animeApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.data.local.AnimeDao animeDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.data.local.AnimeDatabase animeDatabase = null;
    
    @javax.inject.Inject()
    public AnimeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.remote.AnimeApi animeApi, @org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.local.AnimeDao animeDao, @org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.local.AnimeDatabase animeDatabase) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<arrow.core.Either<com.fauzan.myanime.utils.Failure, java.util.List<com.fauzan.myanime.domain.model.Anime>>> getTopAnime() {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.fauzan.myanime.domain.model.Anime>> getPagedAnime() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.fauzan.myanime.domain.model.Anime>> getFavoriteAnime() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<arrow.core.Either<com.fauzan.myanime.utils.Failure, kotlin.Unit>> addFavoriteAnime(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.model.Anime anime) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<arrow.core.Either<com.fauzan.myanime.utils.Failure, kotlin.Unit>> removeFavoriteAnime(int malId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkFavoriteAnime(int malId) {
        return null;
    }
}