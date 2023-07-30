package com.feedapp.app.data.models.localdb;

import java.lang.System;

@androidx.room.Entity(tableName = "food_ru")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/feedapp/app/data/models/localdb/FoodProductRu;", "Lcom/feedapp/app/data/models/localdb/IProduct;", "id", "", "name", "", "weight", "", "proteins", "fats", "carbs", "calories", "(ILjava/lang/String;FFFFF)V", "getCalories", "()F", "getCarbs", "getFats", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "getProteins", "getWeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class FoodProductRu implements com.feedapp.app.data.models.localdb.IProduct {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "weight", typeAffinity = androidx.room.ColumnInfo.REAL)
    private final float weight = 0.0F;
    @androidx.room.ColumnInfo(name = "proteins", typeAffinity = androidx.room.ColumnInfo.REAL)
    private final float proteins = 0.0F;
    @androidx.room.ColumnInfo(name = "fats", typeAffinity = androidx.room.ColumnInfo.REAL)
    private final float fats = 0.0F;
    @androidx.room.ColumnInfo(name = "carbs", typeAffinity = androidx.room.ColumnInfo.REAL)
    private final float carbs = 0.0F;
    @androidx.room.ColumnInfo(name = "calories", typeAffinity = androidx.room.ColumnInfo.REAL)
    private final float calories = 0.0F;
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    public final float getWeight() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getProteins() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getFats() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getCarbs() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getCalories() {
        return 0.0F;
    }
    
    public FoodProductRu(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, float weight, float proteins, float fats, float carbs, float calories) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float component7() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.localdb.FoodProductRu copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, float weight, float proteins, float fats, float carbs, float calories) {
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