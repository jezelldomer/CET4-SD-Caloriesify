package com.feedapp.app.data.models.day;

import java.lang.System;

/**
 * meal means breakfast, lunch, snack or dinner. It's collection of [Product] with type
 */
@androidx.room.TypeConverters(value = {com.feedapp.app.data.databases.converters.Converters.class})
@androidx.room.Entity(tableName = "meals")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\nH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\u0006\u0010#\u001a\u00020\u001fJ\t\u0010$\u001a\u00020\u0004H\u00d6\u0001J\b\u0010%\u001a\u00020&H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/feedapp/app/data/models/day/Meal;", "", "()V", "id", "", "products", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/Product;", "Lkotlin/collections/ArrayList;", "mealType", "Lcom/feedapp/app/data/models/day/MealType;", "(ILjava/util/ArrayList;Lcom/feedapp/app/data/models/day/MealType;)V", "getId", "()I", "setId", "(I)V", "getMealType", "()Lcom/feedapp/app/data/models/day/MealType;", "getProducts", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "deleteProduct", "", "product", "equals", "", "other", "getTotalCalories", "", "getTotalCarbs", "getTotalFats", "getTotalProteins", "getTotalSugar", "hashCode", "toString", "", "app_debug"})
public final class Meal {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.feedapp.app.data.models.Product> products = null;
    @org.jetbrains.annotations.NotNull()
    private final com.feedapp.app.data.models.day.MealType mealType = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final void deleteProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product product) {
    }
    
    /**
     * Get total calories from all products from meal
     */
    public final float getTotalCalories() {
        return 0.0F;
    }
    
    public final float getTotalProteins() {
        return 0.0F;
    }
    
    public final float getTotalFats() {
        return 0.0F;
    }
    
    public final float getTotalCarbs() {
        return 0.0F;
    }
    
    public final float getTotalSugar() {
        return 0.0F;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.models.Product> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.MealType getMealType() {
        return null;
    }
    
    public Meal(int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.models.Product> products, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.MealType mealType) {
        super();
    }
    
    public Meal() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.models.Product> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.MealType component3() {
        return null;
    }
    
    /**
     * meal means breakfast, lunch, snack or dinner. It's collection of [Product] with type
     */
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.Meal copy(int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.models.Product> products, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.MealType mealType) {
        return null;
    }
    
    /**
     * meal means breakfast, lunch, snack or dinner. It's collection of [Product] with type
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * meal means breakfast, lunch, snack or dinner. It's collection of [Product] with type
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}