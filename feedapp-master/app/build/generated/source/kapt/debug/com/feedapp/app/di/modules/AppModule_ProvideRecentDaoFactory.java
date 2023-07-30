package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.RecentDao;
import com.feedapp.app.data.databases.dbclasses.UserDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRecentDaoFactory implements Factory<RecentDao> {
  private final AppModule module;

  private final Provider<UserDatabase> userDatabaseProvider;

  public AppModule_ProvideRecentDaoFactory(
      AppModule module, Provider<UserDatabase> userDatabaseProvider) {
    this.module = module;
    this.userDatabaseProvider = userDatabaseProvider;
  }

  @Override
  public RecentDao get() {
    return provideInstance(module, userDatabaseProvider);
  }

  public static RecentDao provideInstance(
      AppModule module, Provider<UserDatabase> userDatabaseProvider) {
    return proxyProvideRecentDao(module, userDatabaseProvider.get());
  }

  public static AppModule_ProvideRecentDaoFactory create(
      AppModule module, Provider<UserDatabase> userDatabaseProvider) {
    return new AppModule_ProvideRecentDaoFactory(module, userDatabaseProvider);
  }

  public static RecentDao proxyProvideRecentDao(AppModule instance, UserDatabase userDatabase) {
    return Preconditions.checkNotNull(
        instance.provideRecentDao(userDatabase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
