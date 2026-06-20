package com.fauzan.myanime.presentation.model

import android.os.Parcelable
import com.fauzan.myanime.domain.model.Anime
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimeUiModel(
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
    val genres: List<String>,
    val studios: List<String>,
    val year: Int?,
) : Parcelable

fun Anime.toUiModel() = AnimeUiModel(
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
    genres = genres,
    studios = studios,
    year = year,
)

fun AnimeUiModel.toDomain() = Anime(
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
    genres = genres,
    studios = studios,
    year = year,
)
