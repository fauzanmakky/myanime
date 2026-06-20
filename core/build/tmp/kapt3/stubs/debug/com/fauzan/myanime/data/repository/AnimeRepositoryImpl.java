package com.fauzan.myanime.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u000bH\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00180\u000bH\u0016J \u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\f0\u000bH\u0016J\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/fauzan/myanime/data/repository/AnimeRepositoryImpl;", "Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "Lcom/fauzan/myanime/data/repository/AnimePagingRepository;", "animeApi", "Lcom/fauzan/myanime/data/remote/AnimeApi;", "animeDao", "Lcom/fauzan/myanime/data/local/AnimeDao;", "animeDatabase", "Lcom/fauzan/myanime/data/local/AnimeDatabase;", "(Lcom/fauzan/myanime/data/remote/AnimeApi;Lcom/fauzan/myanime/data/local/AnimeDao;Lcom/fauzan/myanime/data/local/AnimeDatabase;)V", "addFavoriteAnime", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/fauzan/myanime/utils/Failure;", "", "anime", "Lcom/fauzan/myanime/domain/model/Anime;", "checkFavoriteAnime", "", "malId", "", "getFavoriteAnime", "", "getPagedAnime", "Landroidx/paging/PagingData;", "getTopAnime", "removeFavoriteAnime", "core_debug"})
public final class AnimeRepositoryImpl implements com.fauzan.myanime.domain.repository.AnimeRepository, com.fauzan.myanime.data.repository.AnimePagingRepository {
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