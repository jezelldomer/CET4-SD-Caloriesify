package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.FoodProductDao;
import com.feedapp.app.data.repositories.SearchFoodRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductSearchModule_ProvideSearchFoodRepositoryFactory
    implements Factory<SearchFoodRepository> {
  private final ProductSearchModule module;

  private final Provider<FoodProductDao> foodProductDaoProvider;

  public ProductSearchModule_ProvideSearchFoodRepositoryFactory(
      ProductSearchModule module, Provider<FoodProductDao> foodProductDaoProvider) {
    this.module = module;
    this.foodProductDaoProvider = foodProductDaoProvider;
  }

  @Override
  public SearchFoodRepository get() {
    return provideInstance(module, foodProductDaoProvider);
  }

  public static SearchFoodRepository provideInstance(
      ProductSearchModule module, Provider<FoodProductDao> foodProductDaoProvider) {
    return proxyProvideSearchFoodRepository(module, foodProductDaoProvider.get());
  }

  public static ProductSearchModule_ProvideSearchFoodRepositoryFactory create(
      ProductSearchModule module, Provider<FoodProductDao> foodProductDaoProvider) {
    return new ProductSearchModule_ProvideSearchFoodRepositoryFactory(
        module, foodProductDaoProvider);
  }

  public static SearchFoodRepository proxyProvideSearchFoodRepository(
      ProductSearchModule instance, FoodProductDao foodProductDao) {
    return Preconditions.checkNotNull(
        instance.provideSearchFoodRepository(foodProductDao),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
