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
public final class HomeDownFragment_Factory implements Factory<HomeDownFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public HomeDownFragment_Factory(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public HomeDownFragment get() {
    return provideInstance(childFragmentInjectorProvider, modelFactoryProvider);
  }

  public static HomeDownFragment provideInstance(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    HomeDownFragment instance = new HomeDownFragment();
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    HomeDownFragment_MembersInjector.injectModelFactory(instance, modelFactoryProvider.get());
    return instance;
  }

  public static HomeDownFragment_Factory create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new HomeDownFragment_Factory(childFragmentInjectorProvider, modelFactoryProvider);
  }

  public static HomeDownFragment newHomeDownFragment() {
    return new HomeDownFragment();
  }
}
