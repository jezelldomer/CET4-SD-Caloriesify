package com.feedapp.app.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideOkHttpClientUSDAFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  public AppModule_ProvideOkHttpClientUSDAFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideInstance(module);
  }

  public static OkHttpClient provideInstance(AppModule module) {
    return proxyProvideOkHttpClientUSDA(module);
  }

  public static AppModule_ProvideOkHttpClientUSDAFactory create(AppModule module) {
    return new AppModule_ProvideOkHttpClientUSDAFactory(module);
  }

  public static OkHttpClient proxyProvideOkHttpClientUSDA(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClientUSDA(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
