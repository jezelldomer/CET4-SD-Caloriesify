package com.feedapp.app.ui.fragments.home;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.feedapp.app.ui.adapters.DayRecyclerAdapter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DayFragment_MembersInjector implements MembersInjector<DayFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<DayRecyclerAdapter> dayRecyclerAdapterProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public DayFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<DayRecyclerAdapter> dayRecyclerAdapterProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.dayRecyclerAdapterProvider = dayRecyclerAdapterProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  public static MembersInjector<DayFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<DayRecyclerAdapter> dayRecyclerAdapterProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new DayFragment_MembersInjector(
        childFragmentInjectorProvider, dayRecyclerAdapterProvider, modelFactoryProvider);
  }

  @Override
  public void injectMembers(DayFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectDayRecyclerAdapter(instance, dayRecyclerAdapterProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
  }

  public static void injectDayRecyclerAdapter(
      DayFragment instance, DayRecyclerAdapter dayRecyclerAdapter) {
    instance.dayRecyclerAdapter = dayRecyclerAdapter;
  }

  public static void injectModelFactory(
      DayFragment instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }
}
