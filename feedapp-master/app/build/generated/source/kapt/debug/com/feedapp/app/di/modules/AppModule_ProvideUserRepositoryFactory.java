package com.feedapp.app.di.modules;

import com.feedapp.app.data.databases.daos.UserDao;
import com.feedapp.app.data.models.calculations.LeftNutrientCalculator;
import com.feedapp.app.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final AppModule module;

  private final Provider<UserDao> userDaoProvider;

  private final Provider<LeftNutrientCalculator> leftCalculatorProvider;

  public AppModule_ProvideUserRepositoryFactory(
      AppModule module,
      Provider<UserDao> userDaoProvider,
      Provider<LeftNutrientCalculator> leftCalculatorProvider) {
    this.module = module;
    this.userDaoProvider = userDaoProvider;
    this.leftCalculatorProvider = leftCalculatorProvider;
  }

  @Override
  public UserRepository get() {
    return provideInstance(module, userDaoProvider, leftCalculatorProvider);
  }

  public static UserRepository provideInstance(
      AppModule module,
      Provider<UserDao> userDaoProvider,
      Provider<LeftNutrientCalculator> leftCalculatorProvider) {
    return proxyProvideUserRepository(module, userDaoProvider.get(), leftCalculatorProvider.get());
  }

  public static AppModule_ProvideUserRepositoryFactory create(
      AppModule module,
      Provider<UserDao> userDaoProvider,
      Provider<LeftNutrientCalculator> leftCalculatorProvider) {
    return new AppModule_ProvideUserRepositoryFactory(
        module, userDaoProvider, leftCalculatorProvider);
  }

  public static UserRepository proxyProvideUserRepository(
      AppModule instance, UserDao userDao, LeftNutrientCalculator leftCalculator) {
    return Preconditions.checkNotNull(
        instance.provideUserRepository(userDao, leftCalculator),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
