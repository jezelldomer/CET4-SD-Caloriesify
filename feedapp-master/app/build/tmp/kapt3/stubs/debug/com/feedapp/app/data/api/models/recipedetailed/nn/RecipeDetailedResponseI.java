package com.feedapp.app.data.api.models.recipedetailed.nn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponseI;", "", "nutrition", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;", "getNutrition", "()Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;", "setNutrition", "(Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_debug"})
public abstract interface RecipeDetailedResponseI {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition getNutrition();
    
    public abstract void setNutrition(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    public abstract void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
}