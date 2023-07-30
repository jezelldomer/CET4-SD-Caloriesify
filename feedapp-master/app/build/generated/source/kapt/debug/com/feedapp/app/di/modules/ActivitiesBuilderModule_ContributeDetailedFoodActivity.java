package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.DetailedViewModelModule;
import com.feedapp.app.ui.activities.DetailedFoodActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      ActivitiesBuilderModule_ContributeDetailedFoodActivity.DetailedFoodActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeDetailedFoodActivity {
  private ActivitiesBuilderModule_ContributeDetailedFoodActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(DetailedFoodActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      DetailedFoodActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {DetailedViewModelModule.class, ProductSearchModule.class})
  public interface DetailedFoodActivitySubcomponent extends AndroidInjector<DetailedFoodActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailedFoodActivity> {}
  }
}
