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
public final class AppModule_ProvideRetrofitInstanceSpoonacularFactory
    implements Factory<Retrofit> {
  private final AppModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideRetrofitInstanceSpoonacularFactory(
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
    return proxyProvideRetrofitInstanceSpoonacular(module, okHttpClientProvider.get());
  }

  public static AppModule_ProvideRetrofitInstanceSpoonacularFactory create(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideRetrofitInstanceSpoonacularFactory(module, okHttpClientProvider);
  }

  public static Retrofit proxyProvideRetrofitInstanceSpoonacular(
      AppModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        instance.provideRetrofitInstanceSpoonacular(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
