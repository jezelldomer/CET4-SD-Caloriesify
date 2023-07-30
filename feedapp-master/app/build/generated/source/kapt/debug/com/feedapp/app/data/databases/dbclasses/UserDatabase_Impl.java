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
import com.feedapp.app.data.databases.daos.DayDao;
import com.feedapp.app.data.databases.daos.DayDao_Impl;
import com.feedapp.app.data.databases.daos.RecentDao;
import com.feedapp.app.data.databases.daos.RecentDao_Impl;
import com.feedapp.app.data.databases.daos.UserDao;
import com.feedapp.app.data.databases.daos.UserDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class UserDatabase_Impl extends UserDatabase {
  private volatile UserDao _userDao;

  private volatile DayDao _dayDao;

  private volatile RecentDao _recentDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT, `caloriesNeeded` INTEGER NOT NULL, `proteinsNeeded` INTEGER NOT NULL, `carbsNeeded` INTEGER NOT NULL, `fatsNeeded` INTEGER NOT NULL, `measureType` INTEGER NOT NULL, `intolerance` TEXT, `diet` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `meals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `products` TEXT NOT NULL, `mealType` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food` (`id` INTEGER NOT NULL, `cryptoxanthin` REAL, `totalfolates` REAL, `ergocalciferol_d2` REAL, `niacin_b3` REAL, `cobalamin_b12` REAL, `energy_without_dietary_fibre` REAL, `carbs` REAL NOT NULL, `fluoride` REAL, `pantothenic_acid_b5` REAL, `thiamin_b1` REAL, `folicacid` REAL, `retinol` REAL, `alpha_carotene` REAL, `pyridoxine_b6` REAL, `protein` REAL NOT NULL, `fat` REAL NOT NULL, `tin` REAL, `chloride` REAL, `omega_g` REAL, `zinc` REAL, `o_poly_fats_g` REAL, `energy` REAL, `molybdenum` REAL, `phosphorus` REAL, `provitamin_a` REAL, `alcohol` REAL, `total_dietary_fibre` REAL, `sat_fats_g` REAL, `vitamin_c` REAL, `vitamin_e` REAL, `magnesium` REAL, `galactose` REAL, `moisture` REAL, `folatenatural` REAL, `sucrose` REAL, `arsenic` REAL, `omega` REAL, `sodium` REAL, `beta_carotene` REAL, `name` TEXT NOT NULL, `cadmium` REAL, `vitamin_a_retinol_equivalents` REAL, `sugar` REAL, `o_poly_fats` REAL, `cholecalciferol_d3` REAL, `potassium` REAL, `mercury` REAL, `dietary_folate_equivalents` REAL, `cobalt` REAL, `lactose` REAL, `manganese` REAL, `biotin_b7` REAL, `maltose` REAL, `maltotriose` REAL, `mono_fats` REAL, `selenium` REAL, `copper` REAL, `iodine` REAL, `t_poly_fats_g` REAL, `nickel` REAL, `glucose` REAL, `chromium` REAL, `antimony` REAL, `calcium` REAL, `sulphur` REAL, `nitrogen` REAL, `fructose` REAL, `lead` REAL, `sat_fats` REAL, `mono_fats_g` REAL, `ash` REAL, `aluminium` REAL, `t_poly_fats` REAL, `iron` REAL, `starch` REAL, `riboflavin_b2` REAL, `calories` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `products` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `foodProductId` INTEGER NOT NULL, `eatenGrams` REAL NOT NULL, `consumedCalories` REAL NOT NULL, `name` TEXT NOT NULL, `consumedCryptoxanthin` REAL, `consumedTotalfolates` REAL, `consumedErgocalciferol_d2` REAL, `consumedNiacin_b3` REAL, `consumedCobalamin_b12` REAL, `consumedEnergy_without_dietary_fibre` REAL, `consumedCarbs` REAL, `consumedFluoride` REAL, `consumedPantothenic_acid_b5` REAL, `consumedThiamin_b1` REAL, `consumedFolicacid` REAL, `consumedRetinol` REAL, `consumedAlpha_carotene` REAL, `consumedPyridoxine_b6` REAL, `consumedProtein` REAL, `consumedFat` REAL, `consumedTin` REAL, `consumedChloride` REAL, `consumedOmega_g` REAL, `consumedZinc` REAL, `consumedO_poly_fats_g` REAL, `consumedEnergy` REAL, `consumedMolybdenum` REAL, `consumedPhosphorus` REAL, `consumedProvitamin_a` REAL, `consumedAlcohol` REAL, `consumedTotal_dietary_fiber` REAL, `consumedSat_fats_g` REAL, `consumedVitamin_c` REAL, `consumedVitamin_e` REAL, `consumedMagnesium` REAL, `consumedGalactose` REAL, `consumedMoisture` REAL, `consumedFolatenatural` REAL, `consumedSucrose` REAL, `consumedArsenic` REAL, `consumedOmega` REAL, `consumedSodium` REAL, `consumedBeta_carotene` REAL, `consumedCadmium` REAL, `consumedVitamin_a_retinol_equivalents` REAL, `consumedSugar` REAL, `consumedO_poly_fats` REAL, `consumedCholecalciferol_d3` REAL, `consumedPotassium` REAL, `consumedMercury` REAL, `consumedDietary_folate_equivalents` REAL, `consumedCobalt` REAL, `consumedLactose` REAL, `consumedManganese` REAL, `consumedBiotin_b7` REAL, `consumedMaltose` REAL, `consumedMaltotriose` REAL, `consumedMono_fats` REAL, `consumedSelenium` REAL, `consumedCopper` REAL, `consumedIodine` REAL, `consumedT_poly_fats_g` REAL, `consumedNickel` REAL, `consumedGlucose` REAL, `consumedChromium` REAL, `consumedAntimony` REAL, `consumedCalcium` REAL, `consumedSulphur` REAL, `consumedNitrogen` REAL, `consumedFructose` REAL, `consumedLead` REAL, `consumedSat_fats` REAL, `consumedMono_fats_g` REAL, `consumedAsh` REAL, `consumedAluminium` REAL, `consumedT_poly_fats` REAL, `consumedIron` REAL, `consumedStarch` REAL, `consumedRiboflavin_b2` REAL, `consumedCholesterol` REAL, `consumedVitaminD` REAL, `consumedVitaminA` REAL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `days` (`dayId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `meals` TEXT NOT NULL, `waterNum` INTEGER NOT NULL, `month` TEXT NOT NULL, `day` TEXT NOT NULL, `year` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recentProducts` (`name` TEXT NOT NULL, `foodProductId` INTEGER NOT NULL, PRIMARY KEY(`name`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"84c9642b481b56f5c4e4fcfab68fede8\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user`");
        _db.execSQL("DROP TABLE IF EXISTS `meals`");
        _db.execSQL("DROP TABLE IF EXISTS `food`");
        _db.execSQL("DROP TABLE IF EXISTS `products`");
        _db.execSQL("DROP TABLE IF EXISTS `days`");
        _db.execSQL("DROP TABLE IF EXISTS `recentProducts`");
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
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(8);
        _columnsUser.put("uid", new TableInfo.Column("uid", "INTEGER", false, 1));
        _columnsUser.put("caloriesNeeded", new TableInfo.Column("caloriesNeeded", "INTEGER", true, 0));
        _columnsUser.put("proteinsNeeded", new TableInfo.Column("proteinsNeeded", "INTEGER", true, 0));
        _columnsUser.put("carbsNeeded", new TableInfo.Column("carbsNeeded", "INTEGER", true, 0));
        _columnsUser.put("fatsNeeded", new TableInfo.Column("fatsNeeded", "INTEGER", true, 0));
        _columnsUser.put("measureType", new TableInfo.Column("measureType", "INTEGER", true, 0));
        _columnsUser.put("intolerance", new TableInfo.Column("intolerance", "TEXT", false, 0));
        _columnsUser.put("diet", new TableInfo.Column("diet", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle user(com.feedapp.app.data.models.user.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
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
        final HashMap<String, TableInfo.Column> _columnsProducts = new HashMap<String, TableInfo.Column>(83);
        _columnsProducts.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsProducts.put("foodProductId", new TableInfo.Column("foodProductId", "INTEGER", true, 0));
        _columnsProducts.put("eatenGrams", new TableInfo.Column("eatenGrams", "REAL", true, 0));
        _columnsProducts.put("consumedCalories", new TableInfo.Column("consumedCalories", "REAL", true, 0));
        _columnsProducts.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsProducts.put("consumedCryptoxanthin", new TableInfo.Column("consumedCryptoxanthin", "REAL", false, 0));
        _columnsProducts.put("consumedTotalfolates", new TableInfo.Column("consumedTotalfolates", "REAL", false, 0));
        _columnsProducts.put("consumedErgocalciferol_d2", new TableInfo.Column("consumedErgocalciferol_d2", "REAL", false, 0));
        _columnsProducts.put("consumedNiacin_b3", new TableInfo.Column("consumedNiacin_b3", "REAL", false, 0));
        _columnsProducts.put("consumedCobalamin_b12", new TableInfo.Column("consumedCobalamin_b12", "REAL", false, 0));
        _columnsProducts.put("consumedEnergy_without_dietary_fibre", new TableInfo.Column("consumedEnergy_without_dietary_fibre", "REAL", false, 0));
        _columnsProducts.put("consumedCarbs", new TableInfo.Column("consumedCarbs", "REAL", false, 0));
        _columnsProducts.put("consumedFluoride", new TableInfo.Column("consumedFluoride", "REAL", false, 0));
        _columnsProducts.put("consumedPantothenic_acid_b5", new TableInfo.Column("consumedPantothenic_acid_b5", "REAL", false, 0));
        _columnsProducts.put("consumedThiamin_b1", new TableInfo.Column("consumedThiamin_b1", "REAL", false, 0));
        _columnsProducts.put("consumedFolicacid", new TableInfo.Column("consumedFolicacid", "REAL", false, 0));
        _columnsProducts.put("consumedRetinol", new TableInfo.Column("consumedRetinol", "REAL", false, 0));
        _columnsProducts.put("consumedAlpha_carotene", new TableInfo.Column("consumedAlpha_carotene", "REAL", false, 0));
        _columnsProducts.put("consumedPyridoxine_b6", new TableInfo.Column("consumedPyridoxine_b6", "REAL", false, 0));
        _columnsProducts.put("consumedProtein", new TableInfo.Column("consumedProtein", "REAL", false, 0));
        _columnsProducts.put("consumedFat", new TableInfo.Column("consumedFat", "REAL", false, 0));
        _columnsProducts.put("consumedTin", new TableInfo.Column("consumedTin", "REAL", false, 0));
        _columnsProducts.put("consumedChloride", new TableInfo.Column("consumedChloride", "REAL", false, 0));
        _columnsProducts.put("consumedOmega_g", new TableInfo.Column("consumedOmega_g", "REAL", false, 0));
        _columnsProducts.put("consumedZinc", new TableInfo.Column("consumedZinc", "REAL", false, 0));
        _columnsProducts.put("consumedO_poly_fats_g", new TableInfo.Column("consumedO_poly_fats_g", "REAL", false, 0));
        _columnsProducts.put("consumedEnergy", new TableInfo.Column("consumedEnergy", "REAL", false, 0));
        _columnsProducts.put("consumedMolybdenum", new TableInfo.Column("consumedMolybdenum", "REAL", false, 0));
        _columnsProducts.put("consumedPhosphorus", new TableInfo.Column("consumedPhosphorus", "REAL", false, 0));
        _columnsProducts.put("consumedProvitamin_a", new TableInfo.Column("consumedProvitamin_a", "REAL", false, 0));
        _columnsProducts.put("consumedAlcohol", new TableInfo.Column("consumedAlcohol", "REAL", false, 0));
        _columnsProducts.put("consumedTotal_dietary_fiber", new TableInfo.Column("consumedTotal_dietary_fiber", "REAL", false, 0));
        _columnsProducts.put("consumedSat_fats_g", new TableInfo.Column("consumedSat_fats_g", "REAL", false, 0));
        _columnsProducts.put("consumedVitamin_c", new TableInfo.Column("consumedVitamin_c", "REAL", false, 0));
        _columnsProducts.put("consumedVitamin_e", new TableInfo.Column("consumedVitamin_e", "REAL", false, 0));
        _columnsProducts.put("consumedMagnesium", new TableInfo.Column("consumedMagnesium", "REAL", false, 0));
        _columnsProducts.put("consumedGalactose", new TableInfo.Column("consumedGalactose", "REAL", false, 0));
        _columnsProducts.put("consumedMoisture", new TableInfo.Column("consumedMoisture", "REAL", false, 0));
        _columnsProducts.put("consumedFolatenatural", new TableInfo.Column("consumedFolatenatural", "REAL", false, 0));
        _columnsProducts.put("consumedSucrose", new TableInfo.Column("consumedSucrose", "REAL", false, 0));
        _columnsProducts.put("consumedArsenic", new TableInfo.Column("consumedArsenic", "REAL", false, 0));
        _columnsProducts.put("consumedOmega", new TableInfo.Column("consumedOmega", "REAL", false, 0));
        _columnsProducts.put("consumedSodium", new TableInfo.Column("consumedSodium", "REAL", false, 0));
        _columnsProducts.put("consumedBeta_carotene", new TableInfo.Column("consumedBeta_carotene", "REAL", false, 0));
        _columnsProducts.put("consumedCadmium", new TableInfo.Column("consumedCadmium", "REAL", false, 0));
        _columnsProducts.put("consumedVitamin_a_retinol_equivalents", new TableInfo.Column("consumedVitamin_a_retinol_equivalents", "REAL", false, 0));
        _columnsProducts.put("consumedSugar", new TableInfo.Column("consumedSugar", "REAL", false, 0));
        _columnsProducts.put("consumedO_poly_fats", new TableInfo.Column("consumedO_poly_fats", "REAL", false, 0));
        _columnsProducts.put("consumedCholecalciferol_d3", new TableInfo.Column("consumedCholecalciferol_d3", "REAL", false, 0));
        _columnsProducts.put("consumedPotassium", new TableInfo.Column("consumedPotassium", "REAL", false, 0));
        _columnsProducts.put("consumedMercury", new TableInfo.Column("consumedMercury", "REAL", false, 0));
        _columnsProducts.put("consumedDietary_folate_equivalents", new TableInfo.Column("consumedDietary_folate_equivalents", "REAL", false, 0));
        _columnsProducts.put("consumedCobalt", new TableInfo.Column("consumedCobalt", "REAL", false, 0));
        _columnsProducts.put("consumedLactose", new TableInfo.Column("consumedLactose", "REAL", false, 0));
        _columnsProducts.put("consumedManganese", new TableInfo.Column("consumedManganese", "REAL", false, 0));
        _columnsProducts.put("consumedBiotin_b7", new TableInfo.Column("consumedBiotin_b7", "REAL", false, 0));
        _columnsProducts.put("consumedMaltose", new TableInfo.Column("consumedMaltose", "REAL", false, 0));
        _columnsProducts.put("consumedMaltotriose", new TableInfo.Column("consumedMaltotriose", "REAL", false, 0));
        _columnsProducts.put("consumedMono_fats", new TableInfo.Column("consumedMono_fats", "REAL", false, 0));
        _columnsProducts.put("consumedSelenium", new TableInfo.Column("consumedSelenium", "REAL", false, 0));
        _columnsProducts.put("consumedCopper", new TableInfo.Column("consumedCopper", "REAL", false, 0));
        _columnsProducts.put("consumedIodine", new TableInfo.Column("consumedIodine", "REAL", false, 0));
        _columnsProducts.put("consumedT_poly_fats_g", new TableInfo.Column("consumedT_poly_fats_g", "REAL", false, 0));
        _columnsProducts.put("consumedNickel", new TableInfo.Column("consumedNickel", "REAL", false, 0));
        _columnsProducts.put("consumedGlucose", new TableInfo.Column("consumedGlucose", "REAL", false, 0));
        _columnsProducts.put("consumedChromium", new TableInfo.Column("consumedChromium", "REAL", false, 0));
        _columnsProducts.put("consumedAntimony", new TableInfo.Column("consumedAntimony", "REAL", false, 0));
        _columnsProducts.put("consumedCalcium", new TableInfo.Column("consumedCalcium", "REAL", false, 0));
        _columnsProducts.put("consumedSulphur", new TableInfo.Column("consumedSulphur", "REAL", false, 0));
        _columnsProducts.put("consumedNitrogen", new TableInfo.Column("consumedNitrogen", "REAL", false, 0));
        _columnsProducts.put("consumedFructose", new TableInfo.Column("consumedFructose", "REAL", false, 0));
        _columnsProducts.put("consumedLead", new TableInfo.Column("consumedLead", "REAL", false, 0));
        _columnsProducts.put("consumedSat_fats", new TableInfo.Column("consumedSat_fats", "REAL", false, 0));
        _columnsProducts.put("consumedMono_fats_g", new TableInfo.Column("consumedMono_fats_g", "REAL", false, 0));
        _columnsProducts.put("consumedAsh", new TableInfo.Column("consumedAsh", "REAL", false, 0));
        _columnsProducts.put("consumedAluminium", new TableInfo.Column("consumedAluminium", "REAL", false, 0));
        _columnsProducts.put("consumedT_poly_fats", new TableInfo.Column("consumedT_poly_fats", "REAL", false, 0));
        _columnsProducts.put("consumedIron", new TableInfo.Column("consumedIron", "REAL", false, 0));
        _columnsProducts.put("consumedStarch", new TableInfo.Column("consumedStarch", "REAL", false, 0));
        _columnsProducts.put("consumedRiboflavin_b2", new TableInfo.Column("consumedRiboflavin_b2", "REAL", false, 0));
        _columnsProducts.put("consumedCholesterol", new TableInfo.Column("consumedCholesterol", "REAL", false, 0));
        _columnsProducts.put("consumedVitaminD", new TableInfo.Column("consumedVitaminD", "REAL", false, 0));
        _columnsProducts.put("consumedVitaminA", new TableInfo.Column("consumedVitaminA", "REAL", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProducts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProducts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProducts = new TableInfo("products", _columnsProducts, _foreignKeysProducts, _indicesProducts);
        final TableInfo _existingProducts = TableInfo.read(_db, "products");
        if (! _infoProducts.equals(_existingProducts)) {
          throw new IllegalStateException("Migration didn't properly handle products(com.feedapp.app.data.models.Product).\n"
                  + " Expected:\n" + _infoProducts + "\n"
                  + " Found:\n" + _existingProducts);
        }
        final HashMap<String, TableInfo.Column> _columnsDays = new HashMap<String, TableInfo.Column>(6);
        _columnsDays.put("dayId", new TableInfo.Column("dayId", "INTEGER", true, 1));
        _columnsDays.put("meals", new TableInfo.Column("meals", "TEXT", true, 0));
        _columnsDays.put("waterNum", new TableInfo.Column("waterNum", "INTEGER", true, 0));
        _columnsDays.put("month", new TableInfo.Column("month", "TEXT", true, 0));
        _columnsDays.put("day", new TableInfo.Column("day", "TEXT", true, 0));
        _columnsDays.put("year", new TableInfo.Column("year", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDays = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDays = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDays = new TableInfo("days", _columnsDays, _foreignKeysDays, _indicesDays);
        final TableInfo _existingDays = TableInfo.read(_db, "days");
        if (! _infoDays.equals(_existingDays)) {
          throw new IllegalStateException("Migration didn't properly handle days(com.feedapp.app.data.models.day.Day).\n"
                  + " Expected:\n" + _infoDays + "\n"
                  + " Found:\n" + _existingDays);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentProducts = new HashMap<String, TableInfo.Column>(2);
        _columnsRecentProducts.put("name", new TableInfo.Column("name", "TEXT", true, 1));
        _columnsRecentProducts.put("foodProductId", new TableInfo.Column("foodProductId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentProducts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentProducts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecentProducts = new TableInfo("recentProducts", _columnsRecentProducts, _foreignKeysRecentProducts, _indicesRecentProducts);
        final TableInfo _existingRecentProducts = TableInfo.read(_db, "recentProducts");
        if (! _infoRecentProducts.equals(_existingRecentProducts)) {
          throw new IllegalStateException("Migration didn't properly handle recentProducts(com.feedapp.app.data.models.RecentProduct).\n"
                  + " Expected:\n" + _infoRecentProducts + "\n"
                  + " Found:\n" + _existingRecentProducts);
        }
      }
    }, "84c9642b481b56f5c4e4fcfab68fede8", "dd76c96d0a439ce60501720f49612b8e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "user","meals","food","products","days","recentProducts");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user`");
      _db.execSQL("DELETE FROM `meals`");
      _db.execSQL("DELETE FROM `food`");
      _db.execSQL("DELETE FROM `products`");
      _db.execSQL("DELETE FROM `days`");
      _db.execSQL("DELETE FROM `recentProducts`");
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
  public UserDao getUserDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public DayDao getDayDao() {
    if (_dayDao != null) {
      return _dayDao;
    } else {
      synchronized(this) {
        if(_dayDao == null) {
          _dayDao = new DayDao_Impl(this);
        }
        return _dayDao;
      }
    }
  }

  @Override
  public RecentDao getRecentDao() {
    if (_recentDao != null) {
      return _recentDao;
    } else {
      synchronized(this) {
        if(_recentDao == null) {
          _recentDao = new RecentDao_Impl(this);
        }
        return _recentDao;
      }
    }
  }
}
