package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.HomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeHomeFragment {
  private HomeFragmentBuildersModule_ContributeHomeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HomeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeFragment> {}
  }
}
