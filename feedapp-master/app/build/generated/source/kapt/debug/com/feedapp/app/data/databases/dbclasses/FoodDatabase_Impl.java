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
import com.feedapp.app.data.databases.daos.FoodProductDao;
import com.feedapp.app.data.databases.daos.FoodProductDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class FoodDatabase_Impl extends FoodDatabase {
  private volatile FoodProductDao _foodProductDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food` (`id` INTEGER NOT NULL, `cryptoxanthin` REAL, `totalfolates` REAL, `ergocalciferol_d2` REAL, `niacin_b3` REAL, `cobalamin_b12` REAL, `energy_without_dietary_fibre` REAL, `carbs` REAL NOT NULL, `fluoride` REAL, `pantothenic_acid_b5` REAL, `thiamin_b1` REAL, `folicacid` REAL, `retinol` REAL, `alpha_carotene` REAL, `pyridoxine_b6` REAL, `protein` REAL NOT NULL, `fat` REAL NOT NULL, `tin` REAL, `chloride` REAL, `omega_g` REAL, `zinc` REAL, `o_poly_fats_g` REAL, `energy` REAL, `molybdenum` REAL, `phosphorus` REAL, `provitamin_a` REAL, `alcohol` REAL, `total_dietary_fibre` REAL, `sat_fats_g` REAL, `vitamin_c` REAL, `vitamin_e` REAL, `magnesium` REAL, `galactose` REAL, `moisture` REAL, `folatenatural` REAL, `sucrose` REAL, `arsenic` REAL, `omega` REAL, `sodium` REAL, `beta_carotene` REAL, `name` TEXT NOT NULL, `cadmium` REAL, `vitamin_a_retinol_equivalents` REAL, `sugar` REAL, `o_poly_fats` REAL, `cholecalciferol_d3` REAL, `potassium` REAL, `mercury` REAL, `dietary_folate_equivalents` REAL, `cobalt` REAL, `lactose` REAL, `manganese` REAL, `biotin_b7` REAL, `maltose` REAL, `maltotriose` REAL, `mono_fats` REAL, `selenium` REAL, `copper` REAL, `iodine` REAL, `t_poly_fats_g` REAL, `nickel` REAL, `glucose` REAL, `chromium` REAL, `antimony` REAL, `calcium` REAL, `sulphur` REAL, `nitrogen` REAL, `fructose` REAL, `lead` REAL, `sat_fats` REAL, `mono_fats_g` REAL, `ash` REAL, `aluminium` REAL, `t_poly_fats` REAL, `iron` REAL, `starch` REAL, `riboflavin_b2` REAL, `calories` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `meals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `products` TEXT NOT NULL, `mealType` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"261b486a451a9a72d06971071b9c6c9b\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `food`");
        _db.execSQL("DROP TABLE IF EXISTS `meals`");
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
        final HashMap<String, TableInfo.Column> _columnsFood = new HashMap<String, TableInfo.Column>(78);
        _columnsFood.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsFood.put("cryptoxanthin", new TableInfo.Column("cryptoxanthin", "REAL", false, 0));
        _columnsFood.put("totalfolates", new TableInfo.Column("totalfolates", "REAL", false, 0));
        _columnsFood.put("ergocalciferol_d2", new TableInfo.Column("ergocalciferol_d2", "REAL", false, 0));
        _columnsFood.put("niacin_b3", new TableInfo.Column("niacin_b3", "REAL", false, 0));
        _columnsFood.put("cobalamin_b12", new TableInfo.Column("cobalamin_b12", "REAL", false, 0));
        _columnsFood.put("energy_without_dietary_fibre", new TableInfo.Column("energy_without_dietary_fibre", "REAL", false, 0));
        _columnsFood.put("carbs", new TableInfo.Column("carbs", "REAL", true, 0));
        _columnsFood.put("fluoride", new TableInfo.Column("fluoride", "REAL", false, 0));
        _columnsFood.put("pantothenic_acid_b5", new TableInfo.Column("pantothenic_acid_b5", "REAL", false, 0));
        _columnsFood.put("thiamin_b1", new TableInfo.Column("thiamin_b1", "REAL", false, 0));
        _columnsFood.put("folicacid", new TableInfo.Column("folicacid", "REAL", false, 0));
        _columnsFood.put("retinol", new TableInfo.Column("retinol", "REAL", false, 0));
        _columnsFood.put("alpha_carotene", new TableInfo.Column("alpha_carotene", "REAL", false, 0));
        _columnsFood.put("pyridoxine_b6", new TableInfo.Column("pyridoxine_b6", "REAL", false, 0));
        _columnsFood.put("protein", new TableInfo.Column("protein", "REAL", true, 0));
        _columnsFood.put("fat", new TableInfo.Column("fat", "REAL", true, 0));
        _columnsFood.put("tin", new TableInfo.Column("tin", "REAL", false, 0));
        _columnsFood.put("chloride", new TableInfo.Column("chloride", "REAL", false, 0));
        _columnsFood.put("omega_g", new TableInfo.Column("omega_g", "REAL", false, 0));
        _columnsFood.put("zinc", new TableInfo.Column("zinc", "REAL", false, 0));
        _columnsFood.put("o_poly_fats_g", new TableInfo.Column("o_poly_fats_g", "REAL", false, 0));
        _columnsFood.put("energy", new TableInfo.Column("energy", "REAL", false, 0));
        _columnsFood.put("molybdenum", new TableInfo.Column("molybdenum", "REAL", false, 0));
        _columnsFood.put("phosphorus", new TableInfo.Column("phosphorus", "REAL", false, 0));
        _columnsFood.put("provitamin_a", new TableInfo.Column("provitamin_a", "REAL", false, 0));
        _columnsFood.put("alcohol", new TableInfo.Column("alcohol", "REAL", false, 0));
        _columnsFood.put("total_dietary_fibre", new TableInfo.Column("total_dietary_fibre", "REAL", false, 0));
        _columnsFood.put("sat_fats_g", new TableInfo.Column("sat_fats_g", "REAL", false, 0));
        _columnsFood.put("vitamin_c", new TableInfo.Column("vitamin_c", "REAL", false, 0));
        _columnsFood.put("vitamin_e", new TableInfo.Column("vitamin_e", "REAL", false, 0));
        _columnsFood.put("magnesium", new TableInfo.Column("magnesium", "REAL", false, 0));
        _columnsFood.put("galactose", new TableInfo.Column("galactose", "REAL", false, 0));
        _columnsFood.put("moisture", new TableInfo.Column("moisture", "REAL", false, 0));
        _columnsFood.put("folatenatural", new TableInfo.Column("folatenatural", "REAL", false, 0));
        _columnsFood.put("sucrose", new TableInfo.Column("sucrose", "REAL", false, 0));
        _columnsFood.put("arsenic", new TableInfo.Column("arsenic", "REAL", false, 0));
        _columnsFood.put("omega", new TableInfo.Column("omega", "REAL", false, 0));
        _columnsFood.put("sodium", new TableInfo.Column("sodium", "REAL", false, 0));
        _columnsFood.put("beta_carotene", new TableInfo.Column("beta_carotene", "REAL", false, 0));
        _columnsFood.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsFood.put("cadmium", new TableInfo.Column("cadmium", "REAL", false, 0));
        _columnsFood.put("vitamin_a_retinol_equivalents", new TableInfo.Column("vitamin_a_retinol_equivalents", "REAL", false, 0));
        _columnsFood.put("sugar", new TableInfo.Column("sugar", "REAL", false, 0));
        _columnsFood.put("o_poly_fats", new TableInfo.Column("o_poly_fats", "REAL", false, 0));
        _columnsFood.put("cholecalciferol_d3", new TableInfo.Column("cholecalciferol_d3", "REAL", false, 0));
        _columnsFood.put("potassium", new TableInfo.Column("potassium", "REAL", false, 0));
        _columnsFood.put("mercury", new TableInfo.Column("mercury", "REAL", false, 0));
        _columnsFood.put("dietary_folate_equivalents", new TableInfo.Column("dietary_folate_equivalents", "REAL", false, 0));
        _columnsFood.put("cobalt", new TableInfo.Column("cobalt", "REAL", false, 0));
        _columnsFood.put("lactose", new TableInfo.Column("lactose", "REAL", false, 0));
        _columnsFood.put("manganese", new TableInfo.Column("manganese", "REAL", false, 0));
        _columnsFood.put("biotin_b7", new TableInfo.Column("biotin_b7", "REAL", false, 0));
        _columnsFood.put("maltose", new TableInfo.Column("maltose", "REAL", false, 0));
        _columnsFood.put("maltotriose", new TableInfo.Column("maltotriose", "REAL", false, 0));
        _columnsFood.put("mono_fats", new TableInfo.Column("mono_fats", "REAL", false, 0));
        _columnsFood.put("selenium", new TableInfo.Column("selenium", "REAL", false, 0));
        _columnsFood.put("copper", new TableInfo.Column("copper", "REAL", false, 0));
        _columnsFood.put("iodine", new TableInfo.Column("iodine", "REAL", false, 0));
        _columnsFood.put("t_poly_fats_g", new TableInfo.Column("t_poly_fats_g", "REAL", false, 0));
        _columnsFood.put("nickel", new TableInfo.Column("nickel", "REAL", false, 0));
        _columnsFood.put("glucose", new TableInfo.Column("glucose", "REAL", false, 0));
        _columnsFood.put("chromium", new TableInfo.Column("chromium", "REAL", false, 0));
        _columnsFood.put("antimony", new TableInfo.Column("antimony", "REAL", false, 0));
        _columnsFood.put("calcium", new TableInfo.Column("calcium", "REAL", false, 0));
        _columnsFood.put("sulphur", new TableInfo.Column("sulphur", "REAL", false, 0));
        _columnsFood.put("nitrogen", new TableInfo.Column("nitrogen", "REAL", false, 0));
        _columnsFood.put("fructose", new TableInfo.Column("fructose", "REAL", false, 0));
        _columnsFood.put("lead", new TableInfo.Column("lead", "REAL", false, 0));
        _columnsFood.put("sat_fats", new TableInfo.Column("sat_fats", "REAL", false, 0));
        _columnsFood.put("mono_fats_g", new TableInfo.Column("mono_fats_g", "REAL", false, 0));
        _columnsFood.put("ash", new TableInfo.Column("ash", "REAL", false, 0));
        _columnsFood.put("aluminium", new TableInfo.Column("aluminium", "REAL", false, 0));
        _columnsFood.put("t_poly_fats", new TableInfo.Column("t_poly_fats", "REAL", false, 0));
        _columnsFood.put("iron", new TableInfo.Column("iron", "REAL", false, 0));
        _columnsFood.put("starch", new TableInfo.Column("starch", "REAL", false, 0));
        _columnsFood.put("riboflavin_b2", new TableInfo.Column("riboflavin_b2", "REAL", false, 0));
        _columnsFood.put("calories", new TableInfo.Column("calories", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFood = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFood = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFood = new TableInfo("food", _columnsFood, _foreignKeysFood, _indicesFood);
        final TableInfo _existingFood = TableInfo.read(_db, "food");
        if (! _infoFood.equals(_existingFood)) {
          throw new IllegalStateException("Migration didn't properly handle food(com.feedapp.app.data.models.FoodProduct).\n"
                  + " Expected:\n" + _infoFood + "\n"
                  + " Found:\n" + _existingFood);
        }
        final HashMap<String, TableInfo.Column> _columnsMeals = new HashMap<String, TableInfo.Column>(3);
        _columnsMeals.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsMeals.put("products", new TableInfo.Column("products", "TEXT", true, 0));
        _columnsMeals.put("mealType", new TableInfo.Column("mealType", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMeals = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMeals = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMeals = new TableInfo("meals", _columnsMeals, _foreignKeysMeals, _indicesMeals);
        final TableInfo _existingMeals = TableInfo.read(_db, "meals");
        if (! _infoMeals.equals(_existingMeals)) {
          throw new IllegalStateException("Migration didn't properly handle meals(com.feedapp.app.data.models.day.Meal).\n"
                  + " Expected:\n" + _infoMeals + "\n"
                  + " Found:\n" + _existingMeals);
        }
      }
    }, "261b486a451a9a72d06971071b9c6c9b", "b1e26abc564ce7530beaaa0b05fba40d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "food","meals");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `food`");
      _db.execSQL("DELETE FROM `meals`");
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
  public FoodProductDao getProductDao() {
    if (_foodProductDao != null) {
      return _foodProductDao;
    } else {
      synchronized(this) {
        if(_foodProductDao == null) {
          _foodProductDao = new FoodProductDao_Impl(this);
        }
        return _foodProductDao;
      }
    }
  }
}
