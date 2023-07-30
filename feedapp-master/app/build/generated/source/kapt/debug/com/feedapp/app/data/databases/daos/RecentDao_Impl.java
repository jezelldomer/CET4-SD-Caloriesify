package com.feedapp.app.data.databases.daos;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.feedapp.app.data.models.RecentProduct;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class RecentDao_Impl implements RecentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRecentProduct;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRecentProducts;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFirstRecent;

  public RecentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecentProduct = new EntityInsertionAdapter<RecentProduct>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `recentProducts`(`name`,`foodProductId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentProduct value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getFoodProductId());
      }
    };
    this.__preparedStmtOfDeleteRecentProducts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from recentProducts";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFirstRecent = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from recentProducts where name == (select name from recentProducts order by rowid asc limit 1)";
        return _query;
      }
    };
  }

  @Override
  public void insertRecentProducts(RecentProduct recentProduct) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecentProduct.insert(recentProduct);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRecentProducts() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRecentProducts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRecentProducts.release(_stmt);
    }
  }

  @Override
  public void deleteFirstRecent() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFirstRecent.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteFirstRecent.release(_stmt);
    }
  }

  @Override
  public LiveData<List<RecentProduct>> getRecentProducts(int maxRecentNumber) {
    final String _sql = "select * from recentProducts order by rowid desc limit ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxRecentNumber);
    return new ComputableLiveData<List<RecentProduct>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<RecentProduct> compute() {
        if (_observer == null) {
          _observer = new Observer("recentProducts") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfFoodProductId = _cursor.getColumnIndexOrThrow("foodProductId");
          final List<RecentProduct> _result = new ArrayList<RecentProduct>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecentProduct _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpFoodProductId;
            _tmpFoodProductId = _cursor.getInt(_cursorIndexOfFoodProductId);
            _item = new RecentProduct(_tmpName,_tmpFoodProductId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public int getNumRecent() {
    final String _sql = "select count(rowid) from recentProducts";
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
}
