package com.feedapp.app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/feedapp/app/ui/adapters/FoodProductRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/feedapp/app/data/models/localdb/IProduct;", "Lcom/feedapp/app/ui/viewholders/MealViewHolder;", "context", "Landroid/content/Context;", "searchResult", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "colorList", "", "", "getColorList", "()Ljava/util/List;", "setColorList", "(Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class FoodProductRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.feedapp.app.data.models.localdb.IProduct, com.feedapp.app.ui.viewholders.MealViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> colorList;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<com.feedapp.app.data.models.localdb.IProduct, kotlin.Unit> searchResult = null;
    private static final int defaultColor = 0;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.feedapp.app.data.models.localdb.IProduct> DIFF_CALLBACK = null;
    public static final com.feedapp.app.ui.adapters.FoodProductRecyclerAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getColorList() {
        return null;
    }
    
    public final void setColorList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.viewholders.MealViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.ui.viewholders.MealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public FoodProductRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.feedapp.app.data.models.localdb.IProduct, kotlin.Unit> searchResult) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/feedapp/app/ui/adapters/FoodProductRecyclerAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/feedapp/app/data/models/localdb/IProduct;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "defaultColor", "", "getDefaultColor", "()I", "app_debug"})
    public static final class Companion {
        
        public final int getDefaultColor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.feedapp.app.data.models.localdb.IProduct> getDIFF_CALLBACK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}