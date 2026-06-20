package com.fauzan.myanime.di;

import com.fauzan.myanime.data.local.AnimeDatabase;
import com.fauzan.myanime.data.local.RemoteKeysDao;
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
public final class AppModule_ProvideRemoteKeysDaoFactory implements Factory<RemoteKeysDao> {
  private final Provider<AnimeDatabase> databaseProvider;

  public AppModule_ProvideRemoteKeysDaoFactory(Provider<AnimeDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RemoteKeysDao get() {
    return provideRemoteKeysDao(databaseProvider.get());
  }

  public static AppModule_ProvideRemoteKeysDaoFactory create(
      javax.inject.Provider<AnimeDatabase> databaseProvider) {
    return new AppModule_ProvideRemoteKeysDaoFactory(Providers.asDaggerProvider(databaseProvider));
  }

  public static AppModule_ProvideRemoteKeysDaoFactory create(
      Provider<AnimeDatabase> databaseProvider) {
    return new AppModule_ProvideRemoteKeysDaoFactory(databaseProvider);
  }

  public static RemoteKeysDao provideRemoteKeysDao(AnimeDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRemoteKeysDao(database));
  }
}
