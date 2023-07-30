package com.feedapp.app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B7\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/feedapp/app/ui/adapters/RecipesRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeResult;", "Lcom/feedapp/app/ui/viewholders/RecipeApiViewHolder;", "starter", "Lkotlin/Function3;", "", "", "", "requestManager", "Lcom/bumptech/glide/RequestManager;", "onSearchLimit", "Lcom/feedapp/app/ui/adapters/OnSearchLimit;", "(Lkotlin/jvm/functions/Function3;Lcom/bumptech/glide/RequestManager;Lcom/feedapp/app/ui/adapters/OnSearchLimit;)V", "stringUtils", "Lcom/feedapp/app/util/StringUtils;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class RecipesRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.feedapp.app.data.api.models.recipesearch.RecipeResult, com.feedapp.app.ui.viewholders.RecipeApiViewHolder> {
    private final com.feedapp.app.util.StringUtils stringUtils = null;
    private final kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.String, java.lang.String, kotlin.Unit> starter = null;
    private final com.bumptech.glide.RequestManager requestManager = null;
    private final com.feedapp.app.ui.adapters.OnSearchLimit onSearchLimit = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.feedapp.app.data.api.models.recipesearch.RecipeResult> DIFF_CALLBACK = null;
    public static final com.feedapp.app.ui.adapters.RecipesRecyclerAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.viewholders.RecipeApiViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.ui.viewholders.RecipeApiViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public RecipesRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> starter, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.adapters.OnSearchLimit onSearchLimit) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/feedapp/app/ui/adapters/RecipesRecyclerAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeResult;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.feedapp.app.data.api.models.recipesearch.RecipeResult> getDIFF_CALLBACK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}