package com.feedapp.app.di.modules;

import androidx.fragment.app.Fragment;
import com.feedapp.app.ui.fragments.home.RecipesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      HomeFragmentBuildersModule_ContributeRecipeSearchFragment.RecipesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class HomeFragmentBuildersModule_ContributeRecipeSearchFragment {
  private HomeFragmentBuildersModule_ContributeRecipeSearchFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RecipesFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RecipesFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RecipesFragmentSubcomponent extends AndroidInjector<RecipesFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RecipesFragment> {}
  }
}
