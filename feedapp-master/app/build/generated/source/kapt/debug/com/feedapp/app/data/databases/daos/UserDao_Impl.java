package com.feedapp.app.data.databases.daos;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.feedapp.app.data.databases.converters.Converters;
import com.feedapp.app.data.models.MeasureType;
import com.feedapp.app.data.models.user.User;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllUsers;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user`(`uid`,`caloriesNeeded`,`proteinsNeeded`,`carbsNeeded`,`fatsNeeded`,`measureType`,`intolerance`,`diet`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        stmt.bindLong(2, value.getCaloriesNeeded());
        stmt.bindLong(3, value.getProteinsNeeded());
        stmt.bindLong(4, value.getCarbsNeeded());
        stmt.bindLong(5, value.getFatsNeeded());
        final int _tmp;
        _tmp = Converters.toOrdinalMeasure(value.getMeasureType());
        stmt.bindLong(6, _tmp);
        final String _tmp_1;
        _tmp_1 = Converters.StringlistToJson(value.getIntolerance());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = Converters.StringlistToJson(value.getDiet());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_2);
        }
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user` SET `uid` = ?,`caloriesNeeded` = ?,`proteinsNeeded` = ?,`carbsNeeded` = ?,`fatsNeeded` = ?,`measureType` = ?,`intolerance` = ?,`diet` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        stmt.bindLong(2, value.getCaloriesNeeded());
        stmt.bindLong(3, value.getProteinsNeeded());
        stmt.bindLong(4, value.getCarbsNeeded());
        stmt.bindLong(5, value.getFatsNeeded());
        final int _tmp;
        _tmp = Converters.toOrdinalMeasure(value.getMeasureType());
        stmt.bindLong(6, _tmp);
        final String _tmp_1;
        _tmp_1 = Converters.StringlistToJson(value.getIntolerance());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = Converters.StringlistToJson(value.getDiet());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_2);
        }
        if (value.getUid() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getUid());
        }
      }
    };
    this.__preparedStmtOfDeleteAllUsers = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from user";
        return _query;
      }
    };
  }

  @Override
  public void insertUser(User user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(User user) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllUsers() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllUsers.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllUsers.release(_stmt);
    }
  }

  @Override
  public Integer getCalories() {
    final String _sql = "select caloriesNeeded from user where uid == 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final Integer _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getInt(0);
        }
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
  public User getUser() {
    final String _sql = "select * from user where uid == 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUid = _cursor.getColumnIndexOrThrow("uid");
      final int _cursorIndexOfCaloriesNeeded = _cursor.getColumnIndexOrThrow("caloriesNeeded");
      final int _cursorIndexOfProteinsNeeded = _cursor.getColumnIndexOrThrow("proteinsNeeded");
      final int _cursorIndexOfCarbsNeeded = _cursor.getColumnIndexOrThrow("carbsNeeded");
      final int _cursorIndexOfFatsNeeded = _cursor.getColumnIndexOrThrow("fatsNeeded");
      final int _cursorIndexOfMeasureType = _cursor.getColumnIndexOrThrow("measureType");
      final int _cursorIndexOfIntolerance = _cursor.getColumnIndexOrThrow("intolerance");
      final int _cursorIndexOfDiet = _cursor.getColumnIndexOrThrow("diet");
      final User _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final int _tmpCaloriesNeeded;
        _tmpCaloriesNeeded = _cursor.getInt(_cursorIndexOfCaloriesNeeded);
        final int _tmpProteinsNeeded;
        _tmpProteinsNeeded = _cursor.getInt(_cursorIndexOfProteinsNeeded);
        final int _tmpCarbsNeeded;
        _tmpCarbsNeeded = _cursor.getInt(_cursorIndexOfCarbsNeeded);
        final int _tmpFatsNeeded;
        _tmpFatsNeeded = _cursor.getInt(_cursorIndexOfFatsNeeded);
        final MeasureType _tmpMeasureType;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfMeasureType);
        _tmpMeasureType = Converters.toEnumFromMeasure(_tmp);
        final List<String> _tmpIntolerance;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfIntolerance);
        _tmpIntolerance = Converters.StringjsonToList(_tmp_1);
        final List<String> _tmpDiet;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfDiet);
        _tmpDiet = Converters.StringjsonToList(_tmp_2);
        _result = new User(_tmpUid,_tmpCaloriesNeeded,_tmpProteinsNeeded,_tmpCarbsNeeded,_tmpFatsNeeded,_tmpMeasureType,_tmpIntolerance,_tmpDiet);
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
  public MeasureType getMeasure() {
    final String _sql = "select measureType from user where uid == 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final MeasureType _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = Converters.toEnumFromMeasure(_tmp);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
