package com.feedapp.app.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fJ\u000e\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u0013J\u0011\u0010%\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u0004\u0018\u00010$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\fJ\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020 J\u000e\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u001cJ\u000e\u0010.\u001a\u00020$2\u0006\u0010)\u001a\u00020\fJ\u000e\u0010/\u001a\u00020$2\u0006\u0010-\u001a\u00020\u001cJ\u000e\u00100\u001a\u00020$2\u0006\u0010-\u001a\u00020\u001cJ\u000e\u00101\u001a\u00020$2\u0006\u0010)\u001a\u00020\fJ\u000e\u00102\u001a\u00020$2\u0006\u0010)\u001a\u00020\fJ\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\fH\u0002J\u000e\u00105\u001a\u00020$2\u0006\u00104\u001a\u00020\fR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lcom/feedapp/app/viewModels/IntroductionViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/feedapp/app/data/repositories/UserRepository;", "introductionRepository", "Lcom/feedapp/app/data/repositories/IntroductionRepository;", "spHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "(Lcom/feedapp/app/data/repositories/UserRepository;Lcom/feedapp/app/data/repositories/IntroductionRepository;Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;)V", "_progressBar", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/Event;", "", "_valuesInvalid", "applied", "getApplied", "()Landroidx/lifecycle/MutableLiveData;", "goal", "Landroidx/lifecycle/LiveData;", "Lcom/feedapp/app/data/models/user/UserGoal;", "getGoal", "()Landroidx/lifecycle/LiveData;", "progressBar", "getProgressBar", "valuesInvalid", "getValuesInvalid", "areHeightWeightInvalid", "text", "", "text1", "canUnblockButton", "length", "", "length1", "notEmpty", "chooseGoal", "", "ifUserExists", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUser", "setActivityChosen", "b", "setActivityLevel", "position", "setAgeValue", "toString", "setAppliedValue", "setHeightValue", "setWeightValue", "sexChosenValue", "sexValue", "showInvalidToast", "itemId", "showProgressBar", "app_debug"})
public final class IntroductionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserGoal> goal = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> applied = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.Event<java.lang.Boolean>> _valuesInvalid = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.Event<java.lang.Boolean>> _progressBar = null;
    private final com.feedapp.app.data.repositories.UserRepository userRepository = null;
    private final com.feedapp.app.data.repositories.IntroductionRepository introductionRepository = null;
    private final com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserGoal> getGoal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getApplied() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.Event<java.lang.Boolean>> getValuesInvalid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.Event<java.lang.Boolean>> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    private final void showInvalidToast(boolean itemId) {
    }
    
    public final void showProgressBar(boolean itemId) {
    }
    
    public final boolean canUnblockButton(int length, int length1, boolean notEmpty) {
        return false;
    }
    
    public final boolean areHeightWeightInvalid(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String text1) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ifUserExists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    public final void chooseGoal(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.user.UserGoal goal) {
    }
    
    public final void setWeightValue(@org.jetbrains.annotations.NotNull()
    java.lang.String toString) {
    }
    
    public final void setAgeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String toString) {
    }
    
    public final void setHeightValue(@org.jetbrains.annotations.NotNull()
    java.lang.String toString) {
    }
    
    public final void setAppliedValue(boolean b) {
    }
    
    public final void setActivityLevel(int position) {
    }
    
    public final void setActivityChosen(boolean b) {
    }
    
    public final void sexChosenValue(boolean b) {
    }
    
    public final void sexValue(boolean b) {
    }
    
    @javax.inject.Inject()
    public IntroductionViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.IntroductionRepository introductionRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper) {
        super();
    }
}