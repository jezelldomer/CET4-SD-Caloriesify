package com.feedapp.app.di.modules;

import android.app.Application;
import com.feedapp.app.data.databases.dbclasses.UserDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideUserDatabaseFactory implements Factory<UserDatabase> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideUserDatabaseFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public UserDatabase get() {
    return provideInstance(module, applicationProvider);
  }

  public static UserDatabase provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyProvideUserDatabase(module, applicationProvider.get());
  }

  public static AppModule_ProvideUserDatabaseFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideUserDatabaseFactory(module, applicationProvider);
  }

  public static UserDatabase proxyProvideUserDatabase(AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideUserDatabase(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
