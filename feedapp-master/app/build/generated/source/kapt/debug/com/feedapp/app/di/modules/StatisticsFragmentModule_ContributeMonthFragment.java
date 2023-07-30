package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.statistics.StatisticsMonthFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      StatisticsFragmentModule_ContributeMonthFragment.StatisticsMonthFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class StatisticsFragmentModule_ContributeMonthFragment {
  private StatisticsFragmentModule_ContributeMonthFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(StatisticsMonthFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      StatisticsMonthFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface StatisticsMonthFragmentSubcomponent
      extends AndroidInjector<StatisticsMonthFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StatisticsMonthFragment> {}
  }
}
