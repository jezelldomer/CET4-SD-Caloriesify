package com.feedapp.app.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\"\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020 H\u0016J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020 H\u0002J \u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020#H\u0002J\b\u00107\u001a\u00020 H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006<"}, d2 = {"Lcom/feedapp/app/ui/activities/HomeActivity;", "Lcom/feedapp/app/ui/activities/ClassicActivity;", "()V", "binding", "Lcom/feedapp/app/databinding/ActivityHomeBinding;", "doubleBackToExitPressedOnce", "", "fabListener", "Lcom/leinardi/android/speeddial/SpeedDialView$OnActionSelectedListener;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "navController", "Landroidx/navigation/NavController;", "spHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "getSpHelper", "()Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "setSpHelper", "(Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;)V", "viewModel", "Lcom/feedapp/app/viewModels/HomeViewModel;", "getViewModel", "()Lcom/feedapp/app/viewModels/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkHomeUiGuide", "", "checkLocalDatabase", "getCountry", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setAddMealFab", "setNavView", "setViewListeners", "setViewModelObservers", "showDownloadDialog", "listener", "Landroid/content/DialogInterface$OnClickListener;", "countryDisplayName", "code", "startIntroduction", "updateBottomPosition", "type", "Lcom/feedapp/app/data/models/FragmentNavigationType;", "Companion", "app_debug"})
public final class HomeActivity extends com.feedapp.app.ui.activities.ClassicActivity {
    private com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.feedapp.app.databinding.ActivityHomeBinding binding;
    private androidx.navigation.NavController navController;
    private boolean doubleBackToExitPressedOnce;
    
    /**
     * Listener for Add Product Fab
     */
    private final com.leinardi.android.speeddial.SpeedDialView.OnActionSelectedListener fabListener = null;
    public static final int REQUEST_CODE_ADD_MEAL = 100;
    public static final int RESULT_CODE_SEARCH_IN_RECIPES = 101;
    public static final int RESULT_CODE_UPDATE_DAY = 102;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRAS_UPDATE_DAY = "updateDay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRAS_RECIPES_QUERY = "recipesName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRAS_DATE = "Day";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRAS_MEAL_TYPE = "MealType";
    public static final com.feedapp.app.ui.activities.HomeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.prefs.SharedPrefsHelper getSpHelper() {
        return null;
    }
    
    public final void setSpHelper(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.prefs.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.feedapp.app.viewModels.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Checks if database for current locale is available to download and downloads it
     */
    private final void checkLocalDatabase() {
    }
    
    private final java.lang.String getCountry() {
        return null;
    }
    
    /**
     * show dialog to user if he wants to download database on his local language
     */
    private final void showDownloadDialog(android.content.DialogInterface.OnClickListener listener, java.lang.String countryDisplayName, java.lang.String code) {
    }
    
    /**
     * Check if introduction screen for Add button showed
     */
    private final void checkHomeUiGuide() {
    }
    
    private final void startIntroduction() {
    }
    
    private final void setNavView() {
    }
    
    private final void setViewListeners() {
    }
    
    private final void setAddMealFab() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setViewModelObservers() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void updateBottomPosition(com.feedapp.app.data.models.FragmentNavigationType type) {
    }
    
    public HomeActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/feedapp/app/ui/activities/HomeActivity$Companion;", "", "()V", "EXTRAS_RECIPES_QUERY", "", "EXTRAS_UPDATE_DAY", "INTENT_EXTRAS_DATE", "INTENT_EXTRAS_MEAL_TYPE", "REQUEST_CODE_ADD_MEAL", "", "RESULT_CODE_SEARCH_IN_RECIPES", "RESULT_CODE_UPDATE_DAY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}