package com.feedapp.app.data.databases.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J\n\u0010\t\u001a\u0004\u0018\u00010\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/feedapp/app/data/databases/daos/UserDao;", "", "deleteAllUsers", "", "getCalories", "", "()Ljava/lang/Integer;", "getMeasure", "Lcom/feedapp/app/data/models/MeasureType;", "getUser", "Lcom/feedapp/app/data/models/user/User;", "insertUser", "user", "update", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select caloriesNeeded from user where uid == 0")
    public abstract java.lang.Integer getCalories();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUser(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.user.User user);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.user.User user);
    
    @androidx.room.Query(value = "delete from user")
    public abstract void deleteAllUsers();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from user where uid == 0")
    public abstract com.feedapp.app.data.models.user.User getUser();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select measureType from user where uid == 0")
    public abstract com.feedapp.app.data.models.MeasureType getMeasure();
}