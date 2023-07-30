package com.feedapp.app.viewModels;

import java.lang.System;

/**
 * ViewModel is shared by StatisticsActivity, StatisticsMonthFragment and StatisticsDayFragment
 */
@android.annotation.SuppressLint(value = {"DefaultLocale"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0017\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020$J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020(J\u0010\u0010-\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(J#\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/feedapp/app/viewModels/StatisticsViewModel;", "Landroidx/lifecycle/ViewModel;", "statisticsRepository", "Lcom/feedapp/app/data/repositories/StatisticsRepository;", "dayRepository", "Lcom/feedapp/app/data/repositories/DayRepository;", "(Lcom/feedapp/app/data/repositories/StatisticsRepository;Lcom/feedapp/app/data/repositories/DayRepository;)V", "_deleteProduct", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/Event;", "", "barDataSet", "Landroidx/lifecycle/LiveData;", "Lcom/github/mikephil/charting/data/BarDataSet;", "getBarDataSet", "()Landroidx/lifecycle/LiveData;", "dataChanged", "", "kotlin.jvm.PlatformType", "getDataChanged", "()Landroidx/lifecycle/MutableLiveData;", "deleteCallback", "Lcom/feedapp/app/data/interfaces/BasicOperationCallback;", "deleteProduct", "getDeleteProduct", "monthPosition", "", "getMonthPosition", "nutrientPosition", "Lcom/feedapp/app/data/models/StatisticsNutrientType;", "getNutrientPosition", "pieDataSet", "Lcom/github/mikephil/charting/data/PieDataSet;", "getPieDataSet", "products", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/Product;", "getProducts", "Lkotlinx/coroutines/Job;", "date", "Lcom/feedapp/app/data/models/day/DayDate;", "product", "getDateToDisplay", "", "dayDate", "getNewPieData", "updateBarDataset", "", "nutrientInt", "monthInt", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateProducts", "day", "Lcom/feedapp/app/data/models/day/Day;", "app_debug"})
public final class StatisticsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.github.mikephil.charting.data.BarDataSet> barDataSet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.github.mikephil.charting.data.PieDataSet> pieDataSet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.Product>> products = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> monthPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.StatisticsNutrientType> nutrientPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataChanged = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.Event<java.lang.String>> _deleteProduct = null;
    private final com.feedapp.app.data.interfaces.BasicOperationCallback deleteCallback = null;
    private final com.feedapp.app.data.repositories.StatisticsRepository statisticsRepository = null;
    private final com.feedapp.app.data.repositories.DayRepository dayRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.github.mikephil.charting.data.BarDataSet> getBarDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.github.mikephil.charting.data.PieDataSet> getPieDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.Product>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getMonthPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.StatisticsNutrientType> getNutrientPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDataChanged() {
        return null;
    }
    
    private final void updateProducts(com.feedapp.app.data.models.day.Day day) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNewPieData(@org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.DayDate date) {
        return null;
    }
    
    public final void updateBarDataset(@org.jetbrains.annotations.Nullable()
    java.lang.Integer nutrientInt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer monthInt) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.Event<java.lang.String>> getDeleteProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate date, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence getDateToDisplay(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate dayDate) {
        return null;
    }
    
    @javax.inject.Inject()
    public StatisticsViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.StatisticsRepository statisticsRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.DayRepository dayRepository) {
        super();
    }
}