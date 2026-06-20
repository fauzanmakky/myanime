package com.fauzan.myanime.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012\u0012\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u00c6\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0012H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u00c6\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00122\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R \u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b,\u0010\u0019\u00a8\u0006B"}, d2 = {"Lcom/fauzan/myanime/data/remote/dto/AnimeItemDto;", "", "malId", "", "title", "", "titleEnglish", "titleJapanese", "images", "Lcom/fauzan/myanime/data/remote/dto/ImagesDto;", "synopsis", "score", "", "rank", "popularity", "episodes", "status", "genres", "", "Lcom/fauzan/myanime/data/remote/dto/GenreDto;", "studios", "Lcom/fauzan/myanime/data/remote/dto/StudioDto;", "year", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fauzan/myanime/data/remote/dto/ImagesDto;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getEpisodes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "()Ljava/util/List;", "getImages", "()Lcom/fauzan/myanime/data/remote/dto/ImagesDto;", "getMalId", "getPopularity", "getRank", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStatus", "()Ljava/lang/String;", "getStudios", "getSynopsis", "getTitle", "getTitleEnglish", "getTitleJapanese", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fauzan/myanime/data/remote/dto/ImagesDto;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/fauzan/myanime/data/remote/dto/AnimeItemDto;", "equals", "", "other", "hashCode", "toString", "core_debug"})
public final class AnimeItemDto {
    @com.google.gson.annotations.SerializedName(value = "mal_id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer malId = null;
    @com.google.gson.annotations.SerializedName(value = "title")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @com.google.gson.annotations.SerializedName(value = "title_english")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String titleEnglish = null;
    @com.google.gson.annotations.SerializedName(value = "title_japanese")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String titleJapanese = null;
    @com.google.gson.annotations.SerializedName(value = "images")
    @org.jetbrains.annotations.Nullable()
    private final com.fauzan.myanime.data.remote.dto.ImagesDto images = null;
    @com.google.gson.annotations.SerializedName(value = "synopsis")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String synopsis = null;
    @com.google.gson.annotations.SerializedName(value = "score")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double score = null;
    @com.google.gson.annotations.SerializedName(value = "rank")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rank = null;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer popularity = null;
    @com.google.gson.annotations.SerializedName(value = "episodes")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer episodes = null;
    @com.google.gson.annotations.SerializedName(value = "status")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @com.google.gson.annotations.SerializedName(value = "genres")
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.fauzan.myanime.data.remote.dto.GenreDto> genres = null;
    @com.google.gson.annotations.SerializedName(value = "studios")
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.fauzan.myanime.data.remote.dto.StudioDto> studios = null;
    @com.google.gson.annotations.SerializedName(value = "year")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer year = null;
    
    public AnimeItemDto(@org.jetbrains.annotations.Nullable()
    java.lang.Integer malId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleEnglish, @org.jetbrains.annotations.Nullable()
    java.lang.String titleJapanese, @org.jetbrains.annotations.Nullable()
    com.fauzan.myanime.data.remote.dto.ImagesDto images, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
    java.lang.Double score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rank, @org.jetbrains.annotations.Nullable()
    java.lang.Integer popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodes, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fauzan.myanime.data.remote.dto.GenreDto> genres, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fauzan.myanime.data.remote.dto.StudioDto> studios, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMalId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleEnglish() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleJapanese() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fauzan.myanime.data.remote.dto.ImagesDto getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSynopsis() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRank() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPopularity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEpisodes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fauzan.myanime.data.remote.dto.GenreDto> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fauzan.myanime.data.remote.dto.StudioDto> getStudios() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    public AnimeItemDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fauzan.myanime.data.remote.dto.GenreDto> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fauzan.myanime.data.remote.dto.StudioDto> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fauzan.myanime.data.remote.dto.ImagesDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fauzan.myanime.data.remote.dto.AnimeItemDto copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer malId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleEnglish, @org.jetbrains.annotations.Nullable()
    java.lang.String titleJapanese, @org.jetbrains.annotations.Nullable()
    com.fauzan.myanime.data.remote.dto.ImagesDto images, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
    java.lang.Double score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rank, @org.jetbrains.annotations.Nullable()
    java.lang.Integer popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodes, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fauzan.myanime.data.remote.dto.GenreDto> genres, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fauzan.myanime.data.remote.dto.StudioDto> studios, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}