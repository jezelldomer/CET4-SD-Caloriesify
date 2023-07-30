package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.StatisticsViewModelModule;
import com.feedapp.app.ui.activities.StatisticsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      ActivitiesBuilderModule_ContributeRecipeHistoryActivity.StatisticsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeRecipeHistoryActivity {
  private ActivitiesBuilderModule_ContributeRecipeHistoryActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(StatisticsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      StatisticsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {StatisticsViewModelModule.class, StatisticsFragmentModule.class})
  public interface StatisticsActivitySubcomponent extends AndroidInjector<StatisticsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StatisticsActivity> {}
  }
}
