package com.feedapp.app.di.modules;

import com.feedapp.app.data.models.calculations.LeftNutrientCalculator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideLeftNutrientCalculatorFactory
    implements Factory<LeftNutrientCalculator> {
  private final AppModule module;

  public AppModule_ProvideLeftNutrientCalculatorFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public LeftNutrientCalculator get() {
    return provideInstance(module);
  }

  public static LeftNutrientCalculator provideInstance(AppModule module) {
    return proxyProvideLeftNutrientCalculator(module);
  }

  public static AppModule_ProvideLeftNutrientCalculatorFactory create(AppModule module) {
    return new AppModule_ProvideLeftNutrientCalculatorFactory(module);
  }

  public static LeftNutrientCalculator proxyProvideLeftNutrientCalculator(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideLeftNutrientCalculator(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
