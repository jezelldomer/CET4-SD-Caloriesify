package com.feedapp.app.di.modules;

import android.app.Application;
import com.feedapp.app.data.api.interfaces.RecipeApiSearch;
import com.feedapp.app.data.repositories.RecipeSearchRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRecipeSearchRepositoryFactory
    implements Factory<RecipeSearchRepository> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<RecipeApiSearch> recipeApiSearchProvider;

  public AppModule_ProvideRecipeSearchRepositoryFactory(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RecipeApiSearch> recipeApiSearchProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.recipeApiSearchProvider = recipeApiSearchProvider;
  }

  @Override
  public RecipeSearchRepository get() {
    return provideInstance(module, applicationProvider, recipeApiSearchProvider);
  }

  public static RecipeSearchRepository provideInstance(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RecipeApiSearch> recipeApiSearchProvider) {
    return proxyProvideRecipeSearchRepository(
        module, applicationProvider.get(), recipeApiSearchProvider.get());
  }

  public static AppModule_ProvideRecipeSearchRepositoryFactory create(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RecipeApiSearch> recipeApiSearchProvider) {
    return new AppModule_ProvideRecipeSearchRepositoryFactory(
        module, applicationProvider, recipeApiSearchProvider);
  }

  public static RecipeSearchRepository proxyProvideRecipeSearchRepository(
      AppModule instance, Application application, RecipeApiSearch recipeApiSearch) {
    return Preconditions.checkNotNull(
        instance.provideRecipeSearchRepository(application, recipeApiSearch),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
