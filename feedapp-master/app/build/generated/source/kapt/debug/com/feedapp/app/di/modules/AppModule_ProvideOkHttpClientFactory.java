package com.feedapp.app.di.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  private final Provider<Interceptor> networkInterceptorProvider;

  private final Provider<Interceptor> offlineInterceptorProvider;

  public AppModule_ProvideOkHttpClientFactory(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<Interceptor> networkInterceptorProvider,
      Provider<Interceptor> offlineInterceptorProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
    this.networkInterceptorProvider = networkInterceptorProvider;
    this.offlineInterceptorProvider = offlineInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideInstance(
        module,
        applicationProvider,
        httpLoggingInterceptorProvider,
        networkInterceptorProvider,
        offlineInterceptorProvider);
  }

  public static OkHttpClient provideInstance(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<Interceptor> networkInterceptorProvider,
      Provider<Interceptor> offlineInterceptorProvider) {
    return proxyProvideOkHttpClient(
        module,
        applicationProvider.get(),
        httpLoggingInterceptorProvider.get(),
        networkInterceptorProvider.get(),
        offlineInterceptorProvider.get());
  }

  public static AppModule_ProvideOkHttpClientFactory create(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<Interceptor> networkInterceptorProvider,
      Provider<Interceptor> offlineInterceptorProvider) {
    return new AppModule_ProvideOkHttpClientFactory(
        module,
        applicationProvider,
        httpLoggingInterceptorProvider,
        networkInterceptorProvider,
        offlineInterceptorProvider);
  }

  public static OkHttpClient proxyProvideOkHttpClient(
      AppModule instance,
      Application application,
      HttpLoggingInterceptor httpLoggingInterceptor,
      Interceptor networkInterceptor,
      Interceptor offlineInterceptor) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClient(
            application, httpLoggingInterceptor, networkInterceptor, offlineInterceptor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
