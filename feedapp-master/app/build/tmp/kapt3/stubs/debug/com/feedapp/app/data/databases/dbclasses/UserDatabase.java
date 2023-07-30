package com.feedapp.app.data.databases.dbclasses;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.feedapp.app.data.databases.converters.Converters.class})
@androidx.room.Database(entities = {com.feedapp.app.data.models.user.User.class, com.feedapp.app.data.models.day.Meal.class, com.feedapp.app.data.models.FoodProduct.class, com.feedapp.app.data.models.Product.class, com.feedapp.app.data.models.day.Day.class, com.feedapp.app.data.models.RecentProduct.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/feedapp/app/data/databases/dbclasses/UserDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDayDao", "Lcom/feedapp/app/data/databases/daos/DayDao;", "getRecentDao", "Lcom/feedapp/app/data/databases/daos/RecentDao;", "getUserDao", "Lcom/feedapp/app/data/databases/daos/UserDao;", "Companion", "app_debug"})
public abstract class UserDatabase extends androidx.room.RoomDatabase {
    private static volatile com.feedapp.app.data.databases.dbclasses.UserDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final com.feedapp.app.data.databases.dbclasses.UserDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.feedapp.app.data.databases.daos.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.feedapp.app.data.databases.daos.DayDao getDayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.feedapp.app.data.databases.daos.RecentDao getRecentDao();
    
    public UserDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/feedapp/app/data/databases/dbclasses/UserDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/feedapp/app/data/databases/dbclasses/UserDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.feedapp.app.data.databases.dbclasses.UserDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.feedapp.app.data.databases.dbclasses.UserDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}