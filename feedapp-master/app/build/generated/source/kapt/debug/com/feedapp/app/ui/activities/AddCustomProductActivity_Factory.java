package com.feedapp.app.ui.activities;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddCustomProductActivity_Factory implements Factory<AddCustomProductActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public AddCustomProductActivity_Factory(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public AddCustomProductActivity get() {
    return provideInstance(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, modelFactoryProvider);
  }

  public static AddCustomProductActivity provideInstance(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    AddCustomProductActivity instance = new AddCustomProductActivity();
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    AddCustomProductActivity_MembersInjector.injectModelFactory(
        instance, modelFactoryProvider.get());
    return instance;
  }

  public static AddCustomProductActivity_Factory create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new AddCustomProductActivity_Factory(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, modelFactoryProvider);
  }

  public static AddCustomProductActivity newAddCustomProductActivity() {
    return new AddCustomProductActivity();
  }
}
