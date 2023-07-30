package com.feedapp.app.data.databases.daos;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.feedapp.app.data.databases.converters.Converters;
import com.feedapp.app.data.models.Product;
import com.feedapp.app.data.models.day.Day;
import com.feedapp.app.data.models.day.DayDate;
import com.feedapp.app.data.models.day.Meal;
import com.feedapp.app.data.models.day.MealType;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class DayDao_Impl implements DayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDay;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDay;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllDays;

  private final SharedSQLiteStatement __preparedStmtOfUpdateWaterGlasses;

  public DayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDay = new EntityInsertionAdapter<Day>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `days`(`dayId`,`meals`,`waterNum`,`month`,`day`,`year`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Day value) {
        stmt.bindLong(1, value.getDayId());
        final String _tmp;
        _tmp = Converters.MealListToJson(value.getMeals());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.getWaterNum());
        final DayDate _tmpDate = value.getDate();
        if(_tmpDate != null) {
          if (_tmpDate.getMonth() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpDate.getMonth());
          }
          if (_tmpDate.getDay() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpDate.getDay());
          }
          if (_tmpDate.getYear() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpDate.getYear());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
      }
    };
    this.__preparedStmtOfDeleteDay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from days where dayId == ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllDays = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from days";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateWaterGlasses = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update days set waterNum=? where dayId == ?";
        return _query;
      }
    };
  }

  @Override
  public void insertDay(Day day) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDay.insert(day);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDay(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDay.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDay.release(_stmt);
    }
  }

  @Override
  public void deleteAllDays() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllDays.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllDays.release(_stmt);
    }
  }

  @Override
  public void updateWaterGlasses(int waterNum, int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateWaterGlasses.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, waterNum);
      _argIndex = 2;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateWaterGlasses.release(_stmt);
    }
  }

  @Override
  public List<Day> getAllDays() {
    final String _sql = "select * from days";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("dayId");
      final int _cursorIndexOfMeals = _cursor.getColumnIndexOrThrow("meals");
      final int _cursorIndexOfWaterNum = _cursor.getColumnIndexOrThrow("waterNum");
      final int _cursorIndexOfMonth = _cursor.getColumnIndexOrThrow("month");
      final int _cursorIndexOfDay = _cursor.getColumnIndexOrThrow("day");
      final int _cursorIndexOfYear = _cursor.getColumnIndexOrThrow("year");
      final List<Day> _result = new ArrayList<Day>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Day _item;
        final int _tmpDayId;
        _tmpDayId = _cursor.getInt(_cursorIndexOfDayId);
        final List<Meal> _tmpMeals;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfMeals);
        _tmpMeals = Converters.jsonToMealList(_tmp);
        final int _tmpWaterNum;
        _tmpWaterNum = _cursor.getInt(_cursorIndexOfWaterNum);
        final DayDate _tmpDate;
        if (! (_cursor.isNull(_cursorIndexOfMonth) && _cursor.isNull(_cursorIndexOfDay) && _cursor.isNull(_cursorIndexOfYear))) {
          final String _tmpMonth;
          _tmpMonth = _cursor.getString(_cursorIndexOfMonth);
          final String _tmpDay;
          _tmpDay = _cursor.getString(_cursorIndexOfDay);
          final String _tmpYear;
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
          _tmpDate = new DayDate(_tmpMonth,_tmpDay,_tmpYear);
        }  else  {
          _tmpDate = null;
        }
        _item = new Day(_tmpDayId,_tmpMeals,_tmpDate,_tmpWaterNum);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Day> getAllDaysInMonth(String month) {
    final String _sql = "select * from days where month == ? limit 31";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (month == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, month);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("dayId");
      final int _cursorIndexOfMeals = _cursor.getColumnIndexOrThrow("meals");
      final int _cursorIndexOfWaterNum = _cursor.getColumnIndexOrThrow("waterNum");
      final int _cursorIndexOfMonth = _cursor.getColumnIndexOrThrow("month");
      final int _cursorIndexOfDay = _cursor.getColumnIndexOrThrow("day");
      final int _cursorIndexOfYear = _cursor.getColumnIndexOrThrow("year");
      final List<Day> _result = new ArrayList<Day>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Day _item;
        final int _tmpDayId;
        _tmpDayId = _cursor.getInt(_cursorIndexOfDayId);
        final List<Meal> _tmpMeals;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfMeals);
        _tmpMeals = Converters.jsonToMealList(_tmp);
        final int _tmpWaterNum;
        _tmpWaterNum = _cursor.getInt(_cursorIndexOfWaterNum);
        final DayDate _tmpDate;
        if (! (_cursor.isNull(_cursorIndexOfMonth) && _cursor.isNull(_cursorIndexOfDay) && _cursor.isNull(_cursorIndexOfYear))) {
          final String _tmpMonth;
          _tmpMonth = _cursor.getString(_cursorIndexOfMonth);
          final String _tmpDay;
          _tmpDay = _cursor.getString(_cursorIndexOfDay);
          final String _tmpYear;
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
          _tmpDate = new DayDate(_tmpMonth,_tmpDay,_tmpYear);
        }  else  {
          _tmpDate = null;
        }
        _item = new Day(_tmpDayId,_tmpMeals,_tmpDate,_tmpWaterNum);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Day searchByStringDate(String month, String day) {
    final String _sql = "select * from days where month == ? and day == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (month == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, month);
    }
    _argIndex = 2;
    if (day == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, day);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("dayId");
      final int _cursorIndexOfMeals = _cursor.getColumnIndexOrThrow("meals");
      final int _cursorIndexOfWaterNum = _cursor.getColumnIndexOrThrow("waterNum");
      final int _cursorIndexOfMonth = _cursor.getColumnIndexOrThrow("month");
      final int _cursorIndexOfDay = _cursor.getColumnIndexOrThrow("day");
      final int _cursorIndexOfYear = _cursor.getColumnIndexOrThrow("year");
      final Day _result;
      if(_cursor.moveToFirst()) {
        final int _tmpDayId;
        _tmpDayId = _cursor.getInt(_cursorIndexOfDayId);
        final List<Meal> _tmpMeals;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfMeals);
        _tmpMeals = Converters.jsonToMealList(_tmp);
        final int _tmpWaterNum;
        _tmpWaterNum = _cursor.getInt(_cursorIndexOfWaterNum);
        final DayDate _tmpDate;
        if (! (_cursor.isNull(_cursorIndexOfMonth) && _cursor.isNull(_cursorIndexOfDay) && _cursor.isNull(_cursorIndexOfYear))) {
          final String _tmpMonth;
          _tmpMonth = _cursor.getString(_cursorIndexOfMonth);
          final String _tmpDay;
          _tmpDay = _cursor.getString(_cursorIndexOfDay);
          final String _tmpYear;
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
          _tmpDate = new DayDate(_tmpMonth,_tmpDay,_tmpYear);
        }  else  {
          _tmpDate = null;
        }
        _result = new Day(_tmpDayId,_tmpMeals,_tmpDate,_tmpWaterNum);
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
  public Day searchById(int id) {
    final String _sql = "select * from days where dayId == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("dayId");
      final int _cursorIndexOfMeals = _cursor.getColumnIndexOrThrow("meals");
      final int _cursorIndexOfWaterNum = _cursor.getColumnIndexOrThrow("waterNum");
      final int _cursorIndexOfMonth = _cursor.getColumnIndexOrThrow("month");
      final int _cursorIndexOfDay = _cursor.getColumnIndexOrThrow("day");
      final int _cursorIndexOfYear = _cursor.getColumnIndexOrThrow("year");
      final Day _result;
      if(_cursor.moveToFirst()) {
        final int _tmpDayId;
        _tmpDayId = _cursor.getInt(_cursorIndexOfDayId);
        final List<Meal> _tmpMeals;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfMeals);
        _tmpMeals = Converters.jsonToMealList(_tmp);
        final int _tmpWaterNum;
        _tmpWaterNum = _cursor.getInt(_cursorIndexOfWaterNum);
        final DayDate _tmpDate;
        if (! (_cursor.isNull(_cursorIndexOfMonth) && _cursor.isNull(_cursorIndexOfDay) && _cursor.isNull(_cursorIndexOfYear))) {
          final String _tmpMonth;
          _tmpMonth = _cursor.getString(_cursorIndexOfMonth);
          final String _tmpDay;
          _tmpDay = _cursor.getString(_cursorIndexOfDay);
          final String _tmpYear;
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
          _tmpDate = new DayDate(_tmpMonth,_tmpDay,_tmpYear);
        }  else  {
          _tmpDate = null;
        }
        _result = new Day(_tmpDayId,_tmpMeals,_tmpDate,_tmpWaterNum);
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
    final String _sql = "select rowid from days order by ROWID desc limit 1";
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
  public Day getLastDay() {
    final String _sql = "select * from days order by ROWID desc limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("dayId");
      final int _cursorIndexOfMeals = _cursor.getColumnIndexOrThrow("meals");
      final int _cursorIndexOfWaterNum = _cursor.getColumnIndexOrThrow("waterNum");
      final int _cursorIndexOfMonth = _cursor.getColumnIndexOrThrow("month");
      final int _cursorIndexOfDay = _cursor.getColumnIndexOrThrow("day");
      final int _cursorIndexOfYear = _cursor.getColumnIndexOrThrow("year");
      final Day _result;
      if(_cursor.moveToFirst()) {
        final int _tmpDayId;
        _tmpDayId = _cursor.getInt(_cursorIndexOfDayId);
        final List<Meal> _tmpMeals;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfMeals);
        _tmpMeals = Converters.jsonToMealList(_tmp);
        final int _tmpWaterNum;
        _tmpWaterNum = _cursor.getInt(_cursorIndexOfWaterNum);
        final DayDate _tmpDate;
        if (! (_cursor.isNull(_cursorIndexOfMonth) && _cursor.isNull(_cursorIndexOfDay) && _cursor.isNull(_cursorIndexOfYear))) {
          final String _tmpMonth;
          _tmpMonth = _cursor.getString(_cursorIndexOfMonth);
          final String _tmpDay;
          _tmpDay = _cursor.getString(_cursorIndexOfDay);
          final String _tmpYear;
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
          _tmpDate = new DayDate(_tmpMonth,_tmpDay,_tmpYear);
        }  else  {
          _tmpDate = null;
        }
        _result = new Day(_tmpDayId,_tmpMeals,_tmpDate,_tmpWaterNum);
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
  public List<Meal> getAllProducts() {
    final String _sql = "select * from meals";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfProducts = _cursor.getColumnIndexOrThrow("products");
      final int _cursorIndexOfMealType = _cursor.getColumnIndexOrThrow("mealType");
      final List<Meal> _result = new ArrayList<Meal>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Meal _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final ArrayList<Product> _tmpProducts;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfProducts);
        _tmpProducts = Converters.jsonToProductList(_tmp);
        final MealType _tmpMealType;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfMealType);
        _tmpMealType = Converters.toEnumFromMealType(_tmp_1);
        _item = new Meal(_tmpId,_tmpProducts,_tmpMealType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
