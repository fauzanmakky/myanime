package com.fauzan.myanime.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/fauzan/myanime/di/BindingModule;", "", "()V", "bindAnimePagingRepository", "Lcom/fauzan/myanime/data/repository/AnimePagingRepository;", "animeRepositoryImpl", "Lcom/fauzan/myanime/data/repository/AnimeRepositoryImpl;", "bindAnimeRepository", "Lcom/fauzan/myanime/domain/repository/AnimeRepository;", "core_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class BindingModule {
    
    public BindingModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.fauzan.myanime.domain.repository.AnimeRepository bindAnimeRepository(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.repository.AnimeRepositoryImpl animeRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.fauzan.myanime.data.repository.AnimePagingRepository bindAnimePagingRepository(@org.jetbrains.annotations.NotNull()
    com.fauzan.myanime.data.repository.AnimeRepositoryImpl animeRepositoryImpl);
}