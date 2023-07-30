package com.feedapp.app.viewModels;

import com.feedapp.app.data.models.calculations.RecipesDetailsCalculator;
import com.feedapp.app.data.repositories.DayRepository;
import com.feedapp.app.data.repositories.RecipeSearchRepository;
import com.feedapp.app.data.repositories.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailedRecipeViewModel_Factory implements Factory<DetailedRecipeViewModel> {
  private final Provider<RecipeSearchRepository> recipeSearchRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<DayRepository> dayRepositoryProvider;

  private final Provider<RecipesDetailsCalculator> recipesDetailsCalculatorProvider;

  public DetailedRecipeViewModel_Factory(
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider,
      Provider<RecipesDetailsCalculator> recipesDetailsCalculatorProvider) {
    this.recipeSearchRepositoryProvider = recipeSearchRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.dayRepositoryProvider = dayRepositoryProvider;
    this.recipesDetailsCalculatorProvider = recipesDetailsCalculatorProvider;
  }

  @Override
  public DetailedRecipeViewModel get() {
    return provideInstance(
        recipeSearchRepositoryProvider,
        userRepositoryProvider,
        dayRepositoryProvider,
        recipesDetailsCalculatorProvider);
  }

  public static DetailedRecipeViewModel provideInstance(
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider,
      Provider<RecipesDetailsCalculator> recipesDetailsCalculatorProvider) {
    return new DetailedRecipeViewModel(
        recipeSearchRepositoryProvider.get(),
        userRepositoryProvider.get(),
        dayRepositoryProvider.get(),
        recipesDetailsCalculatorProvider.get());
  }

  public static DetailedRecipeViewModel_Factory create(
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider,
      Provider<RecipesDetailsCalculator> recipesDetailsCalculatorProvider) {
    return new DetailedRecipeViewModel_Factory(
        recipeSearchRepositoryProvider,
        userRepositoryProvider,
        dayRepositoryProvider,
        recipesDetailsCalculatorProvider);
  }

  public static DetailedRecipeViewModel newDetailedRecipeViewModel(
      RecipeSearchRepository recipeSearchRepository,
      UserRepository userRepository,
      DayRepository dayRepository,
      RecipesDetailsCalculator recipesDetailsCalculator) {
    return new DetailedRecipeViewModel(
        recipeSearchRepository, userRepository, dayRepository, recipesDetailsCalculator);
  }
}
