package com.feedapp.app.data.models;

import java.lang.System;

/**
 * Class to convert received models from api and offline database to one object
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/feedapp/app/data/models/ConverterToProduct;", "", "()V", "convertFoodProduct", "Lcom/feedapp/app/data/models/Product;", "foodProduct", "Lcom/feedapp/app/data/models/FoodProduct;", "grams", "", "convertLocal", "it", "Lcom/feedapp/app/data/models/localdb/IProduct;", "convertRecipe", "recipe", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponseI;", "servings", "", "app_debug"})
public final class ConverterToProduct {
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.Product convertRecipe(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponseI recipe, int servings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.Product convertFoodProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct foodProduct, float grams) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.Product convertLocal(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.localdb.IProduct it, float grams) {
        return null;
    }
    
    public ConverterToProduct() {
        super();
    }
}