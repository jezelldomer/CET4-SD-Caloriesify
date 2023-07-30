package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/feedapp/app/viewModels/MyMealsViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepository", "Lcom/feedapp/app/data/repositories/FoodRepository;", "(Lcom/feedapp/app/data/repositories/FoodRepository;)V", "isProgressBarVisible", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isTextNoMealsVisible", "myProducts", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/FoodProduct;", "Lkotlin/collections/ArrayList;", "getMyProducts", "()Landroidx/lifecycle/LiveData;", "deleteCustomProduct", "", "foodProduct", "isProductsEmpty", "refreshCustomProducts", "app_debug"})
public final class MyMealsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.FoodProduct>> myProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTextNoMealsVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isProgressBarVisible = null;
    private final com.feedapp.app.data.repositories.FoodRepository foodRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.FoodProduct>> getMyProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTextNoMealsVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isProgressBarVisible() {
        return null;
    }
    
    public final void deleteCustomProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct foodProduct) {
    }
    
    public final void refreshCustomProducts() {
    }
    
    public final boolean isProductsEmpty() {
        return false;
    }
    
    @javax.inject.Inject()
    public MyMealsViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.FoodRepository foodRepository) {
        super();
    }
}