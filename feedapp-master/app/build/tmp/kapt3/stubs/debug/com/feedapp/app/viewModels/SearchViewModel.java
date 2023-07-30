package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\b\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0002\u0010&J\u001b\u0010\'\u001a\u0004\u0018\u00010\u00182\u0006\u0010(\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010+\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020.\"\b\b\u0000\u0010/*\u00020\u00182\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/0\u0017J\u000e\u00101\u001a\u00020.2\u0006\u0010+\u001a\u00020\fJ\u000e\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/feedapp/app/viewModels/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchRepository", "Lcom/feedapp/app/data/repositories/SearchFoodRepository;", "recentDelegate", "Lcom/feedapp/app/data/repositories/RecentDelegate;", "(Lcom/feedapp/app/data/repositories/SearchFoodRepository;Lcom/feedapp/app/data/repositories/RecentDelegate;)V", "_hasSearched", "Landroidx/lifecycle/MutableLiveData;", "", "_isSearching", "_searchQuery", "", "hasAdded", "kotlin.jvm.PlatformType", "getHasAdded", "()Landroidx/lifecycle/MutableLiveData;", "hasSearched", "Landroidx/lifecycle/LiveData;", "getHasSearched", "()Landroidx/lifecycle/LiveData;", "isSearching", "localFoodSearch", "Lcom/feedapp/app/data/models/localdb/LocalFoodDelegate;", "Lcom/feedapp/app/data/models/localdb/IProduct;", "meals", "Landroidx/lifecycle/MediatorLiveData;", "", "getMeals", "()Landroidx/lifecycle/MediatorLiveData;", "recentProducts", "Lcom/feedapp/app/data/models/RecentProduct;", "getRecentProducts", "searchQuery", "getSearchQuery", "generateColors", "", "size", "(Ljava/lang/Integer;)Ljava/util/List;", "getByIdLocal", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchSuggestions", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initLocalFoodDelegate", "", "T", "delegate", "searchByQuery", "setHasSearched", "b", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private com.feedapp.app.data.models.localdb.LocalFoodDelegate<com.feedapp.app.data.models.localdb.IProduct> localFoodSearch;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> recentProducts = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hasSearched = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hasAdded = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>> meals = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isSearching = null;
    private final com.feedapp.app.data.repositories.SearchFoodRepository searchRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> getRecentProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasSearched() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHasAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>> getMeals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isSearching() {
        return null;
    }
    
    public final void searchByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void setHasSearched(boolean b) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchSuggestions(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> generateColors(@org.jetbrains.annotations.Nullable()
    java.lang.Integer size) {
        return null;
    }
    
    public final <T extends com.feedapp.app.data.models.localdb.IProduct>void initLocalFoodDelegate(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.localdb.LocalFoodDelegate<T> delegate) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getByIdLocal(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.feedapp.app.data.models.localdb.IProduct> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.SearchFoodRepository searchRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.RecentDelegate recentDelegate) {
        super();
    }
}