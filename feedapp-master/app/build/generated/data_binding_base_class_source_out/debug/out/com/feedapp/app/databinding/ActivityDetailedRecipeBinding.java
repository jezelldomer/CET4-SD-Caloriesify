// Generated by data binding compiler. Do not edit!
package com.feedapp.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.feedapp.app.R;
import com.feedapp.app.viewModels.DetailedRecipeViewModel;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailedRecipeBinding extends ViewDataBinding {
  @NonNull
  public final CardView detailedCardview1;

  @NonNull
  public final CardView detailedCardview2;

  @NonNull
  public final CardView detailedCardview3;

  @NonNull
  public final CardView detailedCardview4;

  @NonNull
  public final TextView detailedRecipeCredit;

  @NonNull
  public final RelativeLayout detailedRecipeCreditRl;

  @NonNull
  public final ExtendedFloatingActionButton detailedRecipeFab;

  @NonNull
  public final ConstraintLayout detailedRecipeFatsCl;

  @NonNull
  public final ProgressBar detailedRecipeInfoCarbsBar;

  @NonNull
  public final TextView detailedRecipeInfoCarbsText;

  @NonNull
  public final ProgressBar detailedRecipeInfoFatsBar;

  @NonNull
  public final TextView detailedRecipeInfoFatsText;

  @NonNull
  public final TextView detailedRecipeInfoInOne;

  @NonNull
  public final ProgressBar detailedRecipeInfoProteinsBar;

  @NonNull
  public final TextView detailedRecipeInfoProteinsText;

  @NonNull
  public final TextView detailedRecipeInfoTitle;

  @NonNull
  public final TextView detailedRecipeIngNo;

  @NonNull
  public final TextView detailedRecipeIngPerServings;

  @NonNull
  public final RelativeLayout detailedRecipeIngRl;

  @NonNull
  public final RecyclerView detailedRecipeIngRv;

  @NonNull
  public final TextView detailedRecipeIngTitle;

  @NonNull
  public final RelativeLayout detailedRecipeInsRl;

  @NonNull
  public final TextView detailedRecipeInsTitle;

  @NonNull
  public final RelativeLayout detailedRecipeNutritionRl;

  @NonNull
  public final ConstraintLayout detailedRecipeProteinsCl;

  @NonNull
  public final RecyclerView detailedRecipeStepRv;

  @NonNull
  public final ImageView detailedRecipeTimeImage;

  @NonNull
  public final RelativeLayout detailedRecipeTimeRl;

  @NonNull
  public final TextView detailedRecipeTimeText;

  @NonNull
  public final TextView detailedRecipeTitle;

  @NonNull
  public final CoordinatorLayout detailedRecipesCl;

  @NonNull
  public final AppBarLayout detailedRecipesCollapsingAppbar;

  @NonNull
  public final CollapsingToolbarLayout detailedRecipesCollapsingToolbar;

  @NonNull
  public final ImageView detailedRecipesCtImage;

  @NonNull
  public final ProgressBar detailedRecipesProgress;

  @NonNull
  public final Toolbar detailedRecipesToolbar;

  @NonNull
  public final NestedScrollView nsv;

  @Bindable
  protected DetailedRecipeViewModel mViewmodel;

  protected ActivityDetailedRecipeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView detailedCardview1, CardView detailedCardview2,
      CardView detailedCardview3, CardView detailedCardview4, TextView detailedRecipeCredit,
      RelativeLayout detailedRecipeCreditRl, ExtendedFloatingActionButton detailedRecipeFab,
      ConstraintLayout detailedRecipeFatsCl, ProgressBar detailedRecipeInfoCarbsBar,
      TextView detailedRecipeInfoCarbsText, ProgressBar detailedRecipeInfoFatsBar,
      TextView detailedRecipeInfoFatsText, TextView detailedRecipeInfoInOne,
      ProgressBar detailedRecipeInfoProteinsBar, TextView detailedRecipeInfoProteinsText,
      TextView detailedRecipeInfoTitle, TextView detailedRecipeIngNo,
      TextView detailedRecipeIngPerServings, RelativeLayout detailedRecipeIngRl,
      RecyclerView detailedRecipeIngRv, TextView detailedRecipeIngTitle,
      RelativeLayout detailedRecipeInsRl, TextView detailedRecipeInsTitle,
      RelativeLayout detailedRecipeNutritionRl, ConstraintLayout detailedRecipeProteinsCl,
      RecyclerView detailedRecipeStepRv, ImageView detailedRecipeTimeImage,
      RelativeLayout detailedRecipeTimeRl, TextView detailedRecipeTimeText,
      TextView detailedRecipeTitle, CoordinatorLayout detailedRecipesCl,
      AppBarLayout detailedRecipesCollapsingAppbar,
      CollapsingToolbarLayout detailedRecipesCollapsingToolbar, ImageView detailedRecipesCtImage,
      ProgressBar detailedRecipesProgress, Toolbar detailedRecipesToolbar, NestedScrollView nsv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailedCardview1 = detailedCardview1;
    this.detailedCardview2 = detailedCardview2;
    this.detailedCardview3 = detailedCardview3;
    this.detailedCardview4 = detailedCardview4;
    this.detailedRecipeCredit = detailedRecipeCredit;
    this.detailedRecipeCreditRl = detailedRecipeCreditRl;
    this.detailedRecipeFab = detailedRecipeFab;
    this.detailedRecipeFatsCl = detailedRecipeFatsCl;
    this.detailedRecipeInfoCarbsBar = detailedRecipeInfoCarbsBar;
    this.detailedRecipeInfoCarbsText = detailedRecipeInfoCarbsText;
    this.detailedRecipeInfoFatsBar = detailedRecipeInfoFatsBar;
    this.detailedRecipeInfoFatsText = detailedRecipeInfoFatsText;
    this.detailedRecipeInfoInOne = detailedRecipeInfoInOne;
    this.detailedRecipeInfoProteinsBar = detailedRecipeInfoProteinsBar;
    this.detailedRecipeInfoProteinsText = detailedRecipeInfoProteinsText;
    this.detailedRecipeInfoTitle = detailedRecipeInfoTitle;
    this.detailedRecipeIngNo = detailedRecipeIngNo;
    this.detailedRecipeIngPerServings = detailedRecipeIngPerServings;
    this.detailedRecipeIngRl = detailedRecipeIngRl;
    this.detailedRecipeIngRv = detailedRecipeIngRv;
    this.detailedRecipeIngTitle = detailedRecipeIngTitle;
    this.detailedRecipeInsRl = detailedRecipeInsRl;
    this.detailedRecipeInsTitle = detailedRecipeInsTitle;
    this.detailedRecipeNutritionRl = detailedRecipeNutritionRl;
    this.detailedRecipeProteinsCl = detailedRecipeProteinsCl;
    this.detailedRecipeStepRv = detailedRecipeStepRv;
    this.detailedRecipeTimeImage = detailedRecipeTimeImage;
    this.detailedRecipeTimeRl = detailedRecipeTimeRl;
    this.detailedRecipeTimeText = detailedRecipeTimeText;
    this.detailedRecipeTitle = detailedRecipeTitle;
    this.detailedRecipesCl = detailedRecipesCl;
    this.detailedRecipesCollapsingAppbar = detailedRecipesCollapsingAppbar;
    this.detailedRecipesCollapsingToolbar = detailedRecipesCollapsingToolbar;
    this.detailedRecipesCtImage = detailedRecipesCtImage;
    this.detailedRecipesProgress = detailedRecipesProgress;
    this.detailedRecipesToolbar = detailedRecipesToolbar;
    this.nsv = nsv;
  }

  public abstract void setViewmodel(@Nullable DetailedRecipeViewModel viewmodel);

  @Nullable
  public DetailedRecipeViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivityDetailedRecipeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detailed_recipe, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailedRecipeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailedRecipeBinding>inflateInternal(inflater, R.layout.activity_detailed_recipe, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailedRecipeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detailed_recipe, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailedRecipeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailedRecipeBinding>inflateInternal(inflater, R.layout.activity_detailed_recipe, null, false, component);
  }

  public static ActivityDetailedRecipeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDetailedRecipeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailedRecipeBinding)bind(component, view, R.layout.activity_detailed_recipe);
  }
}