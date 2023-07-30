package com.feedapp.app.di.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_OfflineInterceptorFactory implements Factory<Interceptor> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_OfflineInterceptorFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Interceptor get() {
    return provideInstance(module, applicationProvider);
  }

  public static Interceptor provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyOfflineInterceptor(module, applicationProvider.get());
  }

  public static AppModule_OfflineInterceptorFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_OfflineInterceptorFactory(module, applicationProvider);
  }

  public static Interceptor proxyOfflineInterceptor(AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.offlineInterceptor(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
