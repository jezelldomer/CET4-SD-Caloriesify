package com.feedapp.app.di.modules;

import com.feedapp.app.data.api.interfaces.RecipeApiSearch;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRecipeApiSearchResultFactory
    implements Factory<RecipeApiSearch> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideRecipeApiSearchResultFactory(
      AppModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RecipeApiSearch get() {
    return provideInstance(module, retrofitProvider);
  }

  public static RecipeApiSearch provideInstance(
      AppModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvideRecipeApiSearchResult(module, retrofitProvider.get());
  }

  public static AppModule_ProvideRecipeApiSearchResultFactory create(
      AppModule module, Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideRecipeApiSearchResultFactory(module, retrofitProvider);
  }

  public static RecipeApiSearch proxyProvideRecipeApiSearchResult(
      AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideRecipeApiSearchResult(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
