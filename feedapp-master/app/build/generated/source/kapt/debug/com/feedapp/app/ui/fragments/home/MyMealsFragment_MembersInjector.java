package com.feedapp.app.ui.fragments.home;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import com.feedapp.app.viewModels.MyMealsViewModel;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyMealsFragment_MembersInjector implements MembersInjector<MyMealsFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  private final Provider<MyMealsViewModel> myMealsViewModelProvider;

  private final Provider<SharedPrefsHelper> spHelperProvider;

  public MyMealsFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<MyMealsViewModel> myMealsViewModelProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
    this.myMealsViewModelProvider = myMealsViewModelProvider;
    this.spHelperProvider = spHelperProvider;
  }

  public static MembersInjector<MyMealsFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<MyMealsViewModel> myMealsViewModelProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    return new MyMealsFragment_MembersInjector(
        childFragmentInjectorProvider,
        modelFactoryProvider,
        myMealsViewModelProvider,
        spHelperProvider);
  }

  @Override
  public void injectMembers(MyMealsFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
    injectMyMealsViewModel(instance, myMealsViewModelProvider.get());
    injectSpHelper(instance, spHelperProvider.get());
  }

  public static void injectModelFactory(
      MyMealsFragment instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }

  public static void injectMyMealsViewModel(
      MyMealsFragment instance, MyMealsViewModel myMealsViewModel) {
    instance.myMealsViewModel = myMealsViewModel;
  }

  public static void injectSpHelper(MyMealsFragment instance, SharedPrefsHelper spHelper) {
    instance.spHelper = spHelper;
  }
}
