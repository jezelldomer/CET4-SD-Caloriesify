package com.feedapp.app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/feedapp/app/ui/adapters/StatisticsDayProductsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/feedapp/app/ui/viewholders/StatisticsDayViewHolder;", "products", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/Product;", "Lkotlin/collections/ArrayList;", "deleter", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getProducts", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "app_debug"})
public final class StatisticsDayProductsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.feedapp.app.ui.viewholders.StatisticsDayViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.feedapp.app.data.models.Product> products = null;
    private final kotlin.jvm.functions.Function1<com.feedapp.app.data.models.Product, kotlin.Unit> deleter = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.viewholders.StatisticsDayViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.ui.viewholders.StatisticsDayViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.models.Product> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.models.Product> getProducts() {
        return null;
    }
    
    public StatisticsDayProductsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.models.Product> products, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.feedapp.app.data.models.Product, kotlin.Unit> deleter) {
        super();
    }
}