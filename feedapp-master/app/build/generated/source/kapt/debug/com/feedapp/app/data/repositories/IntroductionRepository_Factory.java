package com.feedapp.app.data.repositories;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IntroductionRepository_Factory implements Factory<IntroductionRepository> {
  private static final IntroductionRepository_Factory INSTANCE =
      new IntroductionRepository_Factory();

  @Override
  public IntroductionRepository get() {
    return provideInstance();
  }

  public static IntroductionRepository provideInstance() {
    return new IntroductionRepository();
  }

  public static IntroductionRepository_Factory create() {
    return INSTANCE;
  }

  public static IntroductionRepository newIntroductionRepository() {
    return new IntroductionRepository();
  }
}
