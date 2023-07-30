package com.front_end.app.appcomponents.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a>\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0007\u001a*\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0007\u001a\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0007\u001a \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"IMAGE_BASE_URL", "", "addSpaceBetweenRecyclerItem", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemSpace", "", "includeEdge", "", "loadImageFromNetwork", "imageView", "Landroid/widget/ImageView;", "url", "placeHolder", "Landroid/graphics/drawable/Drawable;", "placeHolderError", "cornerRadius", "", "circular", "loadImageFromResource", "imageRes", "setTextUnderline", "textView", "Landroid/widget/TextView;", "isTextUnderline", "setVisibility", "view", "Landroid/view/View;", "isVisible", "isInvisible", "app_debug"})
public final class CustomBindingAdapterKt {
    
    /**
     * to load url based image assign base url of image.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IMAGE_BASE_URL = "";
    
    /**
     * method which manages the visibility of views
     *
     * @param view the view which going to used for visibility.
     * @param isVisible passed from viewVisibility which make view visible or gone.
     * @param isInvisible passed from isInvisible which make view invisible once viewVisibility is false.
     */
    @androidx.databinding.BindingAdapter(value = {"viewVisibility", "isInvisible"}, requireAll = false)
    public static final void setVisibility(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean isVisible, boolean isInvisible) {
    }
    
    /**
     * method which loads images into imageView
     *
     * @param imageView the image view which used to present image.
     * @param url the string path to load image from file/internet/resource path.
     * @param placeHolder the Drawable used when image which used to present default image before image loads.
     * @param placeHolderError the Drawable used when found any error to loading the image we are going to uses passed image.
     * @param cornerRadius Float type value which used to curve the rectangle as much as passed value.
     */
    @androidx.databinding.BindingAdapter(value = {"imageUrl", "placeHolder", "placeHolderError", "cornerRadius", "circular"}, requireAll = false)
    public static final void loadImageFromNetwork(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable placeHolder, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable placeHolderError, float cornerRadius, boolean circular) {
    }
    
    /**
     * method which loads images into imageView
     *
     * @param imageView the image view which used to present image.
     * @param imageRes the Drawable used to render the image.
     * @param cornerRadius Float type value which used to curve the rectangle as much as passed value.
     * @param circular the Boolean which used to identify the image is circle or not.
     */
    @androidx.databinding.BindingAdapter(value = {"imageRes", "cornerRadius", "circular"}, requireAll = false)
    public static final void loadImageFromResource(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable imageRes, float cornerRadius, boolean circular) {
    }
    
    /**
     * method which adds spacing into recycler view
     *
     * @param recyclerView the recycler list view
     * @param itemSpace the double value to providing space between items
     */
    @androidx.databinding.BindingAdapter(value = {"itemSpace", "includeEdge"}, requireAll = false)
    public static final void addSpaceBetweenRecyclerItem(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, double itemSpace, boolean includeEdge) {
    }
    
    /**
     * method which set underline into TextView
     * @param textView the Text view
     * @param isTextUnderline passed from textUnderline which set underline or not.
     */
    @androidx.databinding.BindingAdapter(value = {"textUnderline"}, requireAll = false)
    public static final void setTextUnderline(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, boolean isTextUnderline) {
    }
}