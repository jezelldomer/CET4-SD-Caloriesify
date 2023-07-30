package com.feedapp.app.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRetrofitInstanceFactory implements Factory<Retrofit> {
  private final AppModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideRetrofitInstanceFactory(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(module, okHttpClientProvider);
  }

  public static Retrofit provideInstance(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return proxyProvideRetrofitInstance(module, okHttpClientProvider.get());
  }

  public static AppModule_ProvideRetrofitInstanceFactory create(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideRetrofitInstanceFactory(module, okHttpClientProvider);
  }

  public static Retrofit proxyProvideRetrofitInstance(
      AppModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        instance.provideRetrofitInstance(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
