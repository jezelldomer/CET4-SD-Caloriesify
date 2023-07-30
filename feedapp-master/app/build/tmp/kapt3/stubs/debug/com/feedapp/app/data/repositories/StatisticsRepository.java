package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001bJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000fH\u0002J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u000fH\u0002J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0002J\u0018\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203J\u001f\u00104\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u00105J\u000e\u00106\u001a\u00020\u001e2\u0006\u00102\u001a\u000203R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000f0\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000b\u00a8\u00067"}, d2 = {"Lcom/feedapp/app/data/repositories/StatisticsRepository;", "", "dayDao", "Lcom/feedapp/app/data/databases/daos/DayDao;", "calendar", "Ljava/util/Calendar;", "(Lcom/feedapp/app/data/databases/daos/DayDao;Ljava/util/Calendar;)V", "barDataSet", "Landroidx/lifecycle/MutableLiveData;", "Lcom/github/mikephil/charting/data/BarDataSet;", "getBarDataSet", "()Landroidx/lifecycle/MutableLiveData;", "getCalendar", "()Ljava/util/Calendar;", "currentYear", "", "monthPosition", "kotlin.jvm.PlatformType", "getMonthPosition", "nutrient", "Lcom/feedapp/app/data/models/StatisticsNutrientType;", "getNutrient", "pieDataSet", "Lcom/github/mikephil/charting/data/PieDataSet;", "getPieDataSet", "products", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/Product;", "getProducts", "deleteProductFromProducts", "", "product", "getBarEntries", "", "Lcom/github/mikephil/charting/data/BarEntry;", "nutrientType", "monthEnum", "Lcom/feedapp/app/data/models/MonthEnum;", "getDaysFromCurrentMonth", "getDefaultMonth", "getDefaultStatisticsNutrientType", "getMonthStringFromInt", "", "month", "getNutrientTotalFromMonth", "Ljava/util/HashMap;", "getPieColors", "setNewBarDataset", "Lkotlinx/coroutines/Job;", "setNewPieDataset", "day", "Lcom/feedapp/app/data/models/day/Day;", "updateBarDataset", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateProducts", "app_debug"})
public final class StatisticsRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.github.mikephil.charting.data.BarDataSet> barDataSet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.github.mikephil.charting.data.PieDataSet> pieDataSet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.feedapp.app.data.models.Product>> products = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> monthPosition = null;
    private final int currentYear = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.StatisticsNutrientType> nutrient = null;
    private final com.feedapp.app.data.databases.daos.DayDao dayDao = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Calendar calendar = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.github.mikephil.charting.data.BarDataSet> getBarDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.github.mikephil.charting.data.PieDataSet> getPieDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.feedapp.app.data.models.Product>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMonthPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.StatisticsNutrientType> getNutrient() {
        return null;
    }
    
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> getNutrientTotalFromMonth(com.feedapp.app.data.models.StatisticsNutrientType nutrient, int month) {
        return null;
    }
    
    private final java.lang.String getMonthStringFromInt(int month) {
        return null;
    }
    
    public final void updateProducts(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.Day day) {
    }
    
    private final int getDaysFromCurrentMonth(com.feedapp.app.data.models.MonthEnum monthEnum) {
        return 0;
    }
    
    private final kotlinx.coroutines.Job setNewBarDataset(com.feedapp.app.data.models.StatisticsNutrientType nutrientType, com.feedapp.app.data.models.MonthEnum monthEnum) {
        return null;
    }
    
    public final void setNewPieDataset(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.Day day) {
    }
    
    private final java.util.List<java.lang.Integer> getPieColors() {
        return null;
    }
    
    private final java.util.List<com.github.mikephil.charting.data.BarEntry> getBarEntries(com.feedapp.app.data.models.StatisticsNutrientType nutrientType, com.feedapp.app.data.models.MonthEnum monthEnum) {
        return null;
    }
    
    private final com.feedapp.app.data.models.StatisticsNutrientType getDefaultStatisticsNutrientType() {
        return null;
    }
    
    private final com.feedapp.app.data.models.MonthEnum getDefaultMonth() {
        return null;
    }
    
    public final void deleteProductFromProducts(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product product) {
    }
    
    public final void updateBarDataset(@org.jetbrains.annotations.Nullable()
    java.lang.Integer nutrient, @org.jetbrains.annotations.Nullable()
    java.lang.Integer month) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getCalendar() {
        return null;
    }
    
    @javax.inject.Inject()
    public StatisticsRepository(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.DayDao dayDao, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        super();
    }
}