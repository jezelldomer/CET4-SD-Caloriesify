package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.RecentDelegate;
import com.feedapp.app.data.repositories.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<RecentDelegate> recentDelegateProvider;

  public SettingsViewModel_Factory(
      Provider<UserRepository> userRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.recentDelegateProvider = recentDelegateProvider;
  }

  @Override
  public SettingsViewModel get() {
    return provideInstance(userRepositoryProvider, recentDelegateProvider);
  }

  public static SettingsViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    return new SettingsViewModel(userRepositoryProvider.get(), recentDelegateProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    return new SettingsViewModel_Factory(userRepositoryProvider, recentDelegateProvider);
  }

  public static SettingsViewModel newSettingsViewModel(
      UserRepository userRepository, RecentDelegate recentDelegate) {
    return new SettingsViewModel(userRepository, recentDelegate);
  }
}
