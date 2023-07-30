package com.feedapp.app.data.databases.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\nH\'\u00a8\u0006\r"}, d2 = {"Lcom/feedapp/app/data/databases/daos/LocalProductRuDao;", "Lcom/feedapp/app/data/databases/daos/LocalProductDao;", "Lcom/feedapp/app/data/models/localdb/FoodProductRu;", "()V", "searchById", "id", "", "searchByName", "", "name", "", "searchBySuggestion", "suggestion", "app_debug"})
public abstract class LocalProductRuDao implements com.feedapp.app.data.databases.daos.LocalProductDao<com.feedapp.app.data.models.localdb.FoodProductRu> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from food_ru where name like \'%\' || :name || \'%\' limit 20")
    @java.lang.Override()
    public abstract java.util.List<com.feedapp.app.data.models.localdb.FoodProductRu> searchByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from food_ru where id == :id")
    @java.lang.Override()
    public abstract com.feedapp.app.data.models.localdb.FoodProductRu searchById(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select name from food_ru where name like \'%\' || :suggestion || \'%\'")
    @java.lang.Override()
    public abstract java.util.List<java.lang.String> searchBySuggestion(@org.jetbrains.annotations.NotNull()
    java.lang.String suggestion);
    
    public LocalProductRuDao() {
        super();
    }
}