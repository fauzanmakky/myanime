package com.fauzan.myanime.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u00ba\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b)\u0010\u0016\u00a8\u0006?"}, d2 = {"Lcom/fauzan/myanime/domain/model/Anime;", "", "malId", "", "title", "", "titleJapanese", "titleEnglish", "imageUrl", "synopsis", "score", "", "rank", "popularity", "episodes", "status", "genres", "", "studios", "year", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getEpisodes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "()Ljava/util/List;", "getImageUrl", "()Ljava/lang/String;", "getMalId", "()I", "getPopularity", "getRank", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStatus", "getStudios", "getSynopsis", "getTitle", "getTitleEnglish", "getTitleJapanese", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/fauzan/myanime/domain/model/Anime;", "equals", "", "other", "hashCode", "toString", "core_debug"})
public final class Anime {
    private final int malId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String titleJapanese = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String titleEnglish = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String synopsis = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rank = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer popularity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer episodes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> genres = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> studios = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer year = null;
    
    public Anime(int malId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleJapanese, @org.jetbrains.annotations.Nullable()
    java.lang.String titleEnglish, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
    java.lang.Double score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rank, @org.jetbrains.annotations.Nullable()
    java.lang.Integer popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodes, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> studios, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year) {
        super();
    }
    
    public final int getMalId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleJapanese() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleEnglish() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getStudios() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    public final java.lang.String component5() {
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
    public final com.fauzan.myanime.domain.model.Anime copy(int malId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleJapanese, @org.jetbrains.annotations.Nullable()
    java.lang.String titleEnglish, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
    java.lang.Double score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rank, @org.jetbrains.annotations.Nullable()
    java.lang.Integer popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodes, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> studios, @org.jetbrains.annotations.Nullable()
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