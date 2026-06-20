package com.fauzan.myanime.data.repository;

import com.fauzan.myanime.data.local.AnimeDao;
import com.fauzan.myanime.data.local.AnimeDatabase;
import com.fauzan.myanime.data.remote.AnimeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AnimeRepositoryImpl_Factory implements Factory<AnimeRepositoryImpl> {
  private final Provider<AnimeApi> animeApiProvider;

  private final Provider<AnimeDao> animeDaoProvider;

  private final Provider<AnimeDatabase> animeDatabaseProvider;

  public AnimeRepositoryImpl_Factory(Provider<AnimeApi> animeApiProvider,
      Provider<AnimeDao> animeDaoProvider, Provider<AnimeDatabase> animeDatabaseProvider) {
    this.animeApiProvider = animeApiProvider;
    this.animeDaoProvider = animeDaoProvider;
    this.animeDatabaseProvider = animeDatabaseProvider;
  }

  @Override
  public AnimeRepositoryImpl get() {
    return newInstance(animeApiProvider.get(), animeDaoProvider.get(), animeDatabaseProvider.get());
  }

  public static AnimeRepositoryImpl_Factory create(javax.inject.Provider<AnimeApi> animeApiProvider,
      javax.inject.Provider<AnimeDao> animeDaoProvider,
      javax.inject.Provider<AnimeDatabase> animeDatabaseProvider) {
    return new AnimeRepositoryImpl_Factory(Providers.asDaggerProvider(animeApiProvider), Providers.asDaggerProvider(animeDaoProvider), Providers.asDaggerProvider(animeDatabaseProvider));
  }

  public static AnimeRepositoryImpl_Factory create(Provider<AnimeApi> animeApiProvider,
      Provider<AnimeDao> animeDaoProvider, Provider<AnimeDatabase> animeDatabaseProvider) {
    return new AnimeRepositoryImpl_Factory(animeApiProvider, animeDaoProvider, animeDatabaseProvider);
  }

  public static AnimeRepositoryImpl newInstance(AnimeApi animeApi, AnimeDao animeDao,
      AnimeDatabase animeDatabase) {
    return new AnimeRepositoryImpl(animeApi, animeDao, animeDatabase);
  }
}
