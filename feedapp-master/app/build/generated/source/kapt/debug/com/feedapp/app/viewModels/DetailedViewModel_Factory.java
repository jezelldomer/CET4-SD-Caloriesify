package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.DayRepository;
import com.feedapp.app.data.repositories.RecentDelegate;
import com.feedapp.app.data.repositories.SearchFoodRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailedViewModel_Factory implements Factory<DetailedViewModel> {
  private final Provider<SearchFoodRepository> searchRepositoryProvider;

  private final Provider<DayRepository> dayRepositoryProvider;

  private final Provider<RecentDelegate> recentDelegateProvider;

  public DetailedViewModel_Factory(
      Provider<SearchFoodRepository> searchRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    this.searchRepositoryProvider = searchRepositoryProvider;
    this.dayRepositoryProvider = dayRepositoryProvider;
    this.recentDelegateProvider = recentDelegateProvider;
  }

  @Override
  public DetailedViewModel get() {
    return provideInstance(searchRepositoryProvider, dayRepositoryProvider, recentDelegateProvider);
  }

  public static DetailedViewModel provideInstance(
      Provider<SearchFoodRepository> searchRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    return new DetailedViewModel(
        searchRepositoryProvider.get(), dayRepositoryProvider.get(), recentDelegateProvider.get());
  }

  public static DetailedViewModel_Factory create(
      Provider<SearchFoodRepository> searchRepositoryProvider,
      Provider<DayRepository> dayRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    return new DetailedViewModel_Factory(
        searchRepositoryProvider, dayRepositoryProvider, recentDelegateProvider);
  }

  public static DetailedViewModel newDetailedViewModel(
      SearchFoodRepository searchRepository,
      DayRepository dayRepository,
      RecentDelegate recentDelegate) {
    return new DetailedViewModel(searchRepository, dayRepository, recentDelegate);
  }
}
