package com.fauzan.myanime.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fauzan.myanime.data.local.entity.AnimeEntity

@Dao
interface AnimeTopDao {

    @Query("SELECT * FROM anime_cache ORDER BY rank ASC")
    fun getAllAnime(): PagingSource<Int, AnimeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(animeList: List<AnimeEntity>)

    @Query("DELETE FROM anime_cache")
    suspend fun deleteAll()
}
