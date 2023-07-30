package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.IntroVMModule;
import com.feedapp.app.ui.activities.IntroductionActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeIntroActivity {
  private ActivitiesBuilderModule_ContributeIntroActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(IntroductionActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      IntroductionActivitySubcomponent.Builder builder);

  @Subcomponent(modules = IntroVMModule.class)
  public interface IntroductionActivitySubcomponent extends AndroidInjector<IntroductionActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<IntroductionActivity> {}
  }
}
