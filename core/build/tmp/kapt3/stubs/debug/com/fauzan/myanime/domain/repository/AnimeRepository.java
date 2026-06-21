package com.fauzan.myanime.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u0003H&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u0003H&J \u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u00040\u0003H&J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u0013"}, d2 = {"Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "", "addFavoriteAnime", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/fauzan/myanime/utils/Failure;", "", "anime", "Lcom/fauzan/myanime/domain/model/Anime;", "checkFavoriteAnime", "", "malId", "", "getFavoriteAnime", "", "getPagedAnime", "Landroidx/paging/PagingData;", "getTopAnime", "removeFavoriteAnime", "core_debug"})
public abstract interface AnimeRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<arrow.core.Either<com.fauzan.myanime.utils.Failure, java.util.List<com.fauzan.myanime.domain.model.Anime>>> getTopAnime();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.fauzan.myanime.domain.model.Anime>> getPagedAnime();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fauzan.myanime.domain.model.Anime>> getFavoriteAnime();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<arrow.core.Either<com.fauzan.myanime.utils.Failure, kotlin.Unit>> addFavoriteAnime(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.domain.model.Anime anime);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<arrow.core.Either<com.fauzan.myanime.utils.Failure, kotlin.Unit>> removeFavoriteAnime(int malId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkFavoriteAnime(int malId);
}