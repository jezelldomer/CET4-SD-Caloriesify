package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.FoodRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddCustomProductViewModel_Factory implements Factory<AddCustomProductViewModel> {
  private final Provider<FoodRepository> foodRepositoryProvider;

  public AddCustomProductViewModel_Factory(Provider<FoodRepository> foodRepositoryProvider) {
    this.foodRepositoryProvider = foodRepositoryProvider;
  }

  @Override
  public AddCustomProductViewModel get() {
    return provideInstance(foodRepositoryProvider);
  }

  public static AddCustomProductViewModel provideInstance(
      Provider<FoodRepository> foodRepositoryProvider) {
    return new AddCustomProductViewModel(foodRepositoryProvider.get());
  }

  public static AddCustomProductViewModel_Factory create(
      Provider<FoodRepository> foodRepositoryProvider) {
    return new AddCustomProductViewModel_Factory(foodRepositoryProvider);
  }

  public static AddCustomProductViewModel newAddCustomProductViewModel(
      FoodRepository foodRepository) {
    return new AddCustomProductViewModel(foodRepository);
  }
}
