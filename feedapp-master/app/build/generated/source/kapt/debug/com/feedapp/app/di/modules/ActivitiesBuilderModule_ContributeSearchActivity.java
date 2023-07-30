package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.SearchViewModelModule;
import com.feedapp.app.ui.activities.SearchActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeSearchActivity {
  private ActivitiesBuilderModule_ContributeSearchActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SearchActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SearchActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {SearchViewModelModule.class, ProductSearchModule.class})
  public interface SearchActivitySubcomponent extends AndroidInjector<SearchActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchActivity> {}
  }
}
