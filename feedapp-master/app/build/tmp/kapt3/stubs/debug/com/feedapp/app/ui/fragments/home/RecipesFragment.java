package com.feedapp.app.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000205H\u0016J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u000205H\u0016J\u001a\u0010?\u001a\u0002052\u0006\u0010@\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010A\u001a\u000205H\u0002J\u0010\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u000205H\u0002J\b\u0010F\u001a\u000205H\u0002J*\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\u0006\u00100\u001a\u000201H\u0002J\b\u0010M\u001a\u000205H\u0002J\b\u0010N\u001a\u000205H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006P"}, d2 = {"Lcom/feedapp/app/ui/fragments/home/RecipesFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/feedapp/app/ui/adapters/OnSearchLimit;", "()V", "binding", "Lcom/feedapp/app/databinding/FragmentRecipesBinding;", "getBinding", "()Lcom/feedapp/app/databinding/FragmentRecipesBinding;", "setBinding", "(Lcom/feedapp/app/databinding/FragmentRecipesBinding;)V", "cardAdapterB", "Lcom/feedapp/app/ui/fragments/recipesbox/CardPagerAdapter;", "cardAdapterD", "cardAdapterL", "cardAdapterS", "cardNumber", "", "modelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "recipeSearchRepository", "Lcom/feedapp/app/data/repositories/RecipeSearchRepository;", "getRecipeSearchRepository", "()Lcom/feedapp/app/data/repositories/RecipeSearchRepository;", "setRecipeSearchRepository", "(Lcom/feedapp/app/data/repositories/RecipeSearchRepository;)V", "requestManager", "Lcom/bumptech/glide/RequestManager;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "setRequestManager", "(Lcom/bumptech/glide/RequestManager;)V", "resultAdapter", "Lcom/feedapp/app/ui/adapters/RecipesRecyclerAdapter;", "searchActionListener", "Lcom/mancj/materialsearchbar/MaterialSearchBar$OnSearchActionListener;", "viewModel", "Lcom/feedapp/app/viewModels/RecipeSearchViewModel;", "getViewModel", "()Lcom/feedapp/app/viewModels/RecipeSearchViewModel;", "setViewModel", "(Lcom/feedapp/app/viewModels/RecipeSearchViewModel;)V", "getCardImageListener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "mealType", "Lcom/feedapp/app/data/models/day/MealType;", "ifLimitReached", "", "limitReached", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "scrollActivityToTop", "search", "query", "", "searchLimitReached", "setObservers", "setUpCard", "i", "card", "Landroidx/cardview/widget/CardView;", "model", "Lcom/feedapp/app/data/api/models/recipesearch/RecipeSearchModel;", "setUpView", "setViewPagers", "Companion", "app_debug"})
public final class RecipesFragment extends dagger.android.support.DaggerFragment implements com.feedapp.app.ui.adapters.OnSearchLimit {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory modelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager requestManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.feedapp.app.data.repositories.RecipeSearchRepository recipeSearchRepository;
    @org.jetbrains.annotations.NotNull()
    public com.feedapp.app.viewModels.RecipeSearchViewModel viewModel;
    private com.feedapp.app.ui.adapters.RecipesRecyclerAdapter resultAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.feedapp.app.databinding.FragmentRecipesBinding binding;
    private final int cardNumber = 4;
    private final com.feedapp.app.ui.fragments.recipesbox.CardPagerAdapter cardAdapterB = null;
    private final com.feedapp.app.ui.fragments.recipesbox.CardPagerAdapter cardAdapterL = null;
    private final com.feedapp.app.ui.fragments.recipesbox.CardPagerAdapter cardAdapterS = null;
    private final com.feedapp.app.ui.fragments.recipesbox.CardPagerAdapter cardAdapterD = null;
    private final com.mancj.materialsearchbar.MaterialSearchBar.OnSearchActionListener searchActionListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRAS_IMAGE_URI = "imageUri";
    public static final com.feedapp.app.ui.fragments.home.RecipesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getModelFactory() {
        return null;
    }
    
    public final void setModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    public final void setRequestManager(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.repositories.RecipeSearchRepository getRecipeSearchRepository() {
        return null;
    }
    
    public final void setRecipeSearchRepository(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.repositories.RecipeSearchRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.viewModels.RecipeSearchViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.RecipeSearchViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.databinding.FragmentRecipesBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.databinding.FragmentRecipesBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpView() {
    }
    
    private final void scrollActivityToTop() {
    }
    
    private final void search(java.lang.String query) {
    }
    
    private final void searchLimitReached() {
    }
    
    private final void setViewPagers() {
    }
    
    private final com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> getCardImageListener(com.feedapp.app.data.models.day.MealType mealType) {
        return null;
    }
    
    private final void setUpCard(int i, androidx.cardview.widget.CardView card, com.feedapp.app.data.api.models.recipesearch.RecipeSearchModel model, com.feedapp.app.data.models.day.MealType mealType) {
    }
    
    private final void setObservers() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public boolean ifLimitReached() {
        return false;
    }
    
    @java.lang.Override()
    public void limitReached() {
    }
    
    public RecipesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/feedapp/app/ui/fragments/home/RecipesFragment$Companion;", "", "()V", "INTENT_EXTRAS_IMAGE_URI", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}