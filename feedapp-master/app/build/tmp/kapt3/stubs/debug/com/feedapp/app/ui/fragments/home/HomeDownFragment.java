package com.feedapp.app.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020!H\u0016J\u001a\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010/\u001a\u00020!H\u0002J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0002J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/feedapp/app/ui/fragments/home/HomeDownFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/feedapp/app/data/interfaces/ViewPagerPageListenerCallback;", "()V", "binding", "Lcom/feedapp/app/databinding/FragmentHomeDownMenuBinding;", "fragments", "Ljava/util/ArrayList;", "Lcom/feedapp/app/ui/fragments/home/DayFragment;", "Lkotlin/collections/ArrayList;", "getFragments", "()Ljava/util/ArrayList;", "value", "", "isResettingDateOrSwiping", "()Z", "setResettingDateOrSwiping", "(Z)V", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "scrollState", "", "getScrollState", "()I", "setScrollState", "(I)V", "viewModel", "Lcom/feedapp/app/viewModels/HomeViewModel;", "arrowSwipe", "", "arrowDirection", "Lcom/feedapp/app/data/models/ArrowDirection;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setObservers", "setUpListeners", "setViews", "setupAdapter", "updateDayAndDate", "position", "app_debug"})
public final class HomeDownFragment extends dagger.android.support.DaggerFragment implements com.feedapp.app.data.interfaces.ViewPagerPageListenerCallback {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.feedapp.app.ui.fragments.home.DayFragment> fragments = null;
    private com.feedapp.app.viewModels.HomeViewModel viewModel;
    private com.feedapp.app.databinding.FragmentHomeDownMenuBinding binding;
    private int scrollState;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.ui.fragments.home.DayFragment> getFragments() {
        return null;
    }
    
    @java.lang.Override()
    public int getScrollState() {
        return 0;
    }
    
    @java.lang.Override()
    public void setScrollState(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setObservers() {
    }
    
    private final void arrowSwipe(com.feedapp.app.data.models.ArrowDirection arrowDirection) {
    }
    
    private final void setViews() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setupAdapter() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void updateDayAndDate(int position) {
    }
    
    @java.lang.Override()
    public boolean isResettingDateOrSwiping() {
        return false;
    }
    
    @java.lang.Override()
    public void setResettingDateOrSwiping(boolean value) {
    }
    
    @javax.inject.Inject()
    public HomeDownFragment() {
        super();
    }
}