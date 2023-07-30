package com.feedapp.app.data.databases.daos;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.feedapp.app.data.models.FoodProduct;
import java.lang.Float;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class FoodProductDao_Impl implements FoodProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfFoodProduct;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfFoodProduct;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCustomProducts;

  public FoodProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFoodProduct = new EntityInsertionAdapter<FoodProduct>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `food`(`id`,`cryptoxanthin`,`totalfolates`,`ergocalciferol_d2`,`niacin_b3`,`cobalamin_b12`,`energy_without_dietary_fibre`,`carbs`,`fluoride`,`pantothenic_acid_b5`,`thiamin_b1`,`folicacid`,`retinol`,`alpha_carotene`,`pyridoxine_b6`,`protein`,`fat`,`tin`,`chloride`,`omega_g`,`zinc`,`o_poly_fats_g`,`energy`,`molybdenum`,`phosphorus`,`provitamin_a`,`alcohol`,`total_dietary_fibre`,`sat_fats_g`,`vitamin_c`,`vitamin_e`,`magnesium`,`galactose`,`moisture`,`folatenatural`,`sucrose`,`arsenic`,`omega`,`sodium`,`beta_carotene`,`name`,`cadmium`,`vitamin_a_retinol_equivalents`,`sugar`,`o_poly_fats`,`cholecalciferol_d3`,`potassium`,`mercury`,`dietary_folate_equivalents`,`cobalt`,`lactose`,`manganese`,`biotin_b7`,`maltose`,`maltotriose`,`mono_fats`,`selenium`,`copper`,`iodine`,`t_poly_fats_g`,`nickel`,`glucose`,`chromium`,`antimony`,`calcium`,`sulphur`,`nitrogen`,`fructose`,`lead`,`sat_fats`,`mono_fats_g`,`ash`,`aluminium`,`t_poly_fats`,`iron`,`starch`,`riboflavin_b2`,`calories`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodProduct value) {
        stmt.bindLong(1, value.getId());
        if (value.getCryptoxanthin() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindDouble(2, value.getCryptoxanthin());
        }
        if (value.getTotalfolates() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getTotalfolates());
        }
        if (value.getErgocalciferol_d2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getErgocalciferol_d2());
        }
        if (value.getNiacin_b3() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getNiacin_b3());
        }
        if (value.getCobalamin_b12() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getCobalamin_b12());
        }
        if (value.getEnergy_without_dietary_fibre() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getEnergy_without_dietary_fibre());
        }
        stmt.bindDouble(8, value.getCarbs());
        if (value.getFluoride() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindDouble(9, value.getFluoride());
        }
        if (value.getPantothenic_acid_b5() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPantothenic_acid_b5());
        }
        if (value.getThiamin_b1() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindDouble(11, value.getThiamin_b1());
        }
        if (value.getFolicacid() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindDouble(12, value.getFolicacid());
        }
        if (value.getRetinol() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindDouble(13, value.getRetinol());
        }
        if (value.getAlpha_carotene() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getAlpha_carotene());
        }
        if (value.getPyridoxine_b6() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindDouble(15, value.getPyridoxine_b6());
        }
        stmt.bindDouble(16, value.getProteins());
        stmt.bindDouble(17, value.getFats());
        if (value.getTin() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindDouble(18, value.getTin());
        }
        if (value.getChloride() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindDouble(19, value.getChloride());
        }
        if (value.getOmega_g() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindDouble(20, value.getOmega_g());
        }
        if (value.getZinc() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindDouble(21, value.getZinc());
        }
        if (value.getO_poly_fats_g() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindDouble(22, value.getO_poly_fats_g());
        }
        if (value.getEnergy() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindDouble(23, value.getEnergy());
        }
        if (value.getMolybdenum() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindDouble(24, value.getMolybdenum());
        }
        if (value.getPhosphorus() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindDouble(25, value.getPhosphorus());
        }
        if (value.getProvitamin_a() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindDouble(26, value.getProvitamin_a());
        }
        if (value.getAlcohol() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindDouble(27, value.getAlcohol());
        }
        if (value.getTotal_dietary_fibre() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindDouble(28, value.getTotal_dietary_fibre());
        }
        if (value.getSat_fats_g() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindDouble(29, value.getSat_fats_g());
        }
        if (value.getVitamin_c() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindDouble(30, value.getVitamin_c());
        }
        if (value.getVitamin_e() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindDouble(31, value.getVitamin_e());
        }
        if (value.getMagnesium() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindDouble(32, value.getMagnesium());
        }
        if (value.getGalactose() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindDouble(33, value.getGalactose());
        }
        if (value.getMoisture() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindDouble(34, value.getMoisture());
        }
        if (value.getFolatenatural() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindDouble(35, value.getFolatenatural());
        }
        if (value.getSucrose() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindDouble(36, value.getSucrose());
        }
        if (value.getArsenic() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindDouble(37, value.getArsenic());
        }
        if (value.getOmega() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindDouble(38, value.getOmega());
        }
        if (value.getSodium() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindDouble(39, value.getSodium());
        }
        if (value.getBeta_carotene() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindDouble(40, value.getBeta_carotene());
        }
        if (value.getName() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getName());
        }
        if (value.getCadmium() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindDouble(42, value.getCadmium());
        }
        if (value.getVitamin_a_retinol_equivalents() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindDouble(43, value.getVitamin_a_retinol_equivalents());
        }
        if (value.getSugar() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindDouble(44, value.getSugar());
        }
        if (value.getO_poly_fats() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindDouble(45, value.getO_poly_fats());
        }
        if (value.getCholecalciferol_d3() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindDouble(46, value.getCholecalciferol_d3());
        }
        if (value.getPotassium() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindDouble(47, value.getPotassium());
        }
        if (value.getMercury() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindDouble(48, value.getMercury());
        }
        if (value.getDietary_folate_equivalents() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindDouble(49, value.getDietary_folate_equivalents());
        }
        if (value.getCobalt() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindDouble(50, value.getCobalt());
        }
        if (value.getLactose() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindDouble(51, value.getLactose());
        }
        if (value.getManganese() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindDouble(52, value.getManganese());
        }
        if (value.getBiotin_b7() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindDouble(53, value.getBiotin_b7());
        }
        if (value.getMaltose() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindDouble(54, value.getMaltose());
        }
        if (value.getMaltotriose() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindDouble(55, value.getMaltotriose());
        }
        if (value.getMono_fats() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindDouble(56, value.getMono_fats());
        }
        if (value.getSelenium() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindDouble(57, value.getSelenium());
        }
        if (value.getCopper() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindDouble(58, value.getCopper());
        }
        if (value.getIodine() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindDouble(59, value.getIodine());
        }
        if (value.getT_poly_fats_g() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindDouble(60, value.getT_poly_fats_g());
        }
        if (value.getNickel() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindDouble(61, value.getNickel());
        }
        if (value.getGlucose() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindDouble(62, value.getGlucose());
        }
        if (value.getChromium() == null) {
          stmt.bindNull(63);
        } else {
          stmt.bindDouble(63, value.getChromium());
        }
        if (value.getAntimony() == null) {
          stmt.bindNull(64);
        } else {
          stmt.bindDouble(64, value.getAntimony());
        }
        if (value.getCalcium() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindDouble(65, value.getCalcium());
        }
        if (value.getSulphur() == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindDouble(66, value.getSulphur());
        }
        if (value.getNitrogen() == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindDouble(67, value.getNitrogen());
        }
        if (value.getFructose() == null) {
          stmt.bindNull(68);
        } else {
          stmt.bindDouble(68, value.getFructose());
        }
        if (value.getLead() == null) {
          stmt.bindNull(69);
        } else {
          stmt.bindDouble(69, value.getLead());
        }
        if (value.getSat_fats() == null) {
          stmt.bindNull(70);
        } else {
          stmt.bindDouble(70, value.getSat_fats());
        }
        if (value.getMono_fats_g() == null) {
          stmt.bindNull(71);
        } else {
          stmt.bindDouble(71, value.getMono_fats_g());
        }
        if (value.getAsh() == null) {
          stmt.bindNull(72);
        } else {
          stmt.bindDouble(72, value.getAsh());
        }
        if (value.getAluminium() == null) {
          stmt.bindNull(73);
        } else {
          stmt.bindDouble(73, value.getAluminium());
        }
        if (value.getT_poly_fats() == null) {
          stmt.bindNull(74);
        } else {
          stmt.bindDouble(74, value.getT_poly_fats());
        }
        if (value.getIron() == null) {
          stmt.bindNull(75);
        } else {
          stmt.bindDouble(75, value.getIron());
        }
        if (value.getStarch() == null) {
          stmt.bindNull(76);
        } else {
          stmt.bindDouble(76, value.getStarch());
        }
        if (value.getRiboflavin_b2() == null) {
          stmt.bindNull(77);
        } else {
          stmt.bindDouble(77, value.getRiboflavin_b2());
        }
        stmt.bindDouble(78, value.getCalories());
      }
    };
    this.__deletionAdapterOfFoodProduct = new EntityDeletionOrUpdateAdapter<FoodProduct>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `food` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodProduct value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteCustomProducts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from food where id > 976";
        return _query;
      }
    };
  }

  @Override
  public void insertProduct(FoodProduct product) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFoodProduct.insert(product);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertProducts(List<FoodProduct> products) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFoodProduct.insert(products);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteProduct(FoodProduct product) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfFoodProduct.handle(product);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCustomProducts() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCustomProducts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCustomProducts.release(_stmt);
    }
  }

  @Override
  public List<FoodProduct> getAllFood() {
    final String _sql = "select * from food";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCryptoxanthin = _cursor.getColumnIndexOrThrow("cryptoxanthin");
      final int _cursorIndexOfTotalfolates = _cursor.getColumnIndexOrThrow("totalfolates");
      final int _cursorIndexOfErgocalciferolD2 = _cursor.getColumnIndexOrThrow("ergocalciferol_d2");
      final int _cursorIndexOfNiacinB3 = _cursor.getColumnIndexOrThrow("niacin_b3");
      final int _cursorIndexOfCobalaminB12 = _cursor.getColumnIndexOrThrow("cobalamin_b12");
      final int _cursorIndexOfEnergyWithoutDietaryFibre = _cursor.getColumnIndexOrThrow("energy_without_dietary_fibre");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfFluoride = _cursor.getColumnIndexOrThrow("fluoride");
      final int _cursorIndexOfPantothenicAcidB5 = _cursor.getColumnIndexOrThrow("pantothenic_acid_b5");
      final int _cursorIndexOfThiaminB1 = _cursor.getColumnIndexOrThrow("thiamin_b1");
      final int _cursorIndexOfFolicacid = _cursor.getColumnIndexOrThrow("folicacid");
      final int _cursorIndexOfRetinol = _cursor.getColumnIndexOrThrow("retinol");
      final int _cursorIndexOfAlphaCarotene = _cursor.getColumnIndexOrThrow("alpha_carotene");
      final int _cursorIndexOfPyridoxineB6 = _cursor.getColumnIndexOrThrow("pyridoxine_b6");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("protein");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fat");
      final int _cursorIndexOfTin = _cursor.getColumnIndexOrThrow("tin");
      final int _cursorIndexOfChloride = _cursor.getColumnIndexOrThrow("chloride");
      final int _cursorIndexOfOmegaG = _cursor.getColumnIndexOrThrow("omega_g");
      final int _cursorIndexOfZinc = _cursor.getColumnIndexOrThrow("zinc");
      final int _cursorIndexOfOPolyFatsG = _cursor.getColumnIndexOrThrow("o_poly_fats_g");
      final int _cursorIndexOfEnergy = _cursor.getColumnIndexOrThrow("energy");
      final int _cursorIndexOfMolybdenum = _cursor.getColumnIndexOrThrow("molybdenum");
      final int _cursorIndexOfPhosphorus = _cursor.getColumnIndexOrThrow("phosphorus");
      final int _cursorIndexOfProvitaminA = _cursor.getColumnIndexOrThrow("provitamin_a");
      final int _cursorIndexOfAlcohol = _cursor.getColumnIndexOrThrow("alcohol");
      final int _cursorIndexOfTotalDietaryFibre = _cursor.getColumnIndexOrThrow("total_dietary_fibre");
      final int _cursorIndexOfSatFatsG = _cursor.getColumnIndexOrThrow("sat_fats_g");
      final int _cursorIndexOfVitaminC = _cursor.getColumnIndexOrThrow("vitamin_c");
      final int _cursorIndexOfVitaminE = _cursor.getColumnIndexOrThrow("vitamin_e");
      final int _cursorIndexOfMagnesium = _cursor.getColumnIndexOrThrow("magnesium");
      final int _cursorIndexOfGalactose = _cursor.getColumnIndexOrThrow("galactose");
      final int _cursorIndexOfMoisture = _cursor.getColumnIndexOrThrow("moisture");
      final int _cursorIndexOfFolatenatural = _cursor.getColumnIndexOrThrow("folatenatural");
      final int _cursorIndexOfSucrose = _cursor.getColumnIndexOrThrow("sucrose");
      final int _cursorIndexOfArsenic = _cursor.getColumnIndexOrThrow("arsenic");
      final int _cursorIndexOfOmega = _cursor.getColumnIndexOrThrow("omega");
      final int _cursorIndexOfSodium = _cursor.getColumnIndexOrThrow("sodium");
      final int _cursorIndexOfBetaCarotene = _cursor.getColumnIndexOrThrow("beta_carotene");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCadmium = _cursor.getColumnIndexOrThrow("cadmium");
      final int _cursorIndexOfVitaminARetinolEquivalents = _cursor.getColumnIndexOrThrow("vitamin_a_retinol_equivalents");
      final int _cursorIndexOfSugar = _cursor.getColumnIndexOrThrow("sugar");
      final int _cursorIndexOfOPolyFats = _cursor.getColumnIndexOrThrow("o_poly_fats");
      final int _cursorIndexOfCholecalciferolD3 = _cursor.getColumnIndexOrThrow("cholecalciferol_d3");
      final int _cursorIndexOfPotassium = _cursor.getColumnIndexOrThrow("potassium");
      final int _cursorIndexOfMercury = _cursor.getColumnIndexOrThrow("mercury");
      final int _cursorIndexOfDietaryFolateEquivalents = _cursor.getColumnIndexOrThrow("dietary_folate_equivalents");
      final int _cursorIndexOfCobalt = _cursor.getColumnIndexOrThrow("cobalt");
      final int _cursorIndexOfLactose = _cursor.getColumnIndexOrThrow("lactose");
      final int _cursorIndexOfManganese = _cursor.getColumnIndexOrThrow("manganese");
      final int _cursorIndexOfBiotinB7 = _cursor.getColumnIndexOrThrow("biotin_b7");
      final int _cursorIndexOfMaltose = _cursor.getColumnIndexOrThrow("maltose");
      final int _cursorIndexOfMaltotriose = _cursor.getColumnIndexOrThrow("maltotriose");
      final int _cursorIndexOfMonoFats = _cursor.getColumnIndexOrThrow("mono_fats");
      final int _cursorIndexOfSelenium = _cursor.getColumnIndexOrThrow("selenium");
      final int _cursorIndexOfCopper = _cursor.getColumnIndexOrThrow("copper");
      final int _cursorIndexOfIodine = _cursor.getColumnIndexOrThrow("iodine");
      final int _cursorIndexOfTPolyFatsG = _cursor.getColumnIndexOrThrow("t_poly_fats_g");
      final int _cursorIndexOfNickel = _cursor.getColumnIndexOrThrow("nickel");
      final int _cursorIndexOfGlucose = _cursor.getColumnIndexOrThrow("glucose");
      final int _cursorIndexOfChromium = _cursor.getColumnIndexOrThrow("chromium");
      final int _cursorIndexOfAntimony = _cursor.getColumnIndexOrThrow("antimony");
      final int _cursorIndexOfCalcium = _cursor.getColumnIndexOrThrow("calcium");
      final int _cursorIndexOfSulphur = _cursor.getColumnIndexOrThrow("sulphur");
      final int _cursorIndexOfNitrogen = _cursor.getColumnIndexOrThrow("nitrogen");
      final int _cursorIndexOfFructose = _cursor.getColumnIndexOrThrow("fructose");
      final int _cursorIndexOfLead = _cursor.getColumnIndexOrThrow("lead");
      final int _cursorIndexOfSatFats = _cursor.getColumnIndexOrThrow("sat_fats");
      final int _cursorIndexOfMonoFatsG = _cursor.getColumnIndexOrThrow("mono_fats_g");
      final int _cursorIndexOfAsh = _cursor.getColumnIndexOrThrow("ash");
      final int _cursorIndexOfAluminium = _cursor.getColumnIndexOrThrow("aluminium");
      final int _cursorIndexOfTPolyFats = _cursor.getColumnIndexOrThrow("t_poly_fats");
      final int _cursorIndexOfIron = _cursor.getColumnIndexOrThrow("iron");
      final int _cursorIndexOfStarch = _cursor.getColumnIndexOrThrow("starch");
      final int _cursorIndexOfRiboflavinB2 = _cursor.getColumnIndexOrThrow("riboflavin_b2");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final List<FoodProduct> _result = new ArrayList<FoodProduct>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FoodProduct _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Float _tmpCryptoxanthin;
        if (_cursor.isNull(_cursorIndexOfCryptoxanthin)) {
          _tmpCryptoxanthin = null;
        } else {
          _tmpCryptoxanthin = _cursor.getFloat(_cursorIndexOfCryptoxanthin);
        }
        final Float _tmpTotalfolates;
        if (_cursor.isNull(_cursorIndexOfTotalfolates)) {
          _tmpTotalfolates = null;
        } else {
          _tmpTotalfolates = _cursor.getFloat(_cursorIndexOfTotalfolates);
        }
        final Float _tmpErgocalciferol_d2;
        if (_cursor.isNull(_cursorIndexOfErgocalciferolD2)) {
          _tmpErgocalciferol_d2 = null;
        } else {
          _tmpErgocalciferol_d2 = _cursor.getFloat(_cursorIndexOfErgocalciferolD2);
        }
        final Float _tmpNiacin_b3;
        if (_cursor.isNull(_cursorIndexOfNiacinB3)) {
          _tmpNiacin_b3 = null;
        } else {
          _tmpNiacin_b3 = _cursor.getFloat(_cursorIndexOfNiacinB3);
        }
        final Float _tmpCobalamin_b12;
        if (_cursor.isNull(_cursorIndexOfCobalaminB12)) {
          _tmpCobalamin_b12 = null;
        } else {
          _tmpCobalamin_b12 = _cursor.getFloat(_cursorIndexOfCobalaminB12);
        }
        final Float _tmpEnergy_without_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfEnergyWithoutDietaryFibre)) {
          _tmpEnergy_without_dietary_fibre = null;
        } else {
          _tmpEnergy_without_dietary_fibre = _cursor.getFloat(_cursorIndexOfEnergyWithoutDietaryFibre);
        }
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final Float _tmpFluoride;
        if (_cursor.isNull(_cursorIndexOfFluoride)) {
          _tmpFluoride = null;
        } else {
          _tmpFluoride = _cursor.getFloat(_cursorIndexOfFluoride);
        }
        final Float _tmpPantothenic_acid_b5;
        if (_cursor.isNull(_cursorIndexOfPantothenicAcidB5)) {
          _tmpPantothenic_acid_b5 = null;
        } else {
          _tmpPantothenic_acid_b5 = _cursor.getFloat(_cursorIndexOfPantothenicAcidB5);
        }
        final Float _tmpThiamin_b1;
        if (_cursor.isNull(_cursorIndexOfThiaminB1)) {
          _tmpThiamin_b1 = null;
        } else {
          _tmpThiamin_b1 = _cursor.getFloat(_cursorIndexOfThiaminB1);
        }
        final Float _tmpFolicacid;
        if (_cursor.isNull(_cursorIndexOfFolicacid)) {
          _tmpFolicacid = null;
        } else {
          _tmpFolicacid = _cursor.getFloat(_cursorIndexOfFolicacid);
        }
        final Float _tmpRetinol;
        if (_cursor.isNull(_cursorIndexOfRetinol)) {
          _tmpRetinol = null;
        } else {
          _tmpRetinol = _cursor.getFloat(_cursorIndexOfRetinol);
        }
        final Float _tmpAlpha_carotene;
        if (_cursor.isNull(_cursorIndexOfAlphaCarotene)) {
          _tmpAlpha_carotene = null;
        } else {
          _tmpAlpha_carotene = _cursor.getFloat(_cursorIndexOfAlphaCarotene);
        }
        final Float _tmpPyridoxine_b6;
        if (_cursor.isNull(_cursorIndexOfPyridoxineB6)) {
          _tmpPyridoxine_b6 = null;
        } else {
          _tmpPyridoxine_b6 = _cursor.getFloat(_cursorIndexOfPyridoxineB6);
        }
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final Float _tmpTin;
        if (_cursor.isNull(_cursorIndexOfTin)) {
          _tmpTin = null;
        } else {
          _tmpTin = _cursor.getFloat(_cursorIndexOfTin);
        }
        final Float _tmpChloride;
        if (_cursor.isNull(_cursorIndexOfChloride)) {
          _tmpChloride = null;
        } else {
          _tmpChloride = _cursor.getFloat(_cursorIndexOfChloride);
        }
        final Float _tmpOmega_g;
        if (_cursor.isNull(_cursorIndexOfOmegaG)) {
          _tmpOmega_g = null;
        } else {
          _tmpOmega_g = _cursor.getFloat(_cursorIndexOfOmegaG);
        }
        final Float _tmpZinc;
        if (_cursor.isNull(_cursorIndexOfZinc)) {
          _tmpZinc = null;
        } else {
          _tmpZinc = _cursor.getFloat(_cursorIndexOfZinc);
        }
        final Float _tmpO_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfOPolyFatsG)) {
          _tmpO_poly_fats_g = null;
        } else {
          _tmpO_poly_fats_g = _cursor.getFloat(_cursorIndexOfOPolyFatsG);
        }
        final Float _tmpEnergy;
        if (_cursor.isNull(_cursorIndexOfEnergy)) {
          _tmpEnergy = null;
        } else {
          _tmpEnergy = _cursor.getFloat(_cursorIndexOfEnergy);
        }
        final Float _tmpMolybdenum;
        if (_cursor.isNull(_cursorIndexOfMolybdenum)) {
          _tmpMolybdenum = null;
        } else {
          _tmpMolybdenum = _cursor.getFloat(_cursorIndexOfMolybdenum);
        }
        final Float _tmpPhosphorus;
        if (_cursor.isNull(_cursorIndexOfPhosphorus)) {
          _tmpPhosphorus = null;
        } else {
          _tmpPhosphorus = _cursor.getFloat(_cursorIndexOfPhosphorus);
        }
        final Float _tmpProvitamin_a;
        if (_cursor.isNull(_cursorIndexOfProvitaminA)) {
          _tmpProvitamin_a = null;
        } else {
          _tmpProvitamin_a = _cursor.getFloat(_cursorIndexOfProvitaminA);
        }
        final Float _tmpAlcohol;
        if (_cursor.isNull(_cursorIndexOfAlcohol)) {
          _tmpAlcohol = null;
        } else {
          _tmpAlcohol = _cursor.getFloat(_cursorIndexOfAlcohol);
        }
        final Float _tmpTotal_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfTotalDietaryFibre)) {
          _tmpTotal_dietary_fibre = null;
        } else {
          _tmpTotal_dietary_fibre = _cursor.getFloat(_cursorIndexOfTotalDietaryFibre);
        }
        final Float _tmpSat_fats_g;
        if (_cursor.isNull(_cursorIndexOfSatFatsG)) {
          _tmpSat_fats_g = null;
        } else {
          _tmpSat_fats_g = _cursor.getFloat(_cursorIndexOfSatFatsG);
        }
        final Float _tmpVitamin_c;
        if (_cursor.isNull(_cursorIndexOfVitaminC)) {
          _tmpVitamin_c = null;
        } else {
          _tmpVitamin_c = _cursor.getFloat(_cursorIndexOfVitaminC);
        }
        final Float _tmpVitamin_e;
        if (_cursor.isNull(_cursorIndexOfVitaminE)) {
          _tmpVitamin_e = null;
        } else {
          _tmpVitamin_e = _cursor.getFloat(_cursorIndexOfVitaminE);
        }
        final Float _tmpMagnesium;
        if (_cursor.isNull(_cursorIndexOfMagnesium)) {
          _tmpMagnesium = null;
        } else {
          _tmpMagnesium = _cursor.getFloat(_cursorIndexOfMagnesium);
        }
        final Float _tmpGalactose;
        if (_cursor.isNull(_cursorIndexOfGalactose)) {
          _tmpGalactose = null;
        } else {
          _tmpGalactose = _cursor.getFloat(_cursorIndexOfGalactose);
        }
        final Float _tmpMoisture;
        if (_cursor.isNull(_cursorIndexOfMoisture)) {
          _tmpMoisture = null;
        } else {
          _tmpMoisture = _cursor.getFloat(_cursorIndexOfMoisture);
        }
        final Float _tmpFolatenatural;
        if (_cursor.isNull(_cursorIndexOfFolatenatural)) {
          _tmpFolatenatural = null;
        } else {
          _tmpFolatenatural = _cursor.getFloat(_cursorIndexOfFolatenatural);
        }
        final Float _tmpSucrose;
        if (_cursor.isNull(_cursorIndexOfSucrose)) {
          _tmpSucrose = null;
        } else {
          _tmpSucrose = _cursor.getFloat(_cursorIndexOfSucrose);
        }
        final Float _tmpArsenic;
        if (_cursor.isNull(_cursorIndexOfArsenic)) {
          _tmpArsenic = null;
        } else {
          _tmpArsenic = _cursor.getFloat(_cursorIndexOfArsenic);
        }
        final Float _tmpOmega;
        if (_cursor.isNull(_cursorIndexOfOmega)) {
          _tmpOmega = null;
        } else {
          _tmpOmega = _cursor.getFloat(_cursorIndexOfOmega);
        }
        final Float _tmpSodium;
        if (_cursor.isNull(_cursorIndexOfSodium)) {
          _tmpSodium = null;
        } else {
          _tmpSodium = _cursor.getFloat(_cursorIndexOfSodium);
        }
        final Float _tmpBeta_carotene;
        if (_cursor.isNull(_cursorIndexOfBetaCarotene)) {
          _tmpBeta_carotene = null;
        } else {
          _tmpBeta_carotene = _cursor.getFloat(_cursorIndexOfBetaCarotene);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final Float _tmpCadmium;
        if (_cursor.isNull(_cursorIndexOfCadmium)) {
          _tmpCadmium = null;
        } else {
          _tmpCadmium = _cursor.getFloat(_cursorIndexOfCadmium);
        }
        final Float _tmpVitamin_a_retinol_equivalents;
        if (_cursor.isNull(_cursorIndexOfVitaminARetinolEquivalents)) {
          _tmpVitamin_a_retinol_equivalents = null;
        } else {
          _tmpVitamin_a_retinol_equivalents = _cursor.getFloat(_cursorIndexOfVitaminARetinolEquivalents);
        }
        final Float _tmpSugar;
        if (_cursor.isNull(_cursorIndexOfSugar)) {
          _tmpSugar = null;
        } else {
          _tmpSugar = _cursor.getFloat(_cursorIndexOfSugar);
        }
        final Float _tmpO_poly_fats;
        if (_cursor.isNull(_cursorIndexOfOPolyFats)) {
          _tmpO_poly_fats = null;
        } else {
          _tmpO_poly_fats = _cursor.getFloat(_cursorIndexOfOPolyFats);
        }
        final Float _tmpCholecalciferol_d3;
        if (_cursor.isNull(_cursorIndexOfCholecalciferolD3)) {
          _tmpCholecalciferol_d3 = null;
        } else {
          _tmpCholecalciferol_d3 = _cursor.getFloat(_cursorIndexOfCholecalciferolD3);
        }
        final Float _tmpPotassium;
        if (_cursor.isNull(_cursorIndexOfPotassium)) {
          _tmpPotassium = null;
        } else {
          _tmpPotassium = _cursor.getFloat(_cursorIndexOfPotassium);
        }
        final Float _tmpMercury;
        if (_cursor.isNull(_cursorIndexOfMercury)) {
          _tmpMercury = null;
        } else {
          _tmpMercury = _cursor.getFloat(_cursorIndexOfMercury);
        }
        final Float _tmpDietary_folate_equivalents;
        if (_cursor.isNull(_cursorIndexOfDietaryFolateEquivalents)) {
          _tmpDietary_folate_equivalents = null;
        } else {
          _tmpDietary_folate_equivalents = _cursor.getFloat(_cursorIndexOfDietaryFolateEquivalents);
        }
        final Float _tmpCobalt;
        if (_cursor.isNull(_cursorIndexOfCobalt)) {
          _tmpCobalt = null;
        } else {
          _tmpCobalt = _cursor.getFloat(_cursorIndexOfCobalt);
        }
        final Float _tmpLactose;
        if (_cursor.isNull(_cursorIndexOfLactose)) {
          _tmpLactose = null;
        } else {
          _tmpLactose = _cursor.getFloat(_cursorIndexOfLactose);
        }
        final Float _tmpManganese;
        if (_cursor.isNull(_cursorIndexOfManganese)) {
          _tmpManganese = null;
        } else {
          _tmpManganese = _cursor.getFloat(_cursorIndexOfManganese);
        }
        final Float _tmpBiotin_b7;
        if (_cursor.isNull(_cursorIndexOfBiotinB7)) {
          _tmpBiotin_b7 = null;
        } else {
          _tmpBiotin_b7 = _cursor.getFloat(_cursorIndexOfBiotinB7);
        }
        final Float _tmpMaltose;
        if (_cursor.isNull(_cursorIndexOfMaltose)) {
          _tmpMaltose = null;
        } else {
          _tmpMaltose = _cursor.getFloat(_cursorIndexOfMaltose);
        }
        final Float _tmpMaltotriose;
        if (_cursor.isNull(_cursorIndexOfMaltotriose)) {
          _tmpMaltotriose = null;
        } else {
          _tmpMaltotriose = _cursor.getFloat(_cursorIndexOfMaltotriose);
        }
        final Float _tmpMono_fats;
        if (_cursor.isNull(_cursorIndexOfMonoFats)) {
          _tmpMono_fats = null;
        } else {
          _tmpMono_fats = _cursor.getFloat(_cursorIndexOfMonoFats);
        }
        final Float _tmpSelenium;
        if (_cursor.isNull(_cursorIndexOfSelenium)) {
          _tmpSelenium = null;
        } else {
          _tmpSelenium = _cursor.getFloat(_cursorIndexOfSelenium);
        }
        final Float _tmpCopper;
        if (_cursor.isNull(_cursorIndexOfCopper)) {
          _tmpCopper = null;
        } else {
          _tmpCopper = _cursor.getFloat(_cursorIndexOfCopper);
        }
        final Float _tmpIodine;
        if (_cursor.isNull(_cursorIndexOfIodine)) {
          _tmpIodine = null;
        } else {
          _tmpIodine = _cursor.getFloat(_cursorIndexOfIodine);
        }
        final Float _tmpT_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfTPolyFatsG)) {
          _tmpT_poly_fats_g = null;
        } else {
          _tmpT_poly_fats_g = _cursor.getFloat(_cursorIndexOfTPolyFatsG);
        }
        final Float _tmpNickel;
        if (_cursor.isNull(_cursorIndexOfNickel)) {
          _tmpNickel = null;
        } else {
          _tmpNickel = _cursor.getFloat(_cursorIndexOfNickel);
        }
        final Float _tmpGlucose;
        if (_cursor.isNull(_cursorIndexOfGlucose)) {
          _tmpGlucose = null;
        } else {
          _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
        }
        final Float _tmpChromium;
        if (_cursor.isNull(_cursorIndexOfChromium)) {
          _tmpChromium = null;
        } else {
          _tmpChromium = _cursor.getFloat(_cursorIndexOfChromium);
        }
        final Float _tmpAntimony;
        if (_cursor.isNull(_cursorIndexOfAntimony)) {
          _tmpAntimony = null;
        } else {
          _tmpAntimony = _cursor.getFloat(_cursorIndexOfAntimony);
        }
        final Float _tmpCalcium;
        if (_cursor.isNull(_cursorIndexOfCalcium)) {
          _tmpCalcium = null;
        } else {
          _tmpCalcium = _cursor.getFloat(_cursorIndexOfCalcium);
        }
        final Float _tmpSulphur;
        if (_cursor.isNull(_cursorIndexOfSulphur)) {
          _tmpSulphur = null;
        } else {
          _tmpSulphur = _cursor.getFloat(_cursorIndexOfSulphur);
        }
        final Float _tmpNitrogen;
        if (_cursor.isNull(_cursorIndexOfNitrogen)) {
          _tmpNitrogen = null;
        } else {
          _tmpNitrogen = _cursor.getFloat(_cursorIndexOfNitrogen);
        }
        final Float _tmpFructose;
        if (_cursor.isNull(_cursorIndexOfFructose)) {
          _tmpFructose = null;
        } else {
          _tmpFructose = _cursor.getFloat(_cursorIndexOfFructose);
        }
        final Float _tmpLead;
        if (_cursor.isNull(_cursorIndexOfLead)) {
          _tmpLead = null;
        } else {
          _tmpLead = _cursor.getFloat(_cursorIndexOfLead);
        }
        final Float _tmpSat_fats;
        if (_cursor.isNull(_cursorIndexOfSatFats)) {
          _tmpSat_fats = null;
        } else {
          _tmpSat_fats = _cursor.getFloat(_cursorIndexOfSatFats);
        }
        final Float _tmpMono_fats_g;
        if (_cursor.isNull(_cursorIndexOfMonoFatsG)) {
          _tmpMono_fats_g = null;
        } else {
          _tmpMono_fats_g = _cursor.getFloat(_cursorIndexOfMonoFatsG);
        }
        final Float _tmpAsh;
        if (_cursor.isNull(_cursorIndexOfAsh)) {
          _tmpAsh = null;
        } else {
          _tmpAsh = _cursor.getFloat(_cursorIndexOfAsh);
        }
        final Float _tmpAluminium;
        if (_cursor.isNull(_cursorIndexOfAluminium)) {
          _tmpAluminium = null;
        } else {
          _tmpAluminium = _cursor.getFloat(_cursorIndexOfAluminium);
        }
        final Float _tmpT_poly_fats;
        if (_cursor.isNull(_cursorIndexOfTPolyFats)) {
          _tmpT_poly_fats = null;
        } else {
          _tmpT_poly_fats = _cursor.getFloat(_cursorIndexOfTPolyFats);
        }
        final Float _tmpIron;
        if (_cursor.isNull(_cursorIndexOfIron)) {
          _tmpIron = null;
        } else {
          _tmpIron = _cursor.getFloat(_cursorIndexOfIron);
        }
        final Float _tmpStarch;
        if (_cursor.isNull(_cursorIndexOfStarch)) {
          _tmpStarch = null;
        } else {
          _tmpStarch = _cursor.getFloat(_cursorIndexOfStarch);
        }
        final Float _tmpRiboflavin_b2;
        if (_cursor.isNull(_cursorIndexOfRiboflavinB2)) {
          _tmpRiboflavin_b2 = null;
        } else {
          _tmpRiboflavin_b2 = _cursor.getFloat(_cursorIndexOfRiboflavinB2);
        }
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _item = new FoodProduct(_tmpId,_tmpCryptoxanthin,_tmpTotalfolates,_tmpErgocalciferol_d2,_tmpNiacin_b3,_tmpCobalamin_b12,_tmpEnergy_without_dietary_fibre,_tmpCarbs,_tmpFluoride,_tmpPantothenic_acid_b5,_tmpThiamin_b1,_tmpFolicacid,_tmpRetinol,_tmpAlpha_carotene,_tmpPyridoxine_b6,_tmpProteins,_tmpFats,_tmpTin,_tmpChloride,_tmpOmega_g,_tmpZinc,_tmpO_poly_fats_g,_tmpEnergy,_tmpMolybdenum,_tmpPhosphorus,_tmpProvitamin_a,_tmpAlcohol,_tmpTotal_dietary_fibre,_tmpSat_fats_g,_tmpVitamin_c,_tmpVitamin_e,_tmpMagnesium,_tmpGalactose,_tmpMoisture,_tmpFolatenatural,_tmpSucrose,_tmpArsenic,_tmpOmega,_tmpSodium,_tmpBeta_carotene,_tmpName,_tmpCadmium,_tmpVitamin_a_retinol_equivalents,_tmpSugar,_tmpO_poly_fats,_tmpCholecalciferol_d3,_tmpPotassium,_tmpMercury,_tmpDietary_folate_equivalents,_tmpCobalt,_tmpLactose,_tmpManganese,_tmpBiotin_b7,_tmpMaltose,_tmpMaltotriose,_tmpMono_fats,_tmpSelenium,_tmpCopper,_tmpIodine,_tmpT_poly_fats_g,_tmpNickel,_tmpGlucose,_tmpChromium,_tmpAntimony,_tmpCalcium,_tmpSulphur,_tmpNitrogen,_tmpFructose,_tmpLead,_tmpSat_fats,_tmpMono_fats_g,_tmpAsh,_tmpAluminium,_tmpT_poly_fats,_tmpIron,_tmpStarch,_tmpRiboflavin_b2,_tmpCalories);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<FoodProduct> searchByName(String name) {
    final String _sql = "select * from food where name like '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCryptoxanthin = _cursor.getColumnIndexOrThrow("cryptoxanthin");
      final int _cursorIndexOfTotalfolates = _cursor.getColumnIndexOrThrow("totalfolates");
      final int _cursorIndexOfErgocalciferolD2 = _cursor.getColumnIndexOrThrow("ergocalciferol_d2");
      final int _cursorIndexOfNiacinB3 = _cursor.getColumnIndexOrThrow("niacin_b3");
      final int _cursorIndexOfCobalaminB12 = _cursor.getColumnIndexOrThrow("cobalamin_b12");
      final int _cursorIndexOfEnergyWithoutDietaryFibre = _cursor.getColumnIndexOrThrow("energy_without_dietary_fibre");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfFluoride = _cursor.getColumnIndexOrThrow("fluoride");
      final int _cursorIndexOfPantothenicAcidB5 = _cursor.getColumnIndexOrThrow("pantothenic_acid_b5");
      final int _cursorIndexOfThiaminB1 = _cursor.getColumnIndexOrThrow("thiamin_b1");
      final int _cursorIndexOfFolicacid = _cursor.getColumnIndexOrThrow("folicacid");
      final int _cursorIndexOfRetinol = _cursor.getColumnIndexOrThrow("retinol");
      final int _cursorIndexOfAlphaCarotene = _cursor.getColumnIndexOrThrow("alpha_carotene");
      final int _cursorIndexOfPyridoxineB6 = _cursor.getColumnIndexOrThrow("pyridoxine_b6");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("protein");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fat");
      final int _cursorIndexOfTin = _cursor.getColumnIndexOrThrow("tin");
      final int _cursorIndexOfChloride = _cursor.getColumnIndexOrThrow("chloride");
      final int _cursorIndexOfOmegaG = _cursor.getColumnIndexOrThrow("omega_g");
      final int _cursorIndexOfZinc = _cursor.getColumnIndexOrThrow("zinc");
      final int _cursorIndexOfOPolyFatsG = _cursor.getColumnIndexOrThrow("o_poly_fats_g");
      final int _cursorIndexOfEnergy = _cursor.getColumnIndexOrThrow("energy");
      final int _cursorIndexOfMolybdenum = _cursor.getColumnIndexOrThrow("molybdenum");
      final int _cursorIndexOfPhosphorus = _cursor.getColumnIndexOrThrow("phosphorus");
      final int _cursorIndexOfProvitaminA = _cursor.getColumnIndexOrThrow("provitamin_a");
      final int _cursorIndexOfAlcohol = _cursor.getColumnIndexOrThrow("alcohol");
      final int _cursorIndexOfTotalDietaryFibre = _cursor.getColumnIndexOrThrow("total_dietary_fibre");
      final int _cursorIndexOfSatFatsG = _cursor.getColumnIndexOrThrow("sat_fats_g");
      final int _cursorIndexOfVitaminC = _cursor.getColumnIndexOrThrow("vitamin_c");
      final int _cursorIndexOfVitaminE = _cursor.getColumnIndexOrThrow("vitamin_e");
      final int _cursorIndexOfMagnesium = _cursor.getColumnIndexOrThrow("magnesium");
      final int _cursorIndexOfGalactose = _cursor.getColumnIndexOrThrow("galactose");
      final int _cursorIndexOfMoisture = _cursor.getColumnIndexOrThrow("moisture");
      final int _cursorIndexOfFolatenatural = _cursor.getColumnIndexOrThrow("folatenatural");
      final int _cursorIndexOfSucrose = _cursor.getColumnIndexOrThrow("sucrose");
      final int _cursorIndexOfArsenic = _cursor.getColumnIndexOrThrow("arsenic");
      final int _cursorIndexOfOmega = _cursor.getColumnIndexOrThrow("omega");
      final int _cursorIndexOfSodium = _cursor.getColumnIndexOrThrow("sodium");
      final int _cursorIndexOfBetaCarotene = _cursor.getColumnIndexOrThrow("beta_carotene");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCadmium = _cursor.getColumnIndexOrThrow("cadmium");
      final int _cursorIndexOfVitaminARetinolEquivalents = _cursor.getColumnIndexOrThrow("vitamin_a_retinol_equivalents");
      final int _cursorIndexOfSugar = _cursor.getColumnIndexOrThrow("sugar");
      final int _cursorIndexOfOPolyFats = _cursor.getColumnIndexOrThrow("o_poly_fats");
      final int _cursorIndexOfCholecalciferolD3 = _cursor.getColumnIndexOrThrow("cholecalciferol_d3");
      final int _cursorIndexOfPotassium = _cursor.getColumnIndexOrThrow("potassium");
      final int _cursorIndexOfMercury = _cursor.getColumnIndexOrThrow("mercury");
      final int _cursorIndexOfDietaryFolateEquivalents = _cursor.getColumnIndexOrThrow("dietary_folate_equivalents");
      final int _cursorIndexOfCobalt = _cursor.getColumnIndexOrThrow("cobalt");
      final int _cursorIndexOfLactose = _cursor.getColumnIndexOrThrow("lactose");
      final int _cursorIndexOfManganese = _cursor.getColumnIndexOrThrow("manganese");
      final int _cursorIndexOfBiotinB7 = _cursor.getColumnIndexOrThrow("biotin_b7");
      final int _cursorIndexOfMaltose = _cursor.getColumnIndexOrThrow("maltose");
      final int _cursorIndexOfMaltotriose = _cursor.getColumnIndexOrThrow("maltotriose");
      final int _cursorIndexOfMonoFats = _cursor.getColumnIndexOrThrow("mono_fats");
      final int _cursorIndexOfSelenium = _cursor.getColumnIndexOrThrow("selenium");
      final int _cursorIndexOfCopper = _cursor.getColumnIndexOrThrow("copper");
      final int _cursorIndexOfIodine = _cursor.getColumnIndexOrThrow("iodine");
      final int _cursorIndexOfTPolyFatsG = _cursor.getColumnIndexOrThrow("t_poly_fats_g");
      final int _cursorIndexOfNickel = _cursor.getColumnIndexOrThrow("nickel");
      final int _cursorIndexOfGlucose = _cursor.getColumnIndexOrThrow("glucose");
      final int _cursorIndexOfChromium = _cursor.getColumnIndexOrThrow("chromium");
      final int _cursorIndexOfAntimony = _cursor.getColumnIndexOrThrow("antimony");
      final int _cursorIndexOfCalcium = _cursor.getColumnIndexOrThrow("calcium");
      final int _cursorIndexOfSulphur = _cursor.getColumnIndexOrThrow("sulphur");
      final int _cursorIndexOfNitrogen = _cursor.getColumnIndexOrThrow("nitrogen");
      final int _cursorIndexOfFructose = _cursor.getColumnIndexOrThrow("fructose");
      final int _cursorIndexOfLead = _cursor.getColumnIndexOrThrow("lead");
      final int _cursorIndexOfSatFats = _cursor.getColumnIndexOrThrow("sat_fats");
      final int _cursorIndexOfMonoFatsG = _cursor.getColumnIndexOrThrow("mono_fats_g");
      final int _cursorIndexOfAsh = _cursor.getColumnIndexOrThrow("ash");
      final int _cursorIndexOfAluminium = _cursor.getColumnIndexOrThrow("aluminium");
      final int _cursorIndexOfTPolyFats = _cursor.getColumnIndexOrThrow("t_poly_fats");
      final int _cursorIndexOfIron = _cursor.getColumnIndexOrThrow("iron");
      final int _cursorIndexOfStarch = _cursor.getColumnIndexOrThrow("starch");
      final int _cursorIndexOfRiboflavinB2 = _cursor.getColumnIndexOrThrow("riboflavin_b2");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final List<FoodProduct> _result = new ArrayList<FoodProduct>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FoodProduct _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Float _tmpCryptoxanthin;
        if (_cursor.isNull(_cursorIndexOfCryptoxanthin)) {
          _tmpCryptoxanthin = null;
        } else {
          _tmpCryptoxanthin = _cursor.getFloat(_cursorIndexOfCryptoxanthin);
        }
        final Float _tmpTotalfolates;
        if (_cursor.isNull(_cursorIndexOfTotalfolates)) {
          _tmpTotalfolates = null;
        } else {
          _tmpTotalfolates = _cursor.getFloat(_cursorIndexOfTotalfolates);
        }
        final Float _tmpErgocalciferol_d2;
        if (_cursor.isNull(_cursorIndexOfErgocalciferolD2)) {
          _tmpErgocalciferol_d2 = null;
        } else {
          _tmpErgocalciferol_d2 = _cursor.getFloat(_cursorIndexOfErgocalciferolD2);
        }
        final Float _tmpNiacin_b3;
        if (_cursor.isNull(_cursorIndexOfNiacinB3)) {
          _tmpNiacin_b3 = null;
        } else {
          _tmpNiacin_b3 = _cursor.getFloat(_cursorIndexOfNiacinB3);
        }
        final Float _tmpCobalamin_b12;
        if (_cursor.isNull(_cursorIndexOfCobalaminB12)) {
          _tmpCobalamin_b12 = null;
        } else {
          _tmpCobalamin_b12 = _cursor.getFloat(_cursorIndexOfCobalaminB12);
        }
        final Float _tmpEnergy_without_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfEnergyWithoutDietaryFibre)) {
          _tmpEnergy_without_dietary_fibre = null;
        } else {
          _tmpEnergy_without_dietary_fibre = _cursor.getFloat(_cursorIndexOfEnergyWithoutDietaryFibre);
        }
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final Float _tmpFluoride;
        if (_cursor.isNull(_cursorIndexOfFluoride)) {
          _tmpFluoride = null;
        } else {
          _tmpFluoride = _cursor.getFloat(_cursorIndexOfFluoride);
        }
        final Float _tmpPantothenic_acid_b5;
        if (_cursor.isNull(_cursorIndexOfPantothenicAcidB5)) {
          _tmpPantothenic_acid_b5 = null;
        } else {
          _tmpPantothenic_acid_b5 = _cursor.getFloat(_cursorIndexOfPantothenicAcidB5);
        }
        final Float _tmpThiamin_b1;
        if (_cursor.isNull(_cursorIndexOfThiaminB1)) {
          _tmpThiamin_b1 = null;
        } else {
          _tmpThiamin_b1 = _cursor.getFloat(_cursorIndexOfThiaminB1);
        }
        final Float _tmpFolicacid;
        if (_cursor.isNull(_cursorIndexOfFolicacid)) {
          _tmpFolicacid = null;
        } else {
          _tmpFolicacid = _cursor.getFloat(_cursorIndexOfFolicacid);
        }
        final Float _tmpRetinol;
        if (_cursor.isNull(_cursorIndexOfRetinol)) {
          _tmpRetinol = null;
        } else {
          _tmpRetinol = _cursor.getFloat(_cursorIndexOfRetinol);
        }
        final Float _tmpAlpha_carotene;
        if (_cursor.isNull(_cursorIndexOfAlphaCarotene)) {
          _tmpAlpha_carotene = null;
        } else {
          _tmpAlpha_carotene = _cursor.getFloat(_cursorIndexOfAlphaCarotene);
        }
        final Float _tmpPyridoxine_b6;
        if (_cursor.isNull(_cursorIndexOfPyridoxineB6)) {
          _tmpPyridoxine_b6 = null;
        } else {
          _tmpPyridoxine_b6 = _cursor.getFloat(_cursorIndexOfPyridoxineB6);
        }
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final Float _tmpTin;
        if (_cursor.isNull(_cursorIndexOfTin)) {
          _tmpTin = null;
        } else {
          _tmpTin = _cursor.getFloat(_cursorIndexOfTin);
        }
        final Float _tmpChloride;
        if (_cursor.isNull(_cursorIndexOfChloride)) {
          _tmpChloride = null;
        } else {
          _tmpChloride = _cursor.getFloat(_cursorIndexOfChloride);
        }
        final Float _tmpOmega_g;
        if (_cursor.isNull(_cursorIndexOfOmegaG)) {
          _tmpOmega_g = null;
        } else {
          _tmpOmega_g = _cursor.getFloat(_cursorIndexOfOmegaG);
        }
        final Float _tmpZinc;
        if (_cursor.isNull(_cursorIndexOfZinc)) {
          _tmpZinc = null;
        } else {
          _tmpZinc = _cursor.getFloat(_cursorIndexOfZinc);
        }
        final Float _tmpO_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfOPolyFatsG)) {
          _tmpO_poly_fats_g = null;
        } else {
          _tmpO_poly_fats_g = _cursor.getFloat(_cursorIndexOfOPolyFatsG);
        }
        final Float _tmpEnergy;
        if (_cursor.isNull(_cursorIndexOfEnergy)) {
          _tmpEnergy = null;
        } else {
          _tmpEnergy = _cursor.getFloat(_cursorIndexOfEnergy);
        }
        final Float _tmpMolybdenum;
        if (_cursor.isNull(_cursorIndexOfMolybdenum)) {
          _tmpMolybdenum = null;
        } else {
          _tmpMolybdenum = _cursor.getFloat(_cursorIndexOfMolybdenum);
        }
        final Float _tmpPhosphorus;
        if (_cursor.isNull(_cursorIndexOfPhosphorus)) {
          _tmpPhosphorus = null;
        } else {
          _tmpPhosphorus = _cursor.getFloat(_cursorIndexOfPhosphorus);
        }
        final Float _tmpProvitamin_a;
        if (_cursor.isNull(_cursorIndexOfProvitaminA)) {
          _tmpProvitamin_a = null;
        } else {
          _tmpProvitamin_a = _cursor.getFloat(_cursorIndexOfProvitaminA);
        }
        final Float _tmpAlcohol;
        if (_cursor.isNull(_cursorIndexOfAlcohol)) {
          _tmpAlcohol = null;
        } else {
          _tmpAlcohol = _cursor.getFloat(_cursorIndexOfAlcohol);
        }
        final Float _tmpTotal_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfTotalDietaryFibre)) {
          _tmpTotal_dietary_fibre = null;
        } else {
          _tmpTotal_dietary_fibre = _cursor.getFloat(_cursorIndexOfTotalDietaryFibre);
        }
        final Float _tmpSat_fats_g;
        if (_cursor.isNull(_cursorIndexOfSatFatsG)) {
          _tmpSat_fats_g = null;
        } else {
          _tmpSat_fats_g = _cursor.getFloat(_cursorIndexOfSatFatsG);
        }
        final Float _tmpVitamin_c;
        if (_cursor.isNull(_cursorIndexOfVitaminC)) {
          _tmpVitamin_c = null;
        } else {
          _tmpVitamin_c = _cursor.getFloat(_cursorIndexOfVitaminC);
        }
        final Float _tmpVitamin_e;
        if (_cursor.isNull(_cursorIndexOfVitaminE)) {
          _tmpVitamin_e = null;
        } else {
          _tmpVitamin_e = _cursor.getFloat(_cursorIndexOfVitaminE);
        }
        final Float _tmpMagnesium;
        if (_cursor.isNull(_cursorIndexOfMagnesium)) {
          _tmpMagnesium = null;
        } else {
          _tmpMagnesium = _cursor.getFloat(_cursorIndexOfMagnesium);
        }
        final Float _tmpGalactose;
        if (_cursor.isNull(_cursorIndexOfGalactose)) {
          _tmpGalactose = null;
        } else {
          _tmpGalactose = _cursor.getFloat(_cursorIndexOfGalactose);
        }
        final Float _tmpMoisture;
        if (_cursor.isNull(_cursorIndexOfMoisture)) {
          _tmpMoisture = null;
        } else {
          _tmpMoisture = _cursor.getFloat(_cursorIndexOfMoisture);
        }
        final Float _tmpFolatenatural;
        if (_cursor.isNull(_cursorIndexOfFolatenatural)) {
          _tmpFolatenatural = null;
        } else {
          _tmpFolatenatural = _cursor.getFloat(_cursorIndexOfFolatenatural);
        }
        final Float _tmpSucrose;
        if (_cursor.isNull(_cursorIndexOfSucrose)) {
          _tmpSucrose = null;
        } else {
          _tmpSucrose = _cursor.getFloat(_cursorIndexOfSucrose);
        }
        final Float _tmpArsenic;
        if (_cursor.isNull(_cursorIndexOfArsenic)) {
          _tmpArsenic = null;
        } else {
          _tmpArsenic = _cursor.getFloat(_cursorIndexOfArsenic);
        }
        final Float _tmpOmega;
        if (_cursor.isNull(_cursorIndexOfOmega)) {
          _tmpOmega = null;
        } else {
          _tmpOmega = _cursor.getFloat(_cursorIndexOfOmega);
        }
        final Float _tmpSodium;
        if (_cursor.isNull(_cursorIndexOfSodium)) {
          _tmpSodium = null;
        } else {
          _tmpSodium = _cursor.getFloat(_cursorIndexOfSodium);
        }
        final Float _tmpBeta_carotene;
        if (_cursor.isNull(_cursorIndexOfBetaCarotene)) {
          _tmpBeta_carotene = null;
        } else {
          _tmpBeta_carotene = _cursor.getFloat(_cursorIndexOfBetaCarotene);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final Float _tmpCadmium;
        if (_cursor.isNull(_cursorIndexOfCadmium)) {
          _tmpCadmium = null;
        } else {
          _tmpCadmium = _cursor.getFloat(_cursorIndexOfCadmium);
        }
        final Float _tmpVitamin_a_retinol_equivalents;
        if (_cursor.isNull(_cursorIndexOfVitaminARetinolEquivalents)) {
          _tmpVitamin_a_retinol_equivalents = null;
        } else {
          _tmpVitamin_a_retinol_equivalents = _cursor.getFloat(_cursorIndexOfVitaminARetinolEquivalents);
        }
        final Float _tmpSugar;
        if (_cursor.isNull(_cursorIndexOfSugar)) {
          _tmpSugar = null;
        } else {
          _tmpSugar = _cursor.getFloat(_cursorIndexOfSugar);
        }
        final Float _tmpO_poly_fats;
        if (_cursor.isNull(_cursorIndexOfOPolyFats)) {
          _tmpO_poly_fats = null;
        } else {
          _tmpO_poly_fats = _cursor.getFloat(_cursorIndexOfOPolyFats);
        }
        final Float _tmpCholecalciferol_d3;
        if (_cursor.isNull(_cursorIndexOfCholecalciferolD3)) {
          _tmpCholecalciferol_d3 = null;
        } else {
          _tmpCholecalciferol_d3 = _cursor.getFloat(_cursorIndexOfCholecalciferolD3);
        }
        final Float _tmpPotassium;
        if (_cursor.isNull(_cursorIndexOfPotassium)) {
          _tmpPotassium = null;
        } else {
          _tmpPotassium = _cursor.getFloat(_cursorIndexOfPotassium);
        }
        final Float _tmpMercury;
        if (_cursor.isNull(_cursorIndexOfMercury)) {
          _tmpMercury = null;
        } else {
          _tmpMercury = _cursor.getFloat(_cursorIndexOfMercury);
        }
        final Float _tmpDietary_folate_equivalents;
        if (_cursor.isNull(_cursorIndexOfDietaryFolateEquivalents)) {
          _tmpDietary_folate_equivalents = null;
        } else {
          _tmpDietary_folate_equivalents = _cursor.getFloat(_cursorIndexOfDietaryFolateEquivalents);
        }
        final Float _tmpCobalt;
        if (_cursor.isNull(_cursorIndexOfCobalt)) {
          _tmpCobalt = null;
        } else {
          _tmpCobalt = _cursor.getFloat(_cursorIndexOfCobalt);
        }
        final Float _tmpLactose;
        if (_cursor.isNull(_cursorIndexOfLactose)) {
          _tmpLactose = null;
        } else {
          _tmpLactose = _cursor.getFloat(_cursorIndexOfLactose);
        }
        final Float _tmpManganese;
        if (_cursor.isNull(_cursorIndexOfManganese)) {
          _tmpManganese = null;
        } else {
          _tmpManganese = _cursor.getFloat(_cursorIndexOfManganese);
        }
        final Float _tmpBiotin_b7;
        if (_cursor.isNull(_cursorIndexOfBiotinB7)) {
          _tmpBiotin_b7 = null;
        } else {
          _tmpBiotin_b7 = _cursor.getFloat(_cursorIndexOfBiotinB7);
        }
        final Float _tmpMaltose;
        if (_cursor.isNull(_cursorIndexOfMaltose)) {
          _tmpMaltose = null;
        } else {
          _tmpMaltose = _cursor.getFloat(_cursorIndexOfMaltose);
        }
        final Float _tmpMaltotriose;
        if (_cursor.isNull(_cursorIndexOfMaltotriose)) {
          _tmpMaltotriose = null;
        } else {
          _tmpMaltotriose = _cursor.getFloat(_cursorIndexOfMaltotriose);
        }
        final Float _tmpMono_fats;
        if (_cursor.isNull(_cursorIndexOfMonoFats)) {
          _tmpMono_fats = null;
        } else {
          _tmpMono_fats = _cursor.getFloat(_cursorIndexOfMonoFats);
        }
        final Float _tmpSelenium;
        if (_cursor.isNull(_cursorIndexOfSelenium)) {
          _tmpSelenium = null;
        } else {
          _tmpSelenium = _cursor.getFloat(_cursorIndexOfSelenium);
        }
        final Float _tmpCopper;
        if (_cursor.isNull(_cursorIndexOfCopper)) {
          _tmpCopper = null;
        } else {
          _tmpCopper = _cursor.getFloat(_cursorIndexOfCopper);
        }
        final Float _tmpIodine;
        if (_cursor.isNull(_cursorIndexOfIodine)) {
          _tmpIodine = null;
        } else {
          _tmpIodine = _cursor.getFloat(_cursorIndexOfIodine);
        }
        final Float _tmpT_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfTPolyFatsG)) {
          _tmpT_poly_fats_g = null;
        } else {
          _tmpT_poly_fats_g = _cursor.getFloat(_cursorIndexOfTPolyFatsG);
        }
        final Float _tmpNickel;
        if (_cursor.isNull(_cursorIndexOfNickel)) {
          _tmpNickel = null;
        } else {
          _tmpNickel = _cursor.getFloat(_cursorIndexOfNickel);
        }
        final Float _tmpGlucose;
        if (_cursor.isNull(_cursorIndexOfGlucose)) {
          _tmpGlucose = null;
        } else {
          _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
        }
        final Float _tmpChromium;
        if (_cursor.isNull(_cursorIndexOfChromium)) {
          _tmpChromium = null;
        } else {
          _tmpChromium = _cursor.getFloat(_cursorIndexOfChromium);
        }
        final Float _tmpAntimony;
        if (_cursor.isNull(_cursorIndexOfAntimony)) {
          _tmpAntimony = null;
        } else {
          _tmpAntimony = _cursor.getFloat(_cursorIndexOfAntimony);
        }
        final Float _tmpCalcium;
        if (_cursor.isNull(_cursorIndexOfCalcium)) {
          _tmpCalcium = null;
        } else {
          _tmpCalcium = _cursor.getFloat(_cursorIndexOfCalcium);
        }
        final Float _tmpSulphur;
        if (_cursor.isNull(_cursorIndexOfSulphur)) {
          _tmpSulphur = null;
        } else {
          _tmpSulphur = _cursor.getFloat(_cursorIndexOfSulphur);
        }
        final Float _tmpNitrogen;
        if (_cursor.isNull(_cursorIndexOfNitrogen)) {
          _tmpNitrogen = null;
        } else {
          _tmpNitrogen = _cursor.getFloat(_cursorIndexOfNitrogen);
        }
        final Float _tmpFructose;
        if (_cursor.isNull(_cursorIndexOfFructose)) {
          _tmpFructose = null;
        } else {
          _tmpFructose = _cursor.getFloat(_cursorIndexOfFructose);
        }
        final Float _tmpLead;
        if (_cursor.isNull(_cursorIndexOfLead)) {
          _tmpLead = null;
        } else {
          _tmpLead = _cursor.getFloat(_cursorIndexOfLead);
        }
        final Float _tmpSat_fats;
        if (_cursor.isNull(_cursorIndexOfSatFats)) {
          _tmpSat_fats = null;
        } else {
          _tmpSat_fats = _cursor.getFloat(_cursorIndexOfSatFats);
        }
        final Float _tmpMono_fats_g;
        if (_cursor.isNull(_cursorIndexOfMonoFatsG)) {
          _tmpMono_fats_g = null;
        } else {
          _tmpMono_fats_g = _cursor.getFloat(_cursorIndexOfMonoFatsG);
        }
        final Float _tmpAsh;
        if (_cursor.isNull(_cursorIndexOfAsh)) {
          _tmpAsh = null;
        } else {
          _tmpAsh = _cursor.getFloat(_cursorIndexOfAsh);
        }
        final Float _tmpAluminium;
        if (_cursor.isNull(_cursorIndexOfAluminium)) {
          _tmpAluminium = null;
        } else {
          _tmpAluminium = _cursor.getFloat(_cursorIndexOfAluminium);
        }
        final Float _tmpT_poly_fats;
        if (_cursor.isNull(_cursorIndexOfTPolyFats)) {
          _tmpT_poly_fats = null;
        } else {
          _tmpT_poly_fats = _cursor.getFloat(_cursorIndexOfTPolyFats);
        }
        final Float _tmpIron;
        if (_cursor.isNull(_cursorIndexOfIron)) {
          _tmpIron = null;
        } else {
          _tmpIron = _cursor.getFloat(_cursorIndexOfIron);
        }
        final Float _tmpStarch;
        if (_cursor.isNull(_cursorIndexOfStarch)) {
          _tmpStarch = null;
        } else {
          _tmpStarch = _cursor.getFloat(_cursorIndexOfStarch);
        }
        final Float _tmpRiboflavin_b2;
        if (_cursor.isNull(_cursorIndexOfRiboflavinB2)) {
          _tmpRiboflavin_b2 = null;
        } else {
          _tmpRiboflavin_b2 = _cursor.getFloat(_cursorIndexOfRiboflavinB2);
        }
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _item = new FoodProduct(_tmpId,_tmpCryptoxanthin,_tmpTotalfolates,_tmpErgocalciferol_d2,_tmpNiacin_b3,_tmpCobalamin_b12,_tmpEnergy_without_dietary_fibre,_tmpCarbs,_tmpFluoride,_tmpPantothenic_acid_b5,_tmpThiamin_b1,_tmpFolicacid,_tmpRetinol,_tmpAlpha_carotene,_tmpPyridoxine_b6,_tmpProteins,_tmpFats,_tmpTin,_tmpChloride,_tmpOmega_g,_tmpZinc,_tmpO_poly_fats_g,_tmpEnergy,_tmpMolybdenum,_tmpPhosphorus,_tmpProvitamin_a,_tmpAlcohol,_tmpTotal_dietary_fibre,_tmpSat_fats_g,_tmpVitamin_c,_tmpVitamin_e,_tmpMagnesium,_tmpGalactose,_tmpMoisture,_tmpFolatenatural,_tmpSucrose,_tmpArsenic,_tmpOmega,_tmpSodium,_tmpBeta_carotene,_tmpName,_tmpCadmium,_tmpVitamin_a_retinol_equivalents,_tmpSugar,_tmpO_poly_fats,_tmpCholecalciferol_d3,_tmpPotassium,_tmpMercury,_tmpDietary_folate_equivalents,_tmpCobalt,_tmpLactose,_tmpManganese,_tmpBiotin_b7,_tmpMaltose,_tmpMaltotriose,_tmpMono_fats,_tmpSelenium,_tmpCopper,_tmpIodine,_tmpT_poly_fats_g,_tmpNickel,_tmpGlucose,_tmpChromium,_tmpAntimony,_tmpCalcium,_tmpSulphur,_tmpNitrogen,_tmpFructose,_tmpLead,_tmpSat_fats,_tmpMono_fats_g,_tmpAsh,_tmpAluminium,_tmpT_poly_fats,_tmpIron,_tmpStarch,_tmpRiboflavin_b2,_tmpCalories);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public FoodProduct searchById(int id) {
    final String _sql = "select * from food where id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCryptoxanthin = _cursor.getColumnIndexOrThrow("cryptoxanthin");
      final int _cursorIndexOfTotalfolates = _cursor.getColumnIndexOrThrow("totalfolates");
      final int _cursorIndexOfErgocalciferolD2 = _cursor.getColumnIndexOrThrow("ergocalciferol_d2");
      final int _cursorIndexOfNiacinB3 = _cursor.getColumnIndexOrThrow("niacin_b3");
      final int _cursorIndexOfCobalaminB12 = _cursor.getColumnIndexOrThrow("cobalamin_b12");
      final int _cursorIndexOfEnergyWithoutDietaryFibre = _cursor.getColumnIndexOrThrow("energy_without_dietary_fibre");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfFluoride = _cursor.getColumnIndexOrThrow("fluoride");
      final int _cursorIndexOfPantothenicAcidB5 = _cursor.getColumnIndexOrThrow("pantothenic_acid_b5");
      final int _cursorIndexOfThiaminB1 = _cursor.getColumnIndexOrThrow("thiamin_b1");
      final int _cursorIndexOfFolicacid = _cursor.getColumnIndexOrThrow("folicacid");
      final int _cursorIndexOfRetinol = _cursor.getColumnIndexOrThrow("retinol");
      final int _cursorIndexOfAlphaCarotene = _cursor.getColumnIndexOrThrow("alpha_carotene");
      final int _cursorIndexOfPyridoxineB6 = _cursor.getColumnIndexOrThrow("pyridoxine_b6");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("protein");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fat");
      final int _cursorIndexOfTin = _cursor.getColumnIndexOrThrow("tin");
      final int _cursorIndexOfChloride = _cursor.getColumnIndexOrThrow("chloride");
      final int _cursorIndexOfOmegaG = _cursor.getColumnIndexOrThrow("omega_g");
      final int _cursorIndexOfZinc = _cursor.getColumnIndexOrThrow("zinc");
      final int _cursorIndexOfOPolyFatsG = _cursor.getColumnIndexOrThrow("o_poly_fats_g");
      final int _cursorIndexOfEnergy = _cursor.getColumnIndexOrThrow("energy");
      final int _cursorIndexOfMolybdenum = _cursor.getColumnIndexOrThrow("molybdenum");
      final int _cursorIndexOfPhosphorus = _cursor.getColumnIndexOrThrow("phosphorus");
      final int _cursorIndexOfProvitaminA = _cursor.getColumnIndexOrThrow("provitamin_a");
      final int _cursorIndexOfAlcohol = _cursor.getColumnIndexOrThrow("alcohol");
      final int _cursorIndexOfTotalDietaryFibre = _cursor.getColumnIndexOrThrow("total_dietary_fibre");
      final int _cursorIndexOfSatFatsG = _cursor.getColumnIndexOrThrow("sat_fats_g");
      final int _cursorIndexOfVitaminC = _cursor.getColumnIndexOrThrow("vitamin_c");
      final int _cursorIndexOfVitaminE = _cursor.getColumnIndexOrThrow("vitamin_e");
      final int _cursorIndexOfMagnesium = _cursor.getColumnIndexOrThrow("magnesium");
      final int _cursorIndexOfGalactose = _cursor.getColumnIndexOrThrow("galactose");
      final int _cursorIndexOfMoisture = _cursor.getColumnIndexOrThrow("moisture");
      final int _cursorIndexOfFolatenatural = _cursor.getColumnIndexOrThrow("folatenatural");
      final int _cursorIndexOfSucrose = _cursor.getColumnIndexOrThrow("sucrose");
      final int _cursorIndexOfArsenic = _cursor.getColumnIndexOrThrow("arsenic");
      final int _cursorIndexOfOmega = _cursor.getColumnIndexOrThrow("omega");
      final int _cursorIndexOfSodium = _cursor.getColumnIndexOrThrow("sodium");
      final int _cursorIndexOfBetaCarotene = _cursor.getColumnIndexOrThrow("beta_carotene");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCadmium = _cursor.getColumnIndexOrThrow("cadmium");
      final int _cursorIndexOfVitaminARetinolEquivalents = _cursor.getColumnIndexOrThrow("vitamin_a_retinol_equivalents");
      final int _cursorIndexOfSugar = _cursor.getColumnIndexOrThrow("sugar");
      final int _cursorIndexOfOPolyFats = _cursor.getColumnIndexOrThrow("o_poly_fats");
      final int _cursorIndexOfCholecalciferolD3 = _cursor.getColumnIndexOrThrow("cholecalciferol_d3");
      final int _cursorIndexOfPotassium = _cursor.getColumnIndexOrThrow("potassium");
      final int _cursorIndexOfMercury = _cursor.getColumnIndexOrThrow("mercury");
      final int _cursorIndexOfDietaryFolateEquivalents = _cursor.getColumnIndexOrThrow("dietary_folate_equivalents");
      final int _cursorIndexOfCobalt = _cursor.getColumnIndexOrThrow("cobalt");
      final int _cursorIndexOfLactose = _cursor.getColumnIndexOrThrow("lactose");
      final int _cursorIndexOfManganese = _cursor.getColumnIndexOrThrow("manganese");
      final int _cursorIndexOfBiotinB7 = _cursor.getColumnIndexOrThrow("biotin_b7");
      final int _cursorIndexOfMaltose = _cursor.getColumnIndexOrThrow("maltose");
      final int _cursorIndexOfMaltotriose = _cursor.getColumnIndexOrThrow("maltotriose");
      final int _cursorIndexOfMonoFats = _cursor.getColumnIndexOrThrow("mono_fats");
      final int _cursorIndexOfSelenium = _cursor.getColumnIndexOrThrow("selenium");
      final int _cursorIndexOfCopper = _cursor.getColumnIndexOrThrow("copper");
      final int _cursorIndexOfIodine = _cursor.getColumnIndexOrThrow("iodine");
      final int _cursorIndexOfTPolyFatsG = _cursor.getColumnIndexOrThrow("t_poly_fats_g");
      final int _cursorIndexOfNickel = _cursor.getColumnIndexOrThrow("nickel");
      final int _cursorIndexOfGlucose = _cursor.getColumnIndexOrThrow("glucose");
      final int _cursorIndexOfChromium = _cursor.getColumnIndexOrThrow("chromium");
      final int _cursorIndexOfAntimony = _cursor.getColumnIndexOrThrow("antimony");
      final int _cursorIndexOfCalcium = _cursor.getColumnIndexOrThrow("calcium");
      final int _cursorIndexOfSulphur = _cursor.getColumnIndexOrThrow("sulphur");
      final int _cursorIndexOfNitrogen = _cursor.getColumnIndexOrThrow("nitrogen");
      final int _cursorIndexOfFructose = _cursor.getColumnIndexOrThrow("fructose");
      final int _cursorIndexOfLead = _cursor.getColumnIndexOrThrow("lead");
      final int _cursorIndexOfSatFats = _cursor.getColumnIndexOrThrow("sat_fats");
      final int _cursorIndexOfMonoFatsG = _cursor.getColumnIndexOrThrow("mono_fats_g");
      final int _cursorIndexOfAsh = _cursor.getColumnIndexOrThrow("ash");
      final int _cursorIndexOfAluminium = _cursor.getColumnIndexOrThrow("aluminium");
      final int _cursorIndexOfTPolyFats = _cursor.getColumnIndexOrThrow("t_poly_fats");
      final int _cursorIndexOfIron = _cursor.getColumnIndexOrThrow("iron");
      final int _cursorIndexOfStarch = _cursor.getColumnIndexOrThrow("starch");
      final int _cursorIndexOfRiboflavinB2 = _cursor.getColumnIndexOrThrow("riboflavin_b2");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final FoodProduct _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Float _tmpCryptoxanthin;
        if (_cursor.isNull(_cursorIndexOfCryptoxanthin)) {
          _tmpCryptoxanthin = null;
        } else {
          _tmpCryptoxanthin = _cursor.getFloat(_cursorIndexOfCryptoxanthin);
        }
        final Float _tmpTotalfolates;
        if (_cursor.isNull(_cursorIndexOfTotalfolates)) {
          _tmpTotalfolates = null;
        } else {
          _tmpTotalfolates = _cursor.getFloat(_cursorIndexOfTotalfolates);
        }
        final Float _tmpErgocalciferol_d2;
        if (_cursor.isNull(_cursorIndexOfErgocalciferolD2)) {
          _tmpErgocalciferol_d2 = null;
        } else {
          _tmpErgocalciferol_d2 = _cursor.getFloat(_cursorIndexOfErgocalciferolD2);
        }
        final Float _tmpNiacin_b3;
        if (_cursor.isNull(_cursorIndexOfNiacinB3)) {
          _tmpNiacin_b3 = null;
        } else {
          _tmpNiacin_b3 = _cursor.getFloat(_cursorIndexOfNiacinB3);
        }
        final Float _tmpCobalamin_b12;
        if (_cursor.isNull(_cursorIndexOfCobalaminB12)) {
          _tmpCobalamin_b12 = null;
        } else {
          _tmpCobalamin_b12 = _cursor.getFloat(_cursorIndexOfCobalaminB12);
        }
        final Float _tmpEnergy_without_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfEnergyWithoutDietaryFibre)) {
          _tmpEnergy_without_dietary_fibre = null;
        } else {
          _tmpEnergy_without_dietary_fibre = _cursor.getFloat(_cursorIndexOfEnergyWithoutDietaryFibre);
        }
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final Float _tmpFluoride;
        if (_cursor.isNull(_cursorIndexOfFluoride)) {
          _tmpFluoride = null;
        } else {
          _tmpFluoride = _cursor.getFloat(_cursorIndexOfFluoride);
        }
        final Float _tmpPantothenic_acid_b5;
        if (_cursor.isNull(_cursorIndexOfPantothenicAcidB5)) {
          _tmpPantothenic_acid_b5 = null;
        } else {
          _tmpPantothenic_acid_b5 = _cursor.getFloat(_cursorIndexOfPantothenicAcidB5);
        }
        final Float _tmpThiamin_b1;
        if (_cursor.isNull(_cursorIndexOfThiaminB1)) {
          _tmpThiamin_b1 = null;
        } else {
          _tmpThiamin_b1 = _cursor.getFloat(_cursorIndexOfThiaminB1);
        }
        final Float _tmpFolicacid;
        if (_cursor.isNull(_cursorIndexOfFolicacid)) {
          _tmpFolicacid = null;
        } else {
          _tmpFolicacid = _cursor.getFloat(_cursorIndexOfFolicacid);
        }
        final Float _tmpRetinol;
        if (_cursor.isNull(_cursorIndexOfRetinol)) {
          _tmpRetinol = null;
        } else {
          _tmpRetinol = _cursor.getFloat(_cursorIndexOfRetinol);
        }
        final Float _tmpAlpha_carotene;
        if (_cursor.isNull(_cursorIndexOfAlphaCarotene)) {
          _tmpAlpha_carotene = null;
        } else {
          _tmpAlpha_carotene = _cursor.getFloat(_cursorIndexOfAlphaCarotene);
        }
        final Float _tmpPyridoxine_b6;
        if (_cursor.isNull(_cursorIndexOfPyridoxineB6)) {
          _tmpPyridoxine_b6 = null;
        } else {
          _tmpPyridoxine_b6 = _cursor.getFloat(_cursorIndexOfPyridoxineB6);
        }
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final Float _tmpTin;
        if (_cursor.isNull(_cursorIndexOfTin)) {
          _tmpTin = null;
        } else {
          _tmpTin = _cursor.getFloat(_cursorIndexOfTin);
        }
        final Float _tmpChloride;
        if (_cursor.isNull(_cursorIndexOfChloride)) {
          _tmpChloride = null;
        } else {
          _tmpChloride = _cursor.getFloat(_cursorIndexOfChloride);
        }
        final Float _tmpOmega_g;
        if (_cursor.isNull(_cursorIndexOfOmegaG)) {
          _tmpOmega_g = null;
        } else {
          _tmpOmega_g = _cursor.getFloat(_cursorIndexOfOmegaG);
        }
        final Float _tmpZinc;
        if (_cursor.isNull(_cursorIndexOfZinc)) {
          _tmpZinc = null;
        } else {
          _tmpZinc = _cursor.getFloat(_cursorIndexOfZinc);
        }
        final Float _tmpO_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfOPolyFatsG)) {
          _tmpO_poly_fats_g = null;
        } else {
          _tmpO_poly_fats_g = _cursor.getFloat(_cursorIndexOfOPolyFatsG);
        }
        final Float _tmpEnergy;
        if (_cursor.isNull(_cursorIndexOfEnergy)) {
          _tmpEnergy = null;
        } else {
          _tmpEnergy = _cursor.getFloat(_cursorIndexOfEnergy);
        }
        final Float _tmpMolybdenum;
        if (_cursor.isNull(_cursorIndexOfMolybdenum)) {
          _tmpMolybdenum = null;
        } else {
          _tmpMolybdenum = _cursor.getFloat(_cursorIndexOfMolybdenum);
        }
        final Float _tmpPhosphorus;
        if (_cursor.isNull(_cursorIndexOfPhosphorus)) {
          _tmpPhosphorus = null;
        } else {
          _tmpPhosphorus = _cursor.getFloat(_cursorIndexOfPhosphorus);
        }
        final Float _tmpProvitamin_a;
        if (_cursor.isNull(_cursorIndexOfProvitaminA)) {
          _tmpProvitamin_a = null;
        } else {
          _tmpProvitamin_a = _cursor.getFloat(_cursorIndexOfProvitaminA);
        }
        final Float _tmpAlcohol;
        if (_cursor.isNull(_cursorIndexOfAlcohol)) {
          _tmpAlcohol = null;
        } else {
          _tmpAlcohol = _cursor.getFloat(_cursorIndexOfAlcohol);
        }
        final Float _tmpTotal_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfTotalDietaryFibre)) {
          _tmpTotal_dietary_fibre = null;
        } else {
          _tmpTotal_dietary_fibre = _cursor.getFloat(_cursorIndexOfTotalDietaryFibre);
        }
        final Float _tmpSat_fats_g;
        if (_cursor.isNull(_cursorIndexOfSatFatsG)) {
          _tmpSat_fats_g = null;
        } else {
          _tmpSat_fats_g = _cursor.getFloat(_cursorIndexOfSatFatsG);
        }
        final Float _tmpVitamin_c;
        if (_cursor.isNull(_cursorIndexOfVitaminC)) {
          _tmpVitamin_c = null;
        } else {
          _tmpVitamin_c = _cursor.getFloat(_cursorIndexOfVitaminC);
        }
        final Float _tmpVitamin_e;
        if (_cursor.isNull(_cursorIndexOfVitaminE)) {
          _tmpVitamin_e = null;
        } else {
          _tmpVitamin_e = _cursor.getFloat(_cursorIndexOfVitaminE);
        }
        final Float _tmpMagnesium;
        if (_cursor.isNull(_cursorIndexOfMagnesium)) {
          _tmpMagnesium = null;
        } else {
          _tmpMagnesium = _cursor.getFloat(_cursorIndexOfMagnesium);
        }
        final Float _tmpGalactose;
        if (_cursor.isNull(_cursorIndexOfGalactose)) {
          _tmpGalactose = null;
        } else {
          _tmpGalactose = _cursor.getFloat(_cursorIndexOfGalactose);
        }
        final Float _tmpMoisture;
        if (_cursor.isNull(_cursorIndexOfMoisture)) {
          _tmpMoisture = null;
        } else {
          _tmpMoisture = _cursor.getFloat(_cursorIndexOfMoisture);
        }
        final Float _tmpFolatenatural;
        if (_cursor.isNull(_cursorIndexOfFolatenatural)) {
          _tmpFolatenatural = null;
        } else {
          _tmpFolatenatural = _cursor.getFloat(_cursorIndexOfFolatenatural);
        }
        final Float _tmpSucrose;
        if (_cursor.isNull(_cursorIndexOfSucrose)) {
          _tmpSucrose = null;
        } else {
          _tmpSucrose = _cursor.getFloat(_cursorIndexOfSucrose);
        }
        final Float _tmpArsenic;
        if (_cursor.isNull(_cursorIndexOfArsenic)) {
          _tmpArsenic = null;
        } else {
          _tmpArsenic = _cursor.getFloat(_cursorIndexOfArsenic);
        }
        final Float _tmpOmega;
        if (_cursor.isNull(_cursorIndexOfOmega)) {
          _tmpOmega = null;
        } else {
          _tmpOmega = _cursor.getFloat(_cursorIndexOfOmega);
        }
        final Float _tmpSodium;
        if (_cursor.isNull(_cursorIndexOfSodium)) {
          _tmpSodium = null;
        } else {
          _tmpSodium = _cursor.getFloat(_cursorIndexOfSodium);
        }
        final Float _tmpBeta_carotene;
        if (_cursor.isNull(_cursorIndexOfBetaCarotene)) {
          _tmpBeta_carotene = null;
        } else {
          _tmpBeta_carotene = _cursor.getFloat(_cursorIndexOfBetaCarotene);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final Float _tmpCadmium;
        if (_cursor.isNull(_cursorIndexOfCadmium)) {
          _tmpCadmium = null;
        } else {
          _tmpCadmium = _cursor.getFloat(_cursorIndexOfCadmium);
        }
        final Float _tmpVitamin_a_retinol_equivalents;
        if (_cursor.isNull(_cursorIndexOfVitaminARetinolEquivalents)) {
          _tmpVitamin_a_retinol_equivalents = null;
        } else {
          _tmpVitamin_a_retinol_equivalents = _cursor.getFloat(_cursorIndexOfVitaminARetinolEquivalents);
        }
        final Float _tmpSugar;
        if (_cursor.isNull(_cursorIndexOfSugar)) {
          _tmpSugar = null;
        } else {
          _tmpSugar = _cursor.getFloat(_cursorIndexOfSugar);
        }
        final Float _tmpO_poly_fats;
        if (_cursor.isNull(_cursorIndexOfOPolyFats)) {
          _tmpO_poly_fats = null;
        } else {
          _tmpO_poly_fats = _cursor.getFloat(_cursorIndexOfOPolyFats);
        }
        final Float _tmpCholecalciferol_d3;
        if (_cursor.isNull(_cursorIndexOfCholecalciferolD3)) {
          _tmpCholecalciferol_d3 = null;
        } else {
          _tmpCholecalciferol_d3 = _cursor.getFloat(_cursorIndexOfCholecalciferolD3);
        }
        final Float _tmpPotassium;
        if (_cursor.isNull(_cursorIndexOfPotassium)) {
          _tmpPotassium = null;
        } else {
          _tmpPotassium = _cursor.getFloat(_cursorIndexOfPotassium);
        }
        final Float _tmpMercury;
        if (_cursor.isNull(_cursorIndexOfMercury)) {
          _tmpMercury = null;
        } else {
          _tmpMercury = _cursor.getFloat(_cursorIndexOfMercury);
        }
        final Float _tmpDietary_folate_equivalents;
        if (_cursor.isNull(_cursorIndexOfDietaryFolateEquivalents)) {
          _tmpDietary_folate_equivalents = null;
        } else {
          _tmpDietary_folate_equivalents = _cursor.getFloat(_cursorIndexOfDietaryFolateEquivalents);
        }
        final Float _tmpCobalt;
        if (_cursor.isNull(_cursorIndexOfCobalt)) {
          _tmpCobalt = null;
        } else {
          _tmpCobalt = _cursor.getFloat(_cursorIndexOfCobalt);
        }
        final Float _tmpLactose;
        if (_cursor.isNull(_cursorIndexOfLactose)) {
          _tmpLactose = null;
        } else {
          _tmpLactose = _cursor.getFloat(_cursorIndexOfLactose);
        }
        final Float _tmpManganese;
        if (_cursor.isNull(_cursorIndexOfManganese)) {
          _tmpManganese = null;
        } else {
          _tmpManganese = _cursor.getFloat(_cursorIndexOfManganese);
        }
        final Float _tmpBiotin_b7;
        if (_cursor.isNull(_cursorIndexOfBiotinB7)) {
          _tmpBiotin_b7 = null;
        } else {
          _tmpBiotin_b7 = _cursor.getFloat(_cursorIndexOfBiotinB7);
        }
        final Float _tmpMaltose;
        if (_cursor.isNull(_cursorIndexOfMaltose)) {
          _tmpMaltose = null;
        } else {
          _tmpMaltose = _cursor.getFloat(_cursorIndexOfMaltose);
        }
        final Float _tmpMaltotriose;
        if (_cursor.isNull(_cursorIndexOfMaltotriose)) {
          _tmpMaltotriose = null;
        } else {
          _tmpMaltotriose = _cursor.getFloat(_cursorIndexOfMaltotriose);
        }
        final Float _tmpMono_fats;
        if (_cursor.isNull(_cursorIndexOfMonoFats)) {
          _tmpMono_fats = null;
        } else {
          _tmpMono_fats = _cursor.getFloat(_cursorIndexOfMonoFats);
        }
        final Float _tmpSelenium;
        if (_cursor.isNull(_cursorIndexOfSelenium)) {
          _tmpSelenium = null;
        } else {
          _tmpSelenium = _cursor.getFloat(_cursorIndexOfSelenium);
        }
        final Float _tmpCopper;
        if (_cursor.isNull(_cursorIndexOfCopper)) {
          _tmpCopper = null;
        } else {
          _tmpCopper = _cursor.getFloat(_cursorIndexOfCopper);
        }
        final Float _tmpIodine;
        if (_cursor.isNull(_cursorIndexOfIodine)) {
          _tmpIodine = null;
        } else {
          _tmpIodine = _cursor.getFloat(_cursorIndexOfIodine);
        }
        final Float _tmpT_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfTPolyFatsG)) {
          _tmpT_poly_fats_g = null;
        } else {
          _tmpT_poly_fats_g = _cursor.getFloat(_cursorIndexOfTPolyFatsG);
        }
        final Float _tmpNickel;
        if (_cursor.isNull(_cursorIndexOfNickel)) {
          _tmpNickel = null;
        } else {
          _tmpNickel = _cursor.getFloat(_cursorIndexOfNickel);
        }
        final Float _tmpGlucose;
        if (_cursor.isNull(_cursorIndexOfGlucose)) {
          _tmpGlucose = null;
        } else {
          _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
        }
        final Float _tmpChromium;
        if (_cursor.isNull(_cursorIndexOfChromium)) {
          _tmpChromium = null;
        } else {
          _tmpChromium = _cursor.getFloat(_cursorIndexOfChromium);
        }
        final Float _tmpAntimony;
        if (_cursor.isNull(_cursorIndexOfAntimony)) {
          _tmpAntimony = null;
        } else {
          _tmpAntimony = _cursor.getFloat(_cursorIndexOfAntimony);
        }
        final Float _tmpCalcium;
        if (_cursor.isNull(_cursorIndexOfCalcium)) {
          _tmpCalcium = null;
        } else {
          _tmpCalcium = _cursor.getFloat(_cursorIndexOfCalcium);
        }
        final Float _tmpSulphur;
        if (_cursor.isNull(_cursorIndexOfSulphur)) {
          _tmpSulphur = null;
        } else {
          _tmpSulphur = _cursor.getFloat(_cursorIndexOfSulphur);
        }
        final Float _tmpNitrogen;
        if (_cursor.isNull(_cursorIndexOfNitrogen)) {
          _tmpNitrogen = null;
        } else {
          _tmpNitrogen = _cursor.getFloat(_cursorIndexOfNitrogen);
        }
        final Float _tmpFructose;
        if (_cursor.isNull(_cursorIndexOfFructose)) {
          _tmpFructose = null;
        } else {
          _tmpFructose = _cursor.getFloat(_cursorIndexOfFructose);
        }
        final Float _tmpLead;
        if (_cursor.isNull(_cursorIndexOfLead)) {
          _tmpLead = null;
        } else {
          _tmpLead = _cursor.getFloat(_cursorIndexOfLead);
        }
        final Float _tmpSat_fats;
        if (_cursor.isNull(_cursorIndexOfSatFats)) {
          _tmpSat_fats = null;
        } else {
          _tmpSat_fats = _cursor.getFloat(_cursorIndexOfSatFats);
        }
        final Float _tmpMono_fats_g;
        if (_cursor.isNull(_cursorIndexOfMonoFatsG)) {
          _tmpMono_fats_g = null;
        } else {
          _tmpMono_fats_g = _cursor.getFloat(_cursorIndexOfMonoFatsG);
        }
        final Float _tmpAsh;
        if (_cursor.isNull(_cursorIndexOfAsh)) {
          _tmpAsh = null;
        } else {
          _tmpAsh = _cursor.getFloat(_cursorIndexOfAsh);
        }
        final Float _tmpAluminium;
        if (_cursor.isNull(_cursorIndexOfAluminium)) {
          _tmpAluminium = null;
        } else {
          _tmpAluminium = _cursor.getFloat(_cursorIndexOfAluminium);
        }
        final Float _tmpT_poly_fats;
        if (_cursor.isNull(_cursorIndexOfTPolyFats)) {
          _tmpT_poly_fats = null;
        } else {
          _tmpT_poly_fats = _cursor.getFloat(_cursorIndexOfTPolyFats);
        }
        final Float _tmpIron;
        if (_cursor.isNull(_cursorIndexOfIron)) {
          _tmpIron = null;
        } else {
          _tmpIron = _cursor.getFloat(_cursorIndexOfIron);
        }
        final Float _tmpStarch;
        if (_cursor.isNull(_cursorIndexOfStarch)) {
          _tmpStarch = null;
        } else {
          _tmpStarch = _cursor.getFloat(_cursorIndexOfStarch);
        }
        final Float _tmpRiboflavin_b2;
        if (_cursor.isNull(_cursorIndexOfRiboflavinB2)) {
          _tmpRiboflavin_b2 = null;
        } else {
          _tmpRiboflavin_b2 = _cursor.getFloat(_cursorIndexOfRiboflavinB2);
        }
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _result = new FoodProduct(_tmpId,_tmpCryptoxanthin,_tmpTotalfolates,_tmpErgocalciferol_d2,_tmpNiacin_b3,_tmpCobalamin_b12,_tmpEnergy_without_dietary_fibre,_tmpCarbs,_tmpFluoride,_tmpPantothenic_acid_b5,_tmpThiamin_b1,_tmpFolicacid,_tmpRetinol,_tmpAlpha_carotene,_tmpPyridoxine_b6,_tmpProteins,_tmpFats,_tmpTin,_tmpChloride,_tmpOmega_g,_tmpZinc,_tmpO_poly_fats_g,_tmpEnergy,_tmpMolybdenum,_tmpPhosphorus,_tmpProvitamin_a,_tmpAlcohol,_tmpTotal_dietary_fibre,_tmpSat_fats_g,_tmpVitamin_c,_tmpVitamin_e,_tmpMagnesium,_tmpGalactose,_tmpMoisture,_tmpFolatenatural,_tmpSucrose,_tmpArsenic,_tmpOmega,_tmpSodium,_tmpBeta_carotene,_tmpName,_tmpCadmium,_tmpVitamin_a_retinol_equivalents,_tmpSugar,_tmpO_poly_fats,_tmpCholecalciferol_d3,_tmpPotassium,_tmpMercury,_tmpDietary_folate_equivalents,_tmpCobalt,_tmpLactose,_tmpManganese,_tmpBiotin_b7,_tmpMaltose,_tmpMaltotriose,_tmpMono_fats,_tmpSelenium,_tmpCopper,_tmpIodine,_tmpT_poly_fats_g,_tmpNickel,_tmpGlucose,_tmpChromium,_tmpAntimony,_tmpCalcium,_tmpSulphur,_tmpNitrogen,_tmpFructose,_tmpLead,_tmpSat_fats,_tmpMono_fats_g,_tmpAsh,_tmpAluminium,_tmpT_poly_fats,_tmpIron,_tmpStarch,_tmpRiboflavin_b2,_tmpCalories);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSize() {
    final String _sql = "select rowid from food order by ROWID desc limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<FoodProduct> getCustomProducts() {
    final String _sql = "select * from food where id > 976";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCryptoxanthin = _cursor.getColumnIndexOrThrow("cryptoxanthin");
      final int _cursorIndexOfTotalfolates = _cursor.getColumnIndexOrThrow("totalfolates");
      final int _cursorIndexOfErgocalciferolD2 = _cursor.getColumnIndexOrThrow("ergocalciferol_d2");
      final int _cursorIndexOfNiacinB3 = _cursor.getColumnIndexOrThrow("niacin_b3");
      final int _cursorIndexOfCobalaminB12 = _cursor.getColumnIndexOrThrow("cobalamin_b12");
      final int _cursorIndexOfEnergyWithoutDietaryFibre = _cursor.getColumnIndexOrThrow("energy_without_dietary_fibre");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfFluoride = _cursor.getColumnIndexOrThrow("fluoride");
      final int _cursorIndexOfPantothenicAcidB5 = _cursor.getColumnIndexOrThrow("pantothenic_acid_b5");
      final int _cursorIndexOfThiaminB1 = _cursor.getColumnIndexOrThrow("thiamin_b1");
      final int _cursorIndexOfFolicacid = _cursor.getColumnIndexOrThrow("folicacid");
      final int _cursorIndexOfRetinol = _cursor.getColumnIndexOrThrow("retinol");
      final int _cursorIndexOfAlphaCarotene = _cursor.getColumnIndexOrThrow("alpha_carotene");
      final int _cursorIndexOfPyridoxineB6 = _cursor.getColumnIndexOrThrow("pyridoxine_b6");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("protein");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fat");
      final int _cursorIndexOfTin = _cursor.getColumnIndexOrThrow("tin");
      final int _cursorIndexOfChloride = _cursor.getColumnIndexOrThrow("chloride");
      final int _cursorIndexOfOmegaG = _cursor.getColumnIndexOrThrow("omega_g");
      final int _cursorIndexOfZinc = _cursor.getColumnIndexOrThrow("zinc");
      final int _cursorIndexOfOPolyFatsG = _cursor.getColumnIndexOrThrow("o_poly_fats_g");
      final int _cursorIndexOfEnergy = _cursor.getColumnIndexOrThrow("energy");
      final int _cursorIndexOfMolybdenum = _cursor.getColumnIndexOrThrow("molybdenum");
      final int _cursorIndexOfPhosphorus = _cursor.getColumnIndexOrThrow("phosphorus");
      final int _cursorIndexOfProvitaminA = _cursor.getColumnIndexOrThrow("provitamin_a");
      final int _cursorIndexOfAlcohol = _cursor.getColumnIndexOrThrow("alcohol");
      final int _cursorIndexOfTotalDietaryFibre = _cursor.getColumnIndexOrThrow("total_dietary_fibre");
      final int _cursorIndexOfSatFatsG = _cursor.getColumnIndexOrThrow("sat_fats_g");
      final int _cursorIndexOfVitaminC = _cursor.getColumnIndexOrThrow("vitamin_c");
      final int _cursorIndexOfVitaminE = _cursor.getColumnIndexOrThrow("vitamin_e");
      final int _cursorIndexOfMagnesium = _cursor.getColumnIndexOrThrow("magnesium");
      final int _cursorIndexOfGalactose = _cursor.getColumnIndexOrThrow("galactose");
      final int _cursorIndexOfMoisture = _cursor.getColumnIndexOrThrow("moisture");
      final int _cursorIndexOfFolatenatural = _cursor.getColumnIndexOrThrow("folatenatural");
      final int _cursorIndexOfSucrose = _cursor.getColumnIndexOrThrow("sucrose");
      final int _cursorIndexOfArsenic = _cursor.getColumnIndexOrThrow("arsenic");
      final int _cursorIndexOfOmega = _cursor.getColumnIndexOrThrow("omega");
      final int _cursorIndexOfSodium = _cursor.getColumnIndexOrThrow("sodium");
      final int _cursorIndexOfBetaCarotene = _cursor.getColumnIndexOrThrow("beta_carotene");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCadmium = _cursor.getColumnIndexOrThrow("cadmium");
      final int _cursorIndexOfVitaminARetinolEquivalents = _cursor.getColumnIndexOrThrow("vitamin_a_retinol_equivalents");
      final int _cursorIndexOfSugar = _cursor.getColumnIndexOrThrow("sugar");
      final int _cursorIndexOfOPolyFats = _cursor.getColumnIndexOrThrow("o_poly_fats");
      final int _cursorIndexOfCholecalciferolD3 = _cursor.getColumnIndexOrThrow("cholecalciferol_d3");
      final int _cursorIndexOfPotassium = _cursor.getColumnIndexOrThrow("potassium");
      final int _cursorIndexOfMercury = _cursor.getColumnIndexOrThrow("mercury");
      final int _cursorIndexOfDietaryFolateEquivalents = _cursor.getColumnIndexOrThrow("dietary_folate_equivalents");
      final int _cursorIndexOfCobalt = _cursor.getColumnIndexOrThrow("cobalt");
      final int _cursorIndexOfLactose = _cursor.getColumnIndexOrThrow("lactose");
      final int _cursorIndexOfManganese = _cursor.getColumnIndexOrThrow("manganese");
      final int _cursorIndexOfBiotinB7 = _cursor.getColumnIndexOrThrow("biotin_b7");
      final int _cursorIndexOfMaltose = _cursor.getColumnIndexOrThrow("maltose");
      final int _cursorIndexOfMaltotriose = _cursor.getColumnIndexOrThrow("maltotriose");
      final int _cursorIndexOfMonoFats = _cursor.getColumnIndexOrThrow("mono_fats");
      final int _cursorIndexOfSelenium = _cursor.getColumnIndexOrThrow("selenium");
      final int _cursorIndexOfCopper = _cursor.getColumnIndexOrThrow("copper");
      final int _cursorIndexOfIodine = _cursor.getColumnIndexOrThrow("iodine");
      final int _cursorIndexOfTPolyFatsG = _cursor.getColumnIndexOrThrow("t_poly_fats_g");
      final int _cursorIndexOfNickel = _cursor.getColumnIndexOrThrow("nickel");
      final int _cursorIndexOfGlucose = _cursor.getColumnIndexOrThrow("glucose");
      final int _cursorIndexOfChromium = _cursor.getColumnIndexOrThrow("chromium");
      final int _cursorIndexOfAntimony = _cursor.getColumnIndexOrThrow("antimony");
      final int _cursorIndexOfCalcium = _cursor.getColumnIndexOrThrow("calcium");
      final int _cursorIndexOfSulphur = _cursor.getColumnIndexOrThrow("sulphur");
      final int _cursorIndexOfNitrogen = _cursor.getColumnIndexOrThrow("nitrogen");
      final int _cursorIndexOfFructose = _cursor.getColumnIndexOrThrow("fructose");
      final int _cursorIndexOfLead = _cursor.getColumnIndexOrThrow("lead");
      final int _cursorIndexOfSatFats = _cursor.getColumnIndexOrThrow("sat_fats");
      final int _cursorIndexOfMonoFatsG = _cursor.getColumnIndexOrThrow("mono_fats_g");
      final int _cursorIndexOfAsh = _cursor.getColumnIndexOrThrow("ash");
      final int _cursorIndexOfAluminium = _cursor.getColumnIndexOrThrow("aluminium");
      final int _cursorIndexOfTPolyFats = _cursor.getColumnIndexOrThrow("t_poly_fats");
      final int _cursorIndexOfIron = _cursor.getColumnIndexOrThrow("iron");
      final int _cursorIndexOfStarch = _cursor.getColumnIndexOrThrow("starch");
      final int _cursorIndexOfRiboflavinB2 = _cursor.getColumnIndexOrThrow("riboflavin_b2");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final List<FoodProduct> _result = new ArrayList<FoodProduct>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FoodProduct _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Float _tmpCryptoxanthin;
        if (_cursor.isNull(_cursorIndexOfCryptoxanthin)) {
          _tmpCryptoxanthin = null;
        } else {
          _tmpCryptoxanthin = _cursor.getFloat(_cursorIndexOfCryptoxanthin);
        }
        final Float _tmpTotalfolates;
        if (_cursor.isNull(_cursorIndexOfTotalfolates)) {
          _tmpTotalfolates = null;
        } else {
          _tmpTotalfolates = _cursor.getFloat(_cursorIndexOfTotalfolates);
        }
        final Float _tmpErgocalciferol_d2;
        if (_cursor.isNull(_cursorIndexOfErgocalciferolD2)) {
          _tmpErgocalciferol_d2 = null;
        } else {
          _tmpErgocalciferol_d2 = _cursor.getFloat(_cursorIndexOfErgocalciferolD2);
        }
        final Float _tmpNiacin_b3;
        if (_cursor.isNull(_cursorIndexOfNiacinB3)) {
          _tmpNiacin_b3 = null;
        } else {
          _tmpNiacin_b3 = _cursor.getFloat(_cursorIndexOfNiacinB3);
        }
        final Float _tmpCobalamin_b12;
        if (_cursor.isNull(_cursorIndexOfCobalaminB12)) {
          _tmpCobalamin_b12 = null;
        } else {
          _tmpCobalamin_b12 = _cursor.getFloat(_cursorIndexOfCobalaminB12);
        }
        final Float _tmpEnergy_without_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfEnergyWithoutDietaryFibre)) {
          _tmpEnergy_without_dietary_fibre = null;
        } else {
          _tmpEnergy_without_dietary_fibre = _cursor.getFloat(_cursorIndexOfEnergyWithoutDietaryFibre);
        }
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final Float _tmpFluoride;
        if (_cursor.isNull(_cursorIndexOfFluoride)) {
          _tmpFluoride = null;
        } else {
          _tmpFluoride = _cursor.getFloat(_cursorIndexOfFluoride);
        }
        final Float _tmpPantothenic_acid_b5;
        if (_cursor.isNull(_cursorIndexOfPantothenicAcidB5)) {
          _tmpPantothenic_acid_b5 = null;
        } else {
          _tmpPantothenic_acid_b5 = _cursor.getFloat(_cursorIndexOfPantothenicAcidB5);
        }
        final Float _tmpThiamin_b1;
        if (_cursor.isNull(_cursorIndexOfThiaminB1)) {
          _tmpThiamin_b1 = null;
        } else {
          _tmpThiamin_b1 = _cursor.getFloat(_cursorIndexOfThiaminB1);
        }
        final Float _tmpFolicacid;
        if (_cursor.isNull(_cursorIndexOfFolicacid)) {
          _tmpFolicacid = null;
        } else {
          _tmpFolicacid = _cursor.getFloat(_cursorIndexOfFolicacid);
        }
        final Float _tmpRetinol;
        if (_cursor.isNull(_cursorIndexOfRetinol)) {
          _tmpRetinol = null;
        } else {
          _tmpRetinol = _cursor.getFloat(_cursorIndexOfRetinol);
        }
        final Float _tmpAlpha_carotene;
        if (_cursor.isNull(_cursorIndexOfAlphaCarotene)) {
          _tmpAlpha_carotene = null;
        } else {
          _tmpAlpha_carotene = _cursor.getFloat(_cursorIndexOfAlphaCarotene);
        }
        final Float _tmpPyridoxine_b6;
        if (_cursor.isNull(_cursorIndexOfPyridoxineB6)) {
          _tmpPyridoxine_b6 = null;
        } else {
          _tmpPyridoxine_b6 = _cursor.getFloat(_cursorIndexOfPyridoxineB6);
        }
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final Float _tmpTin;
        if (_cursor.isNull(_cursorIndexOfTin)) {
          _tmpTin = null;
        } else {
          _tmpTin = _cursor.getFloat(_cursorIndexOfTin);
        }
        final Float _tmpChloride;
        if (_cursor.isNull(_cursorIndexOfChloride)) {
          _tmpChloride = null;
        } else {
          _tmpChloride = _cursor.getFloat(_cursorIndexOfChloride);
        }
        final Float _tmpOmega_g;
        if (_cursor.isNull(_cursorIndexOfOmegaG)) {
          _tmpOmega_g = null;
        } else {
          _tmpOmega_g = _cursor.getFloat(_cursorIndexOfOmegaG);
        }
        final Float _tmpZinc;
        if (_cursor.isNull(_cursorIndexOfZinc)) {
          _tmpZinc = null;
        } else {
          _tmpZinc = _cursor.getFloat(_cursorIndexOfZinc);
        }
        final Float _tmpO_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfOPolyFatsG)) {
          _tmpO_poly_fats_g = null;
        } else {
          _tmpO_poly_fats_g = _cursor.getFloat(_cursorIndexOfOPolyFatsG);
        }
        final Float _tmpEnergy;
        if (_cursor.isNull(_cursorIndexOfEnergy)) {
          _tmpEnergy = null;
        } else {
          _tmpEnergy = _cursor.getFloat(_cursorIndexOfEnergy);
        }
        final Float _tmpMolybdenum;
        if (_cursor.isNull(_cursorIndexOfMolybdenum)) {
          _tmpMolybdenum = null;
        } else {
          _tmpMolybdenum = _cursor.getFloat(_cursorIndexOfMolybdenum);
        }
        final Float _tmpPhosphorus;
        if (_cursor.isNull(_cursorIndexOfPhosphorus)) {
          _tmpPhosphorus = null;
        } else {
          _tmpPhosphorus = _cursor.getFloat(_cursorIndexOfPhosphorus);
        }
        final Float _tmpProvitamin_a;
        if (_cursor.isNull(_cursorIndexOfProvitaminA)) {
          _tmpProvitamin_a = null;
        } else {
          _tmpProvitamin_a = _cursor.getFloat(_cursorIndexOfProvitaminA);
        }
        final Float _tmpAlcohol;
        if (_cursor.isNull(_cursorIndexOfAlcohol)) {
          _tmpAlcohol = null;
        } else {
          _tmpAlcohol = _cursor.getFloat(_cursorIndexOfAlcohol);
        }
        final Float _tmpTotal_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfTotalDietaryFibre)) {
          _tmpTotal_dietary_fibre = null;
        } else {
          _tmpTotal_dietary_fibre = _cursor.getFloat(_cursorIndexOfTotalDietaryFibre);
        }
        final Float _tmpSat_fats_g;
        if (_cursor.isNull(_cursorIndexOfSatFatsG)) {
          _tmpSat_fats_g = null;
        } else {
          _tmpSat_fats_g = _cursor.getFloat(_cursorIndexOfSatFatsG);
        }
        final Float _tmpVitamin_c;
        if (_cursor.isNull(_cursorIndexOfVitaminC)) {
          _tmpVitamin_c = null;
        } else {
          _tmpVitamin_c = _cursor.getFloat(_cursorIndexOfVitaminC);
        }
        final Float _tmpVitamin_e;
        if (_cursor.isNull(_cursorIndexOfVitaminE)) {
          _tmpVitamin_e = null;
        } else {
          _tmpVitamin_e = _cursor.getFloat(_cursorIndexOfVitaminE);
        }
        final Float _tmpMagnesium;
        if (_cursor.isNull(_cursorIndexOfMagnesium)) {
          _tmpMagnesium = null;
        } else {
          _tmpMagnesium = _cursor.getFloat(_cursorIndexOfMagnesium);
        }
        final Float _tmpGalactose;
        if (_cursor.isNull(_cursorIndexOfGalactose)) {
          _tmpGalactose = null;
        } else {
          _tmpGalactose = _cursor.getFloat(_cursorIndexOfGalactose);
        }
        final Float _tmpMoisture;
        if (_cursor.isNull(_cursorIndexOfMoisture)) {
          _tmpMoisture = null;
        } else {
          _tmpMoisture = _cursor.getFloat(_cursorIndexOfMoisture);
        }
        final Float _tmpFolatenatural;
        if (_cursor.isNull(_cursorIndexOfFolatenatural)) {
          _tmpFolatenatural = null;
        } else {
          _tmpFolatenatural = _cursor.getFloat(_cursorIndexOfFolatenatural);
        }
        final Float _tmpSucrose;
        if (_cursor.isNull(_cursorIndexOfSucrose)) {
          _tmpSucrose = null;
        } else {
          _tmpSucrose = _cursor.getFloat(_cursorIndexOfSucrose);
        }
        final Float _tmpArsenic;
        if (_cursor.isNull(_cursorIndexOfArsenic)) {
          _tmpArsenic = null;
        } else {
          _tmpArsenic = _cursor.getFloat(_cursorIndexOfArsenic);
        }
        final Float _tmpOmega;
        if (_cursor.isNull(_cursorIndexOfOmega)) {
          _tmpOmega = null;
        } else {
          _tmpOmega = _cursor.getFloat(_cursorIndexOfOmega);
        }
        final Float _tmpSodium;
        if (_cursor.isNull(_cursorIndexOfSodium)) {
          _tmpSodium = null;
        } else {
          _tmpSodium = _cursor.getFloat(_cursorIndexOfSodium);
        }
        final Float _tmpBeta_carotene;
        if (_cursor.isNull(_cursorIndexOfBetaCarotene)) {
          _tmpBeta_carotene = null;
        } else {
          _tmpBeta_carotene = _cursor.getFloat(_cursorIndexOfBetaCarotene);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final Float _tmpCadmium;
        if (_cursor.isNull(_cursorIndexOfCadmium)) {
          _tmpCadmium = null;
        } else {
          _tmpCadmium = _cursor.getFloat(_cursorIndexOfCadmium);
        }
        final Float _tmpVitamin_a_retinol_equivalents;
        if (_cursor.isNull(_cursorIndexOfVitaminARetinolEquivalents)) {
          _tmpVitamin_a_retinol_equivalents = null;
        } else {
          _tmpVitamin_a_retinol_equivalents = _cursor.getFloat(_cursorIndexOfVitaminARetinolEquivalents);
        }
        final Float _tmpSugar;
        if (_cursor.isNull(_cursorIndexOfSugar)) {
          _tmpSugar = null;
        } else {
          _tmpSugar = _cursor.getFloat(_cursorIndexOfSugar);
        }
        final Float _tmpO_poly_fats;
        if (_cursor.isNull(_cursorIndexOfOPolyFats)) {
          _tmpO_poly_fats = null;
        } else {
          _tmpO_poly_fats = _cursor.getFloat(_cursorIndexOfOPolyFats);
        }
        final Float _tmpCholecalciferol_d3;
        if (_cursor.isNull(_cursorIndexOfCholecalciferolD3)) {
          _tmpCholecalciferol_d3 = null;
        } else {
          _tmpCholecalciferol_d3 = _cursor.getFloat(_cursorIndexOfCholecalciferolD3);
        }
        final Float _tmpPotassium;
        if (_cursor.isNull(_cursorIndexOfPotassium)) {
          _tmpPotassium = null;
        } else {
          _tmpPotassium = _cursor.getFloat(_cursorIndexOfPotassium);
        }
        final Float _tmpMercury;
        if (_cursor.isNull(_cursorIndexOfMercury)) {
          _tmpMercury = null;
        } else {
          _tmpMercury = _cursor.getFloat(_cursorIndexOfMercury);
        }
        final Float _tmpDietary_folate_equivalents;
        if (_cursor.isNull(_cursorIndexOfDietaryFolateEquivalents)) {
          _tmpDietary_folate_equivalents = null;
        } else {
          _tmpDietary_folate_equivalents = _cursor.getFloat(_cursorIndexOfDietaryFolateEquivalents);
        }
        final Float _tmpCobalt;
        if (_cursor.isNull(_cursorIndexOfCobalt)) {
          _tmpCobalt = null;
        } else {
          _tmpCobalt = _cursor.getFloat(_cursorIndexOfCobalt);
        }
        final Float _tmpLactose;
        if (_cursor.isNull(_cursorIndexOfLactose)) {
          _tmpLactose = null;
        } else {
          _tmpLactose = _cursor.getFloat(_cursorIndexOfLactose);
        }
        final Float _tmpManganese;
        if (_cursor.isNull(_cursorIndexOfManganese)) {
          _tmpManganese = null;
        } else {
          _tmpManganese = _cursor.getFloat(_cursorIndexOfManganese);
        }
        final Float _tmpBiotin_b7;
        if (_cursor.isNull(_cursorIndexOfBiotinB7)) {
          _tmpBiotin_b7 = null;
        } else {
          _tmpBiotin_b7 = _cursor.getFloat(_cursorIndexOfBiotinB7);
        }
        final Float _tmpMaltose;
        if (_cursor.isNull(_cursorIndexOfMaltose)) {
          _tmpMaltose = null;
        } else {
          _tmpMaltose = _cursor.getFloat(_cursorIndexOfMaltose);
        }
        final Float _tmpMaltotriose;
        if (_cursor.isNull(_cursorIndexOfMaltotriose)) {
          _tmpMaltotriose = null;
        } else {
          _tmpMaltotriose = _cursor.getFloat(_cursorIndexOfMaltotriose);
        }
        final Float _tmpMono_fats;
        if (_cursor.isNull(_cursorIndexOfMonoFats)) {
          _tmpMono_fats = null;
        } else {
          _tmpMono_fats = _cursor.getFloat(_cursorIndexOfMonoFats);
        }
        final Float _tmpSelenium;
        if (_cursor.isNull(_cursorIndexOfSelenium)) {
          _tmpSelenium = null;
        } else {
          _tmpSelenium = _cursor.getFloat(_cursorIndexOfSelenium);
        }
        final Float _tmpCopper;
        if (_cursor.isNull(_cursorIndexOfCopper)) {
          _tmpCopper = null;
        } else {
          _tmpCopper = _cursor.getFloat(_cursorIndexOfCopper);
        }
        final Float _tmpIodine;
        if (_cursor.isNull(_cursorIndexOfIodine)) {
          _tmpIodine = null;
        } else {
          _tmpIodine = _cursor.getFloat(_cursorIndexOfIodine);
        }
        final Float _tmpT_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfTPolyFatsG)) {
          _tmpT_poly_fats_g = null;
        } else {
          _tmpT_poly_fats_g = _cursor.getFloat(_cursorIndexOfTPolyFatsG);
        }
        final Float _tmpNickel;
        if (_cursor.isNull(_cursorIndexOfNickel)) {
          _tmpNickel = null;
        } else {
          _tmpNickel = _cursor.getFloat(_cursorIndexOfNickel);
        }
        final Float _tmpGlucose;
        if (_cursor.isNull(_cursorIndexOfGlucose)) {
          _tmpGlucose = null;
        } else {
          _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
        }
        final Float _tmpChromium;
        if (_cursor.isNull(_cursorIndexOfChromium)) {
          _tmpChromium = null;
        } else {
          _tmpChromium = _cursor.getFloat(_cursorIndexOfChromium);
        }
        final Float _tmpAntimony;
        if (_cursor.isNull(_cursorIndexOfAntimony)) {
          _tmpAntimony = null;
        } else {
          _tmpAntimony = _cursor.getFloat(_cursorIndexOfAntimony);
        }
        final Float _tmpCalcium;
        if (_cursor.isNull(_cursorIndexOfCalcium)) {
          _tmpCalcium = null;
        } else {
          _tmpCalcium = _cursor.getFloat(_cursorIndexOfCalcium);
        }
        final Float _tmpSulphur;
        if (_cursor.isNull(_cursorIndexOfSulphur)) {
          _tmpSulphur = null;
        } else {
          _tmpSulphur = _cursor.getFloat(_cursorIndexOfSulphur);
        }
        final Float _tmpNitrogen;
        if (_cursor.isNull(_cursorIndexOfNitrogen)) {
          _tmpNitrogen = null;
        } else {
          _tmpNitrogen = _cursor.getFloat(_cursorIndexOfNitrogen);
        }
        final Float _tmpFructose;
        if (_cursor.isNull(_cursorIndexOfFructose)) {
          _tmpFructose = null;
        } else {
          _tmpFructose = _cursor.getFloat(_cursorIndexOfFructose);
        }
        final Float _tmpLead;
        if (_cursor.isNull(_cursorIndexOfLead)) {
          _tmpLead = null;
        } else {
          _tmpLead = _cursor.getFloat(_cursorIndexOfLead);
        }
        final Float _tmpSat_fats;
        if (_cursor.isNull(_cursorIndexOfSatFats)) {
          _tmpSat_fats = null;
        } else {
          _tmpSat_fats = _cursor.getFloat(_cursorIndexOfSatFats);
        }
        final Float _tmpMono_fats_g;
        if (_cursor.isNull(_cursorIndexOfMonoFatsG)) {
          _tmpMono_fats_g = null;
        } else {
          _tmpMono_fats_g = _cursor.getFloat(_cursorIndexOfMonoFatsG);
        }
        final Float _tmpAsh;
        if (_cursor.isNull(_cursorIndexOfAsh)) {
          _tmpAsh = null;
        } else {
          _tmpAsh = _cursor.getFloat(_cursorIndexOfAsh);
        }
        final Float _tmpAluminium;
        if (_cursor.isNull(_cursorIndexOfAluminium)) {
          _tmpAluminium = null;
        } else {
          _tmpAluminium = _cursor.getFloat(_cursorIndexOfAluminium);
        }
        final Float _tmpT_poly_fats;
        if (_cursor.isNull(_cursorIndexOfTPolyFats)) {
          _tmpT_poly_fats = null;
        } else {
          _tmpT_poly_fats = _cursor.getFloat(_cursorIndexOfTPolyFats);
        }
        final Float _tmpIron;
        if (_cursor.isNull(_cursorIndexOfIron)) {
          _tmpIron = null;
        } else {
          _tmpIron = _cursor.getFloat(_cursorIndexOfIron);
        }
        final Float _tmpStarch;
        if (_cursor.isNull(_cursorIndexOfStarch)) {
          _tmpStarch = null;
        } else {
          _tmpStarch = _cursor.getFloat(_cursorIndexOfStarch);
        }
        final Float _tmpRiboflavin_b2;
        if (_cursor.isNull(_cursorIndexOfRiboflavinB2)) {
          _tmpRiboflavin_b2 = null;
        } else {
          _tmpRiboflavin_b2 = _cursor.getFloat(_cursorIndexOfRiboflavinB2);
        }
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _item = new FoodProduct(_tmpId,_tmpCryptoxanthin,_tmpTotalfolates,_tmpErgocalciferol_d2,_tmpNiacin_b3,_tmpCobalamin_b12,_tmpEnergy_without_dietary_fibre,_tmpCarbs,_tmpFluoride,_tmpPantothenic_acid_b5,_tmpThiamin_b1,_tmpFolicacid,_tmpRetinol,_tmpAlpha_carotene,_tmpPyridoxine_b6,_tmpProteins,_tmpFats,_tmpTin,_tmpChloride,_tmpOmega_g,_tmpZinc,_tmpO_poly_fats_g,_tmpEnergy,_tmpMolybdenum,_tmpPhosphorus,_tmpProvitamin_a,_tmpAlcohol,_tmpTotal_dietary_fibre,_tmpSat_fats_g,_tmpVitamin_c,_tmpVitamin_e,_tmpMagnesium,_tmpGalactose,_tmpMoisture,_tmpFolatenatural,_tmpSucrose,_tmpArsenic,_tmpOmega,_tmpSodium,_tmpBeta_carotene,_tmpName,_tmpCadmium,_tmpVitamin_a_retinol_equivalents,_tmpSugar,_tmpO_poly_fats,_tmpCholecalciferol_d3,_tmpPotassium,_tmpMercury,_tmpDietary_folate_equivalents,_tmpCobalt,_tmpLactose,_tmpManganese,_tmpBiotin_b7,_tmpMaltose,_tmpMaltotriose,_tmpMono_fats,_tmpSelenium,_tmpCopper,_tmpIodine,_tmpT_poly_fats_g,_tmpNickel,_tmpGlucose,_tmpChromium,_tmpAntimony,_tmpCalcium,_tmpSulphur,_tmpNitrogen,_tmpFructose,_tmpLead,_tmpSat_fats,_tmpMono_fats_g,_tmpAsh,_tmpAluminium,_tmpT_poly_fats,_tmpIron,_tmpStarch,_tmpRiboflavin_b2,_tmpCalories);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public FoodProduct searchByNameExact(String name) {
    final String _sql = "select * from food where name == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCryptoxanthin = _cursor.getColumnIndexOrThrow("cryptoxanthin");
      final int _cursorIndexOfTotalfolates = _cursor.getColumnIndexOrThrow("totalfolates");
      final int _cursorIndexOfErgocalciferolD2 = _cursor.getColumnIndexOrThrow("ergocalciferol_d2");
      final int _cursorIndexOfNiacinB3 = _cursor.getColumnIndexOrThrow("niacin_b3");
      final int _cursorIndexOfCobalaminB12 = _cursor.getColumnIndexOrThrow("cobalamin_b12");
      final int _cursorIndexOfEnergyWithoutDietaryFibre = _cursor.getColumnIndexOrThrow("energy_without_dietary_fibre");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfFluoride = _cursor.getColumnIndexOrThrow("fluoride");
      final int _cursorIndexOfPantothenicAcidB5 = _cursor.getColumnIndexOrThrow("pantothenic_acid_b5");
      final int _cursorIndexOfThiaminB1 = _cursor.getColumnIndexOrThrow("thiamin_b1");
      final int _cursorIndexOfFolicacid = _cursor.getColumnIndexOrThrow("folicacid");
      final int _cursorIndexOfRetinol = _cursor.getColumnIndexOrThrow("retinol");
      final int _cursorIndexOfAlphaCarotene = _cursor.getColumnIndexOrThrow("alpha_carotene");
      final int _cursorIndexOfPyridoxineB6 = _cursor.getColumnIndexOrThrow("pyridoxine_b6");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("protein");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fat");
      final int _cursorIndexOfTin = _cursor.getColumnIndexOrThrow("tin");
      final int _cursorIndexOfChloride = _cursor.getColumnIndexOrThrow("chloride");
      final int _cursorIndexOfOmegaG = _cursor.getColumnIndexOrThrow("omega_g");
      final int _cursorIndexOfZinc = _cursor.getColumnIndexOrThrow("zinc");
      final int _cursorIndexOfOPolyFatsG = _cursor.getColumnIndexOrThrow("o_poly_fats_g");
      final int _cursorIndexOfEnergy = _cursor.getColumnIndexOrThrow("energy");
      final int _cursorIndexOfMolybdenum = _cursor.getColumnIndexOrThrow("molybdenum");
      final int _cursorIndexOfPhosphorus = _cursor.getColumnIndexOrThrow("phosphorus");
      final int _cursorIndexOfProvitaminA = _cursor.getColumnIndexOrThrow("provitamin_a");
      final int _cursorIndexOfAlcohol = _cursor.getColumnIndexOrThrow("alcohol");
      final int _cursorIndexOfTotalDietaryFibre = _cursor.getColumnIndexOrThrow("total_dietary_fibre");
      final int _cursorIndexOfSatFatsG = _cursor.getColumnIndexOrThrow("sat_fats_g");
      final int _cursorIndexOfVitaminC = _cursor.getColumnIndexOrThrow("vitamin_c");
      final int _cursorIndexOfVitaminE = _cursor.getColumnIndexOrThrow("vitamin_e");
      final int _cursorIndexOfMagnesium = _cursor.getColumnIndexOrThrow("magnesium");
      final int _cursorIndexOfGalactose = _cursor.getColumnIndexOrThrow("galactose");
      final int _cursorIndexOfMoisture = _cursor.getColumnIndexOrThrow("moisture");
      final int _cursorIndexOfFolatenatural = _cursor.getColumnIndexOrThrow("folatenatural");
      final int _cursorIndexOfSucrose = _cursor.getColumnIndexOrThrow("sucrose");
      final int _cursorIndexOfArsenic = _cursor.getColumnIndexOrThrow("arsenic");
      final int _cursorIndexOfOmega = _cursor.getColumnIndexOrThrow("omega");
      final int _cursorIndexOfSodium = _cursor.getColumnIndexOrThrow("sodium");
      final int _cursorIndexOfBetaCarotene = _cursor.getColumnIndexOrThrow("beta_carotene");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCadmium = _cursor.getColumnIndexOrThrow("cadmium");
      final int _cursorIndexOfVitaminARetinolEquivalents = _cursor.getColumnIndexOrThrow("vitamin_a_retinol_equivalents");
      final int _cursorIndexOfSugar = _cursor.getColumnIndexOrThrow("sugar");
      final int _cursorIndexOfOPolyFats = _cursor.getColumnIndexOrThrow("o_poly_fats");
      final int _cursorIndexOfCholecalciferolD3 = _cursor.getColumnIndexOrThrow("cholecalciferol_d3");
      final int _cursorIndexOfPotassium = _cursor.getColumnIndexOrThrow("potassium");
      final int _cursorIndexOfMercury = _cursor.getColumnIndexOrThrow("mercury");
      final int _cursorIndexOfDietaryFolateEquivalents = _cursor.getColumnIndexOrThrow("dietary_folate_equivalents");
      final int _cursorIndexOfCobalt = _cursor.getColumnIndexOrThrow("cobalt");
      final int _cursorIndexOfLactose = _cursor.getColumnIndexOrThrow("lactose");
      final int _cursorIndexOfManganese = _cursor.getColumnIndexOrThrow("manganese");
      final int _cursorIndexOfBiotinB7 = _cursor.getColumnIndexOrThrow("biotin_b7");
      final int _cursorIndexOfMaltose = _cursor.getColumnIndexOrThrow("maltose");
      final int _cursorIndexOfMaltotriose = _cursor.getColumnIndexOrThrow("maltotriose");
      final int _cursorIndexOfMonoFats = _cursor.getColumnIndexOrThrow("mono_fats");
      final int _cursorIndexOfSelenium = _cursor.getColumnIndexOrThrow("selenium");
      final int _cursorIndexOfCopper = _cursor.getColumnIndexOrThrow("copper");
      final int _cursorIndexOfIodine = _cursor.getColumnIndexOrThrow("iodine");
      final int _cursorIndexOfTPolyFatsG = _cursor.getColumnIndexOrThrow("t_poly_fats_g");
      final int _cursorIndexOfNickel = _cursor.getColumnIndexOrThrow("nickel");
      final int _cursorIndexOfGlucose = _cursor.getColumnIndexOrThrow("glucose");
      final int _cursorIndexOfChromium = _cursor.getColumnIndexOrThrow("chromium");
      final int _cursorIndexOfAntimony = _cursor.getColumnIndexOrThrow("antimony");
      final int _cursorIndexOfCalcium = _cursor.getColumnIndexOrThrow("calcium");
      final int _cursorIndexOfSulphur = _cursor.getColumnIndexOrThrow("sulphur");
      final int _cursorIndexOfNitrogen = _cursor.getColumnIndexOrThrow("nitrogen");
      final int _cursorIndexOfFructose = _cursor.getColumnIndexOrThrow("fructose");
      final int _cursorIndexOfLead = _cursor.getColumnIndexOrThrow("lead");
      final int _cursorIndexOfSatFats = _cursor.getColumnIndexOrThrow("sat_fats");
      final int _cursorIndexOfMonoFatsG = _cursor.getColumnIndexOrThrow("mono_fats_g");
      final int _cursorIndexOfAsh = _cursor.getColumnIndexOrThrow("ash");
      final int _cursorIndexOfAluminium = _cursor.getColumnIndexOrThrow("aluminium");
      final int _cursorIndexOfTPolyFats = _cursor.getColumnIndexOrThrow("t_poly_fats");
      final int _cursorIndexOfIron = _cursor.getColumnIndexOrThrow("iron");
      final int _cursorIndexOfStarch = _cursor.getColumnIndexOrThrow("starch");
      final int _cursorIndexOfRiboflavinB2 = _cursor.getColumnIndexOrThrow("riboflavin_b2");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final FoodProduct _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Float _tmpCryptoxanthin;
        if (_cursor.isNull(_cursorIndexOfCryptoxanthin)) {
          _tmpCryptoxanthin = null;
        } else {
          _tmpCryptoxanthin = _cursor.getFloat(_cursorIndexOfCryptoxanthin);
        }
        final Float _tmpTotalfolates;
        if (_cursor.isNull(_cursorIndexOfTotalfolates)) {
          _tmpTotalfolates = null;
        } else {
          _tmpTotalfolates = _cursor.getFloat(_cursorIndexOfTotalfolates);
        }
        final Float _tmpErgocalciferol_d2;
        if (_cursor.isNull(_cursorIndexOfErgocalciferolD2)) {
          _tmpErgocalciferol_d2 = null;
        } else {
          _tmpErgocalciferol_d2 = _cursor.getFloat(_cursorIndexOfErgocalciferolD2);
        }
        final Float _tmpNiacin_b3;
        if (_cursor.isNull(_cursorIndexOfNiacinB3)) {
          _tmpNiacin_b3 = null;
        } else {
          _tmpNiacin_b3 = _cursor.getFloat(_cursorIndexOfNiacinB3);
        }
        final Float _tmpCobalamin_b12;
        if (_cursor.isNull(_cursorIndexOfCobalaminB12)) {
          _tmpCobalamin_b12 = null;
        } else {
          _tmpCobalamin_b12 = _cursor.getFloat(_cursorIndexOfCobalaminB12);
        }
        final Float _tmpEnergy_without_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfEnergyWithoutDietaryFibre)) {
          _tmpEnergy_without_dietary_fibre = null;
        } else {
          _tmpEnergy_without_dietary_fibre = _cursor.getFloat(_cursorIndexOfEnergyWithoutDietaryFibre);
        }
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final Float _tmpFluoride;
        if (_cursor.isNull(_cursorIndexOfFluoride)) {
          _tmpFluoride = null;
        } else {
          _tmpFluoride = _cursor.getFloat(_cursorIndexOfFluoride);
        }
        final Float _tmpPantothenic_acid_b5;
        if (_cursor.isNull(_cursorIndexOfPantothenicAcidB5)) {
          _tmpPantothenic_acid_b5 = null;
        } else {
          _tmpPantothenic_acid_b5 = _cursor.getFloat(_cursorIndexOfPantothenicAcidB5);
        }
        final Float _tmpThiamin_b1;
        if (_cursor.isNull(_cursorIndexOfThiaminB1)) {
          _tmpThiamin_b1 = null;
        } else {
          _tmpThiamin_b1 = _cursor.getFloat(_cursorIndexOfThiaminB1);
        }
        final Float _tmpFolicacid;
        if (_cursor.isNull(_cursorIndexOfFolicacid)) {
          _tmpFolicacid = null;
        } else {
          _tmpFolicacid = _cursor.getFloat(_cursorIndexOfFolicacid);
        }
        final Float _tmpRetinol;
        if (_cursor.isNull(_cursorIndexOfRetinol)) {
          _tmpRetinol = null;
        } else {
          _tmpRetinol = _cursor.getFloat(_cursorIndexOfRetinol);
        }
        final Float _tmpAlpha_carotene;
        if (_cursor.isNull(_cursorIndexOfAlphaCarotene)) {
          _tmpAlpha_carotene = null;
        } else {
          _tmpAlpha_carotene = _cursor.getFloat(_cursorIndexOfAlphaCarotene);
        }
        final Float _tmpPyridoxine_b6;
        if (_cursor.isNull(_cursorIndexOfPyridoxineB6)) {
          _tmpPyridoxine_b6 = null;
        } else {
          _tmpPyridoxine_b6 = _cursor.getFloat(_cursorIndexOfPyridoxineB6);
        }
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final Float _tmpTin;
        if (_cursor.isNull(_cursorIndexOfTin)) {
          _tmpTin = null;
        } else {
          _tmpTin = _cursor.getFloat(_cursorIndexOfTin);
        }
        final Float _tmpChloride;
        if (_cursor.isNull(_cursorIndexOfChloride)) {
          _tmpChloride = null;
        } else {
          _tmpChloride = _cursor.getFloat(_cursorIndexOfChloride);
        }
        final Float _tmpOmega_g;
        if (_cursor.isNull(_cursorIndexOfOmegaG)) {
          _tmpOmega_g = null;
        } else {
          _tmpOmega_g = _cursor.getFloat(_cursorIndexOfOmegaG);
        }
        final Float _tmpZinc;
        if (_cursor.isNull(_cursorIndexOfZinc)) {
          _tmpZinc = null;
        } else {
          _tmpZinc = _cursor.getFloat(_cursorIndexOfZinc);
        }
        final Float _tmpO_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfOPolyFatsG)) {
          _tmpO_poly_fats_g = null;
        } else {
          _tmpO_poly_fats_g = _cursor.getFloat(_cursorIndexOfOPolyFatsG);
        }
        final Float _tmpEnergy;
        if (_cursor.isNull(_cursorIndexOfEnergy)) {
          _tmpEnergy = null;
        } else {
          _tmpEnergy = _cursor.getFloat(_cursorIndexOfEnergy);
        }
        final Float _tmpMolybdenum;
        if (_cursor.isNull(_cursorIndexOfMolybdenum)) {
          _tmpMolybdenum = null;
        } else {
          _tmpMolybdenum = _cursor.getFloat(_cursorIndexOfMolybdenum);
        }
        final Float _tmpPhosphorus;
        if (_cursor.isNull(_cursorIndexOfPhosphorus)) {
          _tmpPhosphorus = null;
        } else {
          _tmpPhosphorus = _cursor.getFloat(_cursorIndexOfPhosphorus);
        }
        final Float _tmpProvitamin_a;
        if (_cursor.isNull(_cursorIndexOfProvitaminA)) {
          _tmpProvitamin_a = null;
        } else {
          _tmpProvitamin_a = _cursor.getFloat(_cursorIndexOfProvitaminA);
        }
        final Float _tmpAlcohol;
        if (_cursor.isNull(_cursorIndexOfAlcohol)) {
          _tmpAlcohol = null;
        } else {
          _tmpAlcohol = _cursor.getFloat(_cursorIndexOfAlcohol);
        }
        final Float _tmpTotal_dietary_fibre;
        if (_cursor.isNull(_cursorIndexOfTotalDietaryFibre)) {
          _tmpTotal_dietary_fibre = null;
        } else {
          _tmpTotal_dietary_fibre = _cursor.getFloat(_cursorIndexOfTotalDietaryFibre);
        }
        final Float _tmpSat_fats_g;
        if (_cursor.isNull(_cursorIndexOfSatFatsG)) {
          _tmpSat_fats_g = null;
        } else {
          _tmpSat_fats_g = _cursor.getFloat(_cursorIndexOfSatFatsG);
        }
        final Float _tmpVitamin_c;
        if (_cursor.isNull(_cursorIndexOfVitaminC)) {
          _tmpVitamin_c = null;
        } else {
          _tmpVitamin_c = _cursor.getFloat(_cursorIndexOfVitaminC);
        }
        final Float _tmpVitamin_e;
        if (_cursor.isNull(_cursorIndexOfVitaminE)) {
          _tmpVitamin_e = null;
        } else {
          _tmpVitamin_e = _cursor.getFloat(_cursorIndexOfVitaminE);
        }
        final Float _tmpMagnesium;
        if (_cursor.isNull(_cursorIndexOfMagnesium)) {
          _tmpMagnesium = null;
        } else {
          _tmpMagnesium = _cursor.getFloat(_cursorIndexOfMagnesium);
        }
        final Float _tmpGalactose;
        if (_cursor.isNull(_cursorIndexOfGalactose)) {
          _tmpGalactose = null;
        } else {
          _tmpGalactose = _cursor.getFloat(_cursorIndexOfGalactose);
        }
        final Float _tmpMoisture;
        if (_cursor.isNull(_cursorIndexOfMoisture)) {
          _tmpMoisture = null;
        } else {
          _tmpMoisture = _cursor.getFloat(_cursorIndexOfMoisture);
        }
        final Float _tmpFolatenatural;
        if (_cursor.isNull(_cursorIndexOfFolatenatural)) {
          _tmpFolatenatural = null;
        } else {
          _tmpFolatenatural = _cursor.getFloat(_cursorIndexOfFolatenatural);
        }
        final Float _tmpSucrose;
        if (_cursor.isNull(_cursorIndexOfSucrose)) {
          _tmpSucrose = null;
        } else {
          _tmpSucrose = _cursor.getFloat(_cursorIndexOfSucrose);
        }
        final Float _tmpArsenic;
        if (_cursor.isNull(_cursorIndexOfArsenic)) {
          _tmpArsenic = null;
        } else {
          _tmpArsenic = _cursor.getFloat(_cursorIndexOfArsenic);
        }
        final Float _tmpOmega;
        if (_cursor.isNull(_cursorIndexOfOmega)) {
          _tmpOmega = null;
        } else {
          _tmpOmega = _cursor.getFloat(_cursorIndexOfOmega);
        }
        final Float _tmpSodium;
        if (_cursor.isNull(_cursorIndexOfSodium)) {
          _tmpSodium = null;
        } else {
          _tmpSodium = _cursor.getFloat(_cursorIndexOfSodium);
        }
        final Float _tmpBeta_carotene;
        if (_cursor.isNull(_cursorIndexOfBetaCarotene)) {
          _tmpBeta_carotene = null;
        } else {
          _tmpBeta_carotene = _cursor.getFloat(_cursorIndexOfBetaCarotene);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final Float _tmpCadmium;
        if (_cursor.isNull(_cursorIndexOfCadmium)) {
          _tmpCadmium = null;
        } else {
          _tmpCadmium = _cursor.getFloat(_cursorIndexOfCadmium);
        }
        final Float _tmpVitamin_a_retinol_equivalents;
        if (_cursor.isNull(_cursorIndexOfVitaminARetinolEquivalents)) {
          _tmpVitamin_a_retinol_equivalents = null;
        } else {
          _tmpVitamin_a_retinol_equivalents = _cursor.getFloat(_cursorIndexOfVitaminARetinolEquivalents);
        }
        final Float _tmpSugar;
        if (_cursor.isNull(_cursorIndexOfSugar)) {
          _tmpSugar = null;
        } else {
          _tmpSugar = _cursor.getFloat(_cursorIndexOfSugar);
        }
        final Float _tmpO_poly_fats;
        if (_cursor.isNull(_cursorIndexOfOPolyFats)) {
          _tmpO_poly_fats = null;
        } else {
          _tmpO_poly_fats = _cursor.getFloat(_cursorIndexOfOPolyFats);
        }
        final Float _tmpCholecalciferol_d3;
        if (_cursor.isNull(_cursorIndexOfCholecalciferolD3)) {
          _tmpCholecalciferol_d3 = null;
        } else {
          _tmpCholecalciferol_d3 = _cursor.getFloat(_cursorIndexOfCholecalciferolD3);
        }
        final Float _tmpPotassium;
        if (_cursor.isNull(_cursorIndexOfPotassium)) {
          _tmpPotassium = null;
        } else {
          _tmpPotassium = _cursor.getFloat(_cursorIndexOfPotassium);
        }
        final Float _tmpMercury;
        if (_cursor.isNull(_cursorIndexOfMercury)) {
          _tmpMercury = null;
        } else {
          _tmpMercury = _cursor.getFloat(_cursorIndexOfMercury);
        }
        final Float _tmpDietary_folate_equivalents;
        if (_cursor.isNull(_cursorIndexOfDietaryFolateEquivalents)) {
          _tmpDietary_folate_equivalents = null;
        } else {
          _tmpDietary_folate_equivalents = _cursor.getFloat(_cursorIndexOfDietaryFolateEquivalents);
        }
        final Float _tmpCobalt;
        if (_cursor.isNull(_cursorIndexOfCobalt)) {
          _tmpCobalt = null;
        } else {
          _tmpCobalt = _cursor.getFloat(_cursorIndexOfCobalt);
        }
        final Float _tmpLactose;
        if (_cursor.isNull(_cursorIndexOfLactose)) {
          _tmpLactose = null;
        } else {
          _tmpLactose = _cursor.getFloat(_cursorIndexOfLactose);
        }
        final Float _tmpManganese;
        if (_cursor.isNull(_cursorIndexOfManganese)) {
          _tmpManganese = null;
        } else {
          _tmpManganese = _cursor.getFloat(_cursorIndexOfManganese);
        }
        final Float _tmpBiotin_b7;
        if (_cursor.isNull(_cursorIndexOfBiotinB7)) {
          _tmpBiotin_b7 = null;
        } else {
          _tmpBiotin_b7 = _cursor.getFloat(_cursorIndexOfBiotinB7);
        }
        final Float _tmpMaltose;
        if (_cursor.isNull(_cursorIndexOfMaltose)) {
          _tmpMaltose = null;
        } else {
          _tmpMaltose = _cursor.getFloat(_cursorIndexOfMaltose);
        }
        final Float _tmpMaltotriose;
        if (_cursor.isNull(_cursorIndexOfMaltotriose)) {
          _tmpMaltotriose = null;
        } else {
          _tmpMaltotriose = _cursor.getFloat(_cursorIndexOfMaltotriose);
        }
        final Float _tmpMono_fats;
        if (_cursor.isNull(_cursorIndexOfMonoFats)) {
          _tmpMono_fats = null;
        } else {
          _tmpMono_fats = _cursor.getFloat(_cursorIndexOfMonoFats);
        }
        final Float _tmpSelenium;
        if (_cursor.isNull(_cursorIndexOfSelenium)) {
          _tmpSelenium = null;
        } else {
          _tmpSelenium = _cursor.getFloat(_cursorIndexOfSelenium);
        }
        final Float _tmpCopper;
        if (_cursor.isNull(_cursorIndexOfCopper)) {
          _tmpCopper = null;
        } else {
          _tmpCopper = _cursor.getFloat(_cursorIndexOfCopper);
        }
        final Float _tmpIodine;
        if (_cursor.isNull(_cursorIndexOfIodine)) {
          _tmpIodine = null;
        } else {
          _tmpIodine = _cursor.getFloat(_cursorIndexOfIodine);
        }
        final Float _tmpT_poly_fats_g;
        if (_cursor.isNull(_cursorIndexOfTPolyFatsG)) {
          _tmpT_poly_fats_g = null;
        } else {
          _tmpT_poly_fats_g = _cursor.getFloat(_cursorIndexOfTPolyFatsG);
        }
        final Float _tmpNickel;
        if (_cursor.isNull(_cursorIndexOfNickel)) {
          _tmpNickel = null;
        } else {
          _tmpNickel = _cursor.getFloat(_cursorIndexOfNickel);
        }
        final Float _tmpGlucose;
        if (_cursor.isNull(_cursorIndexOfGlucose)) {
          _tmpGlucose = null;
        } else {
          _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
        }
        final Float _tmpChromium;
        if (_cursor.isNull(_cursorIndexOfChromium)) {
          _tmpChromium = null;
        } else {
          _tmpChromium = _cursor.getFloat(_cursorIndexOfChromium);
        }
        final Float _tmpAntimony;
        if (_cursor.isNull(_cursorIndexOfAntimony)) {
          _tmpAntimony = null;
        } else {
          _tmpAntimony = _cursor.getFloat(_cursorIndexOfAntimony);
        }
        final Float _tmpCalcium;
        if (_cursor.isNull(_cursorIndexOfCalcium)) {
          _tmpCalcium = null;
        } else {
          _tmpCalcium = _cursor.getFloat(_cursorIndexOfCalcium);
        }
        final Float _tmpSulphur;
        if (_cursor.isNull(_cursorIndexOfSulphur)) {
          _tmpSulphur = null;
        } else {
          _tmpSulphur = _cursor.getFloat(_cursorIndexOfSulphur);
        }
        final Float _tmpNitrogen;
        if (_cursor.isNull(_cursorIndexOfNitrogen)) {
          _tmpNitrogen = null;
        } else {
          _tmpNitrogen = _cursor.getFloat(_cursorIndexOfNitrogen);
        }
        final Float _tmpFructose;
        if (_cursor.isNull(_cursorIndexOfFructose)) {
          _tmpFructose = null;
        } else {
          _tmpFructose = _cursor.getFloat(_cursorIndexOfFructose);
        }
        final Float _tmpLead;
        if (_cursor.isNull(_cursorIndexOfLead)) {
          _tmpLead = null;
        } else {
          _tmpLead = _cursor.getFloat(_cursorIndexOfLead);
        }
        final Float _tmpSat_fats;
        if (_cursor.isNull(_cursorIndexOfSatFats)) {
          _tmpSat_fats = null;
        } else {
          _tmpSat_fats = _cursor.getFloat(_cursorIndexOfSatFats);
        }
        final Float _tmpMono_fats_g;
        if (_cursor.isNull(_cursorIndexOfMonoFatsG)) {
          _tmpMono_fats_g = null;
        } else {
          _tmpMono_fats_g = _cursor.getFloat(_cursorIndexOfMonoFatsG);
        }
        final Float _tmpAsh;
        if (_cursor.isNull(_cursorIndexOfAsh)) {
          _tmpAsh = null;
        } else {
          _tmpAsh = _cursor.getFloat(_cursorIndexOfAsh);
        }
        final Float _tmpAluminium;
        if (_cursor.isNull(_cursorIndexOfAluminium)) {
          _tmpAluminium = null;
        } else {
          _tmpAluminium = _cursor.getFloat(_cursorIndexOfAluminium);
        }
        final Float _tmpT_poly_fats;
        if (_cursor.isNull(_cursorIndexOfTPolyFats)) {
          _tmpT_poly_fats = null;
        } else {
          _tmpT_poly_fats = _cursor.getFloat(_cursorIndexOfTPolyFats);
        }
        final Float _tmpIron;
        if (_cursor.isNull(_cursorIndexOfIron)) {
          _tmpIron = null;
        } else {
          _tmpIron = _cursor.getFloat(_cursorIndexOfIron);
        }
        final Float _tmpStarch;
        if (_cursor.isNull(_cursorIndexOfStarch)) {
          _tmpStarch = null;
        } else {
          _tmpStarch = _cursor.getFloat(_cursorIndexOfStarch);
        }
        final Float _tmpRiboflavin_b2;
        if (_cursor.isNull(_cursorIndexOfRiboflavinB2)) {
          _tmpRiboflavin_b2 = null;
        } else {
          _tmpRiboflavin_b2 = _cursor.getFloat(_cursorIndexOfRiboflavinB2);
        }
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _result = new FoodProduct(_tmpId,_tmpCryptoxanthin,_tmpTotalfolates,_tmpErgocalciferol_d2,_tmpNiacin_b3,_tmpCobalamin_b12,_tmpEnergy_without_dietary_fibre,_tmpCarbs,_tmpFluoride,_tmpPantothenic_acid_b5,_tmpThiamin_b1,_tmpFolicacid,_tmpRetinol,_tmpAlpha_carotene,_tmpPyridoxine_b6,_tmpProteins,_tmpFats,_tmpTin,_tmpChloride,_tmpOmega_g,_tmpZinc,_tmpO_poly_fats_g,_tmpEnergy,_tmpMolybdenum,_tmpPhosphorus,_tmpProvitamin_a,_tmpAlcohol,_tmpTotal_dietary_fibre,_tmpSat_fats_g,_tmpVitamin_c,_tmpVitamin_e,_tmpMagnesium,_tmpGalactose,_tmpMoisture,_tmpFolatenatural,_tmpSucrose,_tmpArsenic,_tmpOmega,_tmpSodium,_tmpBeta_carotene,_tmpName,_tmpCadmium,_tmpVitamin_a_retinol_equivalents,_tmpSugar,_tmpO_poly_fats,_tmpCholecalciferol_d3,_tmpPotassium,_tmpMercury,_tmpDietary_folate_equivalents,_tmpCobalt,_tmpLactose,_tmpManganese,_tmpBiotin_b7,_tmpMaltose,_tmpMaltotriose,_tmpMono_fats,_tmpSelenium,_tmpCopper,_tmpIodine,_tmpT_poly_fats_g,_tmpNickel,_tmpGlucose,_tmpChromium,_tmpAntimony,_tmpCalcium,_tmpSulphur,_tmpNitrogen,_tmpFructose,_tmpLead,_tmpSat_fats,_tmpMono_fats_g,_tmpAsh,_tmpAluminium,_tmpT_poly_fats,_tmpIron,_tmpStarch,_tmpRiboflavin_b2,_tmpCalories);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> searchBySuggestion(String suggestion) {
    final String _sql = "select name from food where name like '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (suggestion == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, suggestion);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
