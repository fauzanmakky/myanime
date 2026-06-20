package com.fauzan.myanime.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fauzan.myanime.data.local.entity.FavoriteAnimeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AnimeDao {

    @Query("SELECT * FROM favorite_anime ORDER BY rank ASC")
    fun getAllFavorites(): Flow<List<FavoriteAnimeEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(anime: FavoriteAnimeEntity)

    @Query("DELETE FROM favorite_anime WHERE malId = :malId")
    suspend fun deleteFavorite(malId: Int)

    @Query("SELECT EXISTS(SELECT 1 FROM favorite_anime WHERE malId = :malId)")
    fun isFavorite(malId: Int): Flow<Boolean>
}
