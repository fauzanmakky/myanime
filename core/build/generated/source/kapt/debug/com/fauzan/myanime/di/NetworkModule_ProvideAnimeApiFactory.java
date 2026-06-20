package com.fauzan.myanime.di;

import com.fauzan.myanime.data.remote.AnimeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideAnimeApiFactory implements Factory<AnimeApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideAnimeApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AnimeApi get() {
    return provideAnimeApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideAnimeApiFactory create(
      javax.inject.Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideAnimeApiFactory(Providers.asDaggerProvider(retrofitProvider));
  }

  public static NetworkModule_ProvideAnimeApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideAnimeApiFactory(retrofitProvider);
  }

  public static AnimeApi provideAnimeApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAnimeApi(retrofit));
  }
}
