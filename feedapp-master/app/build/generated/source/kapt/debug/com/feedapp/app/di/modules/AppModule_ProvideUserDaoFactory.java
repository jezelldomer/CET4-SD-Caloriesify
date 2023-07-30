package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.UserDao;
import com.feedapp.app.data.databases.dbclasses.UserDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideUserDaoFactory implements Factory<UserDao> {
  private final AppModule module;

  private final Provider<UserDatabase> databaseProvider;

  public AppModule_ProvideUserDaoFactory(
      AppModule module, Provider<UserDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public UserDao get() {
    return provideInstance(module, databaseProvider);
  }

  public static UserDao provideInstance(AppModule module, Provider<UserDatabase> databaseProvider) {
    return proxyProvideUserDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideUserDaoFactory create(
      AppModule module, Provider<UserDatabase> databaseProvider) {
    return new AppModule_ProvideUserDaoFactory(module, databaseProvider);
  }

  public static UserDao proxyProvideUserDao(AppModule instance, UserDatabase database) {
    return Preconditions.checkNotNull(
        instance.provideUserDao(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}