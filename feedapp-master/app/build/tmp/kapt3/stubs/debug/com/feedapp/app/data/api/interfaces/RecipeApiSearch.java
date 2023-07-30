package com.feedapp.app.data.api.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nH\'JN\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\u00062\b\b\u0003\u0010\u0010\u001a\u00020\b2\b\b\u0003\u0010\u0011\u001a\u00020\b2\b\b\u0003\u0010\u0012\u001a\u00020\nH\'JL\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\u00062\b\b\u0003\u0010\u0014\u001a\u00020\u00062\b\b\u0003\u0010\u0010\u001a\u00020\b2\b\b\u0003\u0010\u0011\u001a\u00020\bH\'\u00a8\u0006\u0015"}, d2 = {"Lcom/feedapp/app/data/api/interfaces/RecipeApiSearch;", "", "getRecipesDetails", "Lio/reactivex/Flowable;", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponse;", "id", "", "api_key", "", "includeNutrition", "", "getRecipesSearch", "Lretrofit2/Call;", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeSearchModel;", "query", "number", "intolerance", "diet", "instructionsRequired", "getRecipesVP", "offset", "app_debug"})
public abstract interface RecipeApiSearch {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    @retrofit2.http.GET(value = "recipes/search")
    public abstract retrofit2.Call<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesVP(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "number")
    int number, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "intolerances")
    java.lang.String intolerance, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "diet")
    java.lang.String diet);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    @retrofit2.http.GET(value = "recipes/search")
    public abstract retrofit2.Call<com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel> getRecipesSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "number")
    int number, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "intolerances")
    java.lang.String intolerance, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "diet")
    java.lang.String diet, @retrofit2.http.Query(value = "instructionsRequired")
    boolean instructionsRequired);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    @retrofit2.http.GET(value = "recipes/{id}/information/")
    public abstract io.reactivex.Flowable<com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse> getRecipesDetails(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String api_key, @retrofit2.http.Query(value = "includeNutrition")
    boolean includeNutrition);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}