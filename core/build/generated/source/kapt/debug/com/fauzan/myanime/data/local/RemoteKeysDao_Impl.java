package com.fauzan.myanime.data.local;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.fauzan.myanime.data.local.entity.RemoteKeysEntity;
import java.lang.Class;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class RemoteKeysDao_Impl implements RemoteKeysDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<RemoteKeysEntity> __insertAdapterOfRemoteKeysEntity;

  public RemoteKeysDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfRemoteKeysEntity = new EntityInsertAdapter<RemoteKeysEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `remote_keys` (`malId`,`prevKey`,`nextKey`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final RemoteKeysEntity entity) {
        statement.bindLong(1, entity.getMalId());
        if (entity.getPrevKey() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getPrevKey());
        }
        if (entity.getNextKey() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getNextKey());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<RemoteKeysEntity> remoteKeys,
      final Continuation<? super Unit> $completion) {
    if (remoteKeys == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfRemoteKeysEntity.insert(_connection, remoteKeys);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getRemoteKeyById(final int malId,
      final Continuation<? super RemoteKeysEntity> $completion) {
    final String _sql = "SELECT * FROM remote_keys WHERE malId = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, malId);
        final int _columnIndexOfMalId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "malId");
        final int _columnIndexOfPrevKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "prevKey");
        final int _columnIndexOfNextKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nextKey");
        final RemoteKeysEntity _result;
        if (_stmt.step()) {
          final int _tmpMalId;
          _tmpMalId = (int) (_stmt.getLong(_columnIndexOfMalId));
          final Integer _tmpPrevKey;
          if (_stmt.isNull(_columnIndexOfPrevKey)) {
            _tmpPrevKey = null;
          } else {
            _tmpPrevKey = (int) (_stmt.getLong(_columnIndexOfPrevKey));
          }
          final Integer _tmpNextKey;
          if (_stmt.isNull(_columnIndexOfNextKey)) {
            _tmpNextKey = null;
          } else {
            _tmpNextKey = (int) (_stmt.getLong(_columnIndexOfNextKey));
          }
          _result = new RemoteKeysEntity(_tmpMalId,_tmpPrevKey,_tmpNextKey);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM remote_keys";
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
