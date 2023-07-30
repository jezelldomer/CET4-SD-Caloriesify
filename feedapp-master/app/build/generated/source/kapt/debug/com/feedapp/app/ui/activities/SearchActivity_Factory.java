package com.feedapp.app.ui.activities;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchActivity_Factory implements Factory<SearchActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<SharedPrefsHelper> spHelperProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public SearchActivity_Factory(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SharedPrefsHelper> spHelperProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.spHelperProvider = spHelperProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public SearchActivity get() {
    return provideInstance(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        spHelperProvider,
        modelFactoryProvider);
  }

  public static SearchActivity provideInstance(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SharedPrefsHelper> spHelperProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    SearchActivity instance = new SearchActivity();
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    SearchActivity_MembersInjector.injectSpHelper(instance, spHelperProvider.get());
    SearchActivity_MembersInjector.injectModelFactory(instance, modelFactoryProvider.get());
    return instance;
  }

  public static SearchActivity_Factory create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SharedPrefsHelper> spHelperProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new SearchActivity_Factory(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        spHelperProvider,
        modelFactoryProvider);
  }

  public static SearchActivity newSearchActivity() {
    return new SearchActivity();
  }
}
