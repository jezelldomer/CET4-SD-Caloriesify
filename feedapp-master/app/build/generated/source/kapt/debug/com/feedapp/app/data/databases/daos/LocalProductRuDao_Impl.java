package com.feedapp.app.data.databases.daos;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.feedapp.app.data.models.localdb.FoodProductRu;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class LocalProductRuDao_Impl extends LocalProductRuDao {
  private final RoomDatabase __db;

  public LocalProductRuDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<FoodProductRu> searchByName(String name) {
    final String _sql = "select * from food_ru where name like '%' || ? || '%' limit 20";
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
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfWeight = _cursor.getColumnIndexOrThrow("weight");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("proteins");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fats");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final List<FoodProductRu> _result = new ArrayList<FoodProductRu>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FoodProductRu _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final float _tmpWeight;
        _tmpWeight = _cursor.getFloat(_cursorIndexOfWeight);
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _item = new FoodProductRu(_tmpId,_tmpName,_tmpWeight,_tmpProteins,_tmpFats,_tmpCarbs,_tmpCalories);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public FoodProductRu searchById(int id) {
    final String _sql = "select * from food_ru where id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfWeight = _cursor.getColumnIndexOrThrow("weight");
      final int _cursorIndexOfProteins = _cursor.getColumnIndexOrThrow("proteins");
      final int _cursorIndexOfFats = _cursor.getColumnIndexOrThrow("fats");
      final int _cursorIndexOfCarbs = _cursor.getColumnIndexOrThrow("carbs");
      final int _cursorIndexOfCalories = _cursor.getColumnIndexOrThrow("calories");
      final FoodProductRu _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final float _tmpWeight;
        _tmpWeight = _cursor.getFloat(_cursorIndexOfWeight);
        final float _tmpProteins;
        _tmpProteins = _cursor.getFloat(_cursorIndexOfProteins);
        final float _tmpFats;
        _tmpFats = _cursor.getFloat(_cursorIndexOfFats);
        final float _tmpCarbs;
        _tmpCarbs = _cursor.getFloat(_cursorIndexOfCarbs);
        final float _tmpCalories;
        _tmpCalories = _cursor.getFloat(_cursorIndexOfCalories);
        _result = new FoodProductRu(_tmpId,_tmpName,_tmpWeight,_tmpProteins,_tmpFats,_tmpCarbs,_tmpCalories);
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
    final String _sql = "select name from food_ru where name like '%' || ? || '%'";
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
