// Generated by data binding compiler. Do not edit!
package com.front_end.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.front_end.app.R;
import com.front_end.app.modules.dinner.data.model.DinnerRowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowDinnerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageUntitleddesignTwo;

  @NonNull
  public final LinearLayout linearColumnsnacks;

  @NonNull
  public final LinearLayout linearRowsnacks;

  @NonNull
  public final LinearLayout linearRowuntitleddesignTwo;

  @NonNull
  public final TextView txtGroupFortyOneTwo;

  @NonNull
  public final TextView txtRecommendedEightyNine;

  @NonNull
  public final TextView txtSnacks;

  @Bindable
  protected DinnerRowModel mDinnerRowModel;

  protected RowDinnerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageUntitleddesignTwo, LinearLayout linearColumnsnacks,
      LinearLayout linearRowsnacks, LinearLayout linearRowuntitleddesignTwo,
      TextView txtGroupFortyOneTwo, TextView txtRecommendedEightyNine, TextView txtSnacks) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageUntitleddesignTwo = imageUntitleddesignTwo;
    this.linearColumnsnacks = linearColumnsnacks;
    this.linearRowsnacks = linearRowsnacks;
    this.linearRowuntitleddesignTwo = linearRowuntitleddesignTwo;
    this.txtGroupFortyOneTwo = txtGroupFortyOneTwo;
    this.txtRecommendedEightyNine = txtRecommendedEightyNine;
    this.txtSnacks = txtSnacks;
  }

  public abstract void setDinnerRowModel(@Nullable DinnerRowModel dinnerRowModel);

  @Nullable
  public DinnerRowModel getDinnerRowModel() {
    return mDinnerRowModel;
  }

  @NonNull
  public static RowDinnerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_dinner, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowDinnerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowDinnerBinding>inflateInternal(inflater, R.layout.row_dinner, root, attachToRoot, component);
  }

  @NonNull
  public static RowDinnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_dinner, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowDinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowDinnerBinding>inflateInternal(inflater, R.layout.row_dinner, null, false, component);
  }

  public static RowDinnerBinding bind(@NonNull View view) {
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
  public static RowDinnerBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowDinnerBinding)bind(component, view, R.layout.row_dinner);
  }
}