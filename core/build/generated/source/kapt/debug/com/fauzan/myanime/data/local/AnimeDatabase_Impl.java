package com.fauzan.myanime.data.local;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class AnimeDatabase_Impl extends AnimeDatabase {
  private volatile AnimeDao _animeDao;

  private volatile AnimeTopDao _animeTopDao;

  private volatile RemoteKeysDao _remoteKeysDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(2, "ffa1da0e128bf3dcf6631077a7e9f86d", "26b33a3ac360e2bcc563e73eea65ec7e") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `favorite_anime` (`malId` INTEGER NOT NULL, `title` TEXT NOT NULL, `titleJapanese` TEXT, `titleEnglish` TEXT, `imageUrl` TEXT, `synopsis` TEXT, `score` REAL, `rank` INTEGER, `popularity` INTEGER, `episodes` INTEGER, `status` TEXT, `genres` TEXT NOT NULL, `studios` TEXT NOT NULL, `year` INTEGER, PRIMARY KEY(`malId`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `anime_cache` (`malId` INTEGER NOT NULL, `title` TEXT NOT NULL, `titleJapanese` TEXT, `titleEnglish` TEXT, `imageUrl` TEXT, `synopsis` TEXT, `score` REAL, `rank` INTEGER, `popularity` INTEGER, `episodes` INTEGER, `status` TEXT, `genres` TEXT NOT NULL, `studios` TEXT NOT NULL, `year` INTEGER, PRIMARY KEY(`malId`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `remote_keys` (`malId` INTEGER NOT NULL, `prevKey` INTEGER, `nextKey` INTEGER, PRIMARY KEY(`malId`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ffa1da0e128bf3dcf6631077a7e9f86d')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `favorite_anime`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `anime_cache`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `remote_keys`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsFavoriteAnime = new HashMap<String, TableInfo.Column>(14);
        _columnsFavoriteAnime.put("malId", new TableInfo.Column("malId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("titleJapanese", new TableInfo.Column("titleJapanese", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("titleEnglish", new TableInfo.Column("titleEnglish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("synopsis", new TableInfo.Column("synopsis", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("score", new TableInfo.Column("score", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("rank", new TableInfo.Column("rank", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("popularity", new TableInfo.Column("popularity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("episodes", new TableInfo.Column("episodes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("genres", new TableInfo.Column("genres", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("studios", new TableInfo.Column("studios", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteAnime.put("year", new TableInfo.Column("year", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysFavoriteAnime = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesFavoriteAnime = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteAnime = new TableInfo("favorite_anime", _columnsFavoriteAnime, _foreignKeysFavoriteAnime, _indicesFavoriteAnime);
        final TableInfo _existingFavoriteAnime = TableInfo.read(connection, "favorite_anime");
        if (!_infoFavoriteAnime.equals(_existingFavoriteAnime)) {
          return new RoomOpenDelegate.ValidationResult(false, "favorite_anime(com.fauzan.myanime.data.local.entity.FavoriteAnimeEntity).\n"
                  + " Expected:\n" + _infoFavoriteAnime + "\n"
                  + " Found:\n" + _existingFavoriteAnime);
        }
        final Map<String, TableInfo.Column> _columnsAnimeCache = new HashMap<String, TableInfo.Column>(14);
        _columnsAnimeCache.put("malId", new TableInfo.Column("malId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("titleJapanese", new TableInfo.Column("titleJapanese", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("titleEnglish", new TableInfo.Column("titleEnglish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("synopsis", new TableInfo.Column("synopsis", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("score", new TableInfo.Column("score", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("rank", new TableInfo.Column("rank", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("popularity", new TableInfo.Column("popularity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("episodes", new TableInfo.Column("episodes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("genres", new TableInfo.Column("genres", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("studios", new TableInfo.Column("studios", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimeCache.put("year", new TableInfo.Column("year", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysAnimeCache = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesAnimeCache = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAnimeCache = new TableInfo("anime_cache", _columnsAnimeCache, _foreignKeysAnimeCache, _indicesAnimeCache);
        final TableInfo _existingAnimeCache = TableInfo.read(connection, "anime_cache");
        if (!_infoAnimeCache.equals(_existingAnimeCache)) {
          return new RoomOpenDelegate.ValidationResult(false, "anime_cache(com.fauzan.myanime.data.local.entity.AnimeEntity).\n"
                  + " Expected:\n" + _infoAnimeCache + "\n"
                  + " Found:\n" + _existingAnimeCache);
        }
        final Map<String, TableInfo.Column> _columnsRemoteKeys = new HashMap<String, TableInfo.Column>(3);
        _columnsRemoteKeys.put("malId", new TableInfo.Column("malId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemoteKeys.put("prevKey", new TableInfo.Column("prevKey", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemoteKeys.put("nextKey", new TableInfo.Column("nextKey", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysRemoteKeys = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesRemoteKeys = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRemoteKeys = new TableInfo("remote_keys", _columnsRemoteKeys, _foreignKeysRemoteKeys, _indicesRemoteKeys);
        final TableInfo _existingRemoteKeys = TableInfo.read(connection, "remote_keys");
        if (!_infoRemoteKeys.equals(_existingRemoteKeys)) {
          return new RoomOpenDelegate.ValidationResult(false, "remote_keys(com.fauzan.myanime.data.local.entity.RemoteKeysEntity).\n"
                  + " Expected:\n" + _infoRemoteKeys + "\n"
                  + " Found:\n" + _existingRemoteKeys);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite_anime", "anime_cache", "remote_keys");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "favorite_anime", "anime_cache", "remote_keys");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AnimeDao.class, AnimeDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AnimeTopDao.class, AnimeTopDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RemoteKeysDao.class, RemoteKeysDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public AnimeDao animeDao() {
    if (_animeDao != null) {
      return _animeDao;
    } else {
      synchronized(this) {
        if(_animeDao == null) {
          _animeDao = new AnimeDao_Impl(this);
        }
        return _animeDao;
      }
    }
  }

  @Override
  public AnimeTopDao animeTopDao() {
    if (_animeTopDao != null) {
      return _animeTopDao;
    } else {
      synchronized(this) {
        if(_animeTopDao == null) {
          _animeTopDao = new AnimeTopDao_Impl(this);
        }
        return _animeTopDao;
      }
    }
  }

  @Override
  public RemoteKeysDao remoteKeysDao() {
    if (_remoteKeysDao != null) {
      return _remoteKeysDao;
    } else {
      synchronized(this) {
        if(_remoteKeysDao == null) {
          _remoteKeysDao = new RemoteKeysDao_Impl(this);
        }
        return _remoteKeysDao;
      }
    }
  }
}
