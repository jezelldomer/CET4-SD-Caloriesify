package com.feedapp.app.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020&H\u0002J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000100H\u0002J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\u00a8\u00066"}, d2 = {"Lcom/feedapp/app/ui/activities/DetailedRecipeActivity;", "Lcom/feedapp/app/ui/activities/ClassicActivity;", "()V", "binding", "Lcom/feedapp/app/databinding/ActivityDetailedRecipeBinding;", "ingAdapter", "Lcom/feedapp/app/ui/adapters/RecipeIngredientAdapter;", "getIngAdapter", "()Lcom/feedapp/app/ui/adapters/RecipeIngredientAdapter;", "setIngAdapter", "(Lcom/feedapp/app/ui/adapters/RecipeIngredientAdapter;)V", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "requestManager", "Lcom/bumptech/glide/RequestManager;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "setRequestManager", "(Lcom/bumptech/glide/RequestManager;)V", "startIntent", "Landroid/content/Intent;", "stepAdapter", "Lcom/feedapp/app/ui/adapters/RecipeStepAdapter;", "getStepAdapter", "()Lcom/feedapp/app/ui/adapters/RecipeStepAdapter;", "setStepAdapter", "(Lcom/feedapp/app/ui/adapters/RecipeStepAdapter;)V", "viewModel", "Lcom/feedapp/app/viewModels/DetailedRecipeViewModel;", "getViewModel", "()Lcom/feedapp/app/viewModels/DetailedRecipeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadRecipeModel", "", "id", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpAdapter", "setUpAppbar", "", "title", "", "imageUri", "setUpListeners", "setUpObservers", "setUpView", "showTrackDialog", "app_debug"})
public final class DetailedRecipeActivity extends com.feedapp.app.ui.activities.ClassicActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.ui.adapters.RecipeStepAdapter stepAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.ui.adapters.RecipeIngredientAdapter ingAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager requestManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.feedapp.app.databinding.ActivityDetailedRecipeBinding binding;
    private final android.content.Intent startIntent = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.ui.adapters.RecipeStepAdapter getStepAdapter() {
        return null;
    }
    
    public final void setStepAdapter(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.adapters.RecipeStepAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.ui.adapters.RecipeIngredientAdapter getIngAdapter() {
        return null;
    }
    
    public final void setIngAdapter(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.adapters.RecipeIngredientAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    public final void setRequestManager(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.feedapp.app.viewModels.DetailedRecipeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpView() {
    }
    
    private final void setUpAdapter() {
    }
    
    private final void setUpObservers() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void showTrackDialog() {
    }
    
    private final void loadRecipeModel(int id) {
    }
    
    private final java.lang.Object setUpAppbar(java.lang.String title, java.lang.String imageUri) {
        return null;
    }
    
    @javax.inject.Inject()
    public DetailedRecipeActivity() {
        super();
    }
}