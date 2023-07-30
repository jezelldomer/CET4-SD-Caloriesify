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
import com.front_end.app.modules.breakfast.data.model.ListuntitleddesignRowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowListuntitleddesignBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageUntitleddesign;

  @NonNull
  public final LinearLayout linearColumnlunch;

  @NonNull
  public final LinearLayout linearRowlunch;

  @NonNull
  public final LinearLayout linearRowuntitleddesign;

  @NonNull
  public final TextView txtGroupFortyOne;

  @NonNull
  public final TextView txtLunch;

  @NonNull
  public final TextView txtRecommended535;

  @Bindable
  protected ListuntitleddesignRowModel mListuntitleddesignRowModel;

  protected RowListuntitleddesignBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageUntitleddesign, LinearLayout linearColumnlunch, LinearLayout linearRowlunch,
      LinearLayout linearRowuntitleddesign, TextView txtGroupFortyOne, TextView txtLunch,
      TextView txtRecommended535) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageUntitleddesign = imageUntitleddesign;
    this.linearColumnlunch = linearColumnlunch;
    this.linearRowlunch = linearRowlunch;
    this.linearRowuntitleddesign = linearRowuntitleddesign;
    this.txtGroupFortyOne = txtGroupFortyOne;
    this.txtLunch = txtLunch;
    this.txtRecommended535 = txtRecommended535;
  }

  public abstract void setListuntitleddesignRowModel(
      @Nullable ListuntitleddesignRowModel listuntitleddesignRowModel);

  @Nullable
  public ListuntitleddesignRowModel getListuntitleddesignRowModel() {
    return mListuntitleddesignRowModel;
  }

  @NonNull
  public static RowListuntitleddesignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_listuntitleddesign, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowListuntitleddesignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowListuntitleddesignBinding>inflateInternal(inflater, R.layout.row_listuntitleddesign, root, attachToRoot, component);
  }

  @NonNull
  public static RowListuntitleddesignBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_listuntitleddesign, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowListuntitleddesignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowListuntitleddesignBinding>inflateInternal(inflater, R.layout.row_listuntitleddesign, null, false, component);
  }

  public static RowListuntitleddesignBinding bind(@NonNull View view) {
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
  public static RowListuntitleddesignBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowListuntitleddesignBinding)bind(component, view, R.layout.row_listuntitleddesign);
  }
}