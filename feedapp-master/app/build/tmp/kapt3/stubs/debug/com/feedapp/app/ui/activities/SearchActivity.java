package com.feedapp.app.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010&\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\"\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020#H\u0016J\u0012\u0010.\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\bH\u0002J\b\u00104\u001a\u00020#H\u0014J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\bH\u0002J\b\u00107\u001a\u00020#H\u0002J\b\u00108\u001a\u00020#H\u0002J\b\u00109\u001a\u00020#H\u0002J\b\u0010:\u001a\u00020#H\u0002J\b\u0010;\u001a\u00020#H\u0002J\b\u0010<\u001a\u00020#H\u0002J\u0010\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006B"}, d2 = {"Lcom/feedapp/app/ui/activities/SearchActivity;", "Lcom/feedapp/app/ui/activities/ClassicActivity;", "()V", "binding", "Lcom/feedapp/app/databinding/ActivitySearchBinding;", "dateString", "Lcom/feedapp/app/data/models/day/DayDate;", "localeSearch", "", "mealTypeCode", "", "Ljava/lang/Integer;", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "offlineAdapter", "Lcom/feedapp/app/ui/adapters/FoodProductRecyclerAdapter;", "recentAdapter", "Lcom/feedapp/app/ui/adapters/RecentProductsRecyclerAdapter;", "spHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "getSpHelper", "()Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "setSpHelper", "(Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;)V", "viewModel", "Lcom/feedapp/app/viewModels/SearchViewModel;", "getViewModel", "()Lcom/feedapp/app/viewModels/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configureSearchDB", "", "getSearchSuggestions", "", "s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRecentItemClicked", "id", "name", "onResume", "searchByQuery", "q", "setAdapters", "setBindingListeners", "setSearchBar", "setUpListeners", "setUpView", "setViews", "startDetailedActivity", "food", "Lcom/feedapp/app/data/models/localdb/IProduct;", "subscribeObservers", "Companion", "app_debug"})
public final class SearchActivity extends com.feedapp.app.ui.activities.ClassicActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper;
    private java.lang.String localeSearch;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.feedapp.app.databinding.ActivitySearchBinding binding;
    private com.feedapp.app.ui.adapters.RecentProductsRecyclerAdapter recentAdapter;
    private com.feedapp.app.ui.adapters.FoodProductRecyclerAdapter offlineAdapter;
    private com.feedapp.app.data.models.day.DayDate dateString;
    private java.lang.Integer mealTypeCode;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SP_KEY_LOCALE_SEARCH = "localeSearch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SP_KEY_LOCALE_ASK = "askToDownload";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRAS_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRAS_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRAS_PRODUCT = "product";
    public static final com.feedapp.app.ui.activities.SearchActivity.Companion Companion = null;
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
    
    private final com.feedapp.app.viewModels.SearchViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Checks if db for current locale is needed to be set and does it
     */
    private final void configureSearchDB() {
    }
    
    private final void setUpView() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setViews() {
    }
    
    private final void setSearchBar() {
    }
    
    private final void setAdapters() {
    }
    
    private final void setBindingListeners() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void subscribeObservers() {
    }
    
    private final void searchByQuery(java.lang.String q) {
    }
    
    private final void startDetailedActivity(com.feedapp.app.data.models.localdb.IProduct food) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void onRecentItemClicked(int id, java.lang.String name) {
    }
    
    @javax.inject.Inject()
    public SearchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/feedapp/app/ui/activities/SearchActivity$Companion;", "", "()V", "INTENT_EXTRAS_ID", "", "INTENT_EXTRAS_PRODUCT", "INTENT_EXTRAS_TITLE", "SP_KEY_LOCALE_ASK", "SP_KEY_LOCALE_SEARCH", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}