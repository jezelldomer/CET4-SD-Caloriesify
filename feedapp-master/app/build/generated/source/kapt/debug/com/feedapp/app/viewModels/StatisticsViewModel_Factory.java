package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.DayRepository;
import com.feedapp.app.data.repositories.StatisticsRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StatisticsViewModel_Factory implements Factory<StatisticsViewModel> {
  private final Provider<StatisticsRepository> statisticsRepositoryProvider;

  private final Provider<DayRepository> dayRepositoryProvider;

  public StatisticsViewModel_Factory(
      Provider<StatisticsRepository> statisticsRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider) {
    this.statisticsRepositoryProvider = statisticsRepositoryProvider;
    this.dayRepositoryProvider = dayRepositoryProvider;
  }

  @Override
  public StatisticsViewModel get() {
    return provideInstance(statisticsRepositoryProvider, dayRepositoryProvider);
  }

  public static StatisticsViewModel provideInstance(
      Provider<StatisticsRepository> statisticsRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider) {
    return new StatisticsViewModel(statisticsRepositoryProvider.get(), dayRepositoryProvider.get());
  }

  public static StatisticsViewModel_Factory create(
      Provider<StatisticsRepository> statisticsRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider) {
    return new StatisticsViewModel_Factory(statisticsRepositoryProvider, dayRepositoryProvider);
  }

  public static StatisticsViewModel newStatisticsViewModel(
      StatisticsRepository statisticsRepository, DayRepository dayRepository) {
    return new StatisticsViewModel(statisticsRepository, dayRepository);
  }
}
