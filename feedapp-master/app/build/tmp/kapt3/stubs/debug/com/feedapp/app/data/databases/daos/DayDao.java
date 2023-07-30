package com.feedapp.app.data.databases.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\'J\b\u0010\u000f\u001a\u00020\tH\'J\b\u0010\u0010\u001a\u00020\u0006H\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\'J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\'J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/feedapp/app/data/databases/daos/DayDao;", "", "deleteAllDays", "", "deleteDay", "id", "", "getAllDays", "", "Lcom/feedapp/app/data/models/day/Day;", "getAllDaysInMonth", "month", "", "getAllProducts", "Lcom/feedapp/app/data/models/day/Meal;", "getLastDay", "getSize", "insertDay", "day", "searchById", "searchByStringDate", "updateWaterGlasses", "waterNum", "app_debug"})
public abstract interface DayDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from days")
    public abstract java.util.List<com.feedapp.app.data.models.day.Day> getAllDays();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from days where month == :month limit 31")
    public abstract java.util.List<com.feedapp.app.data.models.day.Day> getAllDaysInMonth(@org.jetbrains.annotations.NotNull()
    java.lang.String month);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from days where month == :month and day == :day")
    public abstract com.feedapp.app.data.models.day.Day searchByStringDate(@org.jetbrains.annotations.NotNull()
    java.lang.String month, @org.jetbrains.annotations.NotNull()
    java.lang.String day);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from days where dayId == :id")
    public abstract com.feedapp.app.data.models.day.Day searchById(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertDay(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.Day day);
    
    @androidx.room.Query(value = "select rowid from days order by ROWID desc limit 1")
    public abstract int getSize();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from days order by ROWID desc limit 1")
    public abstract com.feedapp.app.data.models.day.Day getLastDay();
    
    @androidx.room.Query(value = "delete from days where dayId == :id")
    public abstract void deleteDay(int id);
    
    @androidx.room.Query(value = "delete from days")
    public abstract void deleteAllDays();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from meals")
    public abstract java.util.List<com.feedapp.app.data.models.day.Meal> getAllProducts();
    
    @androidx.room.Query(value = "update days set waterNum=:waterNum where dayId == :id")
    public abstract void updateWaterGlasses(int waterNum, int id);
}