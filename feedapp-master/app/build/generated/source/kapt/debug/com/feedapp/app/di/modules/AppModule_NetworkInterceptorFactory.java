package com.feedapp.app.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.Interceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_NetworkInterceptorFactory implements Factory<Interceptor> {
  private final AppModule module;

  public AppModule_NetworkInterceptorFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Interceptor get() {
    return provideInstance(module);
  }

  public static Interceptor provideInstance(AppModule module) {
    return proxyNetworkInterceptor(module);
  }

  public static AppModule_NetworkInterceptorFactory create(AppModule module) {
    return new AppModule_NetworkInterceptorFactory(module);
  }

  public static Interceptor proxyNetworkInterceptor(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.networkInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
