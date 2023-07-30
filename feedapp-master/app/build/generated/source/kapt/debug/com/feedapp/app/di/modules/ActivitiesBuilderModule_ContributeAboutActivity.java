package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.ui.activities.AboutActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeAboutActivity {
  private ActivitiesBuilderModule_ContributeAboutActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AboutActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AboutActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface AboutActivitySubcomponent extends AndroidInjector<AboutActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AboutActivity> {}
  }
}
