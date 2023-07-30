package com.feedapp.app.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/feedapp/app/di/modules/ActivitiesBuilderModule;", "", "()V", "contributeAboutActivity", "Lcom/feedapp/app/ui/activities/AboutActivity;", "contributeAddProductActivity", "Lcom/feedapp/app/ui/activities/AddCustomProductActivity;", "contributeDetailedFoodActivity", "Lcom/feedapp/app/ui/activities/DetailedFoodActivity;", "contributeHomeActivity", "Lcom/feedapp/app/ui/activities/HomeActivity;", "contributeIntroActivity", "Lcom/feedapp/app/ui/activities/IntroductionActivity;", "contributeMyMealsSearchActivity", "Lcom/feedapp/app/ui/activities/MyMealsSearchActivity;", "contributeRecipeDetailedActivity", "Lcom/feedapp/app/ui/activities/DetailedRecipeActivity;", "contributeRecipeHistoryActivity", "Lcom/feedapp/app/ui/activities/StatisticsActivity;", "contributeSearchActivity", "Lcom/feedapp/app/ui/activities/SearchActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivitiesBuilderModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.AddCustomProductVMModule.class})
    public abstract com.feedapp.app.ui.activities.AddCustomProductActivity contributeAddProductActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.HomeFragmentBuildersModule.class, com.feedapp.app.di.modules.viewModelModules.HomeActivityVMModules.class})
    public abstract com.feedapp.app.ui.activities.HomeActivity contributeHomeActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.SearchViewModelModule.class, com.feedapp.app.di.modules.ProductSearchModule.class})
    public abstract com.feedapp.app.ui.activities.SearchActivity contributeSearchActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.IntroVMModule.class})
    public abstract com.feedapp.app.ui.activities.IntroductionActivity contributeIntroActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.DetailedViewModelModule.class, com.feedapp.app.di.modules.ProductSearchModule.class})
    public abstract com.feedapp.app.ui.activities.DetailedFoodActivity contributeDetailedFoodActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.MyMealsSearchViewModelModule.class})
    public abstract com.feedapp.app.ui.activities.MyMealsSearchActivity contributeMyMealsSearchActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.DetailedRecipeVMModule.class})
    public abstract com.feedapp.app.ui.activities.DetailedRecipeActivity contributeRecipeDetailedActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.feedapp.app.di.modules.viewModelModules.StatisticsViewModelModule.class, com.feedapp.app.di.modules.StatisticsFragmentModule.class})
    public abstract com.feedapp.app.ui.activities.StatisticsActivity contributeRecipeHistoryActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.feedapp.app.ui.activities.AboutActivity contributeAboutActivity();
    
    public ActivitiesBuilderModule() {
        super();
    }
}