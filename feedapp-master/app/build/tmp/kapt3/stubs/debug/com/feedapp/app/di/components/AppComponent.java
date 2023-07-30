package com.feedapp.app.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/feedapp/app/di/components/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/feedapp/app/AppDelegate;", "Builder", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.feedapp.app.di.modules.ActivitiesBuilderModule.class, com.feedapp.app.di.modules.AppModule.class, com.feedapp.app.di.modules.ViewModelFactoryModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.feedapp.app.AppDelegate> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/feedapp/app/di/components/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/feedapp/app/di/components/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.feedapp.app.di.components.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.feedapp.app.di.components.AppComponent build();
    }
}