package com.feedapp.app.data.repositories;

import com.feedapp.app.data.databases.daos.UserDao;
import com.feedapp.app.data.models.calculations.LeftNutrientCalculator;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserDao> userDaoProvider;

  private final Provider<LeftNutrientCalculator> leftCalculatorProvider;

  public UserRepository_Factory(
      Provider<UserDao> userDaoProvider, Provider<LeftNutrientCalculator> leftCalculatorProvider) {
    this.userDaoProvider = userDaoProvider;
    this.leftCalculatorProvider = leftCalculatorProvider;
  }

  @Override
  public UserRepository get() {
    return provideInstance(userDaoProvider, leftCalculatorProvider);
  }

  public static UserRepository provideInstance(
      Provider<UserDao> userDaoProvider, Provider<LeftNutrientCalculator> leftCalculatorProvider) {
    return new UserRepository(userDaoProvider.get(), leftCalculatorProvider.get());
  }

  public static UserRepository_Factory create(
      Provider<UserDao> userDaoProvider, Provider<LeftNutrientCalculator> leftCalculatorProvider) {
    return new UserRepository_Factory(userDaoProvider, leftCalculatorProvider);
  }

  public static UserRepository newUserRepository(
      UserDao userDao, LeftNutrientCalculator leftCalculator) {
    return new UserRepository(userDao, leftCalculator);
  }
}
