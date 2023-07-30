package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\"J\u001e\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020*J\u0010\u0010\u000b\u001a\u00020+2\u0006\u0010,\u001a\u00020\fH\u0002J\u000e\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/J\u0014\u00100\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020(02J\u0014\u00103\u001a\u00020+2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(02J\u000e\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\fJ\u0016\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020/J\u0010\u0010:\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0017H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/feedapp/app/viewModels/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/feedapp/app/data/repositories/UserRepository;", "recentDelegate", "Lcom/feedapp/app/data/repositories/RecentDelegate;", "(Lcom/feedapp/app/data/repositories/UserRepository;Lcom/feedapp/app/data/repositories/RecentDelegate;)V", "_toastDatabase", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/Event;", "Lcom/feedapp/app/viewModels/Operation;", "firebaseReauth", "", "reauth", "Landroidx/lifecycle/LiveData;", "getReauth", "()Landroidx/lifecycle/LiveData;", "status", "Lcom/feedapp/app/data/models/DataResponseStatus;", "kotlin.jvm.PlatformType", "getStatus", "()Landroidx/lifecycle/MutableLiveData;", "toast", "Lcom/feedapp/app/data/models/user/UserDeleteOperation;", "getToast", "toastDatabase", "getToastDatabase", "toastDelete", "user", "Lcom/feedapp/app/data/models/user/User;", "getUser", "setUser", "(Landroidx/lifecycle/LiveData;)V", "deleteAllData", "Lkotlinx/coroutines/Job;", "listener", "Lcom/feedapp/app/data/interfaces/UserDeleteCallback;", "deleteRecentProducts", "downloadDatabase", "filePath", "", "code", "Lcom/feedapp/app/data/interfaces/BasicOperationCallback;", "", "itemId", "getNutrientValue", "nutrient", "Lcom/feedapp/app/data/models/BasicNutrientType;", "saveDiet", "dietList", "", "saveIntolerance", "intoleranceList", "saveMeasure", "metric", "saveNewValue", "newValueToSave", "type", "toastDeletion", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.DataResponseStatus> status = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> user;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.Event<com.feedapp.app.viewModels.Operation>> _toastDatabase = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.Event<com.feedapp.app.data.models.user.UserDeleteOperation>> toastDelete = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.Event<java.lang.Boolean>> firebaseReauth = null;
    private final com.feedapp.app.data.repositories.UserRepository userRepository = null;
    private final com.feedapp.app.data.repositories.RecentDelegate recentDelegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.DataResponseStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.Event<com.feedapp.app.viewModels.Operation>> getToastDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.Event<com.feedapp.app.data.models.user.UserDeleteOperation>> getToast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.Event<java.lang.Boolean>> getReauth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveNewValue(@org.jetbrains.annotations.NotNull()
    java.lang.String newValueToSave, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveMeasure(boolean metric) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAllData(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.interfaces.UserDeleteCallback listener) {
        return null;
    }
    
    private final void toastDeletion(com.feedapp.app.data.models.user.UserDeleteOperation itemId) {
    }
    
    private final void firebaseReauth(boolean itemId) {
    }
    
    public final void saveIntolerance(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> intoleranceList) {
    }
    
    public final void saveDiet(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dietList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteRecentProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNutrientValue(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType nutrient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job downloadDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.interfaces.BasicOperationCallback listener) {
        return null;
    }
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.RecentDelegate recentDelegate) {
        super();
    }
}