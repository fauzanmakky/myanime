package com.fauzan.myanime.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/fauzan/myanime/data/local/RemoteKeysDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteKeyById", "Lcom/fauzan/myanime/data/local/entity/RemoteKeysEntity;", "malId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "remoteKeys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
@androidx.room.Dao()
public abstract interface RemoteKeysDao {
    
    @androidx.room.Query(value = "SELECT * FROM remote_keys WHERE malId = :malId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRemoteKeyById(int malId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fauzan.myanime.data.local.entity.RemoteKeysEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fauzan.myanime.data.local.entity.RemoteKeysEntity> remoteKeys, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM remote_keys")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}