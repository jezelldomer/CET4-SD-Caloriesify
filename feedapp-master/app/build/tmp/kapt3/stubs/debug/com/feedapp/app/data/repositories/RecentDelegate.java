package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/feedapp/app/data/repositories/RecentDelegate;", "", "recentDao", "Lcom/feedapp/app/data/databases/daos/RecentDao;", "(Lcom/feedapp/app/data/databases/daos/RecentDao;)V", "recentProducts", "Landroidx/lifecycle/LiveData;", "", "Lcom/feedapp/app/data/models/RecentProduct;", "getRecentProducts", "()Landroidx/lifecycle/LiveData;", "deleteRecentProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToRecent", "recent", "Companion", "app_debug"})
public final class RecentDelegate {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> recentProducts = null;
    private final com.feedapp.app.data.databases.daos.RecentDao recentDao = null;
    public static final int MAX_RECENT_NUMBER = 10;
    public static final com.feedapp.app.data.repositories.RecentDelegate.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> getRecentProducts() {
        return null;
    }
    
    /**
     * save product to recent
     */
    public final void saveToRecent(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.RecentProduct recent) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRecentProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public RecentDelegate(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.RecentDao recentDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/feedapp/app/data/repositories/RecentDelegate$Companion;", "", "()V", "MAX_RECENT_NUMBER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}