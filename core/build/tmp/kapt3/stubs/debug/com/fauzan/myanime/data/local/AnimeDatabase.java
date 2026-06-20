package com.fauzan.myanime.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/fauzan/myanime/data/local/AnimeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "animeDao", "Lcom/fauzan/myanime/data/local/AnimeDao;", "animeTopDao", "Lcom/fauzan/myanime/data/local/AnimeTopDao;", "remoteKeysDao", "Lcom/fauzan/myanime/data/local/RemoteKeysDao;", "core_debug"})
@androidx.room.Database(entities = {com.fauzan.myanime.data.local.entity.FavoriteAnimeEntity.class, com.fauzan.myanime.data.local.entity.AnimeEntity.class, com.fauzan.myanime.data.local.entity.RemoteKeysEntity.class}, version = 2, exportSchema = false)
public abstract class AnimeDatabase extends androidx.room.RoomDatabase {
    
    public AnimeDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fauzan.myanime.data.local.AnimeDao animeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fauzan.myanime.data.local.AnimeTopDao animeTopDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fauzan.myanime.data.local.RemoteKeysDao remoteKeysDao();
}