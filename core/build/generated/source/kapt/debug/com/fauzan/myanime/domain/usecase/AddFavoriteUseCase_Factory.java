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
public final class AddFavoriteUseCase_Factory implements Factory<AddFavoriteUseCase> {
  private final Provider<AnimeRepository> animeRepositoryProvider;

  public AddFavoriteUseCase_Factory(Provider<AnimeRepository> animeRepositoryProvider) {
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  @Override
  public AddFavoriteUseCase get() {
    return newInstance(animeRepositoryProvider.get());
  }

  public static AddFavoriteUseCase_Factory create(
      javax.inject.Provider<AnimeRepository> animeRepositoryProvider) {
    return new AddFavoriteUseCase_Factory(Providers.asDaggerProvider(animeRepositoryProvider));
  }

  public static AddFavoriteUseCase_Factory create(
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new AddFavoriteUseCase_Factory(animeRepositoryProvider);
  }

  public static AddFavoriteUseCase newInstance(AnimeRepository animeRepository) {
    return new AddFavoriteUseCase(animeRepository);
  }
}
