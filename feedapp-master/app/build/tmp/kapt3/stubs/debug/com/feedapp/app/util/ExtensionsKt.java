package com.feedapp.app.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\n2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u001a\n\u0010\f\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b\u001a\n\u0010\u0010\u001a\u00020\u0004*\u00020\b\u001a2\u0010\u0011\u001a\u00020\u000e\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u0013*\u00020\n2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u000e0\u0015\u00a2\u0006\u0002\b\u0016H\u0086\b\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0007\u001a?\u0010\u0019\u001a\u00020\u000e*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u001e\u001aH\u0010\u001f\u001a\u00020\u000e*\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010&\u001a\n\u0010(\u001a\u00020\u0001*\u00020\u0005\u001a\u0012\u0010)\u001a\u00020\u000e*\u00020\b2\u0006\u0010\"\u001a\u00020\u0005\u001a\u0012\u0010*\u001a\u00020\u000e*\u00020\b2\u0006\u0010\"\u001a\u00020\u0005\u00a8\u0006+"}, d2 = {"caloriesToEnergy", "", "calories", "containsNumbers", "", "", "dpToPx", "", "Landroid/content/Context;", "dp", "Landroid/view/View;", "context", "getValidLetter", "hideKeyboard", "", "Landroid/app/Activity;", "isConnected", "layoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "round", "decimals", "setMargins", "leftMarginDp", "topMarginDp", "rightMarginDp", "bottomMarginDp", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "showDialog", "view", "title", "message", "positiveText", "negativeText", "okListener", "Landroid/content/DialogInterface$OnClickListener;", "cancelListener", "toFloatOrZero", "toast", "toastLong", "app_debug"})
public final class ExtensionsKt {
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void toastLong(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toastLong, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showDialog, @org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, int positiveText, int negativeText, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener okListener, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnClickListener cancelListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getValidLetter(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$getValidLetter) {
        return null;
    }
    
    public static final float caloriesToEnergy(float calories) {
        return 0.0F;
    }
    
    public static final boolean containsNumbers(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$containsNumbers) {
        return false;
    }
    
    public static final float toFloatOrZero(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toFloatOrZero) {
        return 0.0F;
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard) {
    }
    
    public static final int dpToPx(@org.jetbrains.annotations.NotNull()
    android.view.View $this$dpToPx, float dp) {
        return 0;
    }
    
    public static final int dpToPx(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dpToPx, float dp) {
        return 0;
    }
    
    public static final boolean isConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isConnected) {
        return false;
    }
    
    public static final void setMargins(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setMargins, @org.jetbrains.annotations.Nullable()
    java.lang.Integer leftMarginDp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer topMarginDp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rightMarginDp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bottomMarginDp) {
    }
    
    public static final int dpToPx(int $this$dpToPx, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return 0;
    }
    
    public static final float round(float $this$round, int decimals) {
        return 0.0F;
    }
}