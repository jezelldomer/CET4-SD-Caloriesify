package com.feedapp.app.ui.fragments.home;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeUpFragment_MembersInjector implements MembersInjector<HomeUpFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public HomeUpFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  public static MembersInjector<HomeUpFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new HomeUpFragment_MembersInjector(childFragmentInjectorProvider, modelFactoryProvider);
  }

  @Override
  public void injectMembers(HomeUpFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
  }

  public static void injectModelFactory(
      HomeUpFragment instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }
}
