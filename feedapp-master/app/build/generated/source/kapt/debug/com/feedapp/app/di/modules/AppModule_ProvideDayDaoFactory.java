package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.DayDao;
import com.feedapp.app.data.databases.dbclasses.UserDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDayDaoFactory implements Factory<DayDao> {
  private final AppModule module;

  private final Provider<UserDatabase> databaseProvider;

  public AppModule_ProvideDayDaoFactory(AppModule module, Provider<UserDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public DayDao get() {
    return provideInstance(module, databaseProvider);
  }

  public static DayDao provideInstance(AppModule module, Provider<UserDatabase> databaseProvider) {
    return proxyProvideDayDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideDayDaoFactory create(
      AppModule module, Provider<UserDatabase> databaseProvider) {
    return new AppModule_ProvideDayDaoFactory(module, databaseProvider);
  }

  public static DayDao proxyProvideDayDao(AppModule instance, UserDatabase database) {
    return Preconditions.checkNotNull(
        instance.provideDayDao(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
