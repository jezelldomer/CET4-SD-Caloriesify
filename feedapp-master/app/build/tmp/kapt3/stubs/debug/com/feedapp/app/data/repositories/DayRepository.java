package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000bJ\u001e\u0010!\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001aJ\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070&J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010-\u001a\u00020\u0015J\u0019\u0010.\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\u000bJ\u000e\u00101\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u00102\u001a\u00020\u0013J\u001c\u00103\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001aH\u0002J(\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020*J9\u00109\u001a\u0004\u0018\u00010\u00132\u0006\u0010:\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@\u00a2\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u000bJ\u001b\u0010C\u001a\u0004\u0018\u00010\u00072\u0006\u0010D\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010EJ!\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00130G2\b\u0010H\u001a\u0004\u0018\u00010\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010IJ\u000e\u0010J\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u000bJ\u0018\u0010L\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006N"}, d2 = {"Lcom/feedapp/app/data/repositories/DayRepository;", "", "dayDao", "Lcom/feedapp/app/data/databases/daos/DayDao;", "(Lcom/feedapp/app/data/databases/daos/DayDao;)V", "currentDay", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/day/Day;", "getCurrentDay", "()Landroidx/lifecycle/MutableLiveData;", "currentPosition", "", "kotlin.jvm.PlatformType", "getCurrentPosition", "userId", "", "getUserId", "()Ljava/lang/String;", "addProductToDay", "", "date", "Lcom/feedapp/app/data/models/day/DayDate;", "mealType", "product", "Lcom/feedapp/app/data/models/Product;", "addCallback", "Lcom/feedapp/app/data/interfaces/BasicOperationCallback;", "checkFirebaseVersion", "Lkotlinx/coroutines/Job;", "day", "deleteAllDays", "deleteDay", "id", "deleteProductFromDay", "", "deleteCallback", "generateDefaultDayWithSpecificDay", "generateMeals", "", "Lcom/feedapp/app/data/models/day/Meal;", "getAllDays", "getDate", "Ljava/util/Date;", "position", "getDayByDate", "getInitialDayDate", "getPreviousOrNextDay", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSize", "insertDay", "resetDate", "saveDayToFirebase", "basicOperationCallback", "saveRecipeToDay", "recipe", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponse;", "servings", "saveSearchProductToDay", "dateString", "offlineProduct", "Lcom/feedapp/app/data/models/FoodProduct;", "grams", "", "productLocal", "Lcom/feedapp/app/data/models/localdb/IProduct;", "(Lcom/feedapp/app/data/models/day/DayDate;ILcom/feedapp/app/data/models/FoodProduct;FLcom/feedapp/app/data/models/localdb/IProduct;)Lkotlin/Unit;", "searchById", "searchDayInFirebase", "receivedDay", "(Lcom/feedapp/app/data/models/day/Day;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDay", "Lkotlinx/coroutines/Deferred;", "pos", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWaterNum", "newWaterNum", "updateWaterNumFirebase", "waterNum", "app_debug"})
public final class DayRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> currentPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.day.Day> currentDay = null;
    private java.lang.String userId;
    private final com.feedapp.app.data.databases.daos.DayDao dayDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCurrentPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.day.Day> getCurrentDay() {
        return null;
    }
    
    private final java.lang.String getUserId() {
        return null;
    }
    
    /**
     * get date according to current position
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.day.DayDate getInitialDayDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job checkFirebaseVersion(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.Day day) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateDay(@org.jetbrains.annotations.Nullable()
    java.lang.Integer pos, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<kotlin.Unit>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPreviousOrNextDay(int position, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.feedapp.app.data.models.day.Day> p1) {
        return null;
    }
    
    private final java.util.List<com.feedapp.app.data.models.day.Meal> generateMeals() {
        return null;
    }
    
    private final com.feedapp.app.data.models.day.Day generateDefaultDayWithSpecificDay(com.feedapp.app.data.models.day.DayDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit saveSearchProductToDay(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate dateString, int mealType, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.FoodProduct offlineProduct, float grams, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.localdb.IProduct productLocal) {
        return null;
    }
    
    /**
     * add product to the meals of given day
     */
    private final void addProductToDay(com.feedapp.app.data.models.day.DayDate date, int mealType, com.feedapp.app.data.models.Product product, com.feedapp.app.data.interfaces.BasicOperationCallback addCallback) {
    }
    
    private final void saveDayToFirebase(com.feedapp.app.data.models.day.Day day, com.feedapp.app.data.interfaces.BasicOperationCallback basicOperationCallback) {
    }
    
    public final void deleteAllDays() {
    }
    
    public final void saveRecipeToDay(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse recipe, int servings, int position, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.feedapp.app.data.models.day.Day getDayByDate(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate date) {
        return null;
    }
    
    public final boolean deleteProductFromDay(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.DayDate date, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product product, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.interfaces.BasicOperationCallback deleteCallback) {
        return false;
    }
    
    public final void deleteDay(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.feedapp.app.data.models.day.Day searchById(int id) {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.models.day.Day> getAllDays() {
        return null;
    }
    
    public final void insertDay(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.Day day) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchDayInFirebase(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.day.Day receivedDay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.feedapp.app.data.models.day.Day> p1) {
        return null;
    }
    
    public final void resetDate() {
    }
    
    public final void updateWaterNum(int newWaterNum) {
    }
    
    private final void updateWaterNumFirebase(int waterNum, com.feedapp.app.data.models.day.Day day) {
    }
    
    @javax.inject.Inject()
    public DayRepository(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.DayDao dayDao) {
        super();
    }
}