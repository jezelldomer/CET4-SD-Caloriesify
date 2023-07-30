// Generated by data binding compiler. Do not edit!
package com.feedapp.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.feedapp.app.R;
import com.feedapp.app.viewModels.StatisticsViewModel;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentStatisticsMonthBinding extends ViewDataBinding {
  @NonNull
  public final CardView activityHistoryChartContainer;

  @NonNull
  public final MaterialButton btnSavePdf;

  @NonNull
  public final BarChart chart;

  @NonNull
  public final RelativeLayout dropdownContainer;

  @NonNull
  public final AutoCompleteTextView monthDropdown;

  @NonNull
  public final TextInputLayout monthTil;

  @NonNull
  public final AutoCompleteTextView nutrientDropdown;

  @NonNull
  public final TextInputLayout nutrientTil;

  @NonNull
  public final TextView titleMonth;

  @NonNull
  public final TextView titleNutrient;

  @Bindable
  protected StatisticsViewModel mViewmodel;

  protected FragmentStatisticsMonthBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView activityHistoryChartContainer, MaterialButton btnSavePdf,
      BarChart chart, RelativeLayout dropdownContainer, AutoCompleteTextView monthDropdown,
      TextInputLayout monthTil, AutoCompleteTextView nutrientDropdown, TextInputLayout nutrientTil,
      TextView titleMonth, TextView titleNutrient) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityHistoryChartContainer = activityHistoryChartContainer;
    this.btnSavePdf = btnSavePdf;
    this.chart = chart;
    this.dropdownContainer = dropdownContainer;
    this.monthDropdown = monthDropdown;
    this.monthTil = monthTil;
    this.nutrientDropdown = nutrientDropdown;
    this.nutrientTil = nutrientTil;
    this.titleMonth = titleMonth;
    this.titleNutrient = titleNutrient;
  }

  public abstract void setViewmodel(@Nullable StatisticsViewModel viewmodel);

  @Nullable
  public StatisticsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentStatisticsMonthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_statistics_month, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStatisticsMonthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentStatisticsMonthBinding>inflateInternal(inflater, R.layout.fragment_statistics_month, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStatisticsMonthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_statistics_month, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStatisticsMonthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentStatisticsMonthBinding>inflateInternal(inflater, R.layout.fragment_statistics_month, null, false, component);
  }

  public static FragmentStatisticsMonthBinding bind(@NonNull View view) {
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
  public static FragmentStatisticsMonthBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentStatisticsMonthBinding)bind(component, view, R.layout.fragment_statistics_month);
  }
}