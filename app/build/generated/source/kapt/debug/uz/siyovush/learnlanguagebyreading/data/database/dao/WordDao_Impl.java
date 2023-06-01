package uz.siyovush.learnlanguagebyreading.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WordDao_Impl implements WordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WordTranslation> __insertionAdapterOfWordTranslation;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public WordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWordTranslation = new EntityInsertionAdapter<WordTranslation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `WordTranslation` (`original`,`language`,`translation`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordTranslation value) {
        if (value.getOriginal() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOriginal());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLanguage());
        }
        if (value.getTranslation() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTranslation());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM WordTranslation WHERE original = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final WordTranslation translation,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWordTranslation.insert(translation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final String word, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (word == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, word);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object isFavorite(final String word, final Continuation<? super Boolean> continuation) {
    final String _sql = "SELECT EXISTS(SELECT 1 FROM WordTranslation WHERE original = ? LIMIT 1)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (word == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, word);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<WordTranslation>> getAll() {
    final String _sql = "SELECT * FROM WordTranslation";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"WordTranslation"}, new Callable<List<WordTranslation>>() {
      @Override
      public List<WordTranslation> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOriginal = CursorUtil.getColumnIndexOrThrow(_cursor, "original");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfTranslation = CursorUtil.getColumnIndexOrThrow(_cursor, "translation");
          final List<WordTranslation> _result = new ArrayList<WordTranslation>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WordTranslation _item;
            final String _tmpOriginal;
            if (_cursor.isNull(_cursorIndexOfOriginal)) {
              _tmpOriginal = null;
            } else {
              _tmpOriginal = _cursor.getString(_cursorIndexOfOriginal);
            }
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            final String _tmpTranslation;
            if (_cursor.isNull(_cursorIndexOfTranslation)) {
              _tmpTranslation = null;
            } else {
              _tmpTranslation = _cursor.getString(_cursorIndexOfTranslation);
            }
            _item = new WordTranslation(_tmpOriginal,_tmpLanguage,_tmpTranslation);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
