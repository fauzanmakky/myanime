package com.fauzan.myanime.data.mapper

import com.fauzan.myanime.data.local.entity.AnimeEntity
import com.fauzan.myanime.data.remote.dto.AnimeItemDto
import com.fauzan.myanime.domain.model.Anime

fun AnimeItemDto.toDomain() = Anime(
    malId = malId ?: 0,
    title = title ?: "",
    titleJapanese = titleJapanese,
    titleEnglish = titleEnglish,
    imageUrl = images?.jpg?.largeImageUrl ?: images?.jpg?.imageUrl,
    synopsis = synopsis,
    score = score,
    rank = rank,
    popularity = popularity,
    episodes = episodes,
    status = status,
    genres = genres?.mapNotNull { it?.name } ?: emptyList(),
    studios = studios?.mapNotNull { it?.name } ?: emptyList(),
    year = year,
)

fun AnimeItemDto.toEntity() = AnimeEntity(
    malId = malId ?: 0,
    title = title ?: "",
    titleJapanese = titleJapanese,
    titleEnglish = titleEnglish,
    imageUrl = images?.jpg?.largeImageUrl ?: images?.jpg?.imageUrl,
    synopsis = synopsis,
    score = score,
    rank = rank,
    popularity = popularity,
    episodes = episodes,
    status = status,
    genres = genres?.mapNotNull { it?.name }?.joinToString(",") ?: "",
    studios = studios?.mapNotNull { it?.name }?.joinToString(",") ?: "",
    year = year,
)
