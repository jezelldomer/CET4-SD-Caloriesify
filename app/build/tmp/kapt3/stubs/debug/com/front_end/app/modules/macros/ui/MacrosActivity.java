package com.front_end.app.modules.macros.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/front_end/app/modules/macros/ui/MacrosActivity;", "Lcom/front_end/app/appcomponents/base/BaseActivity;", "Lcom/front_end/app/databinding/ActivityMacrosBinding;", "()V", "REQUEST_CODE_OWN_ACTIVITY", "", "viewModel", "Lcom/front_end/app/modules/macros/data/viewmodel/MacrosVM;", "getViewModel", "()Lcom/front_end/app/modules/macros/data/viewmodel/MacrosVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onClickRecyclerMacros", "", "view", "Landroid/view/View;", "position", "item", "Lcom/front_end/app/modules/macros/data/model/MacrosRowModel;", "onClickRecyclerMacrosLinearColumn", "onClickRecyclerMacrosLinearColumnvolume", "onInitialized", "setUpClicks", "Companion", "app_debug"})
public final class MacrosActivity extends com.front_end.app.appcomponents.base.BaseActivity<com.front_end.app.databinding.ActivityMacrosBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final int REQUEST_CODE_OWN_ACTIVITY = 986;
    @org.jetbrains.annotations.NotNull
    public static final com.front_end.app.modules.macros.ui.MacrosActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "MACROS_ACTIVITY";
    
    public MacrosActivity() {
        super(0);
    }
    
    private final com.front_end.app.modules.macros.data.viewmodel.MacrosVM getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onInitialized() {
    }
    
    @java.lang.Override
    public void setUpClicks() {
    }
    
    public final void onClickRecyclerMacros(@org.jetbrains.annotations.NotNull
    android.view.View view, int position, @org.jetbrains.annotations.NotNull
    com.front_end.app.modules.macros.data.model.MacrosRowModel item) {
    }
    
    public final void onClickRecyclerMacrosLinearColumnvolume(@org.jetbrains.annotations.NotNull
    android.view.View view, int position, @org.jetbrains.annotations.NotNull
    com.front_end.app.modules.macros.data.model.MacrosRowModel item) {
    }
    
    public final void onClickRecyclerMacrosLinearColumn(@org.jetbrains.annotations.NotNull
    android.view.View view, int position, @org.jetbrains.annotations.NotNull
    com.front_end.app.modules.macros.data.model.MacrosRowModel item) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/front_end/app/modules/macros/ui/MacrosActivity$Companion;", "", "()V", "TAG", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.os.Bundle bundle) {
            return null;
        }
    }
}