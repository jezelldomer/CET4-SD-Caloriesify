package com.feedapp.app.data.models.calculations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J1\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/feedapp/app/data/models/calculations/RecipesDetailsCalculator;", "", "()V", "checkServingsAmount", "", "servings", "", "getDailyPercentage", "Lkotlin/Pair;", "", "type", "Lcom/feedapp/app/data/models/BasicNutrientType;", "user", "Lcom/feedapp/app/data/models/user/User;", "amount", "", "(Lcom/feedapp/app/data/models/BasicNutrientType;Lcom/feedapp/app/data/models/user/User;Ljava/lang/Float;)Lkotlin/Pair;", "getDropDownInitialText", "mealTypePosition", "(Ljava/lang/Integer;)Ljava/lang/String;", "getMealTypeByCurrentTime", "Lcom/feedapp/app/data/models/day/MealType;", "app_debug"})
public final class RecipesDetailsCalculator {
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getDailyPercentage(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.user.User user, @org.jetbrains.annotations.Nullable()
    java.lang.Float amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropDownInitialText(@org.jetbrains.annotations.Nullable()
    java.lang.Integer mealTypePosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.MealType getMealTypeByCurrentTime() {
        return null;
    }
    
    public final boolean checkServingsAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String servings) {
        return false;
    }
    
    public RecipesDetailsCalculator() {
        super();
    }
}