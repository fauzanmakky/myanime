package com.fauzan.myanime.domain.usecase;

import com.fauzan.myanime.domain.repository.AnimeRepository;
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
public final class CheckFavoriteUseCase_Factory implements Factory<CheckFavoriteUseCase> {
  private final Provider<AnimeRepository> animeRepositoryProvider;

  public CheckFavoriteUseCase_Factory(Provider<AnimeRepository> animeRepositoryProvider) {
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  @Override
  public CheckFavoriteUseCase get() {
    return newInstance(animeRepositoryProvider.get());
  }

  public static CheckFavoriteUseCase_Factory create(
      javax.inject.Provider<AnimeRepository> animeRepositoryProvider) {
    return new CheckFavoriteUseCase_Factory(Providers.asDaggerProvider(animeRepositoryProvider));
  }

  public static CheckFavoriteUseCase_Factory create(
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new CheckFavoriteUseCase_Factory(animeRepositoryProvider);
  }

  public static CheckFavoriteUseCase newInstance(AnimeRepository animeRepository) {
    return new CheckFavoriteUseCase(animeRepository);
  }
}
