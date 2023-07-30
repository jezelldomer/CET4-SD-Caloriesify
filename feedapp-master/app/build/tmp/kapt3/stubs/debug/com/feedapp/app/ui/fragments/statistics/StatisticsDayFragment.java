package com.feedapp.app.ui.fragments.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\u0016H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0006H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/feedapp/app/ui/fragments/statistics/StatisticsDayFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "binding", "Lcom/feedapp/app/databinding/FragmentStatisticsDayBinding;", "dayDate", "Lcom/feedapp/app/data/models/day/DayDate;", "getDayDate", "()Lcom/feedapp/app/data/models/day/DayDate;", "setDayDate", "(Lcom/feedapp/app/data/models/day/DayDate;)V", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "productsAdapter", "Lcom/feedapp/app/ui/adapters/StatisticsDayProductsAdapter;", "viewModel", "Lcom/feedapp/app/viewModels/StatisticsViewModel;", "deleteProduct", "", "product", "Lcom/feedapp/app/data/models/Product;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteProduct", "onViewCreated", "view", "resetPieChart", "setDateText", "it", "setUpAdapter", "setUpObservers", "setUpPieChartView", "setUpView", "updatePieChart", "pieData", "Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;", "app_debug"})
public final class StatisticsDayFragment extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private com.feedapp.app.viewModels.StatisticsViewModel viewModel;
    private com.feedapp.app.databinding.FragmentStatisticsDayBinding binding;
    private final com.feedapp.app.ui.adapters.StatisticsDayProductsAdapter productsAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private com.feedapp.app.data.models.day.DayDate dayDate;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.feedapp.app.data.models.day.DayDate getDayDate() {
        return null;
    }
    
    public final void setDayDate(@org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.DayDate p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpView() {
    }
    
    private final void setDateText(com.feedapp.app.data.models.day.DayDate it) {
    }
    
    private final void setUpAdapter() {
    }
    
    private final void setUpPieChartView() {
    }
    
    private final void setUpObservers() {
    }
    
    private final void resetPieChart() {
    }
    
    private final void updatePieChart(com.github.mikephil.charting.interfaces.datasets.IPieDataSet pieData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void deleteProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product product) {
    }
    
    private final void onDeleteProduct() {
    }
    
    public StatisticsDayFragment() {
        super();
    }
}