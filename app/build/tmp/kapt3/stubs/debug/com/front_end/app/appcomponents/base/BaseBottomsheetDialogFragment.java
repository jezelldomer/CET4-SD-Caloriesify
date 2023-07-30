package com.front_end.app.appcomponents.base;

import java.lang.System;

/**
 * Base class for bottom sheet dialogs that using databind feature to bind the view
 * also Implements [BaseControllerFunctionsImpl] interface
 * @param T A class that extends [ViewDataBinding] that will be used by the dialog layout binding view.
 * @param layoutId the resource layout view going to bind with the [binding] variable
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001c\u0010\b\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/front_end/app/appcomponents/base/BaseBottomsheetDialogFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/front_end/app/appcomponents/base/BaseControllerFunctionsImpl;", "layoutId", "", "(I)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getLayoutId", "()I", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public abstract class BaseBottomsheetDialogFragment<T extends androidx.databinding.ViewDataBinding> extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.front_end.app.appcomponents.base.BaseControllerFunctionsImpl {
    private final int layoutId = 0;
    public T binding;
    
    public BaseBottomsheetDialogFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    public final int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final T getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * All observer listener code will be handled in this method inside controllers.
     */
    public void addObservers() {
    }
    
    /**
     * All initialization related work will be done in this method.
     * i.e. Handling lifecycle methods.
     */
    public void onInitialized() {
    }
}