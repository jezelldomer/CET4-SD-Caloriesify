package com.feedapp.app.ui.activities;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<SharedPrefsHelper> spHelperProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public SearchActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SharedPrefsHelper> spHelperProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.spHelperProvider = spHelperProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  public static MembersInjector<SearchActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SharedPrefsHelper> spHelperProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new SearchActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        spHelperProvider,
        modelFactoryProvider);
  }

  @Override
  public void injectMembers(SearchActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectSpHelper(instance, spHelperProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
  }

  public static void injectSpHelper(SearchActivity instance, SharedPrefsHelper spHelper) {
    instance.spHelper = spHelper;
  }

  public static void injectModelFactory(
      SearchActivity instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }
}