package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.Settings;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeSettingsFragment {
  private HomeFragmentBuildersModule_ContributeSettingsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(Settings.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SettingsSubcomponent.Builder builder);

  @Subcomponent
  public interface SettingsSubcomponent extends AndroidInjector<Settings> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Settings> {}
  }
}
