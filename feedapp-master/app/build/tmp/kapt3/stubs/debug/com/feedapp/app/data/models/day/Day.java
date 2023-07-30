package com.feedapp.app.data.models.day;

import java.lang.System;

/**
 * Contains all data about consumed food in specific date
 */
@androidx.room.Entity(tableName = "days")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0000H\u0016J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\u000e\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\'2\u0006\u0010+\u001a\u00020.J\b\u0010/\u001a\u00020\'H\u0002J\b\u00100\u001a\u00020\'H\u0002J\b\u00101\u001a\u00020\u0004H\u0016J\u000e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020$J\b\u00104\u001a\u000205H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/feedapp/app/data/models/day/Day;", "", "()V", "dayId", "", "meals", "", "Lcom/feedapp/app/data/models/day/Meal;", "date", "Lcom/feedapp/app/data/models/day/DayDate;", "waterNum", "(ILjava/util/List;Lcom/feedapp/app/data/models/day/DayDate;I)V", "getDate", "()Lcom/feedapp/app/data/models/day/DayDate;", "setDate", "(Lcom/feedapp/app/data/models/day/DayDate;)V", "getDayId", "()I", "setDayId", "(I)V", "getMeals", "()Ljava/util/List;", "getWaterNum", "setWaterNum", "clone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getAllProducts", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/Product;", "Lkotlin/collections/ArrayList;", "getTotalCalories", "", "getTotalCarbs", "getTotalFats", "getTotalNutrient", "nutrientType", "Lcom/feedapp/app/data/models/StatisticsNutrientType;", "getTotalNutrientBasic", "Lcom/feedapp/app/data/models/BasicNutrientType;", "getTotalProteins", "getTotalSugar", "hashCode", "removeProduct", "productToDelete", "toString", "", "app_debug"})
public final class Day implements java.lang.Cloneable {
    @androidx.room.ColumnInfo(name = "dayId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int dayId;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.feedapp.app.data.models.day.Meal> meals = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private com.feedapp.app.data.models.day.DayDate date;
    private int waterNum;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.data.models.day.Day clone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final boolean removeProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product productToDelete) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.models.Product> getAllProducts() {
        return null;
    }
    
    public final float getTotalNutrient(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.StatisticsNutrientType nutrientType) {
        return 0.0F;
    }
    
    private final float getTotalSugar() {
        return 0.0F;
    }
    
    public final float getTotalNutrientBasic(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType nutrientType) {
        return 0.0F;
    }
    
    private final float getTotalCarbs() {
        return 0.0F;
    }
    
    private final float getTotalFats() {
        return 0.0F;
    }
    
    private final float getTotalProteins() {
        return 0.0F;
    }
    
    private final float getTotalCalories() {
        return 0.0F;
    }
    
    public final int getDayId() {
        return 0;
    }
    
    public final void setDayId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.models.day.Meal> getMeals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.DayDate getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate p0) {
    }
    
    public final int getWaterNum() {
        return 0;
    }
    
    public final void setWaterNum(int p0) {
    }
    
    public Day(int dayId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.models.day.Meal> meals, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate date, int waterNum) {
        super();
    }
    
    public Day() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.models.day.Meal> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.DayDate component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    /**
     * Contains all data about consumed food in specific date
     */
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.Day copy(int dayId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.models.day.Meal> meals, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate date, int waterNum) {
        return null;
    }
}