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
import uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao;
import uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao_Impl;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DictDatabase_Impl extends DictDatabase {
  private volatile DictDao _dictDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `word` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `langId` INTEGER NOT NULL, `transcription` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`id`))");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `IX_002` ON `word` (`id` ASC)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `IX_001` ON `word` (`name` ASC, `langId` ASC)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `translation` (`id` INTEGER NOT NULL, `idWord` INTEGER NOT NULL, `idTranslation` INTEGER NOT NULL, `idCategory` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `IX_003` ON `translation` (`idWord` ASC)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd66e4b50f7b44b097b9575fd7c8e6824')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `word`");
        _db.execSQL("DROP TABLE IF EXISTS `translation`");
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
        final HashMap<String, TableInfo.Column> _columnsWord = new HashMap<String, TableInfo.Column>(4);
        _columnsWord.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWord.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWord.put("langId", new TableInfo.Column("langId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWord.put("transcription", new TableInfo.Column("transcription", "TEXT", true, 0, "''", TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWord = new HashSet<TableInfo.Index>(2);
        _indicesWord.add(new TableInfo.Index("IX_002", false, Arrays.asList("id"), Arrays.asList("ASC")));
        _indicesWord.add(new TableInfo.Index("IX_001", false, Arrays.asList("name","langId"), Arrays.asList("ASC","ASC")));
        final TableInfo _infoWord = new TableInfo("word", _columnsWord, _foreignKeysWord, _indicesWord);
        final TableInfo _existingWord = TableInfo.read(_db, "word");
        if (! _infoWord.equals(_existingWord)) {
          return new RoomOpenHelper.ValidationResult(false, "word(uz.siyovush.learnlanguagebyreading.data.database.entity.Word).\n"
                  + " Expected:\n" + _infoWord + "\n"
                  + " Found:\n" + _existingWord);
        }
        final HashMap<String, TableInfo.Column> _columnsTranslation = new HashMap<String, TableInfo.Column>(4);
        _columnsTranslation.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTranslation.put("idWord", new TableInfo.Column("idWord", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTranslation.put("idTranslation", new TableInfo.Column("idTranslation", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTranslation.put("idCategory", new TableInfo.Column("idCategory", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTranslation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTranslation = new HashSet<TableInfo.Index>(1);
        _indicesTranslation.add(new TableInfo.Index("IX_003", false, Arrays.asList("idWord"), Arrays.asList("ASC")));
        final TableInfo _infoTranslation = new TableInfo("translation", _columnsTranslation, _foreignKeysTranslation, _indicesTranslation);
        final TableInfo _existingTranslation = TableInfo.read(_db, "translation");
        if (! _infoTranslation.equals(_existingTranslation)) {
          return new RoomOpenHelper.ValidationResult(false, "translation(uz.siyovush.learnlanguagebyreading.data.database.entity.Translation).\n"
                  + " Expected:\n" + _infoTranslation + "\n"
                  + " Found:\n" + _existingTranslation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d66e4b50f7b44b097b9575fd7c8e6824", "3bd13d6447da75518275f9f939374a81");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "word","translation");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `word`");
      _db.execSQL("DELETE FROM `translation`");
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
    _typeConvertersMap.put(DictDao.class, DictDao_Impl.getRequiredConverters());
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
  public DictDao dictDao() {
    if (_dictDao != null) {
      return _dictDao;
    } else {
      synchronized(this) {
        if(_dictDao == null) {
          _dictDao = new DictDao_Impl(this);
        }
        return _dictDao;
      }
    }
  }
}
