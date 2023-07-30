package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.statistics.StatisticsDayFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      StatisticsFragmentModule_ContributeDayFragment.StatisticsDayFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class StatisticsFragmentModule_ContributeDayFragment {
  private StatisticsFragmentModule_ContributeDayFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(StatisticsDayFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      StatisticsDayFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface StatisticsDayFragmentSubcomponent
      extends AndroidInjector<StatisticsDayFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StatisticsDayFragment> {}
  }
}
