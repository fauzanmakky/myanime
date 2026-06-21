package com.fauzan.myanime.di

import com.fauzan.myanime.core.BuildConfig
import com.fauzan.myanime.data.remote.AnimeApi
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideGson(): Gson = Gson().newBuilder().create()

    @Singleton
    @Provides
    fun provideCertificatePinner(): CertificatePinner = CertificatePinner.Builder()
        .add("api.jikan.moe", "sha256/n6+w9hrNxdy0btQSLhGCZVWpKCSL3rDNP8WMIEf9C8k=")
        .add("api.jikan.moe", "sha256/AlSQhgtJirc8ahLyekmtX+Iw+v46yPYRLJt9Cq1GlB0=")
        .build()

    @Singleton
    @Provides
    fun provideOkHttpClient(certificatePinner: CertificatePinner): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .certificatePinner(certificatePinner)
        if (BuildConfig.DEBUG) {
            builder.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        }
        return builder.addInterceptor { chain ->
            var response = chain.proceed(chain.request())
            if (response.code == 429) {
                response.close()
                Thread.sleep(1000)
                response = chain.proceed(chain.request())
            }
            response
        }
        .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.jikan.moe/v4/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    @Singleton
    @Provides
    fun provideAnimeApi(retrofit: Retrofit): AnimeApi = retrofit.create()
}
