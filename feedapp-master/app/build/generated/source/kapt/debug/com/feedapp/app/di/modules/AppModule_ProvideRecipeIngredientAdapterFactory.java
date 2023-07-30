package com.feedapp.app.di.modules;

import android.app.Application;
import com.feedapp.app.ui.adapters.RecipeIngredientAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRecipeIngredientAdapterFactory
    implements Factory<RecipeIngredientAdapter> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideRecipeIngredientAdapterFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public RecipeIngredientAdapter get() {
    return provideInstance(module, applicationProvider);
  }

  public static RecipeIngredientAdapter provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyProvideRecipeIngredientAdapter(module, applicationProvider.get());
  }

  public static AppModule_ProvideRecipeIngredientAdapterFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideRecipeIngredientAdapterFactory(module, applicationProvider);
  }

  public static RecipeIngredientAdapter proxyProvideRecipeIngredientAdapter(
      AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideRecipeIngredientAdapter(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
