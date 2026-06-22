package com.fauzan.myanime.di

import android.content.Context
import androidx.room.Room
import com.fauzan.myanime.data.local.AnimeDao
import com.fauzan.myanime.data.local.AnimeDatabase
import com.fauzan.myanime.data.local.AnimeTopDao
import com.fauzan.myanime.data.local.RemoteKeysDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAnimeDatabase(@ApplicationContext context: Context): AnimeDatabase {
        val passphrase = SQLiteDatabase.getBytes("dicoding".toCharArray())
        val factory = SupportFactory(passphrase)
        return Room.databaseBuilder(context, AnimeDatabase::class.java, "anime.db")
            .fallbackToDestructiveMigration(false)
            .openHelperFactory(factory)
            .build()
    }

    @Singleton
    @Provides
    fun provideAnimeDao(database: AnimeDatabase): AnimeDao = database.animeDao()

    @Singleton
    @Provides
    fun provideAnimeTopDao(database: AnimeDatabase): AnimeTopDao = database.animeTopDao()

    @Singleton
    @Provides
    fun provideRemoteKeysDao(database: AnimeDatabase): RemoteKeysDao = database.remoteKeysDao()
}
