package com.fauzan.myanime.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Anime(
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
