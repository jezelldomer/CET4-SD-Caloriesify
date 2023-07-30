package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJN\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/feedapp/app/viewModels/AddCustomProductViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepository", "Lcom/feedapp/app/data/repositories/FoodRepository;", "(Lcom/feedapp/app/data/repositories/FoodRepository;)V", "exceeds", "", "gramsInOnePortion", "", "nutrient", "getCalories", "caloriesInOnePortion", "hundredMultiplier", "getEnergy", "caloriesInHundredGrams", "getMultiplier", "saveProduct", "Lkotlinx/coroutines/Job;", "name", "", "energy", "proteinsInHundred", "fatsInHundred", "carbsInHundred", "sugar", "sFats", "uFats", "tFats", "app_debug"})
public final class AddCustomProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.feedapp.app.data.repositories.FoodRepository foodRepository = null;
    
    public final boolean exceeds(float gramsInOnePortion, float nutrient) {
        return false;
    }
    
    public final float getMultiplier(float gramsInOnePortion) {
        return 0.0F;
    }
    
    public final float getCalories(float caloriesInOnePortion, float hundredMultiplier) {
        return 0.0F;
    }
    
    public final float getEnergy(float caloriesInHundredGrams) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String name, float energy, float proteinsInHundred, float fatsInHundred, float carbsInHundred, float sugar, float sFats, float uFats, float tFats) {
        return null;
    }
    
    @javax.inject.Inject()
    public AddCustomProductViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.FoodRepository foodRepository) {
        super();
    }
}