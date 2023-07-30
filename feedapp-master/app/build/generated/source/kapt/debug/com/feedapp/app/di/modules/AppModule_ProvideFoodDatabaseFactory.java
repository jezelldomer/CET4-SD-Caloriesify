package com.feedapp.app.di.modules;

import android.app.Application;
import com.feedapp.app.data.databases.dbclasses.FoodDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideFoodDatabaseFactory implements Factory<FoodDatabase> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideFoodDatabaseFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public FoodDatabase get() {
    return provideInstance(module, applicationProvider);
  }

  public static FoodDatabase provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyProvideFoodDatabase(module, applicationProvider.get());
  }

  public static AppModule_ProvideFoodDatabaseFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideFoodDatabaseFactory(module, applicationProvider);
  }

  public static FoodDatabase proxyProvideFoodDatabase(AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideFoodDatabase(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
