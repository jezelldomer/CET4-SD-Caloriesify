package com.feedapp.app.di.other;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ViewModelProviderFactory_Factory implements Factory<ViewModelProviderFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider;

  public ViewModelProviderFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    this.viewModelsProvider = viewModelsProvider;
  }

  @Override
  public ViewModelProviderFactory get() {
    return provideInstance(viewModelsProvider);
  }

  public static ViewModelProviderFactory provideInstance(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    return new ViewModelProviderFactory(viewModelsProvider.get());
  }

  public static ViewModelProviderFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    return new ViewModelProviderFactory_Factory(viewModelsProvider);
  }

  public static ViewModelProviderFactory newViewModelProviderFactory(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModels) {
    return new ViewModelProviderFactory(viewModels);
  }
}
