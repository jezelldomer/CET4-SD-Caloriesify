package com.feedapp.app.data.repositories;

import android.content.Context;
import com.feedapp.app.data.databases.daos.FoodProductDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FoodRepository_Factory implements Factory<FoodRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<FoodProductDao> foodProductDaoProvider;

  public FoodRepository_Factory(
      Provider<Context> contextProvider, Provider<FoodProductDao> foodProductDaoProvider) {
    this.contextProvider = contextProvider;
    this.foodProductDaoProvider = foodProductDaoProvider;
  }

  @Override
  public FoodRepository get() {
    return provideInstance(contextProvider, foodProductDaoProvider);
  }

  public static FoodRepository provideInstance(
      Provider<Context> contextProvider, Provider<FoodProductDao> foodProductDaoProvider) {
    return new FoodRepository(contextProvider.get(), foodProductDaoProvider.get());
  }

  public static FoodRepository_Factory create(
      Provider<Context> contextProvider, Provider<FoodProductDao> foodProductDaoProvider) {
    return new FoodRepository_Factory(contextProvider, foodProductDaoProvider);
  }

  public static FoodRepository newFoodRepository(Context context, FoodProductDao foodProductDao) {
    return new FoodRepository(context, foodProductDao);
  }
}
