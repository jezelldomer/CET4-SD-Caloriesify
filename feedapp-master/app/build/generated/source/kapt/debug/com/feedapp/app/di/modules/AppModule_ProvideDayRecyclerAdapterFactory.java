package com.feedapp.app.di.modules;

import com.feedapp.app.ui.adapters.DayRecyclerAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDayRecyclerAdapterFactory
    implements Factory<DayRecyclerAdapter> {
  private final AppModule module;

  public AppModule_ProvideDayRecyclerAdapterFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public DayRecyclerAdapter get() {
    return provideInstance(module);
  }

  public static DayRecyclerAdapter provideInstance(AppModule module) {
    return proxyProvideDayRecyclerAdapter(module);
  }

  public static AppModule_ProvideDayRecyclerAdapterFactory create(AppModule module) {
    return new AppModule_ProvideDayRecyclerAdapterFactory(module);
  }

  public static DayRecyclerAdapter proxyProvideDayRecyclerAdapter(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDayRecyclerAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
