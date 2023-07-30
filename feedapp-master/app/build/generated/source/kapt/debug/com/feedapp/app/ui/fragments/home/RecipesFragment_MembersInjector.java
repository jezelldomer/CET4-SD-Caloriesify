package com.feedapp.app.ui.fragments.home;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.feedapp.app.data.repositories.RecipeSearchRepository;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecipesFragment_MembersInjector implements MembersInjector<RecipesFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  private final Provider<RequestManager> requestManagerProvider;

  private final Provider<RecipeSearchRepository> recipeSearchRepositoryProvider;

  public RecipesFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<RequestManager> requestManagerProvider,
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.modelFactoryProvider = modelFactoryProvider;
    this.requestManagerProvider = requestManagerProvider;
    this.recipeSearchRepositoryProvider = recipeSearchRepositoryProvider;
  }

  public static MembersInjector<RecipesFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider,
      Provider<RequestManager> requestManagerProvider,
      Provider<RecipeSearchRepository> recipeSearchRepositoryProvider) {
    return new RecipesFragment_MembersInjector(
        childFragmentInjectorProvider,
        modelFactoryProvider,
        requestManagerProvider,
        recipeSearchRepositoryProvider);
  }

  @Override
  public void injectMembers(RecipesFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
    injectRequestManager(instance, requestManagerProvider.get());
    injectRecipeSearchRepository(instance, recipeSearchRepositoryProvider.get());
  }

  public static void injectModelFactory(
      RecipesFragment instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }

  public static void injectRequestManager(RecipesFragment instance, RequestManager requestManager) {
    instance.requestManager = requestManager;
  }

  public static void injectRecipeSearchRepository(
      RecipesFragment instance, RecipeSearchRepository recipeSearchRepository) {
    instance.recipeSearchRepository = recipeSearchRepository;
  }
}
