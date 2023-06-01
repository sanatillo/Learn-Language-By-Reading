package uz.siyovush.learnlanguagebyreading.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao;
import uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao_Impl;
import uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao;
import uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao_Impl;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile WordDao _wordDao;

  private volatile BookDao _bookDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WordTranslation` (`original` TEXT NOT NULL, `language` TEXT NOT NULL, `translation` TEXT NOT NULL, PRIMARY KEY(`original`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BookEntity` (`title` TEXT NOT NULL, `file` TEXT NOT NULL, `image` BLOB NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7010fcfb8b5fe9ce87c845b838ecd8c7')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `WordTranslation`");
        _db.execSQL("DROP TABLE IF EXISTS `BookEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsWordTranslation = new HashMap<String, TableInfo.Column>(3);
        _columnsWordTranslation.put("original", new TableInfo.Column("original", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordTranslation.put("language", new TableInfo.Column("language", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWordTranslation.put("translation", new TableInfo.Column("translation", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWordTranslation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWordTranslation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWordTranslation = new TableInfo("WordTranslation", _columnsWordTranslation, _foreignKeysWordTranslation, _indicesWordTranslation);
        final TableInfo _existingWordTranslation = TableInfo.read(_db, "WordTranslation");
        if (! _infoWordTranslation.equals(_existingWordTranslation)) {
          return new RoomOpenHelper.ValidationResult(false, "WordTranslation(uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation).\n"
                  + " Expected:\n" + _infoWordTranslation + "\n"
                  + " Found:\n" + _existingWordTranslation);
        }
        final HashMap<String, TableInfo.Column> _columnsBookEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsBookEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookEntity.put("file", new TableInfo.Column("file", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookEntity.put("image", new TableInfo.Column("image", "BLOB", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookEntity = new TableInfo("BookEntity", _columnsBookEntity, _foreignKeysBookEntity, _indicesBookEntity);
        final TableInfo _existingBookEntity = TableInfo.read(_db, "BookEntity");
        if (! _infoBookEntity.equals(_existingBookEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "BookEntity(uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity).\n"
                  + " Expected:\n" + _infoBookEntity + "\n"
                  + " Found:\n" + _existingBookEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7010fcfb8b5fe9ce87c845b838ecd8c7", "a79a6779d96b7fe5e3e3b41d1239ea75");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "WordTranslation","BookEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `WordTranslation`");
      _db.execSQL("DELETE FROM `BookEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(WordDao.class, WordDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BookDao.class, BookDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public WordDao getWordDao() {
    if (_wordDao != null) {
      return _wordDao;
    } else {
      synchronized(this) {
        if(_wordDao == null) {
          _wordDao = new WordDao_Impl(this);
        }
        return _wordDao;
      }
    }
  }

  @Override
  public BookDao getBookDao() {
    if (_bookDao != null) {
      return _bookDao;
    } else {
      synchronized(this) {
        if(_bookDao == null) {
          _bookDao = new BookDao_Impl(this);
        }
        return _bookDao;
      }
    }
  }
}
