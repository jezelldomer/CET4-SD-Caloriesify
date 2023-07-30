package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.MyMealsSearchViewModelModule;
import com.feedapp.app.ui.activities.MyMealsSearchActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      ActivitiesBuilderModule_ContributeMyMealsSearchActivity.MyMealsSearchActivitySubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeMyMealsSearchActivity {
  private ActivitiesBuilderModule_ContributeMyMealsSearchActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MyMealsSearchActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MyMealsSearchActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MyMealsSearchViewModelModule.class)
  public interface MyMealsSearchActivitySubcomponent
      extends AndroidInjector<MyMealsSearchActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MyMealsSearchActivity> {}
  }
}
