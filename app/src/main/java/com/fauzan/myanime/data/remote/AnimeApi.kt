package com.fauzan.myanime.data.remote

import com.fauzan.myanime.data.remote.dto.TopAnimeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApi {

    @GET("top/anime")
    suspend fun getTopAnime(
        @Query("page") page: Int = 1,
        @Query("limit") limit: Int = 25,
    ): Response<TopAnimeResponse>
}
