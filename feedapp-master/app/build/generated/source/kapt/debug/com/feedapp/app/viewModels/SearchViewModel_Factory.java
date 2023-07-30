package com.feedapp.app.viewModels;

import com.feedapp.app.data.repositories.RecentDelegate;
import com.feedapp.app.data.repositories.SearchFoodRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchFoodRepository> searchRepositoryProvider;

  private final Provider<RecentDelegate> recentDelegateProvider;

  public SearchViewModel_Factory(
      Provider<SearchFoodRepository> searchRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    this.searchRepositoryProvider = searchRepositoryProvider;
    this.recentDelegateProvider = recentDelegateProvider;
  }

  @Override
  public SearchViewModel get() {
    return provideInstance(searchRepositoryProvider, recentDelegateProvider);
  }

  public static SearchViewModel provideInstance(
      Provider<SearchFoodRepository> searchRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    return new SearchViewModel(searchRepositoryProvider.get(), recentDelegateProvider.get());
  }

  public static SearchViewModel_Factory create(
      Provider<SearchFoodRepository> searchRepositoryProvider,
      Provider<RecentDelegate> recentDelegateProvider) {
    return new SearchViewModel_Factory(searchRepositoryProvider, recentDelegateProvider);
  }

  public static SearchViewModel newSearchViewModel(
      SearchFoodRepository searchRepository, RecentDelegate recentDelegate) {
    return new SearchViewModel(searchRepository, recentDelegate);
  }
}
