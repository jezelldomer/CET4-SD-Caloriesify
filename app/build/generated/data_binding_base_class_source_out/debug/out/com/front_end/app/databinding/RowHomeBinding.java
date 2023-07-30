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
import com.front_end.app.modules.home.data.model.HomeRowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowHomeBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageVector;

  @NonNull
  public final ImageView imageVolume;

  @NonNull
  public final LinearLayout linearColumn;

  @NonNull
  public final LinearLayout linearColumnvector;

  @NonNull
  public final LinearLayout linearColumnvolume;

  @NonNull
  public final LinearLayout linearRowvector;

  @NonNull
  public final TextView txtDiet;

  @NonNull
  public final TextView txtJournal;

  @Bindable
  protected HomeRowModel mHomeRowModel;

  protected RowHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageVector, ImageView imageVolume, LinearLayout linearColumn,
      LinearLayout linearColumnvector, LinearLayout linearColumnvolume,
      LinearLayout linearRowvector, TextView txtDiet, TextView txtJournal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageVector = imageVector;
    this.imageVolume = imageVolume;
    this.linearColumn = linearColumn;
    this.linearColumnvector = linearColumnvector;
    this.linearColumnvolume = linearColumnvolume;
    this.linearRowvector = linearRowvector;
    this.txtDiet = txtDiet;
    this.txtJournal = txtJournal;
  }

  public abstract void setHomeRowModel(@Nullable HomeRowModel homeRowModel);

  @Nullable
  public HomeRowModel getHomeRowModel() {
    return mHomeRowModel;
  }

  @NonNull
  public static RowHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowHomeBinding>inflateInternal(inflater, R.layout.row_home, root, attachToRoot, component);
  }

  @NonNull
  public static RowHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowHomeBinding>inflateInternal(inflater, R.layout.row_home, null, false, component);
  }

  public static RowHomeBinding bind(@NonNull View view) {
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
  public static RowHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowHomeBinding)bind(component, view, R.layout.row_home);
  }
}