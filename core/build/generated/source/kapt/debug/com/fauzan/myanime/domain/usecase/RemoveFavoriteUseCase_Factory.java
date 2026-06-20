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
public final class RemoveFavoriteUseCase_Factory implements Factory<RemoveFavoriteUseCase> {
  private final Provider<AnimeRepository> animeRepositoryProvider;

  public RemoveFavoriteUseCase_Factory(Provider<AnimeRepository> animeRepositoryProvider) {
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  @Override
  public RemoveFavoriteUseCase get() {
    return newInstance(animeRepositoryProvider.get());
  }

  public static RemoveFavoriteUseCase_Factory create(
      javax.inject.Provider<AnimeRepository> animeRepositoryProvider) {
    return new RemoveFavoriteUseCase_Factory(Providers.asDaggerProvider(animeRepositoryProvider));
  }

  public static RemoveFavoriteUseCase_Factory create(
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new RemoveFavoriteUseCase_Factory(animeRepositoryProvider);
  }

  public static RemoveFavoriteUseCase newInstance(AnimeRepository animeRepository) {
    return new RemoveFavoriteUseCase(animeRepository);
  }
}
