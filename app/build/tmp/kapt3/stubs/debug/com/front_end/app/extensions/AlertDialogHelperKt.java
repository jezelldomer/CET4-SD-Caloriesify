package com.front_end.app.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u001a9\u0010\n\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u0007\u001a9\u0010\u0011\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u0007\u001a9\u0010\u0012\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u0007\u00a8\u0006\u0013"}, d2 = {"alert", "", "Landroid/content/Context;", "title", "", "message", "dialogBuilder", "Lkotlin/Function1;", "Landroid/app/AlertDialog$Builder;", "Lkotlin/ExtensionFunctionType;", "negativeButton", "text", "handleClick", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialogInterface", "neutralButton", "positiveButton", "app_debug"})
public final class AlertDialogHelperKt {
    
    /**
     * Context extension method used to create the alert dialog
     * @param title the string value for dialog title.
     * @param message the string value for dialog message.
     * @param dialogBuilder the builder callback used to build dialog with passed arguments and style.
     */
    public static final void alert(@org.jetbrains.annotations.NotNull
    android.content.Context $this$alert, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.app.AlertDialog.Builder, kotlin.Unit> dialogBuilder) {
    }
    
    /**
     * AlertDialog.Builder extension method which handle the negative button click of the dialog
     * @param text the string value for negative button.
     * @param handleClick the callback for dialog click.
     */
    public static final void negativeButton(@org.jetbrains.annotations.NotNull
    android.app.AlertDialog.Builder $this$negativeButton, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.DialogInterface, kotlin.Unit> handleClick) {
    }
    
    /**
     * AlertDialog.Builder extension method which handle the positive button click of the dialog
     * @param text the string value for positive button.
     * @param handleClick the callback for dialog click.
     */
    public static final void positiveButton(@org.jetbrains.annotations.NotNull
    android.app.AlertDialog.Builder $this$positiveButton, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.DialogInterface, kotlin.Unit> handleClick) {
    }
    
    /**
     * AlertDialog.Builder extension method which handle the neutral button click of the dialog
     * @param text the string value for neutral button.
     * @param handleClick the callback for dialog click.
     */
    public static final void neutralButton(@org.jetbrains.annotations.NotNull
    android.app.AlertDialog.Builder $this$neutralButton, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.DialogInterface, kotlin.Unit> handleClick) {
    }
}