package com.feedapp.app.ui.viewclasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0014J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/feedapp/app/ui/viewclasses/WaterContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "waterModifier", "Lcom/feedapp/app/ui/viewclasses/WaterModifier;", "getWaterModifier", "()Lcom/feedapp/app/ui/viewclasses/WaterModifier;", "setWaterModifier", "(Lcom/feedapp/app/ui/viewclasses/WaterModifier;)V", "checkPrecedingViews", "", "i", "", "fill", "", "fillWaterGlassViews", "waterNum", "getCurrentFullWaterGlasses", "markPrecedingViews", "lottieWaterView", "Lcom/feedapp/app/ui/viewclasses/LottieWaterView;", "onAttachedToWindow", "setViewListeners", "app_debug"})
public final class WaterContainer extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private com.feedapp.app.ui.viewclasses.WaterModifier waterModifier;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.feedapp.app.ui.viewclasses.WaterModifier getWaterModifier() {
        return null;
    }
    
    public final void setWaterModifier(@org.jetbrains.annotations.Nullable()
    com.feedapp.app.ui.viewclasses.WaterModifier p0) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    private final void setViewListeners() {
    }
    
    /**
     * find current view's index in [WaterContainer]
     */
    private final void markPrecedingViews(com.feedapp.app.ui.viewclasses.LottieWaterView lottieWaterView, boolean fill) {
    }
    
    /**
     * iterates through all views and fills preceding views or resets following views
     */
    private final void checkPrecedingViews(int i, boolean fill) {
    }
    
    /**
     * return number of "empty" views ([LottieWaterView])
     */
    private final int getCurrentFullWaterGlasses() {
        return 0;
    }
    
    /**
     * "fills" views til specific number, other resets
     */
    public final void fillWaterGlassViews(int waterNum) {
    }
    
    public WaterContainer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
}