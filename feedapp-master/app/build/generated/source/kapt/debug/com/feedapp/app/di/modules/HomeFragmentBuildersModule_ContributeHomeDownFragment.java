package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.HomeDownFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      HomeFragmentBuildersModule_ContributeHomeDownFragment.HomeDownFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeHomeDownFragment {
  private HomeFragmentBuildersModule_ContributeHomeDownFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HomeDownFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HomeDownFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HomeDownFragmentSubcomponent extends AndroidInjector<HomeDownFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeDownFragment> {}
  }
}
