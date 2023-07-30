package com.feedapp.app.di.modules.viewModelModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H!\u00a2\u0006\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/feedapp/app/di/modules/viewModelModules/HomeActivityVMModules;", "", "()V", "bindHomeViewModel", "Landroidx/lifecycle/ViewModel;", "homeViewModel", "Lcom/feedapp/app/viewModels/HomeViewModel;", "bindHomeViewModel$app_debug", "bindMyMealsViewModel", "myMealsViewModel", "Lcom/feedapp/app/viewModels/MyMealsViewModel;", "bindMyMealsViewModel$app_debug", "bindRecipeSearchViewModelModule", "recipeSearchViewModel", "Lcom/feedapp/app/viewModels/RecipeSearchViewModel;", "bindRecipeSearchViewModelModule$app_debug", "bindSettingsVM", "settingsViewModel", "Lcom/feedapp/app/viewModels/SettingsViewModel;", "bindSettingsVM$app_debug", "app_debug"})
@dagger.Module()
public abstract class HomeActivityVMModules {
    
    @org.jetbrains.annotations.NotNull()
    @com.feedapp.app.di.other.ViewModelKey(value = com.feedapp.app.viewModels.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHomeViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.HomeViewModel homeViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.feedapp.app.di.other.ViewModelKey(value = com.feedapp.app.viewModels.MyMealsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMyMealsViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.MyMealsViewModel myMealsViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.feedapp.app.di.other.ViewModelKey(value = com.feedapp.app.viewModels.RecipeSearchViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindRecipeSearchViewModelModule$app_debug(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.RecipeSearchViewModel recipeSearchViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.feedapp.app.di.other.ViewModelKey(value = com.feedapp.app.viewModels.SettingsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSettingsVM$app_debug(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.SettingsViewModel settingsViewModel);
    
    public HomeActivityVMModules() {
        super();
    }
}