package com.feedapp.app.di.modules;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSPEditorFactory implements Factory<SharedPreferences.Editor> {
  private final AppModule module;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public AppModule_ProvideSPEditorFactory(
      AppModule module, Provider<SharedPreferences> sharedPreferencesProvider) {
    this.module = module;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPreferences.Editor get() {
    return provideInstance(module, sharedPreferencesProvider);
  }

  public static SharedPreferences.Editor provideInstance(
      AppModule module, Provider<SharedPreferences> sharedPreferencesProvider) {
    return proxyProvideSPEditor(module, sharedPreferencesProvider.get());
  }

  public static AppModule_ProvideSPEditorFactory create(
      AppModule module, Provider<SharedPreferences> sharedPreferencesProvider) {
    return new AppModule_ProvideSPEditorFactory(module, sharedPreferencesProvider);
  }

  public static SharedPreferences.Editor proxyProvideSPEditor(
      AppModule instance, SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNull(
        instance.provideSPEditor(sharedPreferences),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
