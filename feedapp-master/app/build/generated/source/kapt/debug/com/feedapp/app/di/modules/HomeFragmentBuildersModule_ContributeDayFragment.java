package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.DayFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeDayFragment {
  private HomeFragmentBuildersModule_ContributeDayFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DayFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DayFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DayFragmentSubcomponent extends AndroidInjector<DayFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DayFragment> {}
  }
}
