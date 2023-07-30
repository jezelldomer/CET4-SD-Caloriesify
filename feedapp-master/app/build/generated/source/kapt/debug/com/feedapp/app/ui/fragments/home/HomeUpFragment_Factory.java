package com.feedapp.app.ui.fragments.home;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeUpFragment_Factory implements Factory<HomeUpFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public HomeUpFragment_Factory(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public HomeUpFragment get() {
    return provideInstance(childFragmentInjectorProvider, modelFactoryProvider);
  }

  public static HomeUpFragment provideInstance(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    HomeUpFragment instance = new HomeUpFragment();
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    HomeUpFragment_MembersInjector.injectModelFactory(instance, modelFactoryProvider.get());
    return instance;
  }

  public static HomeUpFragment_Factory create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new HomeUpFragment_Factory(childFragmentInjectorProvider, modelFactoryProvider);
  }

  public static HomeUpFragment newHomeUpFragment() {
    return new HomeUpFragment();
  }
}
