package com.feedapp.app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/feedapp/app/ui/adapters/DayRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/feedapp/app/ui/viewholders/DayRecyclerViewHolder;", "meals", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/day/Meal;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getMeals", "()Ljava/util/ArrayList;", "titleColor", "", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "app_debug"})
public final class DayRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.feedapp.app.ui.viewholders.DayRecyclerViewHolder> {
    private final int titleColor = 0;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.feedapp.app.data.models.day.Meal> meals = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.ui.viewholders.DayRecyclerViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.ui.viewholders.DayRecyclerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.models.day.Meal> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.feedapp.app.data.models.day.Meal> getMeals() {
        return null;
    }
    
    public DayRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.feedapp.app.data.models.day.Meal> meals) {
        super();
    }
}