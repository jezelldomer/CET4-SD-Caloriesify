package com.feedapp.app.ui.adapters;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/feedapp/app/ui/adapters/RecentProductsRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/feedapp/app/data/models/RecentProduct;", "Lcom/feedapp/app/ui/viewholders/RecentProductsViewHolder;", "context", "Landroid/content/Context;", "searchResult", "Lkotlin/Function2;", "", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "getContext", "()Landroid/content/Context;", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class RecentProductsRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.feedapp.app.data.models.RecentProduct, com.feedapp.app.ui.viewholders.RecentProductsViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent intent = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> searchResult = null;
    private static final int defaultColor = 0;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.feedapp.app.data.models.RecentProduct> DIFF_CALLBACK = null;
    public static final com.feedapp.app.ui.adapters.RecentProductsRecyclerAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getIntent() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.viewholders.RecentProductsViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.ui.viewholders.RecentProductsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public RecentProductsRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> searchResult) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/feedapp/app/ui/adapters/RecentProductsRecyclerAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/feedapp/app/data/models/RecentProduct;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "defaultColor", "", "getDefaultColor", "()I", "app_debug"})
    public static final class Companion {
        
        public final int getDefaultColor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.feedapp.app.data.models.RecentProduct> getDIFF_CALLBACK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}