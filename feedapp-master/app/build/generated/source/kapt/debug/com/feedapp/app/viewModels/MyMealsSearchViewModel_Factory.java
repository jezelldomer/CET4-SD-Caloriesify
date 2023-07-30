package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.FoodRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyMealsSearchViewModel_Factory implements Factory<MyMealsSearchViewModel> {
  private final Provider<FoodRepository> foodRepositoryProvider;

  public MyMealsSearchViewModel_Factory(Provider<FoodRepository> foodRepositoryProvider) {
    this.foodRepositoryProvider = foodRepositoryProvider;
  }

  @Override
  public MyMealsSearchViewModel get() {
    return provideInstance(foodRepositoryProvider);
  }

  public static MyMealsSearchViewModel provideInstance(
      Provider<FoodRepository> foodRepositoryProvider) {
    return new MyMealsSearchViewModel(foodRepositoryProvider.get());
  }

  public static MyMealsSearchViewModel_Factory create(
      Provider<FoodRepository> foodRepositoryProvider) {
    return new MyMealsSearchViewModel_Factory(foodRepositoryProvider);
  }

  public static MyMealsSearchViewModel newMyMealsSearchViewModel(FoodRepository foodRepository) {
    return new MyMealsSearchViewModel(foodRepository);
  }
}
