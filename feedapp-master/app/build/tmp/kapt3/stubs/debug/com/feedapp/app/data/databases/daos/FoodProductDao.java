package com.feedapp.app.data.databases.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\b\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0012\u001a\u00020\u0013H\'J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\'J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0013H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/feedapp/app/data/databases/daos/FoodProductDao;", "", "deleteCustomProducts", "", "deleteProduct", "product", "Lcom/feedapp/app/data/models/FoodProduct;", "getAllFood", "", "getCustomProducts", "getSize", "", "insertProduct", "insertProducts", "products", "searchById", "id", "searchByName", "name", "", "searchByNameExact", "searchBySuggestion", "suggestion", "app_debug"})
public abstract interface FoodProductDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from food")
    public abstract java.util.List<com.feedapp.app.data.models.FoodProduct> getAllFood();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from food where name like \'%\' || :name || \'%\'")
    public abstract java.util.List<com.feedapp.app.data.models.FoodProduct> searchByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from food where id == :id")
    public abstract com.feedapp.app.data.models.FoodProduct searchById(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct product);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.models.FoodProduct> products);
    
    @androidx.room.Query(value = "select rowid from food order by ROWID desc limit 1")
    public abstract int getSize();
    
    @androidx.room.Delete()
    public abstract void deleteProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct product);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from food where id > 976")
    public abstract java.util.List<com.feedapp.app.data.models.FoodProduct> getCustomProducts();
    
    @androidx.room.Query(value = "delete from food where id > 976")
    public abstract void deleteCustomProducts();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from food where name == :name")
    public abstract com.feedapp.app.data.models.FoodProduct searchByNameExact(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select name from food where name like \'%\' || :suggestion || \'%\'")
    public abstract java.util.List<java.lang.String> searchBySuggestion(@org.jetbrains.annotations.NotNull()
    java.lang.String suggestion);
}