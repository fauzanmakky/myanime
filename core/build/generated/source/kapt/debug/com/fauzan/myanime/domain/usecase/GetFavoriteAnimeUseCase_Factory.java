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
public final class GetFavoriteAnimeUseCase_Factory implements Factory<GetFavoriteAnimeUseCase> {
  private final Provider<AnimeRepository> animeRepositoryProvider;

  public GetFavoriteAnimeUseCase_Factory(Provider<AnimeRepository> animeRepositoryProvider) {
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  @Override
  public GetFavoriteAnimeUseCase get() {
    return newInstance(animeRepositoryProvider.get());
  }

  public static GetFavoriteAnimeUseCase_Factory create(
      javax.inject.Provider<AnimeRepository> animeRepositoryProvider) {
    return new GetFavoriteAnimeUseCase_Factory(Providers.asDaggerProvider(animeRepositoryProvider));
  }

  public static GetFavoriteAnimeUseCase_Factory create(
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new GetFavoriteAnimeUseCase_Factory(animeRepositoryProvider);
  }

  public static GetFavoriteAnimeUseCase newInstance(AnimeRepository animeRepository) {
    return new GetFavoriteAnimeUseCase(animeRepository);
  }
}
