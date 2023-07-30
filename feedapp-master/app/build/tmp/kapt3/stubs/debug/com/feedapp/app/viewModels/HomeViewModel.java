package com.feedapp.app.viewModels;

import java.lang.System;

/**
 * ViewModel is shared by HomeActivity, HomeFragment, HomeDownFragment, HomeUpFragment and
 * DayFragment
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020\u001bJ\u0006\u0010.\u001a\u00020\u001bJ\u0006\u0010/\u001a\u00020 J\u0006\u00100\u001a\u00020\u001bJ\u000e\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0015J\u0017\u00103\u001a\u00020 2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u00105R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u001b0\u001b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/feedapp/app/viewModels/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "dayRepository", "Lcom/feedapp/app/data/repositories/DayRepository;", "userRepository", "Lcom/feedapp/app/data/repositories/UserRepository;", "spHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "(Lcom/feedapp/app/data/repositories/DayRepository;Lcom/feedapp/app/data/repositories/UserRepository;Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;)V", "currentBottomPosition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/feedapp/app/data/models/FragmentNavigationType;", "kotlin.jvm.PlatformType", "getCurrentBottomPosition", "()Landroidx/lifecycle/MutableLiveData;", "currentDay", "Landroidx/lifecycle/LiveData;", "Lcom/feedapp/app/data/models/day/Day;", "getCurrentDay", "()Landroidx/lifecycle/LiveData;", "currentPosition", "", "getCurrentPosition", "dayData", "Lkotlinx/coroutines/Job;", "getDayData", "isResettingDateOrSwiping", "", "user", "Lcom/feedapp/app/data/models/user/User;", "getUser", "userData", "", "getUserData", "userLeftValues", "Lcom/feedapp/app/data/models/user/UserLeftValues;", "getUserLeftValues", "downloadLocalDB", "filePath", "", "code", "result", "Lcom/feedapp/app/data/interfaces/BasicOperationCallback;", "getDateText", "", "introShowed", "isHomeGuideShowed", "resetDate", "saveHomeUiGuideShowed", "setWater", "i", "updateDayAndDate", "position", "(Ljava/lang/Integer;)V", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isResettingDateOrSwiping = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.day.Day> currentDay = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.FragmentNavigationType> currentBottomPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> currentPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> user = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserLeftValues> userLeftValues = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Unit> userData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlinx.coroutines.Job> dayData = null;
    private final com.feedapp.app.data.repositories.DayRepository dayRepository = null;
    private final com.feedapp.app.data.repositories.UserRepository userRepository = null;
    private final com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isResettingDateOrSwiping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.day.Day> getCurrentDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.feedapp.app.data.models.FragmentNavigationType> getCurrentBottomPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCurrentPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserLeftValues> getUserLeftValues() {
        return null;
    }
    
    public final boolean introShowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlinx.coroutines.Job> getDayData() {
        return null;
    }
    
    public final void updateDayAndDate(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    public final void resetDate() {
    }
    
    public final boolean saveHomeUiGuideShowed() {
        return false;
    }
    
    public final boolean isHomeGuideShowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence getDateText() {
        return null;
    }
    
    public final void setWater(int i) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job downloadLocalDB(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.interfaces.BasicOperationCallback result) {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.DayRepository dayRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper) {
        super();
    }
}