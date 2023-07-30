package com.feedapp.app.viewModels;

import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import com.feedapp.app.data.repositories.IntroductionRepository;
import com.feedapp.app.data.repositories.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IntroductionViewModel_Factory implements Factory<IntroductionViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<IntroductionRepository> introductionRepositoryProvider;

  private final Provider<SharedPrefsHelper> spHelperProvider;

  public IntroductionViewModel_Factory(
      Provider<UserRepository> userRepositoryProvider,
      Provider<IntroductionRepository> introductionRepositoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.introductionRepositoryProvider = introductionRepositoryProvider;
    this.spHelperProvider = spHelperProvider;
  }

  @Override
  public IntroductionViewModel get() {
    return provideInstance(
        userRepositoryProvider, introductionRepositoryProvider, spHelperProvider);
  }

  public static IntroductionViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider,
      Provider<IntroductionRepository> introductionRepositoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    return new IntroductionViewModel(
        userRepositoryProvider.get(), introductionRepositoryProvider.get(), spHelperProvider.get());
  }

  public static IntroductionViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider,
      Provider<IntroductionRepository> introductionRepositoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    return new IntroductionViewModel_Factory(
        userRepositoryProvider, introductionRepositoryProvider, spHelperProvider);
  }

  public static IntroductionViewModel newIntroductionViewModel(
      UserRepository userRepository,
      IntroductionRepository introductionRepository,
      SharedPrefsHelper spHelper) {
    return new IntroductionViewModel(userRepository, introductionRepository, spHelper);
  }
}
