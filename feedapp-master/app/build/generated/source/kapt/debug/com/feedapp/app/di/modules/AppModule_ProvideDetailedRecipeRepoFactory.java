package com.feedapp.app.di.modules;

import com.feedapp.app.data.models.calculations.RecipesDetailsCalculator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDetailedRecipeRepoFactory
    implements Factory<RecipesDetailsCalculator> {
  private final AppModule module;

  public AppModule_ProvideDetailedRecipeRepoFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public RecipesDetailsCalculator get() {
    return provideInstance(module);
  }

  public static RecipesDetailsCalculator provideInstance(AppModule module) {
    return proxyProvideDetailedRecipeRepo(module);
  }

  public static AppModule_ProvideDetailedRecipeRepoFactory create(AppModule module) {
    return new AppModule_ProvideDetailedRecipeRepoFactory(module);
  }

  public static RecipesDetailsCalculator proxyProvideDetailedRecipeRepo(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDetailedRecipeRepo(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
