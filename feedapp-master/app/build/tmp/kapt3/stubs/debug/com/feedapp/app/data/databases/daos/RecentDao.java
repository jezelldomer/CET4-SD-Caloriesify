package com.feedapp.app.data.databases.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/feedapp/app/data/databases/daos/RecentDao;", "", "deleteFirstRecent", "", "deleteRecentProducts", "getNumRecent", "", "getRecentProducts", "Landroidx/lifecycle/LiveData;", "", "Lcom/feedapp/app/data/models/RecentProduct;", "maxRecentNumber", "insertRecentProducts", "recentProduct", "app_debug"})
public abstract interface RecentDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertRecentProducts(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.RecentProduct recentProduct);
    
    /**
     * return 10 recent products
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from recentProducts order by rowid desc limit :maxRecentNumber")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> getRecentProducts(int maxRecentNumber);
    
    @androidx.room.Query(value = "delete from recentProducts")
    public abstract void deleteRecentProducts();
    
    @androidx.room.Query(value = "select count(rowid) from recentProducts")
    public abstract int getNumRecent();
    
    @androidx.room.Query(value = "delete from recentProducts where name == (select name from recentProducts order by rowid asc limit 1)")
    public abstract void deleteFirstRecent();
}