package com.feedapp.app.ui.activities;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.feedapp.app.ui.adapters.RecipeIngredientAdapter;
import com.feedapp.app.ui.adapters.RecipeStepAdapter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailedRecipeActivity_MembersInjector
    implements MembersInjector<DetailedRecipeActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<RecipeStepAdapter> stepAdapterProvider;

  private final Provider<RecipeIngredientAdapter> ingAdapterProvider;

  private final Provider<RequestManager> requestManagerProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public DetailedRecipeActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<RecipeStepAdapter> stepAdapterProvider,
      Provider<RecipeIngredientAdapter> ingAdapterProvider,
      Provider<RequestManager> requestManagerProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.stepAdapterProvider = stepAdapterProvider;
    this.ingAdapterProvider = ingAdapterProvider;
    this.requestManagerProvider = requestManagerProvider;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  public static MembersInjector<DetailedRecipeActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<RecipeStepAdapter> stepAdapterProvider,
      Provider<RecipeIngredientAdapter> ingAdapterProvider,
      Provider<RequestManager> requestManagerProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new DetailedRecipeActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        stepAdapterProvider,
        ingAdapterProvider,
        requestManagerProvider,
        modelFactoryProvider);
  }

  @Override
  public void injectMembers(DetailedRecipeActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectStepAdapter(instance, stepAdapterProvider.get());
    injectIngAdapter(instance, ingAdapterProvider.get());
    injectRequestManager(instance, requestManagerProvider.get());
    injectModelFactory(instance, modelFactoryProvider.get());
  }

  public static void injectStepAdapter(
      DetailedRecipeActivity instance, RecipeStepAdapter stepAdapter) {
    instance.stepAdapter = stepAdapter;
  }

  public static void injectIngAdapter(
      DetailedRecipeActivity instance, RecipeIngredientAdapter ingAdapter) {
    instance.ingAdapter = ingAdapter;
  }

  public static void injectRequestManager(
      DetailedRecipeActivity instance, RequestManager requestManager) {
    instance.requestManager = requestManager;
  }

  public static void injectModelFactory(
      DetailedRecipeActivity instance, ViewModelProvider.Factory modelFactory) {
    instance.modelFactory = modelFactory;
  }
}
