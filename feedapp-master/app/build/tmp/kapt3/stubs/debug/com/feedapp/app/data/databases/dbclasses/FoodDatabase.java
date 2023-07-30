package com.feedapp.app.data.databases.dbclasses;

import java.lang.System;

/**
 * Database class to obtain information about food products from local DB
 */
@androidx.room.TypeConverters(value = {com.feedapp.app.data.databases.converters.Converters.class})
@androidx.room.Database(entities = {com.feedapp.app.data.models.FoodProduct.class, com.feedapp.app.data.models.day.Meal.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/feedapp/app/data/databases/dbclasses/FoodDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getProductDao", "Lcom/feedapp/app/data/databases/daos/FoodProductDao;", "Companion", "app_debug"})
public abstract class FoodDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String FOOD_DATABASE_NAME = "foodProducts";
    private static final java.lang.String FOOD_DATABASE_PATH = "databases/food.db";
    private static volatile com.feedapp.app.data.databases.dbclasses.FoodDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final com.feedapp.app.data.databases.dbclasses.FoodDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.feedapp.app.data.databases.daos.FoodProductDao getProductDao();
    
    public FoodDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/feedapp/app/data/databases/dbclasses/FoodDatabase$Companion;", "", "()V", "FOOD_DATABASE_NAME", "", "FOOD_DATABASE_PATH", "LOCK", "instance", "Lcom/feedapp/app/data/databases/dbclasses/FoodDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.feedapp.app.data.databases.dbclasses.FoodDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.feedapp.app.data.databases.dbclasses.FoodDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}