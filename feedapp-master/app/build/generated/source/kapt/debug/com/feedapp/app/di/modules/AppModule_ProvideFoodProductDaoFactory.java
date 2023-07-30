package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.FoodProductDao;
import com.feedapp.app.data.databases.dbclasses.FoodDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideFoodProductDaoFactory implements Factory<FoodProductDao> {
  private final AppModule module;

  private final Provider<FoodDatabase> databaseProvider;

  public AppModule_ProvideFoodProductDaoFactory(
      AppModule module, Provider<FoodDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public FoodProductDao get() {
    return provideInstance(module, databaseProvider);
  }

  public static FoodProductDao provideInstance(
      AppModule module, Provider<FoodDatabase> databaseProvider) {
    return proxyProvideFoodProductDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideFoodProductDaoFactory create(
      AppModule module, Provider<FoodDatabase> databaseProvider) {
    return new AppModule_ProvideFoodProductDaoFactory(module, databaseProvider);
  }

  public static FoodProductDao proxyProvideFoodProductDao(
      AppModule instance, FoodDatabase database) {
    return Preconditions.checkNotNull(
        instance.provideFoodProductDao(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
