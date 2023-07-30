package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.HomeUpFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeHomeUpFragment {
  private HomeFragmentBuildersModule_ContributeHomeUpFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HomeUpFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HomeUpFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HomeUpFragmentSubcomponent extends AndroidInjector<HomeUpFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeUpFragment> {}
  }
}
