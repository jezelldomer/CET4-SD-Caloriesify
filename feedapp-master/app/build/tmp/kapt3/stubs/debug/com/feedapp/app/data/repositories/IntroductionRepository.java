package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\u001e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010%\u001a\u0004\u0018\u00010&H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0019J\u000e\u0010.\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000bJ\u000e\u0010/\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0019J\u000e\u00100\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0019J\u000e\u00101\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000bJ\u000e\u00102\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000bJ\b\u00103\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00040\u00040\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000b0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000b0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u00140\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000b0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/feedapp/app/data/repositories/IntroductionRepository;", "", "()V", "HEIGHT_MAXIMUM", "", "WEIGHT_MAXIMUM", "_age", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "_height", "_sex", "", "_weight", "activityChosen", "activityLevel", "Lcom/feedapp/app/data/models/user/UserActivityLevel;", "applied", "getApplied", "()Landroidx/lifecycle/MutableLiveData;", "goal", "Lcom/feedapp/app/data/models/user/UserGoal;", "getGoal", "sexChosen", "areHeightWeightInvalid", "text", "", "text1", "calculateCalories", "calculateCarbs", "calculateFats", "calculateProteins", "canUnblockButton", "length", "length1", "notEmpty", "chooseGoal", "", "createUser", "Lcom/feedapp/app/data/models/user/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setActivityChosen", "b", "setActivityLevel", "position", "setAgeValue", "toString", "setAppliedValue", "setHeightValue", "setWeightValue", "sexChosenValue", "sexValue", "valuesValid", "app_debug"})
public final class IntroductionRepository {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _sex = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.user.UserGoal> goal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _weight = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _height = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _age = null;
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.user.UserActivityLevel> activityLevel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> applied = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sexChosen = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> activityChosen = null;
    private final int HEIGHT_MAXIMUM = 230;
    private final int WEIGHT_MAXIMUM = 350;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.user.UserGoal> getGoal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getApplied() {
        return null;
    }
    
    private final int calculateCalories() {
        return 0;
    }
    
    public final boolean canUnblockButton(int length, int length1, boolean notEmpty) {
        return false;
    }
    
    public final void setActivityLevel(int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.feedapp.app.data.models.user.User> p0) {
        return null;
    }
    
    private final int calculateCarbs() {
        return 0;
    }
    
    private final int calculateFats() {
        return 0;
    }
    
    public final boolean areHeightWeightInvalid(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String text1) {
        return false;
    }
    
    private final boolean valuesValid() {
        return false;
    }
    
    private final int calculateProteins() {
        return 0;
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
    
    public final void setActivityChosen(boolean b) {
    }
    
    public final void sexChosenValue(boolean b) {
    }
    
    public final void sexValue(boolean b) {
    }
    
    @javax.inject.Inject()
    public IntroductionRepository() {
        super();
    }
}