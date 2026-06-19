package com.fauzan.myanime.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fauzan.myanime.domain.model.Anime

@Entity(tableName = "favorite_anime")
data class FavoriteAnimeEntity(
    @PrimaryKey
    val malId: Int,
    val title: String,
    val titleJapanese: String?,
    val titleEnglish: String?,
    val imageUrl: String?,
    val synopsis: String?,
    val score: Double?,
    val rank: Int?,
    val popularity: Int?,
    val episodes: Int?,
    val status: String?,
    val genres: String,
    val studios: String,
    val year: Int?,
)

fun FavoriteAnimeEntity.toDomain() = Anime(
    malId = malId,
    title = title,
    titleJapanese = titleJapanese,
    titleEnglish = titleEnglish,
    imageUrl = imageUrl,
    synopsis = synopsis,
    score = score,
    rank = rank,
    popularity = popularity,
    episodes = episodes,
    status = status,
    genres = if (genres.isBlank()) emptyList() else genres.split(","),
    studios = if (studios.isBlank()) emptyList() else studios.split(","),
    year = year,
)

fun Anime.toEntity() = FavoriteAnimeEntity(
    malId = malId,
    title = title,
    titleJapanese = titleJapanese,
    titleEnglish = titleEnglish,
    imageUrl = imageUrl,
    synopsis = synopsis,
    score = score,
    rank = rank,
    popularity = popularity,
    episodes = episodes,
    status = status,
    genres = genres.joinToString(","),
    studios = studios.joinToString(","),
    year = year,
)
