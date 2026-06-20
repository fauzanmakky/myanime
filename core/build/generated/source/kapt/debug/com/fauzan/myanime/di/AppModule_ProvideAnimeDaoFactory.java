package com.fauzan.myanime.di;

import com.fauzan.myanime.data.local.AnimeDao;
import com.fauzan.myanime.data.local.AnimeDatabase;
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
public final class AppModule_ProvideAnimeDaoFactory implements Factory<AnimeDao> {
  private final Provider<AnimeDatabase> databaseProvider;

  public AppModule_ProvideAnimeDaoFactory(Provider<AnimeDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public AnimeDao get() {
    return provideAnimeDao(databaseProvider.get());
  }

  public static AppModule_ProvideAnimeDaoFactory create(
      javax.inject.Provider<AnimeDatabase> databaseProvider) {
    return new AppModule_ProvideAnimeDaoFactory(Providers.asDaggerProvider(databaseProvider));
  }

  public static AppModule_ProvideAnimeDaoFactory create(Provider<AnimeDatabase> databaseProvider) {
    return new AppModule_ProvideAnimeDaoFactory(databaseProvider);
  }

  public static AnimeDao provideAnimeDao(AnimeDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAnimeDao(database));
  }
}
