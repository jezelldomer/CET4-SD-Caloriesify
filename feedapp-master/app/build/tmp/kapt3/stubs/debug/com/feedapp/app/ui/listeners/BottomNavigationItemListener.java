package com.feedapp.app.ui.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/feedapp/app/ui/listeners/BottomNavigationItemListener;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "navController", "Landroidx/navigation/NavController;", "bottomNavigation", "Lkotlin/Function1;", "Lcom/feedapp/app/data/models/FragmentNavigationType;", "", "(Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;)V", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class BottomNavigationItemListener implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {
    private final androidx.navigation.NavController navController = null;
    private final kotlin.jvm.functions.Function1<com.feedapp.app.data.models.FragmentNavigationType, kotlin.Unit> bottomNavigation = null;
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public BottomNavigationItemListener(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.feedapp.app.data.models.FragmentNavigationType, kotlin.Unit> bottomNavigation) {
        super();
    }
}