package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/feedapp/app/viewModels/MyMealsSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepository", "Lcom/feedapp/app/data/repositories/FoodRepository;", "(Lcom/feedapp/app/data/repositories/FoodRepository;)V", "myProducts", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/FoodProduct;", "getMyProducts", "()Landroidx/lifecycle/LiveData;", "updateProducts", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class MyMealsSearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.FoodProduct>> myProducts = null;
    private final com.feedapp.app.data.repositories.FoodRepository foodRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.FoodProduct>> getMyProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateProducts() {
        return null;
    }
    
    @javax.inject.Inject()
    public MyMealsSearchViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.FoodRepository foodRepository) {
        super();
    }
}