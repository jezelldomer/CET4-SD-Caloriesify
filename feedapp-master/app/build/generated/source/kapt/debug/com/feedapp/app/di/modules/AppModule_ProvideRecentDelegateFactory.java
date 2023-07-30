package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.RecentDao;
import com.feedapp.app.data.repositories.RecentDelegate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRecentDelegateFactory implements Factory<RecentDelegate> {
  private final AppModule module;

  private final Provider<RecentDao> recentDaoProvider;

  public AppModule_ProvideRecentDelegateFactory(
      AppModule module, Provider<RecentDao> recentDaoProvider) {
    this.module = module;
    this.recentDaoProvider = recentDaoProvider;
  }

  @Override
  public RecentDelegate get() {
    return provideInstance(module, recentDaoProvider);
  }

  public static RecentDelegate provideInstance(
      AppModule module, Provider<RecentDao> recentDaoProvider) {
    return proxyProvideRecentDelegate(module, recentDaoProvider.get());
  }

  public static AppModule_ProvideRecentDelegateFactory create(
      AppModule module, Provider<RecentDao> recentDaoProvider) {
    return new AppModule_ProvideRecentDelegateFactory(module, recentDaoProvider);
  }

  public static RecentDelegate proxyProvideRecentDelegate(AppModule instance, RecentDao recentDao) {
    return Preconditions.checkNotNull(
        instance.provideRecentDelegate(recentDao),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
