package com.feedapp.app.ui.fragments.home;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Settings_MembersInjector implements MembersInjector<Settings> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  private final Provider<SharedPrefsHelper> spHelperProvider;

  public Settings_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
    this.spHelperProvider = spHelperProvider;
  }

  public static MembersInjector<Settings> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    return new Settings_MembersInjector(
        childFragmentInjectorProvider, modelFactoryProvider, spHelperProvider);
  }

  @Override
  public void injectMembers(Settings instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
    injectSpHelper(instance, spHelperProvider.get());
  }

  public static void injectModelFactory(Settings instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }

  public static void injectSpHelper(Settings instance, SharedPrefsHelper spHelper) {
    instance.spHelper = spHelper;
  }
}
