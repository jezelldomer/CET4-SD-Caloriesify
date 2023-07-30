package com.feedapp.app.data.databases.dbclasses;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.feedapp.app.data.databases.daos.LocalProductRuDao;
import com.feedapp.app.data.databases.daos.LocalProductRuDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class LocalFoodDatabase_Impl extends LocalFoodDatabase {
  private volatile LocalProductRuDao _localProductRuDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food_ru` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `weight` REAL NOT NULL, `proteins` REAL NOT NULL, `fats` REAL NOT NULL, `carbs` REAL NOT NULL, `calories` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d23e7cf1cc99779155ad2fdc367d7085\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `food_ru`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFoodRu = new HashMap<String, TableInfo.Column>(7);
        _columnsFoodRu.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsFoodRu.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsFoodRu.put("weight", new TableInfo.Column("weight", "REAL", true, 0));
        _columnsFoodRu.put("proteins", new TableInfo.Column("proteins", "REAL", true, 0));
        _columnsFoodRu.put("fats", new TableInfo.Column("fats", "REAL", true, 0));
        _columnsFoodRu.put("carbs", new TableInfo.Column("carbs", "REAL", true, 0));
        _columnsFoodRu.put("calories", new TableInfo.Column("calories", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFoodRu = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFoodRu = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFoodRu = new TableInfo("food_ru", _columnsFoodRu, _foreignKeysFoodRu, _indicesFoodRu);
        final TableInfo _existingFoodRu = TableInfo.read(_db, "food_ru");
        if (! _infoFoodRu.equals(_existingFoodRu)) {
          throw new IllegalStateException("Migration didn't properly handle food_ru(com.feedapp.app.data.models.localdb.FoodProductRu).\n"
                  + " Expected:\n" + _infoFoodRu + "\n"
                  + " Found:\n" + _existingFoodRu);
        }
      }
    }, "d23e7cf1cc99779155ad2fdc367d7085", "9220f3fdf54b0db324bcfae0323d72db");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "food_ru");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `food_ru`");
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
  public LocalProductRuDao getLocalProductDao() {
    if (_localProductRuDao != null) {
      return _localProductRuDao;
    } else {
      synchronized(this) {
        if(_localProductRuDao == null) {
          _localProductRuDao = new LocalProductRuDao_Impl(this);
        }
        return _localProductRuDao;
      }
    }
  }
}
