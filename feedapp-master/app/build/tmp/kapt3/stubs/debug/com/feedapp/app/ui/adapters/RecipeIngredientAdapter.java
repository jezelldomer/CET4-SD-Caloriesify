package com.feedapp.app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001a\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nH\u0016J\u0014\u0010#\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070%R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/feedapp/app/ui/adapters/RecipeIngredientAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/feedapp/app/ui/viewholders/RecipeIngredientViewHolder;", "application", "Landroid/app/Application;", "ingredient", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/IngredientX;", "Lkotlin/collections/ArrayList;", "servings", "", "measureType", "Lcom/feedapp/app/data/models/MeasureType;", "(Landroid/app/Application;Ljava/util/ArrayList;ILcom/feedapp/app/data/models/MeasureType;)V", "getApplication", "()Landroid/app/Application;", "getMeasureType", "()Lcom/feedapp/app/data/models/MeasureType;", "setMeasureType", "(Lcom/feedapp/app/data/models/MeasureType;)V", "getServings", "()I", "setServings", "(I)V", "stringUtils", "Lcom/feedapp/app/util/StringUtils;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "app_debug"})
public final class RecipeIngredientAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.feedapp.app.ui.viewholders.RecipeIngredientViewHolder> {
    private final com.feedapp.app.util.StringUtils stringUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    private final java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> ingredient = null;
    private int servings;
    @org.jetbrains.annotations.NotNull()
    private com.feedapp.app.data.models.MeasureType measureType;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.viewholders.RecipeIngredientViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.ui.viewholders.RecipeIngredientViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final int getServings() {
        return 0;
    }
    
    public final void setServings(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.MeasureType getMeasureType() {
        return null;
    }
    
    public final void setMeasureType(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.MeasureType p0) {
    }
    
    public RecipeIngredientAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.api.models.recipedetailed.nn.IngredientX> ingredient, int servings, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.MeasureType measureType) {
        super();
    }
}