package com.feedapp.app.data.api.models.recipedetailed.nn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;", "", "ingredients", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/IngredientX;", "Lkotlin/collections/ArrayList;", "nutrients", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/NutrientX;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getIngredients", "()Ljava/util/ArrayList;", "setIngredients", "(Ljava/util/ArrayList;)V", "getNutrients", "setNutrients", "getAmountByNutrient", "", "type", "Lcom/feedapp/app/data/models/BasicNutrientType;", "app_debug"})
public final class Nutrition {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> ingredients;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.NutrientX> nutrients;
    
    public final float getAmountByNutrient(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> getIngredients() {
        return null;
    }
    
    public final void setIngredients(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.NutrientX> getNutrients() {
        return null;
    }
    
    public final void setNutrients(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.NutrientX> p0) {
    }
    
    public Nutrition(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> ingredients, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.NutrientX> nutrients) {
        super();
    }
    
    public Nutrition() {
        super();
    }
}