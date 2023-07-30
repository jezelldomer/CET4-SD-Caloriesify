package com.feedapp.app.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideHttpLoggingInterceptorFactory
    implements Factory<HttpLoggingInterceptor> {
  private final AppModule module;

  public AppModule_ProvideHttpLoggingInterceptorFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideInstance(module);
  }

  public static HttpLoggingInterceptor provideInstance(AppModule module) {
    return proxyProvideHttpLoggingInterceptor(module);
  }

  public static AppModule_ProvideHttpLoggingInterceptorFactory create(AppModule module) {
    return new AppModule_ProvideHttpLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor proxyProvideHttpLoggingInterceptor(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideHttpLoggingInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
