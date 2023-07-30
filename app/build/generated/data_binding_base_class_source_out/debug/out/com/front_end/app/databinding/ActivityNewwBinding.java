// Generated by data binding compiler. Do not edit!
package com.front_end.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.front_end.app.R;
import com.front_end.app.modules.neww.data.viewmodel.NewwVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNewwBinding extends ViewDataBinding {
  @NonNull
  public final EditText etContent;

  @NonNull
  public final EditText etUntitledOne;

  @NonNull
  public final ImageView imageArrowleft;

  @NonNull
  public final ImageView imageFrameTen;

  @NonNull
  public final LinearLayout linearNew;

  @NonNull
  public final LinearLayout linearRowarrowleft;

  @NonNull
  public final Toolbar toolbarToolbar;

  @NonNull
  public final TextView txtUntitled;

  @Bindable
  protected NewwVM mNewVM;

  protected ActivityNewwBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText etContent, EditText etUntitledOne, ImageView imageArrowleft, ImageView imageFrameTen,
      LinearLayout linearNew, LinearLayout linearRowarrowleft, Toolbar toolbarToolbar,
      TextView txtUntitled) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etContent = etContent;
    this.etUntitledOne = etUntitledOne;
    this.imageArrowleft = imageArrowleft;
    this.imageFrameTen = imageFrameTen;
    this.linearNew = linearNew;
    this.linearRowarrowleft = linearRowarrowleft;
    this.toolbarToolbar = toolbarToolbar;
    this.txtUntitled = txtUntitled;
  }

  public abstract void setNewVM(@Nullable NewwVM newVM);

  @Nullable
  public NewwVM getNewVM() {
    return mNewVM;
  }

  @NonNull
  public static ActivityNewwBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_neww, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewwBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNewwBinding>inflateInternal(inflater, R.layout.activity_neww, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewwBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_neww, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewwBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNewwBinding>inflateInternal(inflater, R.layout.activity_neww, null, false, component);
  }

  public static ActivityNewwBinding bind(@NonNull View view) {
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
  public static ActivityNewwBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNewwBinding)bind(component, view, R.layout.activity_neww);
  }
}