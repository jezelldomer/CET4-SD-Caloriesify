package com.feedapp.app.viewModels;

import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import com.feedapp.app.data.repositories.DayRepository;
import com.feedapp.app.data.repositories.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<DayRepository> dayRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<SharedPrefsHelper> spHelperProvider;

  public HomeViewModel_Factory(
      Provider<DayRepository> dayRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    this.dayRepositoryProvider = dayRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.spHelperProvider = spHelperProvider;
  }

  @Override
  public HomeViewModel get() {
    return provideInstance(dayRepositoryProvider, userRepositoryProvider, spHelperProvider);
  }

  public static HomeViewModel provideInstance(
      Provider<DayRepository> dayRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    return new HomeViewModel(
        dayRepositoryProvider.get(), userRepositoryProvider.get(), spHelperProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<DayRepository> dayRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<SharedPrefsHelper> spHelperProvider) {
    return new HomeViewModel_Factory(
        dayRepositoryProvider, userRepositoryProvider, spHelperProvider);
  }

  public static HomeViewModel newHomeViewModel(
      DayRepository dayRepository, UserRepository userRepository, SharedPrefsHelper spHelper) {
    return new HomeViewModel(dayRepository, userRepository, spHelper);
  }
}
