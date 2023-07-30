package com.feedapp.app.data.repositories;

import com.feedapp.app.data.databases.daos.DayDao;
import dagger.internal.Factory;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StatisticsRepository_Factory implements Factory<StatisticsRepository> {
  private final Provider<DayDao> dayDaoProvider;

  private final Provider<Calendar> calendarProvider;

  public StatisticsRepository_Factory(
      Provider<DayDao> dayDaoProvider, Provider<Calendar> calendarProvider) {
    this.dayDaoProvider = dayDaoProvider;
    this.calendarProvider = calendarProvider;
  }

  @Override
  public StatisticsRepository get() {
    return provideInstance(dayDaoProvider, calendarProvider);
  }

  public static StatisticsRepository provideInstance(
      Provider<DayDao> dayDaoProvider, Provider<Calendar> calendarProvider) {
    return new StatisticsRepository(dayDaoProvider.get(), calendarProvider.get());
  }

  public static StatisticsRepository_Factory create(
      Provider<DayDao> dayDaoProvider, Provider<Calendar> calendarProvider) {
    return new StatisticsRepository_Factory(dayDaoProvider, calendarProvider);
  }

  public static StatisticsRepository newStatisticsRepository(DayDao dayDao, Calendar calendar) {
    return new StatisticsRepository(dayDao, calendar);
  }
}
