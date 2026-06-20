package com.fauzan.myanime.data.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/fauzan/myanime/data/local/entity/RemoteKeysEntity;", "", "malId", "", "prevKey", "nextKey", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "getMalId", "()I", "getNextKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrevKey", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/fauzan/myanime/data/local/entity/RemoteKeysEntity;", "equals", "", "other", "hashCode", "toString", "", "core_debug"})
@androidx.room.Entity(tableName = "remote_keys")
public final class RemoteKeysEntity {
    @androidx.room.PrimaryKey()
    private final int malId = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer prevKey = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer nextKey = null;
    
    public RemoteKeysEntity(int malId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prevKey, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nextKey) {
        super();
    }
    
    public final int getMalId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrevKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNextKey() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fauzan.myanime.data.local.entity.RemoteKeysEntity copy(int malId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prevKey, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nextKey) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}