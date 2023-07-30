package com.feedapp.app.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\"\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u0016H\u0002J\b\u0010.\u001a\u00020\u0016H\u0002J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u000201H\u0003J\b\u00102\u001a\u00020\u0016H\u0002J\u0010\u00103\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020\u0016H\u0002J\b\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020\u0016H\u0002J\b\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/feedapp/app/ui/fragments/home/Settings;", "Ldagger/android/support/DaggerFragment;", "()V", "RC_SIGN_IN", "", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onDeletionSuccessListener", "Lcom/feedapp/app/data/interfaces/UserDeleteCallback;", "spHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "getSpHelper", "()Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "setSpHelper", "(Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;)V", "viewModel", "Lcom/feedapp/app/viewModels/SettingsViewModel;", "checkDatabase", "", "getCountry", "", "getLocalDBPath", "Ljava/io/File;", "fa", "Landroidx/fragment/app/FragmentActivity;", "code", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setObservers", "setViewListeners", "showAmountDialog", "nutrient", "Lcom/feedapp/app/data/models/BasicNutrientType;", "showCautionDialog", "showDatabaseDialog", "showDeleteDialog", "showDietDialog", "showIntoleranceDialog", "showMeasureDialog", "startAboutActivity", "toastFail", "toastSuccess", "app_debug"})
public final class Settings extends dagger.android.support.DaggerFragment {
    private final int RC_SIGN_IN = 103;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private com.feedapp.app.viewModels.SettingsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.data.models.prefs.SharedPrefsHelper spHelper;
    private final com.feedapp.app.data.interfaces.UserDeleteCallback onDeletionSuccessListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.prefs.SharedPrefsHelper getSpHelper() {
        return null;
    }
    
    public final void setSpHelper(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.prefs.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setObservers() {
    }
    
    private final void setViewListeners() {
    }
    
    private final void checkDatabase() {
    }
    
    private final java.lang.String getCountry() {
        return null;
    }
    
    private final void showDatabaseDialog(java.lang.String code) {
    }
    
    private final java.io.File getLocalDBPath(androidx.fragment.app.FragmentActivity fa, java.lang.String code) {
        return null;
    }
    
    private final void startAboutActivity() {
    }
    
    private final void showDeleteDialog() {
    }
    
    private final void showCautionDialog() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void showIntoleranceDialog() {
    }
    
    private final void showDietDialog() {
    }
    
    private final void showMeasureDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    private final void showAmountDialog(com.feedapp.app.data.models.BasicNutrientType nutrient) {
    }
    
    private final void toastSuccess() {
    }
    
    private final void toastFail() {
    }
    
    public Settings() {
        super();
    }
}