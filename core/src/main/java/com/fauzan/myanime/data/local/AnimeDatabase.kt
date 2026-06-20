package com.fauzan.myanime.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fauzan.myanime.data.local.entity.AnimeEntity
import com.fauzan.myanime.data.local.entity.FavoriteAnimeEntity
import com.fauzan.myanime.data.local.entity.RemoteKeysEntity

@Database(
    entities = [FavoriteAnimeEntity::class, AnimeEntity::class, RemoteKeysEntity::class],
    version = 2,
    exportSchema = false,
)
abstract class AnimeDatabase : RoomDatabase() {
    abstract fun animeDao(): AnimeDao
    abstract fun animeTopDao(): AnimeTopDao
    abstract fun remoteKeysDao(): RemoteKeysDao
}
