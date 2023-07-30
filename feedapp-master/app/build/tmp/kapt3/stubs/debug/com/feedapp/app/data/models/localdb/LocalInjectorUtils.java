package com.feedapp.app.data.models.localdb;

import java.lang.System;

/**
 * Using vanilla injection because of different locales
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lcom/feedapp/app/data/models/localdb/LocalInjectorUtils;", "", "()V", "provideLocalFoodDao", "Lcom/feedapp/app/data/databases/daos/LocalProductRuDao;", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "provideRepository", "Lcom/feedapp/app/data/models/localdb/LocalFoodDelegate;", "Lcom/feedapp/app/data/models/localdb/FoodProductRu;", "app_debug"})
public final class LocalInjectorUtils {
    public static final com.feedapp.app.data.models.localdb.LocalInjectorUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.localdb.LocalFoodDelegate<com.feedapp.app.data.models.localdb.FoodProductRu> provideRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    private final com.feedapp.app.data.databases.daos.LocalProductRuDao provideLocalFoodDao(android.content.Context context, java.io.File file) {
        return null;
    }
    
    private LocalInjectorUtils() {
        super();
    }
}