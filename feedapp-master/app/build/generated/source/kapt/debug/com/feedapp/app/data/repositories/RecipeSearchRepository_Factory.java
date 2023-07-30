package com.feedapp.app.data.repositories;

import android.app.Application;
import com.feedapp.app.data.api.interfaces.RecipeApiSearch;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecipeSearchRepository_Factory implements Factory<RecipeSearchRepository> {
  private final Provider<Application> applicationProvider;

  private final Provider<RecipeApiSearch> recipeApiSearchResultProvider;

  public RecipeSearchRepository_Factory(
      Provider<Application> applicationProvider,
      Provider<RecipeApiSearch> recipeApiSearchResultProvider) {
    this.applicationProvider = applicationProvider;
    this.recipeApiSearchResultProvider = recipeApiSearchResultProvider;
  }

  @Override
  public RecipeSearchRepository get() {
    return provideInstance(applicationProvider, recipeApiSearchResultProvider);
  }

  public static RecipeSearchRepository provideInstance(
      Provider<Application> applicationProvider,
      Provider<RecipeApiSearch> recipeApiSearchResultProvider) {
    return new RecipeSearchRepository(
        applicationProvider.get(), recipeApiSearchResultProvider.get());
  }

  public static RecipeSearchRepository_Factory create(
      Provider<Application> applicationProvider,
      Provider<RecipeApiSearch> recipeApiSearchResultProvider) {
    return new RecipeSearchRepository_Factory(applicationProvider, recipeApiSearchResultProvider);
  }

  public static RecipeSearchRepository newRecipeSearchRepository(
      Application application, RecipeApiSearch recipeApiSearchResult) {
    return new RecipeSearchRepository(application, recipeApiSearchResult);
  }
}
