package com.feedapp.app.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J*\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/feedapp/app/util/BindingAdapters;", "", "()V", "kcalLeftOrOver", "", "view", "Landroid/widget/TextView;", "over", "", "nutrientLeftOrOver", "triple", "Lkotlin/Triple;", "", "valueG", "amount", "", "multiplier", "", "valueK", "visibleIf", "Landroid/view/View;", "boolean", "(Landroid/view/View;Ljava/lang/Boolean;)V", "water", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "app_debug"})
public final class BindingAdapters {
    public static final com.feedapp.app.util.BindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"visibleIf"})
    public static final void visibleIf(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean p1_32355860) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"waterSign"})
    public static final void water(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.Integer amount) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"valueG", "multiplier"})
    public static final void valueG(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, float amount, double multiplier) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"valueK", "multiplier"})
    public static final void valueK(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, float amount, double multiplier) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"kcalLeftOrOver"})
    public static final void kcalLeftOrOver(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, boolean over) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"nutrientLeftOrOver"})
    public static final void nutrientLeftOrOver(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    kotlin.Triple<java.lang.Integer, java.lang.Boolean, java.lang.Integer> triple) {
    }
    
    private BindingAdapters() {
        super();
    }
}