package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ$\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bJ\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u001bJ\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001bJ\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\'J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0011J\u0006\u0010+\u001a\u00020)J\u001f\u0010,\u001a\u00020-2\b\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010/R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000e\u00a8\u00060"}, d2 = {"Lcom/feedapp/app/viewModels/DetailedRecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "recipeSearchRepository", "Lcom/feedapp/app/data/repositories/RecipeSearchRepository;", "userRepository", "Lcom/feedapp/app/data/repositories/UserRepository;", "dayRepository", "Lcom/feedapp/app/data/repositories/DayRepository;", "recipesDetailsCalculator", "Lcom/feedapp/app/data/models/calculations/RecipesDetailsCalculator;", "(Lcom/feedapp/app/data/repositories/RecipeSearchRepository;Lcom/feedapp/app/data/repositories/UserRepository;Lcom/feedapp/app/data/repositories/DayRepository;Lcom/feedapp/app/data/models/calculations/RecipesDetailsCalculator;)V", "isSearching", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "mealTypePosition", "Landroidx/lifecycle/MutableLiveData;", "", "getMealTypePosition", "()Landroidx/lifecycle/MutableLiveData;", "recipeDetailed", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponse;", "getRecipeDetailed", "user", "Lcom/feedapp/app/data/models/user/User;", "getUser", "checkCredits", "", "credits", "sourceName", "sourceUrl", "getDailyPercentage", "Lkotlin/Pair;", "type", "Lcom/feedapp/app/data/models/BasicNutrientType;", "getDropDownInitialText", "isServingsCorrect", "servings", "observeRecipesDetailed", "Landroidx/lifecycle/MediatorLiveData;", "searchDetailedInfo", "", "id", "startSearching", "trackRecipe", "Lkotlinx/coroutines/Job;", "mealType", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/coroutines/Job;", "app_debug"})
public final class DetailedRecipeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> user = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mealTypePosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isSearching = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> recipeDetailed = null;
    private final com.feedapp.app.data.repositories.RecipeSearchRepository recipeSearchRepository = null;
    private final com.feedapp.app.data.repositories.DayRepository dayRepository = null;
    private final com.feedapp.app.data.models.calculations.RecipesDetailsCalculator recipesDetailsCalculator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMealTypePosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isSearching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> getRecipeDetailed() {
        return null;
    }
    
    public final void searchDetailedInfo(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> observeRecipesDetailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String checkCredits(@org.jetbrains.annotations.Nullable()
    java.lang.String credits, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceName, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getDailyPercentage(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job trackRecipe(@org.jetbrains.annotations.Nullable()
    java.lang.Integer servings, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mealType) {
        return null;
    }
    
    public final boolean isServingsCorrect(@org.jetbrains.annotations.NotNull()
    java.lang.String servings) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropDownInitialText() {
        return null;
    }
    
    public final void startSearching() {
    }
    
    @javax.inject.Inject()
    public DetailedRecipeViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.RecipeSearchRepository recipeSearchRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.DayRepository dayRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.calculations.RecipesDetailsCalculator recipesDetailsCalculator) {
        super();
    }
}