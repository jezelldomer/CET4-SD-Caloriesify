package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/feedapp/app/data/repositories/SearchFoodRepository;", "", "foodProductDao", "Lcom/feedapp/app/data/databases/daos/FoodProductDao;", "(Lcom/feedapp/app/data/databases/daos/FoodProductDao;)V", "_foodInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/FoodProduct;", "_products", "", "foodInfo", "Landroidx/lifecycle/LiveData;", "getFoodInfo", "()Landroidx/lifecycle/LiveData;", "multiplierPosition", "", "getMultiplierPosition", "()Landroidx/lifecycle/MutableLiveData;", "products", "getProducts", "getSearchSuggestions", "", "q", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "query", "searchByQuery", "Lkotlinx/coroutines/Job;", "searchFoodProduct", "id", "app_debug"})
public final class SearchFoodRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> multiplierPosition = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.FoodProduct> _foodInfo = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.feedapp.app.data.models.FoodProduct>> _products = null;
    private final com.feedapp.app.data.databases.daos.FoodProductDao foodProductDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMultiplierPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.FoodProduct> getFoodInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.FoodProduct>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    private final void search(java.lang.String query) {
    }
    
    /**
     * search product in offline DB
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchFoodProduct(int id) {
        return null;
    }
    
    /**
     * return list of max 5 suggestions for the query
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchSuggestions(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchFoodRepository(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.FoodProductDao foodProductDao) {
        super();
    }
}