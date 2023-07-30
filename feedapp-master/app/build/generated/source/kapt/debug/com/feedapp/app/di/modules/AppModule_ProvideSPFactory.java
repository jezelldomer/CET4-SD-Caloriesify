package com.feedapp.app.di.modules;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSPFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideSPFactory(AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module, applicationProvider);
  }

  public static SharedPreferences provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyProvideSP(module, applicationProvider.get());
  }

  public static AppModule_ProvideSPFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideSPFactory(module, applicationProvider);
  }

  public static SharedPreferences proxyProvideSP(AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideSP(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
