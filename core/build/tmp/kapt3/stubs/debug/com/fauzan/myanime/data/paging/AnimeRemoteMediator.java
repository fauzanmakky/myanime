package com.fauzan.myanime.data.paging;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0082@\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0082@\u00a2\u0006\u0002\u0010\rJ$\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0082@\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0096@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/fauzan/myanime/data/paging/AnimeRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/fauzan/myanime/data/local/entity/AnimeEntity;", "animeApi", "Lcom/fauzan/myanime/data/remote/AnimeApi;", "animeDatabase", "Lcom/fauzan/myanime/data/local/AnimeDatabase;", "(Lcom/fauzan/myanime/data/remote/AnimeApi;Lcom/fauzan/myanime/data/local/AnimeDatabase;)V", "getRemoteKeyClosestToCurrentPosition", "Lcom/fauzan/myanime/data/local/entity/RemoteKeysEntity;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteKeyForFirstItem", "getRemoteKeyForLastItem", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core_debug"})
@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
public final class AnimeRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.fauzan.myanime.data.local.entity.AnimeEntity> {
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.data.remote.AnimeApi animeApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fauzan.myanime.data.local.AnimeDatabase animeDatabase = null;
    public static final int INITIAL_PAGE_INDEX = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.fauzan.myanime.data.paging.AnimeRemoteMediator.Companion Companion = null;
    
    public AnimeRemoteMediator(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.remote.AnimeApi animeApi, @org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.local.AnimeDatabase animeDatabase) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object initialize(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.fauzan.myanime.data.local.entity.AnimeEntity> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> $completion) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyClosestToCurrentPosition(androidx.paging.PagingState<java.lang.Integer, com.fauzan.myanime.data.local.entity.AnimeEntity> state, kotlin.coroutines.Continuation<? super com.fauzan.myanime.data.local.entity.RemoteKeysEntity> $completion) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyForFirstItem(androidx.paging.PagingState<java.lang.Integer, com.fauzan.myanime.data.local.entity.AnimeEntity> state, kotlin.coroutines.Continuation<? super com.fauzan.myanime.data.local.entity.RemoteKeysEntity> $completion) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyForLastItem(androidx.paging.PagingState<java.lang.Integer, com.fauzan.myanime.data.local.entity.AnimeEntity> state, kotlin.coroutines.Continuation<? super com.fauzan.myanime.data.local.entity.RemoteKeysEntity> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/fauzan/myanime/data/paging/AnimeRemoteMediator$Companion;", "", "()V", "INITIAL_PAGE_INDEX", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}