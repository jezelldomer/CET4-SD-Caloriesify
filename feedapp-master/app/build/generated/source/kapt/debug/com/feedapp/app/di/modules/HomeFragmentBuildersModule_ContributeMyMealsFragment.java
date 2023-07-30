package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.MyMealsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      HomeFragmentBuildersModule_ContributeMyMealsFragment.MyMealsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeMyMealsFragment {
  private HomeFragmentBuildersModule_ContributeMyMealsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(MyMealsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MyMealsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MyMealsFragmentSubcomponent extends AndroidInjector<MyMealsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MyMealsFragment> {}
  }
}
