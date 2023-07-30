package com.feedapp.app.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016J\u001a\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006,"}, d2 = {"Lcom/feedapp/app/ui/fragments/home/MyMealsFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "binding", "Lcom/feedapp/app/databinding/FragmentMyMealsBinding;", "getBinding", "()Lcom/feedapp/app/databinding/FragmentMyMealsBinding;", "setBinding", "(Lcom/feedapp/app/databinding/FragmentMyMealsBinding;)V", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "myMealsViewModel", "Lcom/feedapp/app/viewModels/MyMealsViewModel;", "getMyMealsViewModel", "()Lcom/feedapp/app/viewModels/MyMealsViewModel;", "setMyMealsViewModel", "(Lcom/feedapp/app/viewModels/MyMealsViewModel;)V", "productsAdapter", "Lcom/feedapp/app/ui/adapters/MyProductsRecyclerAdapter;", "spHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "getSpHelper", "()Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "setSpHelper", "(Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;)V", "checkProductsUiGuide", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setObservers", "setViews", "app_debug"})
public final class MyMealsFragment extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.viewModels.MyMealsViewModel myMealsViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper;
    @org.jetbrains.annotations.NotNull()
    public com.feedapp.app.databinding.FragmentMyMealsBinding binding;
    private final com.feedapp.app.ui.adapters.MyProductsRecyclerAdapter productsAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.viewModels.MyMealsViewModel getMyMealsViewModel() {
        return null;
    }
    
    public final void setMyMealsViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.MyMealsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.prefs.SharedPrefsHelper getSpHelper() {
        return null;
    }
    
    public final void setSpHelper(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.prefs.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.databinding.FragmentMyMealsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.databinding.FragmentMyMealsBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void checkProductsUiGuide() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setViews() {
    }
    
    private final void setObservers() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public MyMealsFragment() {
        super();
    }
}