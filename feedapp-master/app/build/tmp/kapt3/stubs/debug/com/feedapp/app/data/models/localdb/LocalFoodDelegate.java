package com.feedapp.app.data.models.localdb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/feedapp/app/data/models/localdb/LocalFoodDelegate;", "T", "Lcom/feedapp/app/data/models/localdb/IProduct;", "Lcom/feedapp/app/data/models/localdb/ILocalProductRepository;", "dao", "Lcom/feedapp/app/data/databases/daos/LocalProductDao;", "(Lcom/feedapp/app/data/databases/daos/LocalProductDao;)V", "_products", "Landroidx/lifecycle/MutableLiveData;", "", "products", "Landroidx/lifecycle/LiveData;", "getProducts", "()Landroidx/lifecycle/LiveData;", "getSearchSuggestions", "", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchById", "id", "", "(I)Lcom/feedapp/app/data/models/localdb/IProduct;", "searchByQuery", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class LocalFoodDelegate<T extends com.feedapp.app.data.models.localdb.IProduct> implements com.feedapp.app.data.models.localdb.ILocalProductRepository {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>> _products = null;
    private final com.feedapp.app.data.databases.daos.LocalProductDao<T> dao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.Job searchByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T searchById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSearchSuggestions(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p1) {
        return null;
    }
    
    public LocalFoodDelegate(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.LocalProductDao<T> dao) {
        super();
    }
}