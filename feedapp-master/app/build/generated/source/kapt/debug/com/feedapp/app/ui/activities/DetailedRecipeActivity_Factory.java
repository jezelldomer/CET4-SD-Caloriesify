package com.feedapp.app.ui.activities;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.feedapp.app.ui.adapters.RecipeIngredientAdapter;
import com.feedapp.app.ui.adapters.RecipeStepAdapter;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailedRecipeActivity_Factory implements Factory<DetailedRecipeActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<RecipeStepAdapter> stepAdapterProvider;

  private final Provider<RecipeIngredientAdapter> ingAdapterProvider;

  private final Provider<RequestManager> requestManagerProvider;

  private final Provider<ViewModelProvider.Factory> modelFactoryProvider;

  public DetailedRecipeActivity_Factory(
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

  @Override
  public DetailedRecipeActivity get() {
    return provideInstance(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        stepAdapterProvider,
        ingAdapterProvider,
        requestManagerProvider,
        modelFactoryProvider);
  }

  public static DetailedRecipeActivity provideInstance(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<RecipeStepAdapter> stepAdapterProvider,
      Provider<RecipeIngredientAdapter> ingAdapterProvider,
      Provider<RequestManager> requestManagerProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    DetailedRecipeActivity instance = new DetailedRecipeActivity();
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    DetailedRecipeActivity_MembersInjector.injectStepAdapter(instance, stepAdapterProvider.get());
    DetailedRecipeActivity_MembersInjector.injectIngAdapter(instance, ingAdapterProvider.get());
    DetailedRecipeActivity_MembersInjector.injectRequestManager(
        instance, requestManagerProvider.get());
    DetailedRecipeActivity_MembersInjector.injectModelFactory(instance, modelFactoryProvider.get());
    return instance;
  }

  public static DetailedRecipeActivity_Factory create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<RecipeStepAdapter> stepAdapterProvider,
      Provider<RecipeIngredientAdapter> ingAdapterProvider,
      Provider<RequestManager> requestManagerProvider,
      Provider<ViewModelProvider.Factory> modelFactoryProvider) {
    return new DetailedRecipeActivity_Factory(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        stepAdapterProvider,
        ingAdapterProvider,
        requestManagerProvider,
        modelFactoryProvider);
  }

  public static DetailedRecipeActivity newDetailedRecipeActivity() {
    return new DetailedRecipeActivity();
  }
}
