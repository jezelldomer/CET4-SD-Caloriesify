package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#J1\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010,J1\u0010-\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010,J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0019J\u000e\u00100\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00061"}, d2 = {"Lcom/feedapp/app/viewModels/DetailedViewModel;", "Landroidx/lifecycle/ViewModel;", "searchRepository", "Lcom/feedapp/app/data/repositories/SearchFoodRepository;", "dayRepository", "Lcom/feedapp/app/data/repositories/DayRepository;", "recentDelegate", "Lcom/feedapp/app/data/repositories/RecentDelegate;", "(Lcom/feedapp/app/data/repositories/SearchFoodRepository;Lcom/feedapp/app/data/repositories/DayRepository;Lcom/feedapp/app/data/repositories/RecentDelegate;)V", "_localFoodInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/localdb/IProduct;", "_multiplier", "", "kotlin.jvm.PlatformType", "foodInfo", "Landroidx/lifecycle/LiveData;", "Lcom/feedapp/app/data/models/FoodProduct;", "getFoodInfo", "()Landroidx/lifecycle/LiveData;", "localFoodInfo", "getLocalFoodInfo", "multiplier", "getMultiplier", "multiplierPosition", "", "usingLocal", "", "getUsingLocal", "()Landroidx/lifecycle/MutableLiveData;", "changeMultiplierValue", "", "d", "isMultiplierValueValid", "text", "", "saveConsumedFoodToDB", "Lkotlinx/coroutines/Job;", "dateString", "Lcom/feedapp/app/data/models/day/DayDate;", "mealType", "grams", "", "product", "(Lcom/feedapp/app/data/models/day/DayDate;Ljava/lang/Integer;FLcom/feedapp/app/data/models/localdb/IProduct;)Lkotlinx/coroutines/Job;", "saveWithoutRecent", "searchFoodProduct", "id", "setLocalProductInfo", "app_debug"})
public final class DetailedViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _multiplier = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> multiplierPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.FoodProduct> foodInfo = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.localdb.IProduct> _localFoodInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> usingLocal = null;
    private final com.feedapp.app.data.repositories.SearchFoodRepository searchRepository = null;
    private final com.feedapp.app.data.repositories.DayRepository dayRepository = null;
    private final com.feedapp.app.data.repositories.RecentDelegate recentDelegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getMultiplier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.FoodProduct> getFoodInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.localdb.IProduct> getLocalFoodInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUsingLocal() {
        return null;
    }
    
    /**
     * search product in offline DB
     */
    public final void searchFoodProduct(int id) {
    }
    
    public final void setLocalProductInfo(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.localdb.IProduct product) {
    }
    
    public final boolean isMultiplierValueValid(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveWithoutRecent(@org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.DayDate dateString, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mealType, float grams, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.localdb.IProduct product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveConsumedFoodToDB(@org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.DayDate dateString, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mealType, float grams, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.localdb.IProduct product) {
        return null;
    }
    
    public final void changeMultiplierValue(double d) {
    }
    
    @javax.inject.Inject()
    public DetailedViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.SearchFoodRepository searchRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.DayRepository dayRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.RecentDelegate recentDelegate) {
        super();
    }
}