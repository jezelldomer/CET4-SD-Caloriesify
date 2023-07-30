package com.feedapp.app.di.modules;

import com.feedapp.app.ui.adapters.RecipeStepAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideStepRecyclerAdapterFactory
    implements Factory<RecipeStepAdapter> {
  private final AppModule module;

  public AppModule_ProvideStepRecyclerAdapterFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public RecipeStepAdapter get() {
    return provideInstance(module);
  }

  public static RecipeStepAdapter provideInstance(AppModule module) {
    return proxyProvideStepRecyclerAdapter(module);
  }

  public static AppModule_ProvideStepRecyclerAdapterFactory create(AppModule module) {
    return new AppModule_ProvideStepRecyclerAdapterFactory(module);
  }

  public static RecipeStepAdapter proxyProvideStepRecyclerAdapter(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideStepRecyclerAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
