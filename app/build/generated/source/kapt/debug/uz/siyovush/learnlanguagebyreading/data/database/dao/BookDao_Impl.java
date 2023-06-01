package uz.siyovush.learnlanguagebyreading.data.database.dao;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
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
import uz.siyovush.learnlanguagebyreading.data.database.BitmapConverter;
import uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BookDao_Impl implements BookDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BookEntity> __insertionAdapterOfBookEntity;

  private final BitmapConverter __bitmapConverter = new BitmapConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public BookDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookEntity = new EntityInsertionAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `BookEntity` (`title`,`file`,`image`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getFile() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFile());
        }
        final byte[] _tmp = __bitmapConverter.imageToByteData(value.getImage());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindBlob(3, _tmp);
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM BookEntity WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final BookEntity book, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBookEntity.insert(book);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteById(final long bookId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, bookId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public Flow<List<BookEntity>> getAllBooksByName(final boolean asc) {
    final String _sql = "SELECT * FROM BookEntity ORDER BY CASE WHEN ? THEN title END ASC, CASE WHEN NOT ? THEN title END DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final int _tmp = asc ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    final int _tmp_1 = asc ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp_1);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"BookEntity"}, new Callable<List<BookEntity>>() {
      @Override
      public List<BookEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfFile = CursorUtil.getColumnIndexOrThrow(_cursor, "file");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<BookEntity> _result = new ArrayList<BookEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BookEntity _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpFile;
            if (_cursor.isNull(_cursorIndexOfFile)) {
              _tmpFile = null;
            } else {
              _tmpFile = _cursor.getString(_cursorIndexOfFile);
            }
            final Bitmap _tmpImage;
            final byte[] _tmp_2;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getBlob(_cursorIndexOfImage);
            }
            _tmpImage = __bitmapConverter.byteDataToImage(_tmp_2);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item = new BookEntity(_tmpTitle,_tmpFile,_tmpImage,_tmpId);
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
