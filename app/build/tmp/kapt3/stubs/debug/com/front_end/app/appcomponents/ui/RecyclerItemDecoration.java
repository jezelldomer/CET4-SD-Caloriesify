package com.front_end.app.appcomponents.ui;

import java.lang.System;

/**
 * The class used to provide spacing in recycler view,
 * @param spacing to provide space between list items.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J*\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002R\u0014\u0010\u0007\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/front_end/app/appcomponents/ui/RecyclerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacing", "", "includeEdge", "", "(IZ)V", "GRID", "getGRID", "()I", "HORIZONTAL", "getHORIZONTAL", "STAGGERED_GRID", "getSTAGGERED_GRID", "VERTICAL", "getVERTICAL", "displayMode", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "resolveDisplayMode", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setSpacingForDirection", "position", "itemCount", "app_debug"})
public final class RecyclerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private int spacing = 0;
    private boolean includeEdge = false;
    private int displayMode = -1;
    private final int HORIZONTAL = 0;
    private final int VERTICAL = 1;
    private final int GRID = 2;
    private final int STAGGERED_GRID = 3;
    
    public RecyclerItemDecoration(int spacing, boolean includeEdge) {
        super();
    }
    
    public final int getHORIZONTAL() {
        return 0;
    }
    
    public final int getVERTICAL() {
        return 0;
    }
    
    public final int getGRID() {
        return 0;
    }
    
    public final int getSTAGGERED_GRID() {
        return 0;
    }
    
    /**
     * the override method which used to manage item offsets,
     * here we are handling space between items.
     *
     * @param outRect the Rect object of cell item boundary.
     * @param view  the view of cell item.
     * @param parent  the recycler view.
     * @param state  the State object of recycler view which holds information of recycler view.
     */
    @java.lang.Override
    public void getItemOffsets(@org.jetbrains.annotations.NotNull
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    /**
     * the method is used to handle spacing between list items,
     * which changes the rectangle offsets based on spacing where the rectangle is boundary of cell item.
     *
     * @param outRect the Rect object of cell item boundary.
     * @param layoutManager the layout manager of recycler view.
     * @param position the current index of item.
     * @param itemCount the number of list items.
     */
    private final void setSpacingForDirection(android.graphics.Rect outRect, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int position, int itemCount) {
    }
    
    /**
     * the method is used to get proper display mode of recycler view
     * @param layoutManager is the layout manager object which used to identify the orientation and recycler view type
     * @return the Int value of display type
     */
    private final int resolveDisplayMode(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return 0;
    }
}