package com.feedapp.app.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/feedapp/app/ui/activities/DetailedFoodActivity;", "Lcom/feedapp/app/ui/activities/ClassicActivity;", "()V", "binding", "Lcom/feedapp/app/databinding/ActivityDetailedFoodBinding;", "dropdownMultipliers", "", "", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "product", "Lcom/feedapp/app/data/models/localdb/IProduct;", "viewModel", "Lcom/feedapp/app/viewModels/DetailedViewModel;", "getViewModel", "()Lcom/feedapp/app/viewModels/DetailedViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDetailedData", "", "id", "", "(Ljava/lang/Integer;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveConsumedFoodToDB", "grams", "", "setListeners", "setUpCollapsingBar", "", "title", "", "setUpLayout", "app_debug"})
public final class DetailedFoodActivity extends com.feedapp.app.ui.activities.ClassicActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.feedapp.app.databinding.ActivityDetailedFoodBinding binding;
    private final java.util.List<java.lang.Double> dropdownMultipliers = null;
    private com.feedapp.app.data.models.localdb.IProduct product;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.feedapp.app.viewModels.DetailedViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadDetailedData(java.lang.Integer id) {
    }
    
    private final void setUpLayout(java.lang.String title) {
    }
    
    private final void setListeners() {
    }
    
    private final void saveConsumedFoodToDB(float grams) {
    }
    
    private final java.lang.Object setUpCollapsingBar(java.lang.String title) {
        return null;
    }
    
    @javax.inject.Inject()
    public DetailedFoodActivity() {
        super();
    }
}