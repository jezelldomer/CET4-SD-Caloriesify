package com.feedapp.app.di.modules;

import android.app.Activity;
import com.feedapp.app.di.modules.viewModelModules.AddCustomProductVMModule;
import com.feedapp.app.ui.activities.AddCustomProductActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      ActivitiesBuilderModule_ContributeAddProductActivity.AddCustomProductActivitySubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivitiesBuilderModule_ContributeAddProductActivity {
  private ActivitiesBuilderModule_ContributeAddProductActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AddCustomProductActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AddCustomProductActivitySubcomponent.Builder builder);

  @Subcomponent(modules = AddCustomProductVMModule.class)
  public interface AddCustomProductActivitySubcomponent
      extends AndroidInjector<AddCustomProductActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AddCustomProductActivity> {}
  }
}
