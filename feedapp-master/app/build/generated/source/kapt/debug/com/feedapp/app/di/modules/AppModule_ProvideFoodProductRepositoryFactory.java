package com.feedapp.app.di.modules;

import android.app.Application;
import com.feedapp.app.data.databases.daos.FoodProductDao;
import com.feedapp.app.data.repositories.FoodRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideFoodProductRepositoryFactory
    implements Factory<FoodRepository> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<FoodProductDao> foodProductDaoProvider;

  public AppModule_ProvideFoodProductRepositoryFactory(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<FoodProductDao> foodProductDaoProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.foodProductDaoProvider = foodProductDaoProvider;
  }

  @Override
  public FoodRepository get() {
    return provideInstance(module, applicationProvider, foodProductDaoProvider);
  }

  public static FoodRepository provideInstance(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<FoodProductDao> foodProductDaoProvider) {
    return proxyProvideFoodProductRepository(
        module, applicationProvider.get(), foodProductDaoProvider.get());
  }

  public static AppModule_ProvideFoodProductRepositoryFactory create(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<FoodProductDao> foodProductDaoProvider) {
    return new AppModule_ProvideFoodProductRepositoryFactory(
        module, applicationProvider, foodProductDaoProvider);
  }

  public static FoodRepository proxyProvideFoodProductRepository(
      AppModule instance, Application application, FoodProductDao foodProductDao) {
    return Preconditions.checkNotNull(
        instance.provideFoodProductRepository(application, foodProductDao),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
