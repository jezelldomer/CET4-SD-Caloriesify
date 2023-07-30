package com.feedapp.app.data.repositories;

import com.feedapp.app.data.databases.daos.DayDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DayRepository_Factory implements Factory<DayRepository> {
  private final Provider<DayDao> dayDaoProvider;

  public DayRepository_Factory(Provider<DayDao> dayDaoProvider) {
    this.dayDaoProvider = dayDaoProvider;
  }

  @Override
  public DayRepository get() {
    return provideInstance(dayDaoProvider);
  }

  public static DayRepository provideInstance(Provider<DayDao> dayDaoProvider) {
    return new DayRepository(dayDaoProvider.get());
  }

  public static DayRepository_Factory create(Provider<DayDao> dayDaoProvider) {
    return new DayRepository_Factory(dayDaoProvider);
  }

  public static DayRepository newDayRepository(DayDao dayDao) {
    return new DayRepository(dayDao);
  }
}
