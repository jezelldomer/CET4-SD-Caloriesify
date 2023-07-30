package com.feedapp.app.data.repositories;

import com.feedapp.app.data.databases.daos.FoodProductDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchFoodRepository_Factory implements Factory<SearchFoodRepository> {
  private final Provider<FoodProductDao> foodProductDaoProvider;

  public SearchFoodRepository_Factory(Provider<FoodProductDao> foodProductDaoProvider) {
    this.foodProductDaoProvider = foodProductDaoProvider;
  }

  @Override
  public SearchFoodRepository get() {
    return provideInstance(foodProductDaoProvider);
  }

  public static SearchFoodRepository provideInstance(
      Provider<FoodProductDao> foodProductDaoProvider) {
    return new SearchFoodRepository(foodProductDaoProvider.get());
  }

  public static SearchFoodRepository_Factory create(
      Provider<FoodProductDao> foodProductDaoProvider) {
    return new SearchFoodRepository_Factory(foodProductDaoProvider);
  }

  public static SearchFoodRepository newSearchFoodRepository(FoodProductDao foodProductDao) {
    return new SearchFoodRepository(foodProductDao);
  }
}
