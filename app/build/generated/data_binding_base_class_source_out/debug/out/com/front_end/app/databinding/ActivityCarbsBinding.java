// Generated by data binding compiler. Do not edit!
package com.front_end.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.front_end.app.R;
import com.front_end.app.modules.carbs.data.viewmodel.CarbsVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCarbsBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameStackarrowfive;

  @NonNull
  public final FrameLayout frameStackgroupfortyone;

  @NonNull
  public final FrameLayout frameStackwater;

  @NonNull
  public final ImageView imageArrowFive;

  @NonNull
  public final ImageView imageArrowOne;

  @NonNull
  public final ImageView imageArrowTwo;

  @NonNull
  public final ImageView imageBeigeIllustrat;

  @NonNull
  public final ImageView imageCalendar;

  @NonNull
  public final ImageView imageUntitleddesignFour;

  @NonNull
  public final LinearLayout linearCarbs;

  @NonNull
  public final LinearLayout linearColumnarrowfive;

  @NonNull
  public final LinearLayout linearColumncarbs;

  @NonNull
  public final LinearLayout linearColumngroupfortyone;

  @NonNull
  public final LinearLayout linearColumnwater;

  @NonNull
  public final LinearLayout linearRowarrowone;

  @NonNull
  public final LinearLayout linearRowarrowtwo;

  @NonNull
  public final LinearLayout linearRowcarbs;

  @NonNull
  public final LinearLayout linearRowwater;

  @NonNull
  public final LinearLayout linearRowweight;

  @NonNull
  public final RecyclerView recyclerCarbs;

  @NonNull
  public final TextView txtBreakfast;

  @NonNull
  public final TextView txtCarbs;

  @NonNull
  public final TextView txtDuration;

  @NonNull
  public final TextView txtFat;

  @NonNull
  public final TextView txtGroupFortyOne;

  @NonNull
  public final TextView txtGroupFortyOneFive;

  @NonNull
  public final TextView txtProtein;

  @NonNull
  public final TextView txtRecommended356;

  @NonNull
  public final TextView txtRecommended5Lt;

  @NonNull
  public final TextView txtWater;

  @NonNull
  public final TextView txtWeight;

  @NonNull
  public final TextView txtWeightOne;

  @NonNull
  public final TextView txtWeightTwo;

  @Bindable
  protected CarbsVM mCarbsVM;

  protected ActivityCarbsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameStackarrowfive, FrameLayout frameStackgroupfortyone,
      FrameLayout frameStackwater, ImageView imageArrowFive, ImageView imageArrowOne,
      ImageView imageArrowTwo, ImageView imageBeigeIllustrat, ImageView imageCalendar,
      ImageView imageUntitleddesignFour, LinearLayout linearCarbs,
      LinearLayout linearColumnarrowfive, LinearLayout linearColumncarbs,
      LinearLayout linearColumngroupfortyone, LinearLayout linearColumnwater,
      LinearLayout linearRowarrowone, LinearLayout linearRowarrowtwo, LinearLayout linearRowcarbs,
      LinearLayout linearRowwater, LinearLayout linearRowweight, RecyclerView recyclerCarbs,
      TextView txtBreakfast, TextView txtCarbs, TextView txtDuration, TextView txtFat,
      TextView txtGroupFortyOne, TextView txtGroupFortyOneFive, TextView txtProtein,
      TextView txtRecommended356, TextView txtRecommended5Lt, TextView txtWater, TextView txtWeight,
      TextView txtWeightOne, TextView txtWeightTwo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameStackarrowfive = frameStackarrowfive;
    this.frameStackgroupfortyone = frameStackgroupfortyone;
    this.frameStackwater = frameStackwater;
    this.imageArrowFive = imageArrowFive;
    this.imageArrowOne = imageArrowOne;
    this.imageArrowTwo = imageArrowTwo;
    this.imageBeigeIllustrat = imageBeigeIllustrat;
    this.imageCalendar = imageCalendar;
    this.imageUntitleddesignFour = imageUntitleddesignFour;
    this.linearCarbs = linearCarbs;
    this.linearColumnarrowfive = linearColumnarrowfive;
    this.linearColumncarbs = linearColumncarbs;
    this.linearColumngroupfortyone = linearColumngroupfortyone;
    this.linearColumnwater = linearColumnwater;
    this.linearRowarrowone = linearRowarrowone;
    this.linearRowarrowtwo = linearRowarrowtwo;
    this.linearRowcarbs = linearRowcarbs;
    this.linearRowwater = linearRowwater;
    this.linearRowweight = linearRowweight;
    this.recyclerCarbs = recyclerCarbs;
    this.txtBreakfast = txtBreakfast;
    this.txtCarbs = txtCarbs;
    this.txtDuration = txtDuration;
    this.txtFat = txtFat;
    this.txtGroupFortyOne = txtGroupFortyOne;
    this.txtGroupFortyOneFive = txtGroupFortyOneFive;
    this.txtProtein = txtProtein;
    this.txtRecommended356 = txtRecommended356;
    this.txtRecommended5Lt = txtRecommended5Lt;
    this.txtWater = txtWater;
    this.txtWeight = txtWeight;
    this.txtWeightOne = txtWeightOne;
    this.txtWeightTwo = txtWeightTwo;
  }

  public abstract void setCarbsVM(@Nullable CarbsVM carbsVM);

  @Nullable
  public CarbsVM getCarbsVM() {
    return mCarbsVM;
  }

  @NonNull
  public static ActivityCarbsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_carbs, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCarbsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCarbsBinding>inflateInternal(inflater, R.layout.activity_carbs, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCarbsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_carbs, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCarbsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCarbsBinding>inflateInternal(inflater, R.layout.activity_carbs, null, false, component);
  }

  public static ActivityCarbsBinding bind(@NonNull View view) {
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
  public static ActivityCarbsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCarbsBinding)bind(component, view, R.layout.activity_carbs);
  }
}