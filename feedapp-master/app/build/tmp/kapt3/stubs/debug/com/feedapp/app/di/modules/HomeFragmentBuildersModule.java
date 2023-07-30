package com.feedapp.app.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/feedapp/app/di/modules/HomeFragmentBuildersModule;", "", "()V", "contributeDayFragment", "Lcom/feedapp/app/ui/fragments/home/DayFragment;", "contributeHomeDownFragment", "Lcom/feedapp/app/ui/fragments/home/HomeDownFragment;", "contributeHomeFragment", "Lcom/feedapp/app/ui/fragments/home/HomeFragment;", "contributeHomeUpFragment", "Lcom/feedapp/app/ui/fragments/home/HomeUpFragment;", "contributeMyMealsFragment", "Lcom/feedapp/app/ui/fragments/home/MyMealsFragment;", "contributeRecipeSearchFragment", "Lcom/feedapp/app/ui/fragments/home/RecipesFragment;", "contributeSettingsFragment", "Lcom/feedapp/app/ui/fragments/home/Settings;", "app_debug"})
@dagger.Module()
public abstract class HomeFragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.HomeFragment contributeHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.HomeUpFragment contributeHomeUpFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.HomeDownFragment contributeHomeDownFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.DayFragment contributeDayFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.MyMealsFragment contributeMyMealsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.RecipesFragment contributeRecipeSearchFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.fragments.home.Settings contributeSettingsFragment();
    
    public HomeFragmentBuildersModule() {
        super();
    }
}