package com.feedapp.app.viewModels;

import android.content.SharedPreferences;
import com.feedapp.app.data.repositories.RecipeSearchRepository;
import com.feedapp.app.data.repositories.UserRepository;
import dagger.internal.Factory;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecipeSearchViewModel_Factory implements Factory<RecipeSearchViewModel> {
  private final Provider<Calendar> calendarProvider;

  private final Provider<SharedPreferences> spProvider;

  private final Provider<RecipeSearchRepository> recipeSearchRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public RecipeSearchViewModel_Factory(
      Provider<Calendar> calendarProvider,
      Provider<SharedPreferences> spProvider,
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.calendarProvider = calendarProvider;
    this.spProvider = spProvider;
    this.recipeSearchRepositoryProvider = recipeSearchRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public RecipeSearchViewModel get() {
    return provideInstance(
        calendarProvider, spProvider, recipeSearchRepositoryProvider, userRepositoryProvider);
  }

  public static RecipeSearchViewModel provideInstance(
      Provider<Calendar> calendarProvider,
      Provider<SharedPreferences> spProvider,
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new RecipeSearchViewModel(
        calendarProvider.get(),
        spProvider.get(),
        recipeSearchRepositoryProvider.get(),
        userRepositoryProvider.get());
  }

  public static RecipeSearchViewModel_Factory create(
      Provider<Calendar> calendarProvider,
      Provider<SharedPreferences> spProvider,
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new RecipeSearchViewModel_Factory(
        calendarProvider, spProvider, recipeSearchRepositoryProvider, userRepositoryProvider);
  }

  public static RecipeSearchViewModel newRecipeSearchViewModel(
      Calendar calendar,
      SharedPreferences sp,
      RecipeSearchRepository recipeSearchRepository,
      UserRepository userRepository) {
    return new RecipeSearchViewModel(calendar, sp, recipeSearchRepository, userRepository);
  }
}
