package uz.siyovush.learnlanguagebyreading.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
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
import kotlin.coroutines.Continuation;
import uz.siyovush.learnlanguagebyreading.data.database.entity.Dict;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DictDao_Impl implements DictDao {
  private final RoomDatabase __db;

  public DictDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getTranslations(final int langId,
      final Continuation<? super List<Dict>> continuation) {
    final String _sql = "\n"
            + "        SELECT\n"
            + "          word.name AS word,\n"
            + "          word.transcription as transcription,\n"
            + "          GROUP_CONCAT(word2.name) AS translation\n"
            + "        FROM\n"
            + "          word\n"
            + "        JOIN\n"
            + "          translation\n"
            + "        ON\n"
            + "          word.id = translation.idWord\n"
            + "        JOIN\n"
            + "          word word2\n"
            + "        ON\n"
            + "          word2.id = translation.idTranslation\n"
            + "        WHERE\n"
            + "          word.langId = ?\n"
            + "        GROUP BY\n"
            + "          word.name;\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, langId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Dict>>() {
      @Override
      public List<Dict> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWord = 0;
          final int _cursorIndexOfTranscription = 1;
          final int _cursorIndexOfTranslation = 2;
          final List<Dict> _result = new ArrayList<Dict>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Dict _item;
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            final String _tmpTranscription;
            if (_cursor.isNull(_cursorIndexOfTranscription)) {
              _tmpTranscription = null;
            } else {
              _tmpTranscription = _cursor.getString(_cursorIndexOfTranscription);
            }
            final String _tmpTranslation;
            if (_cursor.isNull(_cursorIndexOfTranslation)) {
              _tmpTranslation = null;
            } else {
              _tmpTranslation = _cursor.getString(_cursorIndexOfTranslation);
            }
            _item = new Dict(_tmpWord,_tmpTranslation,_tmpTranscription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
