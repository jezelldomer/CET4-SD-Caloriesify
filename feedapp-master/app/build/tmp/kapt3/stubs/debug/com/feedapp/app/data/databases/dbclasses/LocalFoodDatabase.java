package com.feedapp.app.data.databases.dbclasses;

import java.lang.System;

@androidx.room.Database(entities = {com.feedapp.app.data.models.localdb.FoodProductRu.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/feedapp/app/data/databases/dbclasses/LocalFoodDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getLocalProductDao", "Lcom/feedapp/app/data/databases/daos/LocalProductRuDao;", "Companion", "app_debug"})
public abstract class LocalFoodDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String FOOD_DATABASE_NAME = "localFoodProducts";
    private static volatile com.feedapp.app.data.databases.dbclasses.LocalFoodDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final com.feedapp.app.data.databases.dbclasses.LocalFoodDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.feedapp.app.data.databases.daos.LocalProductRuDao getLocalProductDao();
    
    public LocalFoodDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0019\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/feedapp/app/data/databases/dbclasses/LocalFoodDatabase$Companion;", "", "()V", "FOOD_DATABASE_NAME", "", "LOCK", "instance", "Lcom/feedapp/app/data/databases/dbclasses/LocalFoodDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.feedapp.app.data.databases.dbclasses.LocalFoodDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.io.File file) {
            return null;
        }
        
        private final com.feedapp.app.data.databases.dbclasses.LocalFoodDatabase buildDatabase(android.content.Context context, java.io.File file) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}