package com.feedapp.app.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\"\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/feedapp/app/ui/activities/IntroductionActivity;", "Lcom/github/paolorotolo/appintro/AppIntro;", "()V", "RC_SIGN_IN", "", "introViewModel", "Lcom/feedapp/app/viewModels/IntroductionViewModel;", "getIntroViewModel", "()Lcom/feedapp/app/viewModels/IntroductionViewModel;", "introViewModel$delegate", "Lkotlin/Lazy;", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "checkIfUserExists", "Lkotlinx/coroutines/Job;", "checkUser", "", "handleLoginBackButton", "logIn", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setIntroSettings", "setObservers", "setStatusBar", "app_debug"})
public final class IntroductionActivity extends com.github.paolorotolo.appintro.AppIntro {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    private final kotlin.Lazy introViewModel$delegate = null;
    private final int RC_SIGN_IN = 103;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.feedapp.app.viewModels.IntroductionViewModel getIntroViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void logIn() {
    }
    
    private final void setStatusBar() {
    }
    
    private final void setIntroSettings() {
    }
    
    private final void setObservers() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * Checking if user exists in firebase database
     * if so, skip introduction and open HomeActivity
     */
    private final void checkUser() {
    }
    
    private final kotlinx.coroutines.Job checkIfUserExists() {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void handleLoginBackButton() {
    }
    
    public IntroductionActivity() {
        super();
    }
}