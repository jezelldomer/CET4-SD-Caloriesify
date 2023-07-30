package com.feedapp.app.data.api.models.recipedetailed.nn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/feedapp/app/data/api/models/recipedetailed/nn/IngredientX;", "", "amount", "", "name", "", "nutrients", "", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrient;", "unit", "(FLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAmount", "()F", "setAmount", "(F)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNutrients", "()Ljava/util/List;", "setNutrients", "(Ljava/util/List;)V", "getUnit", "setUnit", "checkAmountConversion", "", "convertLbToGrams", "convertOzToGrams", "getRoundedAmount", "roundRecipeUnitsAmount", "app_debug"})
public final class IngredientX {
    private float amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.Nutrient> nutrients;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String unit;
    
    private final float roundRecipeUnitsAmount(float amount) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoundedAmount() {
        return null;
    }
    
    public final void checkAmountConversion() {
    }
    
    private final void convertLbToGrams() {
    }
    
    private final void convertOzToGrams() {
    }
    
    public final float getAmount() {
        return 0.0F;
    }
    
    public final void setAmount(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.Nutrient> getNutrients() {
        return null;
    }
    
    public final void setNutrients(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.Nutrient> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public IngredientX(float amount, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.Nutrient> nutrients, @org.jetbrains.annotations.NotNull()
    java.lang.String unit) {
        super();
    }
    
    public IngredientX() {
        super();
    }
}