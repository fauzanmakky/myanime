package com.fauzan.myanime.data.local;

import androidx.annotation.NonNull;
import androidx.paging.PagingSource;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.fauzan.myanime.data.local.entity.AnimeEntity;
import java.lang.Class;
import java.lang.Double;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class AnimeTopDao_Impl implements AnimeTopDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<AnimeEntity> __insertAdapterOfAnimeEntity;

  public AnimeTopDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfAnimeEntity = new EntityInsertAdapter<AnimeEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `anime_cache` (`malId`,`title`,`titleJapanese`,`titleEnglish`,`imageUrl`,`synopsis`,`score`,`rank`,`popularity`,`episodes`,`status`,`genres`,`studios`,`year`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final AnimeEntity entity) {
        statement.bindLong(1, entity.getMalId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitle());
        }
        if (entity.getTitleJapanese() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getTitleJapanese());
        }
        if (entity.getTitleEnglish() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getTitleEnglish());
        }
        if (entity.getImageUrl() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getImageUrl());
        }
        if (entity.getSynopsis() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getSynopsis());
        }
        if (entity.getScore() == null) {
          statement.bindNull(7);
        } else {
          statement.bindDouble(7, entity.getScore());
        }
        if (entity.getRank() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getRank());
        }
        if (entity.getPopularity() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getPopularity());
        }
        if (entity.getEpisodes() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getEpisodes());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getStatus());
        }
        if (entity.getGenres() == null) {
          statement.bindNull(12);
        } else {
          statement.bindText(12, entity.getGenres());
        }
        if (entity.getStudios() == null) {
          statement.bindNull(13);
        } else {
          statement.bindText(13, entity.getStudios());
        }
        if (entity.getYear() == null) {
          statement.bindNull(14);
        } else {
          statement.bindLong(14, entity.getYear());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<AnimeEntity> animeList,
      final Continuation<? super Unit> $completion) {
    if (animeList == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfAnimeEntity.insert(_connection, animeList);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public PagingSource<Integer, AnimeEntity> getAllAnime() {
    final String _sql = "SELECT * FROM anime_cache ORDER BY rank ASC";
    final RoomRawQuery _rawQuery = new RoomRawQuery(_sql);
    return new LimitOffsetPagingSource<AnimeEntity>(_rawQuery, __db, "anime_cache") {
      @Override
      protected Object convertRows(final RoomRawQuery limitOffsetQuery, final int itemCount,
          final Continuation<? super List<? extends AnimeEntity>> $completion) {
        return DBUtil.performSuspending(__db, true, false, (_connection) -> {
          final SQLiteStatement _stmt = _connection.prepare(limitOffsetQuery.getSql());
          limitOffsetQuery.getBindingFunction().invoke(_stmt);
          try {
            final int _columnIndexOfMalId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "malId");
            final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
            final int _columnIndexOfTitleJapanese = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titleJapanese");
            final int _columnIndexOfTitleEnglish = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titleEnglish");
            final int _columnIndexOfImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "imageUrl");
            final int _columnIndexOfSynopsis = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "synopsis");
            final int _columnIndexOfScore = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "score");
            final int _columnIndexOfRank = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "rank");
            final int _columnIndexOfPopularity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "popularity");
            final int _columnIndexOfEpisodes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "episodes");
            final int _columnIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
            final int _columnIndexOfGenres = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "genres");
            final int _columnIndexOfStudios = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "studios");
            final int _columnIndexOfYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "year");
            final List<AnimeEntity> _result = new ArrayList<AnimeEntity>();
            while (_stmt.step()) {
              final AnimeEntity _item;
              final int _tmpMalId;
              _tmpMalId = (int) (_stmt.getLong(_columnIndexOfMalId));
              final String _tmpTitle;
              if (_stmt.isNull(_columnIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _stmt.getText(_columnIndexOfTitle);
              }
              final String _tmpTitleJapanese;
              if (_stmt.isNull(_columnIndexOfTitleJapanese)) {
                _tmpTitleJapanese = null;
              } else {
                _tmpTitleJapanese = _stmt.getText(_columnIndexOfTitleJapanese);
              }
              final String _tmpTitleEnglish;
              if (_stmt.isNull(_columnIndexOfTitleEnglish)) {
                _tmpTitleEnglish = null;
              } else {
                _tmpTitleEnglish = _stmt.getText(_columnIndexOfTitleEnglish);
              }
              final String _tmpImageUrl;
              if (_stmt.isNull(_columnIndexOfImageUrl)) {
                _tmpImageUrl = null;
              } else {
                _tmpImageUrl = _stmt.getText(_columnIndexOfImageUrl);
              }
              final String _tmpSynopsis;
              if (_stmt.isNull(_columnIndexOfSynopsis)) {
                _tmpSynopsis = null;
              } else {
                _tmpSynopsis = _stmt.getText(_columnIndexOfSynopsis);
              }
              final Double _tmpScore;
              if (_stmt.isNull(_columnIndexOfScore)) {
                _tmpScore = null;
              } else {
                _tmpScore = _stmt.getDouble(_columnIndexOfScore);
              }
              final Integer _tmpRank;
              if (_stmt.isNull(_columnIndexOfRank)) {
                _tmpRank = null;
              } else {
                _tmpRank = (int) (_stmt.getLong(_columnIndexOfRank));
              }
              final Integer _tmpPopularity;
              if (_stmt.isNull(_columnIndexOfPopularity)) {
                _tmpPopularity = null;
              } else {
                _tmpPopularity = (int) (_stmt.getLong(_columnIndexOfPopularity));
              }
              final Integer _tmpEpisodes;
              if (_stmt.isNull(_columnIndexOfEpisodes)) {
                _tmpEpisodes = null;
              } else {
                _tmpEpisodes = (int) (_stmt.getLong(_columnIndexOfEpisodes));
              }
              final String _tmpStatus;
              if (_stmt.isNull(_columnIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _stmt.getText(_columnIndexOfStatus);
              }
              final String _tmpGenres;
              if (_stmt.isNull(_columnIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _stmt.getText(_columnIndexOfGenres);
              }
              final String _tmpStudios;
              if (_stmt.isNull(_columnIndexOfStudios)) {
                _tmpStudios = null;
              } else {
                _tmpStudios = _stmt.getText(_columnIndexOfStudios);
              }
              final Integer _tmpYear;
              if (_stmt.isNull(_columnIndexOfYear)) {
                _tmpYear = null;
              } else {
                _tmpYear = (int) (_stmt.getLong(_columnIndexOfYear));
              }
              _item = new AnimeEntity(_tmpMalId,_tmpTitle,_tmpTitleJapanese,_tmpTitleEnglish,_tmpImageUrl,_tmpSynopsis,_tmpScore,_tmpRank,_tmpPopularity,_tmpEpisodes,_tmpStatus,_tmpGenres,_tmpStudios,_tmpYear);
              _result.add(_item);
            }
            return _result;
          } finally {
            _stmt.close();
          }
        }, $completion);
      }
    };
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM anime_cache";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
