package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.FoodRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyMealsViewModel_Factory implements Factory<MyMealsViewModel> {
  private final Provider<FoodRepository> foodRepositoryProvider;

  public MyMealsViewModel_Factory(Provider<FoodRepository> foodRepositoryProvider) {
    this.foodRepositoryProvider = foodRepositoryProvider;
  }

  @Override
  public MyMealsViewModel get() {
    return provideInstance(foodRepositoryProvider);
  }

  public static MyMealsViewModel provideInstance(Provider<FoodRepository> foodRepositoryProvider) {
    return new MyMealsViewModel(foodRepositoryProvider.get());
  }

  public static MyMealsViewModel_Factory create(Provider<FoodRepository> foodRepositoryProvider) {
    return new MyMealsViewModel_Factory(foodRepositoryProvider);
  }

  public static MyMealsViewModel newMyMealsViewModel(FoodRepository foodRepository) {
    return new MyMealsViewModel(foodRepository);
  }
}
