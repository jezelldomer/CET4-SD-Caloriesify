package com.feedapp.app.ui.activities;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IntroductionActivity_MembersInjector
    implements MembersInjector<IntroductionActivity> {
  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public IntroductionActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.modelFactoryProvider = modelFactoryProvider;
  }

  public static MembersInjector<IntroductionActivity> create(
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new IntroductionActivity_MembersInjector(modelFactoryProvider);
  }

  @Override
  public void injectMembers(IntroductionActivity instance) {
    injectModelFactory(instance, modelFactoryProvider.get());
  }

  public static void injectModelFactory(
      IntroductionActivity instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }
}
