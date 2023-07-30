package com.feedapp.app.data.repositories;

import com.feedapp.app.data.databases.daos.RecentDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecentDelegate_Factory implements Factory<RecentDelegate> {
  private final Provider<RecentDao> recentDaoProvider;

  public RecentDelegate_Factory(Provider<RecentDao> recentDaoProvider) {
    this.recentDaoProvider = recentDaoProvider;
  }

  @Override
  public RecentDelegate get() {
    return provideInstance(recentDaoProvider);
  }

  public static RecentDelegate provideInstance(Provider<RecentDao> recentDaoProvider) {
    return new RecentDelegate(recentDaoProvider.get());
  }

  public static RecentDelegate_Factory create(Provider<RecentDao> recentDaoProvider) {
    return new RecentDelegate_Factory(recentDaoProvider);
  }

  public static RecentDelegate newRecentDelegate(RecentDao recentDao) {
    return new RecentDelegate(recentDao);
  }
}
