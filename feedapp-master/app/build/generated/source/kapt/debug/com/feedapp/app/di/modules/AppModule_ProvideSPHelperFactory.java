package com.feedapp.app.di.modules;

import android.content.SharedPreferences;
import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSPHelperFactory implements Factory<SharedPrefsHelper> {
  private final AppModule module;

  private final Provider<SharedPreferences> spProvider;

  public AppModule_ProvideSPHelperFactory(
      AppModule module, Provider<SharedPreferences> spProvider) {
    this.module = module;
    this.spProvider = spProvider;
  }

  @Override
  public SharedPrefsHelper get() {
    return provideInstance(module, spProvider);
  }

  public static SharedPrefsHelper provideInstance(
      AppModule module, Provider<SharedPreferences> spProvider) {
    return proxyProvideSPHelper(module, spProvider.get());
  }

  public static AppModule_ProvideSPHelperFactory create(
      AppModule module, Provider<SharedPreferences> spProvider) {
    return new AppModule_ProvideSPHelperFactory(module, spProvider);
  }

  public static SharedPrefsHelper proxyProvideSPHelper(AppModule instance, SharedPreferences sp) {
    return Preconditions.checkNotNull(
        instance.provideSPHelper(sp), "Cannot return null from a non-@Nullable @Provides method");
  }
}
