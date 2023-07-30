package com.feedapp.app.data.models.prefs;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SharedPrefsHelper_Factory implements Factory<SharedPrefsHelper> {
  private final Provider<SharedPreferences> spProvider;

  public SharedPrefsHelper_Factory(Provider<SharedPreferences> spProvider) {
    this.spProvider = spProvider;
  }

  @Override
  public SharedPrefsHelper get() {
    return provideInstance(spProvider);
  }

  public static SharedPrefsHelper provideInstance(Provider<SharedPreferences> spProvider) {
    return new SharedPrefsHelper(spProvider.get());
  }

  public static SharedPrefsHelper_Factory create(Provider<SharedPreferences> spProvider) {
    return new SharedPrefsHelper_Factory(spProvider);
  }

  public static SharedPrefsHelper newSharedPrefsHelper(SharedPreferences sp) {
    return new SharedPrefsHelper(sp);
  }
}
