package com.fauzan.myanime.di;

import com.fauzan.myanime.data.local.AnimeDatabase;
import com.fauzan.myanime.data.local.AnimeTopDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideAnimeTopDaoFactory implements Factory<AnimeTopDao> {
  private final Provider<AnimeDatabase> databaseProvider;

  public AppModule_ProvideAnimeTopDaoFactory(Provider<AnimeDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public AnimeTopDao get() {
    return provideAnimeTopDao(databaseProvider.get());
  }

  public static AppModule_ProvideAnimeTopDaoFactory create(
      javax.inject.Provider<AnimeDatabase> databaseProvider) {
    return new AppModule_ProvideAnimeTopDaoFactory(Providers.asDaggerProvider(databaseProvider));
  }

  public static AppModule_ProvideAnimeTopDaoFactory create(
      Provider<AnimeDatabase> databaseProvider) {
    return new AppModule_ProvideAnimeTopDaoFactory(databaseProvider);
  }

  public static AnimeTopDao provideAnimeTopDao(AnimeDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAnimeTopDao(database));
  }
}
