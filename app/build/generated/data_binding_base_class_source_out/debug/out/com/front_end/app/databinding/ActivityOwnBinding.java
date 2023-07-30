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
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.front_end.app.R;
import com.front_end.app.modules.own.data.viewmodel.OwnVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityOwnBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btn00;

  @NonNull
  public final AppCompatButton btn00One;

  @NonNull
  public final AppCompatButton btn00Two;

  @NonNull
  public final AppCompatButton btnBack;

  @NonNull
  public final AppCompatButton btnProceed;

  @NonNull
  public final FrameLayout frameOwn;

  @NonNull
  public final ImageView image360F247848348;

  @NonNull
  public final LinearLayout linearColumn00;

  @NonNull
  public final LinearLayout linearColumn00One;

  @NonNull
  public final LinearLayout linearColumn00Two;

  @NonNull
  public final LinearLayout linearColumncreateyourown;

  @NonNull
  public final LinearLayout linearRowcarbs;

  @NonNull
  public final LinearLayout linearRowfats;

  @NonNull
  public final LinearLayout linearRowprotein;

  @NonNull
  public final TextView txtCarbs;

  @NonNull
  public final TextView txtCreateyourOwn;

  @NonNull
  public final TextView txtFats;

  @NonNull
  public final TextView txtProtein;

  @Bindable
  protected OwnVM mOwnVM;

  protected ActivityOwnBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btn00, AppCompatButton btn00One, AppCompatButton btn00Two,
      AppCompatButton btnBack, AppCompatButton btnProceed, FrameLayout frameOwn,
      ImageView image360F247848348, LinearLayout linearColumn00, LinearLayout linearColumn00One,
      LinearLayout linearColumn00Two, LinearLayout linearColumncreateyourown,
      LinearLayout linearRowcarbs, LinearLayout linearRowfats, LinearLayout linearRowprotein,
      TextView txtCarbs, TextView txtCreateyourOwn, TextView txtFats, TextView txtProtein) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btn00 = btn00;
    this.btn00One = btn00One;
    this.btn00Two = btn00Two;
    this.btnBack = btnBack;
    this.btnProceed = btnProceed;
    this.frameOwn = frameOwn;
    this.image360F247848348 = image360F247848348;
    this.linearColumn00 = linearColumn00;
    this.linearColumn00One = linearColumn00One;
    this.linearColumn00Two = linearColumn00Two;
    this.linearColumncreateyourown = linearColumncreateyourown;
    this.linearRowcarbs = linearRowcarbs;
    this.linearRowfats = linearRowfats;
    this.linearRowprotein = linearRowprotein;
    this.txtCarbs = txtCarbs;
    this.txtCreateyourOwn = txtCreateyourOwn;
    this.txtFats = txtFats;
    this.txtProtein = txtProtein;
  }

  public abstract void setOwnVM(@Nullable OwnVM ownVM);

  @Nullable
  public OwnVM getOwnVM() {
    return mOwnVM;
  }

  @NonNull
  public static ActivityOwnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_own, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOwnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityOwnBinding>inflateInternal(inflater, R.layout.activity_own, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOwnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_own, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOwnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityOwnBinding>inflateInternal(inflater, R.layout.activity_own, null, false, component);
  }

  public static ActivityOwnBinding bind(@NonNull View view) {
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
  public static ActivityOwnBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityOwnBinding)bind(component, view, R.layout.activity_own);
  }
}