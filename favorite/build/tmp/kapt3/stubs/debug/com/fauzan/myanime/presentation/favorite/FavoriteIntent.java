package com.fauzan.myanime.presentation.favorite;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent;", "", "()V", "LoadFavorites", "OpenDetail", "RemoveFavorite", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent$LoadFavorites;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent$OpenDetail;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent$RemoveFavorite;", "favorite_debug"})
public abstract class FavoriteIntent {
    
    private FavoriteIntent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent$LoadFavorites;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent;", "()V", "favorite_debug"})
    public static final class LoadFavorites extends com.fauzan.myanime.presentation.favorite.FavoriteIntent {
        @org.jetbrains.annotations.NotNull()
        public static final com.fauzan.myanime.presentation.favorite.FavoriteIntent.LoadFavorites INSTANCE = null;
        
        private LoadFavorites() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent$OpenDetail;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent;", "anime", "Lcom/fauzan/myanime/presentation/model/AnimeUiModel;", "(Lcom/fauzan/myanime/presentation/model/AnimeUiModel;)V", "getAnime", "()Lcom/fauzan/myanime/presentation/model/AnimeUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "favorite_debug"})
    public static final class OpenDetail extends com.fauzan.myanime.presentation.favorite.FavoriteIntent {
        @org.jetbrains.annotations.NotNull()
        private final com.fauzan.myanime.presentation.model.AnimeUiModel anime = null;
        
        public OpenDetail(@org.jetbrains.annotations.NotNull()
        com.fauzan.myanime.presentation.model.AnimeUiModel anime) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fauzan.myanime.presentation.model.AnimeUiModel getAnime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fauzan.myanime.presentation.model.AnimeUiModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fauzan.myanime.presentation.favorite.FavoriteIntent.OpenDetail copy(@org.jetbrains.annotations.NotNull()
        com.fauzan.myanime.presentation.model.AnimeUiModel anime) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent$RemoveFavorite;", "Lcom/fauzan/myanime/presentation/favorite/FavoriteIntent;", "malId", "", "(I)V", "getMalId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "favorite_debug"})
    public static final class RemoveFavorite extends com.fauzan.myanime.presentation.favorite.FavoriteIntent {
        private final int malId = 0;
        
        public RemoveFavorite(int malId) {
        }
        
        public final int getMalId() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fauzan.myanime.presentation.favorite.FavoriteIntent.RemoveFavorite copy(int malId) {
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
}