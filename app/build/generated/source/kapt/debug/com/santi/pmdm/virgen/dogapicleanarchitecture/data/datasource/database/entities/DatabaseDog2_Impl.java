package com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao_DatabaseDog2_Impl;
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

@SuppressWarnings({"unchecked", "deprecation"})
public final class DatabaseDog2_Impl extends DatabaseDog2 {
  private volatile DogDao _dogDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `DogEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `breed` TEXT NOT NULL, `image` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2cc62faab533ccb29181d80601cccb13')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `DogEntity`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsDogEntity = new HashMap<String, TableInfo.Column>(3);
        _columnsDogEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDogEntity.put("breed", new TableInfo.Column("breed", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDogEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDogEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDogEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDogEntity = new TableInfo("DogEntity", _columnsDogEntity, _foreignKeysDogEntity, _indicesDogEntity);
        final TableInfo _existingDogEntity = TableInfo.read(db, "DogEntity");
        if (!_infoDogEntity.equals(_existingDogEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "DogEntity(com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity).\n"
                  + " Expected:\n" + _infoDogEntity + "\n"
                  + " Found:\n" + _existingDogEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2cc62faab533ccb29181d80601cccb13", "c4abac7f31c8cec53683ee90d2eeb220");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DogEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DogEntity`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DogDao.class, DogDao_DatabaseDog2_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
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
  public DogDao dogDao() {
    if (_dogDao != null) {
      return _dogDao;
    } else {
      synchronized(this) {
        if(_dogDao == null) {
          _dogDao = new DogDao_DatabaseDog2_Impl(this);
        }
        return _dogDao;
      }
    }
  }
}
