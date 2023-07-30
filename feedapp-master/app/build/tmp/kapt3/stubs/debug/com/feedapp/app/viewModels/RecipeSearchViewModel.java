package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010!\u001a\u00020\rJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010(\u001a\u00020#J\u000e\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020%J\u0018\u0010+\u001a\u00020#2\u0006\u0010*\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020#H\u0002J\u0006\u0010/\u001a\u000200R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/feedapp/app/viewModels/RecipeSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "calendar", "Ljava/util/Calendar;", "sp", "Landroid/content/SharedPreferences;", "recipeSearchRepository", "Lcom/feedapp/app/data/repositories/RecipeSearchRepository;", "userRepository", "Lcom/feedapp/app/data/repositories/UserRepository;", "(Ljava/util/Calendar;Landroid/content/SharedPreferences;Lcom/feedapp/app/data/repositories/RecipeSearchRepository;Lcom/feedapp/app/data/repositories/UserRepository;)V", "hasSearched", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getHasSearched", "()Landroidx/lifecycle/MutableLiveData;", "isConnected", "isRecipesEmpty", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isSearching", "recipesBreakfast", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeSearchModel;", "getRecipesBreakfast", "recipesDinner", "getRecipesDinner", "recipesLunch", "getRecipesLunch", "recipesSnack", "getRecipesSnack", "searchRecipes", "getSearchRecipes", "areRecipesLimitReached", "incrementSearches", "", "date", "", "searchesInDay", "", "loadDefaultRecipes", "searchRecipe", "query", "searchRecipeWithType", "mealType", "Lcom/feedapp/app/data/models/day/MealType;", "searchStarted", "updateIntoleranceAndDiet", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class RecipeSearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConnected = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isSearching = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hasSearched = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isRecipesEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> searchRecipes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesBreakfast = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesLunch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesSnack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesDinner = null;
    private final java.util.Calendar calendar = null;
    private final android.content.SharedPreferences sp = null;
    private final com.feedapp.app.data.repositories.RecipeSearchRepository recipeSearchRepository = null;
    private final com.feedapp.app.data.repositories.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConnected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isSearching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHasSearched() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isRecipesEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getSearchRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesBreakfast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesLunch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesSnack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesDinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateIntoleranceAndDiet() {
        return null;
    }
    
    private final void searchRecipeWithType(java.lang.String query, com.feedapp.app.data.models.day.MealType mealType) {
    }
    
    /**
     * check if user hasn't searched too much to save API calls
     */
    public final boolean areRecipesLimitReached() {
        return false;
    }
    
    private final void incrementSearches(java.lang.String date, int searchesInDay) {
    }
    
    public final void searchRecipe(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void loadDefaultRecipes() {
    }
    
    private final void searchStarted() {
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    @javax.inject.Inject()
    public RecipeSearchViewModel(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.RecipeSearchRepository recipeSearchRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.UserRepository userRepository) {
        super();
    }
}