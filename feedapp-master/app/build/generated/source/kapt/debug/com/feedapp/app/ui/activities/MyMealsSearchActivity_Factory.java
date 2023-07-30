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
public final class MyMealsSearchActivity_Factory implements Factory<MyMealsSearchActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public MyMealsSearchActivity_Factory(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public MyMealsSearchActivity get() {
    return provideInstance(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, modelFactoryProvider);
  }

  public static MyMealsSearchActivity provideInstance(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    MyMealsSearchActivity instance = new MyMealsSearchActivity();
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    MyMealsSearchActivity_MembersInjector.injectModelFactory(instance, modelFactoryProvider.get());
    return instance;
  }

  public static MyMealsSearchActivity_Factory create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new MyMealsSearchActivity_Factory(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, modelFactoryProvider);
  }

  public static MyMealsSearchActivity newMyMealsSearchActivity() {
    return new MyMealsSearchActivity();
  }
}
