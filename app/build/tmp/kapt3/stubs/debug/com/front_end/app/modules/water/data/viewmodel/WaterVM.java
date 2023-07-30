package com.front_end.app.modules.water.data.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/front_end/app/modules/water/data/viewmodel/WaterVM;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "navArguments", "Landroid/os/Bundle;", "getNavArguments", "()Landroid/os/Bundle;", "setNavArguments", "(Landroid/os/Bundle;)V", "waterList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/front_end/app/modules/water/data/model/WaterRowModel;", "getWaterList", "()Landroidx/lifecycle/MutableLiveData;", "waterModel", "Lcom/front_end/app/modules/water/data/model/WaterModel;", "getWaterModel", "app_debug"})
public final class WaterVM extends androidx.lifecycle.ViewModel implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.front_end.app.modules.water.data.model.WaterModel> waterModel = null;
    @org.jetbrains.annotations.Nullable
    private android.os.Bundle navArguments;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.front_end.app.modules.water.data.model.WaterRowModel>> waterList = null;
    
    public WaterVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.front_end.app.modules.water.data.model.WaterModel> getWaterModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle getNavArguments() {
        return null;
    }
    
    public final void setNavArguments(@org.jetbrains.annotations.Nullable
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.front_end.app.modules.water.data.model.WaterRowModel>> getWaterList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.koin.core.Koin getKoin() {
        return null;
    }
}