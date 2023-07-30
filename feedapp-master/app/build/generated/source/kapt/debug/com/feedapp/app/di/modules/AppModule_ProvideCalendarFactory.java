package com.feedapp.app.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Calendar;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCalendarFactory implements Factory<Calendar> {
  private final AppModule module;

  public AppModule_ProvideCalendarFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Calendar get() {
    return provideInstance(module);
  }

  public static Calendar provideInstance(AppModule module) {
    return proxyProvideCalendar(module);
  }

  public static AppModule_ProvideCalendarFactory create(AppModule module) {
    return new AppModule_ProvideCalendarFactory(module);
  }

  public static Calendar proxyProvideCalendar(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideCalendar(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
