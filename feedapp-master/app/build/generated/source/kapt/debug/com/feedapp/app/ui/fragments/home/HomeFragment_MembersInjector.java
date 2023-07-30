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
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  private final Provider<HomeUpFragment> homeUpFragmentProvider;

  private final Provider<HomeDownFragment> downMenuFragmentProvider;

  public HomeFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<HomeUpFragment> homeUpFragmentProvider,
      Provider<HomeDownFragment> downMenuFragmentProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
    this.homeUpFragmentProvider = homeUpFragmentProvider;
    this.downMenuFragmentProvider = downMenuFragmentProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<HomeUpFragment> homeUpFragmentProvider,
      Provider<HomeDownFragment> downMenuFragmentProvider) {
    return new HomeFragment_MembersInjector(
        childFragmentInjectorProvider,
        modelFactoryProvider,
        homeUpFragmentProvider,
        downMenuFragmentProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
    injectHomeUpFragment(instance, homeUpFragmentProvider.get());
    injectDownMenuFragment(instance, downMenuFragmentProvider.get());
  }

  public static void injectModelFactory(
      HomeFragment instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }

  public static void injectHomeUpFragment(HomeFragment instance, HomeUpFragment homeUpFragment) {
    instance.homeUpFragment = homeUpFragment;
  }

  public static void injectDownMenuFragment(
      HomeFragment instance, HomeDownFragment downMenuFragment) {
    instance.downMenuFragment = downMenuFragment;
  }
}
