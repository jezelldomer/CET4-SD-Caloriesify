package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bJ\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dJ\u001a\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u0001032\u0006\u00104\u001a\u000205H\u0002J\u000e\u00106\u001a\u0002072\u0006\u00104\u001a\u000205J\u000e\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000bJ\u0016\u0010:\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<J>\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010=2\u0006\u00109\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J>\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010=2\u0006\u00109\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J \u0010?\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0AH\u0002J\u0006\u0010B\u001a\u000207J&\u0010C\u001a\u0002072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0017R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/feedapp/app/data/repositories/RecipeSearchRepository;", "", "application", "Landroid/app/Application;", "recipeApiSearchResult", "Lcom/feedapp/app/data/api/interfaces/RecipeApiSearch;", "(Landroid/app/Application;Lcom/feedapp/app/data/api/interfaces/RecipeApiSearch;)V", "getApplication", "()Landroid/app/Application;", "diet", "", "", "getDiet", "()Ljava/util/List;", "setDiet", "(Ljava/util/List;)V", "intolerance", "getIntolerance", "setIntolerance", "isRecipesEmpty", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isSearching", "recipeDetailed", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponse;", "getRecipeDetailed", "recipeDetailedMediator", "Landroidx/lifecycle/MediatorLiveData;", "recipesBreakfast", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeSearchModel;", "getRecipesBreakfast", "recipesDinner", "getRecipesDinner", "recipesLunch", "getRecipesLunch", "recipesSnack", "getRecipesSnack", "searchRecipes", "getSearchRecipes", "stringUtils", "Lcom/feedapp/app/util/StringUtils;", "checkCredits", "credits", "sourceName", "sourceUrl", "checkTitle", "title", "observeRecipesDetailed", "searchDetailedInfo", "Lio/reactivex/Flowable;", "id", "", "searchDetails", "", "searchRecipe", "query", "searchRecipeWithType", "mealType", "Lcom/feedapp/app/data/models/day/MealType;", "Lretrofit2/Call;", "searchVP", "setDataToRecipe", "response", "Lretrofit2/Response;", "startSearching", "updateIntoleranceAndDiet", "app_debug"})
public final class RecipeSearchRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRecipesEmpty = null;
    private final com.feedapp.app.util.StringUtils stringUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> searchRecipes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesBreakfast = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesLunch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesSnack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> recipesDinner = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSearching = null;
    private final androidx.lifecycle.MediatorLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> recipeDetailedMediator = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> recipeDetailed = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> intolerance;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> diet;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    private final com.feedapp.app.data.api.interfaces.RecipeApiSearch recipeApiSearchResult = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRecipesEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getSearchRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesBreakfast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesLunch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesSnack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesDinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSearching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> observeRecipesDetailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> getRecipeDetailed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getIntolerance() {
        return null;
    }
    
    public final void setIntolerance(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getDiet() {
        return null;
    }
    
    public final void setDiet(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    private final void setDataToRecipe(com.feedapp.app.data.models.day.MealType mealType, retrofit2.Response<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> response) {
    }
    
    public final void searchRecipe(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void searchDetails(int id) {
    }
    
    private final retrofit2.Call<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> searchVP(java.lang.String query, java.util.List<java.lang.String> intolerance, java.util.List<java.lang.String> diet) {
        return null;
    }
    
    private final retrofit2.Call<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> searchRecipes(java.lang.String query, java.util.List<java.lang.String> intolerance, java.util.List<java.lang.String> diet) {
        return null;
    }
    
    private final io.reactivex.Flowable<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> searchDetailedInfo(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String checkTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String checkCredits(@org.jetbrains.annotations.Nullable()
    java.lang.String credits, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceName, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceUrl) {
        return null;
    }
    
    public final void startSearching() {
    }
    
    public final void updateIntoleranceAndDiet(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> intolerance, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> diet) {
    }
    
    public final void searchRecipeWithType(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.MealType mealType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    @javax.inject.Inject()
    public RecipeSearchRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.interfaces.RecipeApiSearch recipeApiSearchResult) {
        super();
    }
}