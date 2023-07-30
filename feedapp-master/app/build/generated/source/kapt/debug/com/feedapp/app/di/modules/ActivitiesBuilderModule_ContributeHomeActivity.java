package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.HomeActivityVMModules;
import com.feedapp.app.ui.activities.HomeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeHomeActivity {
  private ActivitiesBuilderModule_ContributeHomeActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(HomeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {HomeFragmentBuildersModule.class, HomeActivityVMModules.class})
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
  }
}
