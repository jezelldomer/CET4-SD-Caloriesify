package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.DetailedRecipeVMModule;
import com.feedapp.app.ui.activities.DetailedRecipeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      ActivitiesBuilderModule_ContributeRecipeDetailedActivity.DetailedRecipeActivitySubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeRecipeDetailedActivity {
  private ActivitiesBuilderModule_ContributeRecipeDetailedActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(DetailedRecipeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      DetailedRecipeActivitySubcomponent.Builder builder);

  @Subcomponent(modules = DetailedRecipeVMModule.class)
  public interface DetailedRecipeActivitySubcomponent
      extends AndroidInjector<DetailedRecipeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailedRecipeActivity> {}
  }
}
