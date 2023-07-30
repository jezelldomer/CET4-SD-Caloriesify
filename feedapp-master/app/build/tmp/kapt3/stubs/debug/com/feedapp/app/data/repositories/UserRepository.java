package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\n\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0011\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\'H\u0002J\u0014\u0010(\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\'0*J\u0014\u0010+\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\'0*J\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020#J\u000e\u0010.\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0018\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0014H\u0002J\u0018\u00104\u001a\u00020\u001a2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0014H\u0002J\u0018\u00105\u001a\u00020\u001a2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u000102J/\u00107\u001a\u0004\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020\'2\u0006\u00108\u001a\u00020\u000b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0018\u0010<\u001a\u00020\u001a2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0014H\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lcom/feedapp/app/data/repositories/UserRepository;", "", "userDao", "Lcom/feedapp/app/data/databases/daos/UserDao;", "leftCalculator", "Lcom/feedapp/app/data/models/calculations/LeftNutrientCalculator;", "(Lcom/feedapp/app/data/databases/daos/UserDao;Lcom/feedapp/app/data/models/calculations/LeftNutrientCalculator;)V", "_user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/user/User;", "caloriesType", "Lcom/feedapp/app/data/models/BasicNutrientType;", "carbsType", "fatsType", "proteinsType", "user", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "userLeftValues", "Lcom/feedapp/app/data/models/user/UserLeftValues;", "getUserLeftValues", "()Landroidx/lifecycle/MutableLiveData;", "deleteAllUsers", "Lkotlinx/coroutines/Job;", "deleteFirebaseAccount", "", "userDeleteCallback", "Lcom/feedapp/app/data/interfaces/UserDeleteCallback;", "downloadUserFromFB", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPrepared", "getUserProfileFBReference", "Lcom/google/firebase/firestore/DocumentReference;", "ifUserExists", "", "insertUser", "isNewNutrientValueValid", "newValueToSave", "", "saveDiet", "list", "", "saveIntolerance", "saveMeasure", "metricB", "saveUser", "saveUserToFirebase", "updateCalories", "day", "Lcom/feedapp/app/data/models/day/Day;", "leftValues", "updateCarbsLeft", "updateFatsLeft", "updateLeftValues", "updateNutrient", "type", "callback", "Lcom/feedapp/app/data/interfaces/BasicOperationCallback;", "(Ljava/lang/String;Lcom/feedapp/app/data/models/BasicNutrientType;Lcom/feedapp/app/data/interfaces/BasicOperationCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProteins", "app_debug"})
public final class UserRepository {
    private final com.feedapp.app.data.models.BasicNutrientType proteinsType = null;
    private final com.feedapp.app.data.models.BasicNutrientType fatsType = null;
    private final com.feedapp.app.data.models.BasicNutrientType carbsType = null;
    private final com.feedapp.app.data.models.BasicNutrientType caloriesType = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.user.User> _user = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.user.UserLeftValues> userLeftValues = null;
    private final com.feedapp.app.data.databases.daos.UserDao userDao = null;
    private final com.feedapp.app.data.models.calculations.LeftNutrientCalculator leftCalculator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.user.UserLeftValues> getUserLeftValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertUser(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.user.User user) {
        return null;
    }
    
    /**
     * Saving user's profile to Firebase
     * Used also for updating user's data
     */
    private final void saveUserToFirebase(com.feedapp.app.data.models.user.User user) {
    }
    
    public final void deleteFirebaseAccount(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.interfaces.UserDeleteCallback userDeleteCallback) {
    }
    
    public final void saveMeasure(boolean metricB) {
    }
    
    public final void saveIntolerance(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list) {
    }
    
    public final void saveDiet(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAllUsers() {
        return null;
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.user.User user) {
    }
    
    private final com.google.firebase.firestore.DocumentReference getUserProfileFBReference() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ifUserExists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    public final void updateLeftValues(@org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.Day day) {
    }
    
    private final void updateCarbsLeft(com.feedapp.app.data.models.day.Day day, com.feedapp.app.data.models.user.UserLeftValues leftValues) {
    }
    
    private final void updateProteins(com.feedapp.app.data.models.day.Day day, com.feedapp.app.data.models.user.UserLeftValues leftValues) {
    }
    
    private final void updateFatsLeft(com.feedapp.app.data.models.day.Day day, com.feedapp.app.data.models.user.UserLeftValues leftValues) {
    }
    
    private final void updateCalories(com.feedapp.app.data.models.day.Day day, com.feedapp.app.data.models.user.UserLeftValues leftValues) {
    }
    
    /**
     * check if string nutrient value is valid
     */
    private final boolean isNewNutrientValueValid(java.lang.String newValueToSave) {
        return false;
    }
    
    /**
     * Updates nutrient value for user in local and firebase
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateNutrient(@org.jetbrains.annotations.NotNull()
    java.lang.String newValueToSave, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.interfaces.BasicOperationCallback callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.calculations.LeftNutrientCalculator leftCalculator) {
        super();
    }
}