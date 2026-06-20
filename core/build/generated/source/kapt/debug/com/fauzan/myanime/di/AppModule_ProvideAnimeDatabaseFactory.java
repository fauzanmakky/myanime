package com.fauzan.myanime.di;

import android.content.Context;
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
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideAnimeDatabaseFactory implements Factory<AnimeDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideAnimeDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AnimeDatabase get() {
    return provideAnimeDatabase(contextProvider.get());
  }

  public static AppModule_ProvideAnimeDatabaseFactory create(
      javax.inject.Provider<Context> contextProvider) {
    return new AppModule_ProvideAnimeDatabaseFactory(Providers.asDaggerProvider(contextProvider));
  }

  public static AppModule_ProvideAnimeDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideAnimeDatabaseFactory(contextProvider);
  }

  public static AnimeDatabase provideAnimeDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAnimeDatabase(context));
  }
}
