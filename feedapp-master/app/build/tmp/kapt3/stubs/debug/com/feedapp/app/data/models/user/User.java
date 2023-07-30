package com.feedapp.app.data.models.user;

import java.lang.System;

@androidx.room.Entity(tableName = "user")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003Jp\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\fH\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00067"}, d2 = {"Lcom/feedapp/app/data/models/user/User;", "", "uid", "", "caloriesNeeded", "proteinsNeeded", "carbsNeeded", "fatsNeeded", "measureType", "Lcom/feedapp/app/data/models/MeasureType;", "intolerance", "", "", "diet", "(Ljava/lang/Integer;IIIILcom/feedapp/app/data/models/MeasureType;Ljava/util/List;Ljava/util/List;)V", "getCaloriesNeeded", "()I", "setCaloriesNeeded", "(I)V", "getCarbsNeeded", "setCarbsNeeded", "getDiet", "()Ljava/util/List;", "setDiet", "(Ljava/util/List;)V", "getFatsNeeded", "setFatsNeeded", "getIntolerance", "setIntolerance", "getMeasureType", "()Lcom/feedapp/app/data/models/MeasureType;", "setMeasureType", "(Lcom/feedapp/app/data/models/MeasureType;)V", "getProteinsNeeded", "setProteinsNeeded", "getUid", "()Ljava/lang/Integer;", "setUid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;IIIILcom/feedapp/app/data/models/MeasureType;Ljava/util/List;Ljava/util/List;)Lcom/feedapp/app/data/models/user/User;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class User {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer uid;
    @androidx.room.ColumnInfo(name = "caloriesNeeded")
    private int caloriesNeeded;
    @androidx.room.ColumnInfo(name = "proteinsNeeded")
    private int proteinsNeeded;
    @androidx.room.ColumnInfo(name = "carbsNeeded")
    private int carbsNeeded;
    @androidx.room.ColumnInfo(name = "fatsNeeded")
    private int fatsNeeded;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "measureType")
    private com.feedapp.app.data.models.MeasureType measureType;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "intolerance")
    private java.util.List<java.lang.String> intolerance;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "diet")
    private java.util.List<java.lang.String> diet;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int getCaloriesNeeded() {
        return 0;
    }
    
    public final void setCaloriesNeeded(int p0) {
    }
    
    public final int getProteinsNeeded() {
        return 0;
    }
    
    public final void setProteinsNeeded(int p0) {
    }
    
    public final int getCarbsNeeded() {
        return 0;
    }
    
    public final void setCarbsNeeded(int p0) {
    }
    
    public final int getFatsNeeded() {
        return 0;
    }
    
    public final void setFatsNeeded(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.MeasureType getMeasureType() {
        return null;
    }
    
    public final void setMeasureType(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.MeasureType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getIntolerance() {
        return null;
    }
    
    public final void setIntolerance(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getDiet() {
        return null;
    }
    
    public final void setDiet(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.Integer uid, int caloriesNeeded, int proteinsNeeded, int carbsNeeded, int fatsNeeded, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.MeasureType measureType, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> intolerance, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> diet) {
        super();
    }
    
    public User() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.MeasureType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.user.User copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer uid, int caloriesNeeded, int proteinsNeeded, int carbsNeeded, int fatsNeeded, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.MeasureType measureType, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> intolerance, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> diet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}