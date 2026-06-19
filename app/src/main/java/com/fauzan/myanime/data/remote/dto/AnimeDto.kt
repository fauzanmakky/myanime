package com.fauzan.myanime.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TopAnimeResponse(
    @field:SerializedName("data")
    val data: List<AnimeItemDto?>? = null,

    @field:SerializedName("pagination")
    val pagination: PaginationDto? = null,
)

data class PaginationDto(
    @field:SerializedName("has_next_page")
    val hasNextPage: Boolean? = null,

    @field:SerializedName("current_page")
    val currentPage: Int? = null,
)

data class AnimeItemDto(
    @field:SerializedName("mal_id")
    val malId: Int? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("title_english")
    val titleEnglish: String? = null,

    @field:SerializedName("title_japanese")
    val titleJapanese: String? = null,

    @field:SerializedName("images")
    val images: ImagesDto? = null,

    @field:SerializedName("synopsis")
    val synopsis: String? = null,

    @field:SerializedName("score")
    val score: Double? = null,

    @field:SerializedName("rank")
    val rank: Int? = null,

    @field:SerializedName("popularity")
    val popularity: Int? = null,

    @field:SerializedName("episodes")
    val episodes: Int? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("genres")
    val genres: List<GenreDto?>? = null,

    @field:SerializedName("studios")
    val studios: List<StudioDto?>? = null,

    @field:SerializedName("year")
    val year: Int? = null,
)

data class ImagesDto(
    @field:SerializedName("jpg")
    val jpg: ImageUrlDto? = null,

    @field:SerializedName("webp")
    val webp: ImageUrlDto? = null,
)

data class ImageUrlDto(
    @field:SerializedName("image_url")
    val imageUrl: String? = null,

    @field:SerializedName("large_image_url")
    val largeImageUrl: String? = null,
)

data class GenreDto(
    @field:SerializedName("mal_id")
    val malId: Int? = null,

    @field:SerializedName("name")
    val name: String? = null,
)

data class StudioDto(
    @field:SerializedName("mal_id")
    val malId: Int? = null,

    @field:SerializedName("name")
    val name: String? = null,
)
