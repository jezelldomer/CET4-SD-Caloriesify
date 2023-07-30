package com.feedapp.app.data.api.models.recipesearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/feedapp/app/data/api/models/recipesearch/RecipeSearchModel;", "", "baseUri", "", "number", "", "results", "", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeResult;", "(Ljava/lang/String;ILjava/util/List;)V", "getBaseUri", "()Ljava/lang/String;", "setBaseUri", "(Ljava/lang/String;)V", "getNumber", "()I", "setNumber", "(I)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "app_debug"})
public final class RecipeSearchModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String baseUri;
    private int number;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.feedapp.app.data.api.models.recipesearch.RecipeResult> results;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseUri() {
        return null;
    }
    
    public final void setBaseUri(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getNumber() {
        return 0;
    }
    
    public final void setNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.api.models.recipesearch.RecipeResult> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipesearch.RecipeResult> p0) {
    }
    
    public RecipeSearchModel(@org.jetbrains.annotations.Nullable()
    java.lang.String baseUri, int number, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipesearch.RecipeResult> results) {
        super();
    }
    
    public RecipeSearchModel() {
        super();
    }
}