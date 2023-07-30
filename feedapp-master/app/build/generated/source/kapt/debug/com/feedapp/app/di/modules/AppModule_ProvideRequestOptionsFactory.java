package com.feedapp.app.di.modules;

import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRequestOptionsFactory implements Factory<RequestOptions> {
  private final AppModule module;

  public AppModule_ProvideRequestOptionsFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public RequestOptions get() {
    return provideInstance(module);
  }

  public static RequestOptions provideInstance(AppModule module) {
    return proxyProvideRequestOptions(module);
  }

  public static AppModule_ProvideRequestOptionsFactory create(AppModule module) {
    return new AppModule_ProvideRequestOptionsFactory(module);
  }

  public static RequestOptions proxyProvideRequestOptions(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideRequestOptions(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
