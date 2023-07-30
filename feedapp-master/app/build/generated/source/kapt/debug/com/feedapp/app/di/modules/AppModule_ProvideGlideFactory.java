package com.feedapp.app.di.modules;

import android.app.Application;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideGlideFactory implements Factory<RequestManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<RequestOptions> requestOptionsProvider;

  public AppModule_ProvideGlideFactory(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.requestOptionsProvider = requestOptionsProvider;
  }

  @Override
  public RequestManager get() {
    return provideInstance(module, applicationProvider, requestOptionsProvider);
  }

  public static RequestManager provideInstance(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    return proxyProvideGlide(module, applicationProvider.get(), requestOptionsProvider.get());
  }

  public static AppModule_ProvideGlideFactory create(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    return new AppModule_ProvideGlideFactory(module, applicationProvider, requestOptionsProvider);
  }

  public static RequestManager proxyProvideGlide(
      AppModule instance, Application application, RequestOptions requestOptions) {
    return Preconditions.checkNotNull(
        instance.provideGlide(application, requestOptions),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
