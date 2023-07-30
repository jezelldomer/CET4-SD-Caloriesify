package com.feedapp.app.di.components;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.SharedPreferences;
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.feedapp.app.AppDelegate;
import com.feedapp.app.data.api.interfaces.RecipeApiSearch;
import com.feedapp.app.data.databases.daos.DayDao;
import com.feedapp.app.data.databases.daos.FoodProductDao;
import com.feedapp.app.data.databases.daos.UserDao;
import com.feedapp.app.data.databases.dbclasses.FoodDatabase;
import com.feedapp.app.data.databases.dbclasses.UserDatabase;
import com.feedapp.app.data.models.calculations.LeftNutrientCalculator;
import com.feedapp.app.data.models.prefs.SharedPrefsHelper;
import com.feedapp.app.data.repositories.DayRepository_Factory;
import com.feedapp.app.data.repositories.FoodRepository;
import com.feedapp.app.data.repositories.IntroductionRepository_Factory;
import com.feedapp.app.data.repositories.RecipeSearchRepository;
import com.feedapp.app.data.repositories.StatisticsRepository_Factory;
import com.feedapp.app.data.repositories.UserRepository;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeAboutActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeAddProductActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeDetailedFoodActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeHomeActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeIntroActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeMyMealsSearchActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeRecipeDetailedActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeRecipeHistoryActivity;
import com.feedapp.app.di.modules.ActivitiesBuilderModule_ContributeSearchActivity;
import com.feedapp.app.di.modules.AppModule;
import com.feedapp.app.di.modules.AppModule_NetworkInterceptorFactory;
import com.feedapp.app.di.modules.AppModule_OfflineInterceptorFactory;
import com.feedapp.app.di.modules.AppModule_ProvideCalendarFactory;
import com.feedapp.app.di.modules.AppModule_ProvideDayDaoFactory;
import com.feedapp.app.di.modules.AppModule_ProvideDayRecyclerAdapterFactory;
import com.feedapp.app.di.modules.AppModule_ProvideDetailedRecipeRepoFactory;
import com.feedapp.app.di.modules.AppModule_ProvideFoodDatabaseFactory;
import com.feedapp.app.di.modules.AppModule_ProvideFoodProductDaoFactory;
import com.feedapp.app.di.modules.AppModule_ProvideFoodProductRepositoryFactory;
import com.feedapp.app.di.modules.AppModule_ProvideGlideFactory;
import com.feedapp.app.di.modules.AppModule_ProvideHttpLoggingInterceptorFactory;
import com.feedapp.app.di.modules.AppModule_ProvideLeftNutrientCalculatorFactory;
import com.feedapp.app.di.modules.AppModule_ProvideOkHttpClientFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRecentDaoFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRecentDelegateFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRecipeApiSearchResultFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRecipeIngredientAdapterFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRecipeSearchRepositoryFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRequestOptionsFactory;
import com.feedapp.app.di.modules.AppModule_ProvideRetrofitInstanceSpoonacularFactory;
import com.feedapp.app.di.modules.AppModule_ProvideSPFactory;
import com.feedapp.app.di.modules.AppModule_ProvideSPHelperFactory;
import com.feedapp.app.di.modules.AppModule_ProvideStepRecyclerAdapterFactory;
import com.feedapp.app.di.modules.AppModule_ProvideUserDaoFactory;
import com.feedapp.app.di.modules.AppModule_ProvideUserDatabaseFactory;
import com.feedapp.app.di.modules.AppModule_ProvideUserRepositoryFactory;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeDayFragment;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeHomeDownFragment;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeHomeFragment;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeHomeUpFragment;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeMyMealsFragment;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeRecipeSearchFragment;
import com.feedapp.app.di.modules.HomeFragmentBuildersModule_ContributeSettingsFragment;
import com.feedapp.app.di.modules.ProductSearchModule;
import com.feedapp.app.di.modules.ProductSearchModule_ProvideSearchFoodRepositoryFactory;
import com.feedapp.app.di.modules.StatisticsFragmentModule_ContributeDayFragment;
import com.feedapp.app.di.modules.StatisticsFragmentModule_ContributeMonthFragment;
import com.feedapp.app.di.other.ViewModelProviderFactory;
import com.feedapp.app.ui.activities.AboutActivity;
import com.feedapp.app.ui.activities.AddCustomProductActivity;
import com.feedapp.app.ui.activities.AddCustomProductActivity_MembersInjector;
import com.feedapp.app.ui.activities.DetailedFoodActivity;
import com.feedapp.app.ui.activities.DetailedFoodActivity_MembersInjector;
import com.feedapp.app.ui.activities.DetailedRecipeActivity;
import com.feedapp.app.ui.activities.DetailedRecipeActivity_MembersInjector;
import com.feedapp.app.ui.activities.HomeActivity;
import com.feedapp.app.ui.activities.HomeActivity_MembersInjector;
import com.feedapp.app.ui.activities.IntroductionActivity;
import com.feedapp.app.ui.activities.IntroductionActivity_MembersInjector;
import com.feedapp.app.ui.activities.MyMealsSearchActivity;
import com.feedapp.app.ui.activities.MyMealsSearchActivity_MembersInjector;
import com.feedapp.app.ui.activities.SearchActivity;
import com.feedapp.app.ui.activities.SearchActivity_MembersInjector;
import com.feedapp.app.ui.activities.StatisticsActivity;
import com.feedapp.app.ui.activities.StatisticsActivity_MembersInjector;
import com.feedapp.app.ui.adapters.DayRecyclerAdapter;
import com.feedapp.app.ui.adapters.RecipeIngredientAdapter;
import com.feedapp.app.ui.adapters.RecipeStepAdapter;
import com.feedapp.app.ui.fragments.home.DayFragment;
import com.feedapp.app.ui.fragments.home.DayFragment_MembersInjector;
import com.feedapp.app.ui.fragments.home.HomeDownFragment;
import com.feedapp.app.ui.fragments.home.HomeDownFragment_Factory;
import com.feedapp.app.ui.fragments.home.HomeDownFragment_MembersInjector;
import com.feedapp.app.ui.fragments.home.HomeFragment;
import com.feedapp.app.ui.fragments.home.HomeFragment_MembersInjector;
import com.feedapp.app.ui.fragments.home.HomeUpFragment;
import com.feedapp.app.ui.fragments.home.HomeUpFragment_Factory;
import com.feedapp.app.ui.fragments.home.HomeUpFragment_MembersInjector;
import com.feedapp.app.ui.fragments.home.MyMealsFragment;
import com.feedapp.app.ui.fragments.home.MyMealsFragment_MembersInjector;
import com.feedapp.app.ui.fragments.home.RecipesFragment;
import com.feedapp.app.ui.fragments.home.RecipesFragment_MembersInjector;
import com.feedapp.app.ui.fragments.home.Settings;
import com.feedapp.app.ui.fragments.home.Settings_MembersInjector;
import com.feedapp.app.ui.fragments.statistics.StatisticsDayFragment;
import com.feedapp.app.ui.fragments.statistics.StatisticsDayFragment_MembersInjector;
import com.feedapp.app.ui.fragments.statistics.StatisticsMonthFragment;
import com.feedapp.app.ui.fragments.statistics.StatisticsMonthFragment_MembersInjector;
import com.feedapp.app.viewModels.AddCustomProductViewModel;
import com.feedapp.app.viewModels.AddCustomProductViewModel_Factory;
import com.feedapp.app.viewModels.DetailedRecipeViewModel;
import com.feedapp.app.viewModels.DetailedRecipeViewModel_Factory;
import com.feedapp.app.viewModels.DetailedViewModel;
import com.feedapp.app.viewModels.DetailedViewModel_Factory;
import com.feedapp.app.viewModels.HomeViewModel;
import com.feedapp.app.viewModels.HomeViewModel_Factory;
import com.feedapp.app.viewModels.IntroductionViewModel;
import com.feedapp.app.viewModels.IntroductionViewModel_Factory;
import com.feedapp.app.viewModels.MyMealsSearchViewModel;
import com.feedapp.app.viewModels.MyMealsSearchViewModel_Factory;
import com.feedapp.app.viewModels.MyMealsViewModel;
import com.feedapp.app.viewModels.MyMealsViewModel_Factory;
import com.feedapp.app.viewModels.RecipeSearchViewModel;
import com.feedapp.app.viewModels.RecipeSearchViewModel_Factory;
import com.feedapp.app.viewModels.SearchViewModel;
import com.feedapp.app.viewModels.SearchViewModel_Factory;
import com.feedapp.app.viewModels.SettingsViewModel;
import com.feedapp.app.viewModels.SettingsViewModel_Factory;
import com.feedapp.app.viewModels.StatisticsViewModel;
import com.feedapp.app.viewModels.StatisticsViewModel_Factory;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Calendar;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<
          ActivitiesBuilderModule_ContributeAddProductActivity.AddCustomProductActivitySubcomponent
              .Builder>
      addCustomProductActivitySubcomponentBuilderProvider;

  private Provider<ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent.Builder>
      homeActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent.Builder>
      searchActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent.Builder>
      introductionActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeDetailedFoodActivity.DetailedFoodActivitySubcomponent
              .Builder>
      detailedFoodActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeMyMealsSearchActivity.MyMealsSearchActivitySubcomponent
              .Builder>
      myMealsSearchActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeRecipeDetailedActivity
              .DetailedRecipeActivitySubcomponent.Builder>
      detailedRecipeActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeRecipeHistoryActivity.StatisticsActivitySubcomponent
              .Builder>
      statisticsActivitySubcomponentBuilderProvider;

  private Provider<
          ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent.Builder>
      aboutActivitySubcomponentBuilderProvider;

  private Provider<Application> applicationProvider;

  private Provider<FoodDatabase> provideFoodDatabaseProvider;

  private Provider<FoodProductDao> provideFoodProductDaoProvider;

  private Provider<FoodRepository> provideFoodProductRepositoryProvider;

  private Provider<SharedPreferences> provideSPProvider;

  private Provider<SharedPrefsHelper> provideSPHelperProvider;

  private Provider<UserDatabase> provideUserDatabaseProvider;

  private Provider<DayDao> provideDayDaoProvider;

  private Provider<UserDao> provideUserDaoProvider;

  private Provider<LeftNutrientCalculator> provideLeftNutrientCalculatorProvider;

  private Provider<UserRepository> provideUserRepositoryProvider;

  private Provider<Calendar> provideCalendarProvider;

  private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;

  private Provider<Interceptor> networkInterceptorProvider;

  private Provider<Interceptor> offlineInterceptorProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitInstanceSpoonacularProvider;

  private Provider<RecipeApiSearch> provideRecipeApiSearchResultProvider;

  private Provider<RecipeSearchRepository> provideRecipeSearchRepositoryProvider;

  private AppModule_ProvideRecentDaoFactory provideRecentDaoProvider;

  private AppModule_ProvideRecentDelegateFactory provideRecentDelegateProvider;

  private Provider<DayRecyclerAdapter> provideDayRecyclerAdapterProvider;

  private Provider<RequestOptions> provideRequestOptionsProvider;

  private Provider<RequestManager> provideGlideProvider;

  private Provider<RecipeStepAdapter> provideStepRecyclerAdapterProvider;

  private Provider<RecipeIngredientAdapter> provideRecipeIngredientAdapterProvider;

  private AppModule_ProvideDetailedRecipeRepoFactory provideDetailedRecipeRepoProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return ImmutableMap
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            builderWithExpectedSize(9)
        .put(
            AddCustomProductActivity.class,
            (Provider) addCustomProductActivitySubcomponentBuilderProvider)
        .put(HomeActivity.class, (Provider) homeActivitySubcomponentBuilderProvider)
        .put(SearchActivity.class, (Provider) searchActivitySubcomponentBuilderProvider)
        .put(IntroductionActivity.class, (Provider) introductionActivitySubcomponentBuilderProvider)
        .put(DetailedFoodActivity.class, (Provider) detailedFoodActivitySubcomponentBuilderProvider)
        .put(
            MyMealsSearchActivity.class,
            (Provider) myMealsSearchActivitySubcomponentBuilderProvider)
        .put(
            DetailedRecipeActivity.class,
            (Provider) detailedRecipeActivitySubcomponentBuilderProvider)
        .put(StatisticsActivity.class, (Provider) statisticsActivitySubcomponentBuilderProvider)
        .put(AboutActivity.class, (Provider) aboutActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        ImmutableMap.<String, Provider<AndroidInjector.Factory<? extends Activity>>>of());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends BroadcastReceiver>,
                Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
                of(),
        ImmutableMap.<String, Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>of());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>of(),
        ImmutableMap.<String, Provider<AndroidInjector.Factory<? extends Fragment>>>of());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>of(),
        ImmutableMap.<String, Provider<AndroidInjector.Factory<? extends Service>>>of());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends ContentProvider>,
                Provider<AndroidInjector.Factory<? extends ContentProvider>>>
                of(),
        ImmutableMap.<String, Provider<AndroidInjector.Factory<? extends ContentProvider>>>of());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.addCustomProductActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeAddProductActivity
                .AddCustomProductActivitySubcomponent.Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeAddProductActivity
                  .AddCustomProductActivitySubcomponent.Builder
              get() {
            return new AddCustomProductActivitySubcomponentBuilder();
          }
        };
    this.homeActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent.Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent.Builder
              get() {
            return new HomeActivitySubcomponentBuilder();
          }
        };
    this.searchActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent.Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent.Builder
              get() {
            return new SearchActivitySubcomponentBuilder();
          }
        };
    this.introductionActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent
                .Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent
                  .Builder
              get() {
            return new IntroductionActivitySubcomponentBuilder();
          }
        };
    this.detailedFoodActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeDetailedFoodActivity.DetailedFoodActivitySubcomponent
                .Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeDetailedFoodActivity
                  .DetailedFoodActivitySubcomponent.Builder
              get() {
            return new DetailedFoodActivitySubcomponentBuilder();
          }
        };
    this.myMealsSearchActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeMyMealsSearchActivity
                .MyMealsSearchActivitySubcomponent.Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeMyMealsSearchActivity
                  .MyMealsSearchActivitySubcomponent.Builder
              get() {
            return new MyMealsSearchActivitySubcomponentBuilder();
          }
        };
    this.detailedRecipeActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeRecipeDetailedActivity
                .DetailedRecipeActivitySubcomponent.Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeRecipeDetailedActivity
                  .DetailedRecipeActivitySubcomponent.Builder
              get() {
            return new DetailedRecipeActivitySubcomponentBuilder();
          }
        };
    this.statisticsActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeRecipeHistoryActivity.StatisticsActivitySubcomponent
                .Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeRecipeHistoryActivity
                  .StatisticsActivitySubcomponent.Builder
              get() {
            return new StatisticsActivitySubcomponentBuilder();
          }
        };
    this.aboutActivitySubcomponentBuilderProvider =
        new Provider<
            ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent.Builder>() {
          @Override
          public ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent.Builder
              get() {
            return new AboutActivitySubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideFoodDatabaseProvider =
        DoubleCheck.provider(
            AppModule_ProvideFoodDatabaseFactory.create(builder.appModule, applicationProvider));
    this.provideFoodProductDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideFoodProductDaoFactory.create(
                builder.appModule, provideFoodDatabaseProvider));
    this.provideFoodProductRepositoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideFoodProductRepositoryFactory.create(
                builder.appModule, applicationProvider, provideFoodProductDaoProvider));
    this.provideSPProvider =
        DoubleCheck.provider(
            AppModule_ProvideSPFactory.create(builder.appModule, applicationProvider));
    this.provideSPHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvideSPHelperFactory.create(builder.appModule, provideSPProvider));
    this.provideUserDatabaseProvider =
        DoubleCheck.provider(
            AppModule_ProvideUserDatabaseFactory.create(builder.appModule, applicationProvider));
    this.provideDayDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideDayDaoFactory.create(builder.appModule, provideUserDatabaseProvider));
    this.provideUserDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideUserDaoFactory.create(builder.appModule, provideUserDatabaseProvider));
    this.provideLeftNutrientCalculatorProvider =
        DoubleCheck.provider(
            AppModule_ProvideLeftNutrientCalculatorFactory.create(builder.appModule));
    this.provideUserRepositoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideUserRepositoryFactory.create(
                builder.appModule, provideUserDaoProvider, provideLeftNutrientCalculatorProvider));
    this.provideCalendarProvider =
        DoubleCheck.provider(AppModule_ProvideCalendarFactory.create(builder.appModule));
    this.provideHttpLoggingInterceptorProvider =
        DoubleCheck.provider(
            AppModule_ProvideHttpLoggingInterceptorFactory.create(builder.appModule));
    this.networkInterceptorProvider =
        DoubleCheck.provider(AppModule_NetworkInterceptorFactory.create(builder.appModule));
    this.offlineInterceptorProvider =
        DoubleCheck.provider(
            AppModule_OfflineInterceptorFactory.create(builder.appModule, applicationProvider));
    this.provideOkHttpClientProvider =
        DoubleCheck.provider(
            AppModule_ProvideOkHttpClientFactory.create(
                builder.appModule,
                applicationProvider,
                provideHttpLoggingInterceptorProvider,
                networkInterceptorProvider,
                offlineInterceptorProvider));
    this.provideRetrofitInstanceSpoonacularProvider =
        DoubleCheck.provider(
            AppModule_ProvideRetrofitInstanceSpoonacularFactory.create(
                builder.appModule, provideOkHttpClientProvider));
    this.provideRecipeApiSearchResultProvider =
        DoubleCheck.provider(
            AppModule_ProvideRecipeApiSearchResultFactory.create(
                builder.appModule, provideRetrofitInstanceSpoonacularProvider));
    this.provideRecipeSearchRepositoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideRecipeSearchRepositoryFactory.create(
                builder.appModule, applicationProvider, provideRecipeApiSearchResultProvider));
    this.provideRecentDaoProvider =
        AppModule_ProvideRecentDaoFactory.create(builder.appModule, provideUserDatabaseProvider);
    this.provideRecentDelegateProvider =
        AppModule_ProvideRecentDelegateFactory.create(builder.appModule, provideRecentDaoProvider);
    this.provideDayRecyclerAdapterProvider =
        DoubleCheck.provider(AppModule_ProvideDayRecyclerAdapterFactory.create(builder.appModule));
    this.provideRequestOptionsProvider =
        DoubleCheck.provider(AppModule_ProvideRequestOptionsFactory.create(builder.appModule));
    this.provideGlideProvider =
        DoubleCheck.provider(
            AppModule_ProvideGlideFactory.create(
                builder.appModule, applicationProvider, provideRequestOptionsProvider));
    this.provideStepRecyclerAdapterProvider =
        DoubleCheck.provider(AppModule_ProvideStepRecyclerAdapterFactory.create(builder.appModule));
    this.provideRecipeIngredientAdapterProvider =
        DoubleCheck.provider(
            AppModule_ProvideRecipeIngredientAdapterFactory.create(
                builder.appModule, applicationProvider));
    this.provideDetailedRecipeRepoProvider =
        AppModule_ProvideDetailedRecipeRepoFactory.create(builder.appModule);
  }

  @Override
  public void inject(AppDelegate arg0) {
    injectAppDelegate(arg0);
  }

  @CanIgnoreReturnValue
  private AppDelegate injectAppDelegate(AppDelegate instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class AddCustomProductActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeAddProductActivity
          .AddCustomProductActivitySubcomponent.Builder {
    private AddCustomProductActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeAddProductActivity.AddCustomProductActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            AddCustomProductActivity.class.getCanonicalName() + " must be set");
      }
      return new AddCustomProductActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(AddCustomProductActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class AddCustomProductActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeAddProductActivity
          .AddCustomProductActivitySubcomponent {
    private AddCustomProductViewModel_Factory addCustomProductViewModelProvider;

    private AddCustomProductActivitySubcomponentImpl(
        AddCustomProductActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          ImmutableMap
              .<Class<? extends androidx.fragment.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          AddCustomProductViewModel.class, (Provider) addCustomProductViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AddCustomProductActivitySubcomponentBuilder builder) {
      this.addCustomProductViewModelProvider =
          AddCustomProductViewModel_Factory.create(
              DaggerAppComponent.this.provideFoodProductRepositoryProvider);
    }

    @Override
    public void inject(AddCustomProductActivity arg0) {
      injectAddCustomProductActivity(arg0);
    }

    @CanIgnoreReturnValue
    private AddCustomProductActivity injectAddCustomProductActivity(
        AddCustomProductActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      AddCustomProductActivity_MembersInjector.injectModelFactory(
          instance, getViewModelProviderFactory());
      return instance;
    }
  }

  private final class HomeActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent.Builder {
    private HomeActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(HomeActivity.class.getCanonicalName() + " must be set");
      }
      return new HomeActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(HomeActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class HomeActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeHomeActivity.HomeActivitySubcomponent {
    private Provider<
            HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Builder>
        homeFragmentSubcomponentBuilderProvider;

    private Provider<
            HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent.Builder>
        homeUpFragmentSubcomponentBuilderProvider;

    private Provider<
            HomeFragmentBuildersModule_ContributeHomeDownFragment.HomeDownFragmentSubcomponent
                .Builder>
        homeDownFragmentSubcomponentBuilderProvider;

    private Provider<
            HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent.Builder>
        dayFragmentSubcomponentBuilderProvider;

    private Provider<
            HomeFragmentBuildersModule_ContributeMyMealsFragment.MyMealsFragmentSubcomponent
                .Builder>
        myMealsFragmentSubcomponentBuilderProvider;

    private Provider<
            HomeFragmentBuildersModule_ContributeRecipeSearchFragment.RecipesFragmentSubcomponent
                .Builder>
        recipesFragmentSubcomponentBuilderProvider;

    private Provider<
            HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent.Builder>
        settingsSubcomponentBuilderProvider;

    private DayRepository_Factory dayRepositoryProvider;

    private HomeViewModel_Factory homeViewModelProvider;

    private MyMealsViewModel_Factory myMealsViewModelProvider;

    private RecipeSearchViewModel_Factory recipeSearchViewModelProvider;

    private SettingsViewModel_Factory settingsViewModelProvider;

    private HomeActivitySubcomponentImpl(HomeActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<
            Class<? extends androidx.fragment.app.Fragment>,
            Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return ImmutableMap
          .<Class<? extends androidx.fragment.app.Fragment>,
              Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
              builderWithExpectedSize(7)
          .put(HomeFragment.class, (Provider) homeFragmentSubcomponentBuilderProvider)
          .put(HomeUpFragment.class, (Provider) homeUpFragmentSubcomponentBuilderProvider)
          .put(HomeDownFragment.class, (Provider) homeDownFragmentSubcomponentBuilderProvider)
          .put(DayFragment.class, (Provider) dayFragmentSubcomponentBuilderProvider)
          .put(MyMealsFragment.class, (Provider) myMealsFragmentSubcomponentBuilderProvider)
          .put(RecipesFragment.class, (Provider) recipesFragmentSubcomponentBuilderProvider)
          .put(Settings.class, (Provider) settingsSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          HomeViewModel.class,
          (Provider) homeViewModelProvider,
          MyMealsViewModel.class,
          (Provider) myMealsViewModelProvider,
          RecipeSearchViewModel.class,
          (Provider) recipeSearchViewModelProvider,
          SettingsViewModel.class,
          (Provider) settingsViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private MyMealsViewModel getMyMealsViewModel() {
      return new MyMealsViewModel(
          DaggerAppComponent.this.provideFoodProductRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final HomeActivitySubcomponentBuilder builder) {
      this.homeFragmentSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent
                  .Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent
                    .Builder
                get() {
              return new HomeFragmentSubcomponentBuilder();
            }
          };
      this.homeUpFragmentSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent
                  .Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent
                    .Builder
                get() {
              return new HomeUpFragmentSubcomponentBuilder();
            }
          };
      this.homeDownFragmentSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeHomeDownFragment.HomeDownFragmentSubcomponent
                  .Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeHomeDownFragment
                    .HomeDownFragmentSubcomponent.Builder
                get() {
              return new HomeDownFragmentSubcomponentBuilder();
            }
          };
      this.dayFragmentSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent.Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent.Builder
                get() {
              return new DayFragmentSubcomponentBuilder();
            }
          };
      this.myMealsFragmentSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeMyMealsFragment.MyMealsFragmentSubcomponent
                  .Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeMyMealsFragment.MyMealsFragmentSubcomponent
                    .Builder
                get() {
              return new MyMealsFragmentSubcomponentBuilder();
            }
          };
      this.recipesFragmentSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeRecipeSearchFragment.RecipesFragmentSubcomponent
                  .Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeRecipeSearchFragment
                    .RecipesFragmentSubcomponent.Builder
                get() {
              return new RecipesFragmentSubcomponentBuilder();
            }
          };
      this.settingsSubcomponentBuilderProvider =
          new Provider<
              HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent
                  .Builder>() {
            @Override
            public HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent
                    .Builder
                get() {
              return new SettingsSubcomponentBuilder();
            }
          };
      this.dayRepositoryProvider =
          DayRepository_Factory.create(DaggerAppComponent.this.provideDayDaoProvider);
      this.homeViewModelProvider =
          HomeViewModel_Factory.create(
              dayRepositoryProvider,
              DaggerAppComponent.this.provideUserRepositoryProvider,
              DaggerAppComponent.this.provideSPHelperProvider);
      this.myMealsViewModelProvider =
          MyMealsViewModel_Factory.create(
              DaggerAppComponent.this.provideFoodProductRepositoryProvider);
      this.recipeSearchViewModelProvider =
          RecipeSearchViewModel_Factory.create(
              DaggerAppComponent.this.provideCalendarProvider,
              DaggerAppComponent.this.provideSPProvider,
              DaggerAppComponent.this.provideRecipeSearchRepositoryProvider,
              DaggerAppComponent.this.provideUserRepositoryProvider);
      this.settingsViewModelProvider =
          SettingsViewModel_Factory.create(
              DaggerAppComponent.this.provideUserRepositoryProvider,
              DaggerAppComponent.this.provideRecentDelegateProvider);
    }

    @Override
    public void inject(HomeActivity arg0) {
      injectHomeActivity(arg0);
    }

    @CanIgnoreReturnValue
    private HomeActivity injectHomeActivity(HomeActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      HomeActivity_MembersInjector.injectSpHelper(
          instance, DaggerAppComponent.this.provideSPHelperProvider.get());
      HomeActivity_MembersInjector.injectModelFactory(instance, getViewModelProviderFactory());
      return instance;
    }

    private final class HomeFragmentSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Builder {
      private HomeFragment seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(HomeFragment.class.getCanonicalName() + " must be set");
        }
        return new HomeFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(HomeFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class HomeFragmentSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent {
      private HomeFragmentSubcomponentImpl(HomeFragmentSubcomponentBuilder builder) {}

      private HomeUpFragment getHomeUpFragment() {
        return injectHomeUpFragment(HomeUpFragment_Factory.newHomeUpFragment());
      }

      private HomeDownFragment getHomeDownFragment() {
        return injectHomeDownFragment(HomeDownFragment_Factory.newHomeDownFragment());
      }

      @Override
      public void inject(HomeFragment arg0) {
        injectHomeFragment(arg0);
      }

      @CanIgnoreReturnValue
      private HomeUpFragment injectHomeUpFragment(HomeUpFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        HomeUpFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }

      @CanIgnoreReturnValue
      private HomeDownFragment injectHomeDownFragment(HomeDownFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        HomeDownFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }

      @CanIgnoreReturnValue
      private HomeFragment injectHomeFragment(HomeFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        HomeFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        HomeFragment_MembersInjector.injectHomeUpFragment(instance, getHomeUpFragment());
        HomeFragment_MembersInjector.injectDownMenuFragment(instance, getHomeDownFragment());
        return instance;
      }
    }

    private final class HomeUpFragmentSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent
            .Builder {
      private HomeUpFragment seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(HomeUpFragment.class.getCanonicalName() + " must be set");
        }
        return new HomeUpFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(HomeUpFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class HomeUpFragmentSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeHomeUpFragment.HomeUpFragmentSubcomponent {
      private HomeUpFragmentSubcomponentImpl(HomeUpFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(HomeUpFragment arg0) {
        injectHomeUpFragment(arg0);
      }

      @CanIgnoreReturnValue
      private HomeUpFragment injectHomeUpFragment(HomeUpFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        HomeUpFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }
    }

    private final class HomeDownFragmentSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeHomeDownFragment.HomeDownFragmentSubcomponent
            .Builder {
      private HomeDownFragment seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeHomeDownFragment.HomeDownFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              HomeDownFragment.class.getCanonicalName() + " must be set");
        }
        return new HomeDownFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(HomeDownFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class HomeDownFragmentSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeHomeDownFragment
            .HomeDownFragmentSubcomponent {
      private HomeDownFragmentSubcomponentImpl(HomeDownFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(HomeDownFragment arg0) {
        injectHomeDownFragment(arg0);
      }

      @CanIgnoreReturnValue
      private HomeDownFragment injectHomeDownFragment(HomeDownFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        HomeDownFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }
    }

    private final class DayFragmentSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent.Builder {
      private DayFragment seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(DayFragment.class.getCanonicalName() + " must be set");
        }
        return new DayFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(DayFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class DayFragmentSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeDayFragment.DayFragmentSubcomponent {
      private DayFragmentSubcomponentImpl(DayFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(DayFragment arg0) {
        injectDayFragment(arg0);
      }

      @CanIgnoreReturnValue
      private DayFragment injectDayFragment(DayFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        DayFragment_MembersInjector.injectDayRecyclerAdapter(
            instance, DaggerAppComponent.this.provideDayRecyclerAdapterProvider.get());
        DayFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }
    }

    private final class MyMealsFragmentSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeMyMealsFragment.MyMealsFragmentSubcomponent
            .Builder {
      private MyMealsFragment seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeMyMealsFragment.MyMealsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MyMealsFragment.class.getCanonicalName() + " must be set");
        }
        return new MyMealsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MyMealsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MyMealsFragmentSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeMyMealsFragment
            .MyMealsFragmentSubcomponent {
      private MyMealsFragmentSubcomponentImpl(MyMealsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MyMealsFragment arg0) {
        injectMyMealsFragment(arg0);
      }

      @CanIgnoreReturnValue
      private MyMealsFragment injectMyMealsFragment(MyMealsFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        MyMealsFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        MyMealsFragment_MembersInjector.injectMyMealsViewModel(
            instance, HomeActivitySubcomponentImpl.this.getMyMealsViewModel());
        MyMealsFragment_MembersInjector.injectSpHelper(
            instance, DaggerAppComponent.this.provideSPHelperProvider.get());
        return instance;
      }
    }

    private final class RecipesFragmentSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeRecipeSearchFragment
            .RecipesFragmentSubcomponent.Builder {
      private RecipesFragment seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeRecipeSearchFragment.RecipesFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RecipesFragment.class.getCanonicalName() + " must be set");
        }
        return new RecipesFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RecipesFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RecipesFragmentSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeRecipeSearchFragment
            .RecipesFragmentSubcomponent {
      private RecipesFragmentSubcomponentImpl(RecipesFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RecipesFragment arg0) {
        injectRecipesFragment(arg0);
      }

      @CanIgnoreReturnValue
      private RecipesFragment injectRecipesFragment(RecipesFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        RecipesFragment_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        RecipesFragment_MembersInjector.injectRequestManager(
            instance, DaggerAppComponent.this.provideGlideProvider.get());
        RecipesFragment_MembersInjector.injectRecipeSearchRepository(
            instance, DaggerAppComponent.this.provideRecipeSearchRepositoryProvider.get());
        return instance;
      }
    }

    private final class SettingsSubcomponentBuilder
        extends HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent.Builder {
      private Settings seedInstance;

      @Override
      public HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(Settings.class.getCanonicalName() + " must be set");
        }
        return new SettingsSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(Settings arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class SettingsSubcomponentImpl
        implements HomeFragmentBuildersModule_ContributeSettingsFragment.SettingsSubcomponent {
      private SettingsSubcomponentImpl(SettingsSubcomponentBuilder builder) {}

      @Override
      public void inject(Settings arg0) {
        injectSettings(arg0);
      }

      @CanIgnoreReturnValue
      private Settings injectSettings(Settings instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, HomeActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        Settings_MembersInjector.injectModelFactory(
            instance, HomeActivitySubcomponentImpl.this.getViewModelProviderFactory());
        Settings_MembersInjector.injectSpHelper(
            instance, DaggerAppComponent.this.provideSPHelperProvider.get());
        return instance;
      }
    }
  }

  private final class SearchActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent.Builder {
    private ProductSearchModule productSearchModule;

    private SearchActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent build() {
      if (productSearchModule == null) {
        this.productSearchModule = new ProductSearchModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(SearchActivity.class.getCanonicalName() + " must be set");
      }
      return new SearchActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SearchActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SearchActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeSearchActivity.SearchActivitySubcomponent {
    private ProductSearchModule_ProvideSearchFoodRepositoryFactory
        provideSearchFoodRepositoryProvider;

    private SearchViewModel_Factory searchViewModelProvider;

    private SearchActivitySubcomponentImpl(SearchActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          ImmutableMap
              .<Class<? extends androidx.fragment.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          SearchViewModel.class, (Provider) searchViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SearchActivitySubcomponentBuilder builder) {
      this.provideSearchFoodRepositoryProvider =
          ProductSearchModule_ProvideSearchFoodRepositoryFactory.create(
              builder.productSearchModule, DaggerAppComponent.this.provideFoodProductDaoProvider);
      this.searchViewModelProvider =
          SearchViewModel_Factory.create(
              provideSearchFoodRepositoryProvider,
              DaggerAppComponent.this.provideRecentDelegateProvider);
    }

    @Override
    public void inject(SearchActivity arg0) {
      injectSearchActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SearchActivity injectSearchActivity(SearchActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      SearchActivity_MembersInjector.injectSpHelper(
          instance, DaggerAppComponent.this.provideSPHelperProvider.get());
      SearchActivity_MembersInjector.injectModelFactory(instance, getViewModelProviderFactory());
      return instance;
    }
  }

  private final class IntroductionActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent
          .Builder {
    private IntroductionActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            IntroductionActivity.class.getCanonicalName() + " must be set");
      }
      return new IntroductionActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(IntroductionActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class IntroductionActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeIntroActivity.IntroductionActivitySubcomponent {
    private IntroductionViewModel_Factory introductionViewModelProvider;

    private IntroductionActivitySubcomponentImpl(IntroductionActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          IntroductionViewModel.class, (Provider) introductionViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final IntroductionActivitySubcomponentBuilder builder) {
      this.introductionViewModelProvider =
          IntroductionViewModel_Factory.create(
              DaggerAppComponent.this.provideUserRepositoryProvider,
              IntroductionRepository_Factory.create(),
              DaggerAppComponent.this.provideSPHelperProvider);
    }

    @Override
    public void inject(IntroductionActivity arg0) {
      injectIntroductionActivity(arg0);
    }

    @CanIgnoreReturnValue
    private IntroductionActivity injectIntroductionActivity(IntroductionActivity instance) {
      IntroductionActivity_MembersInjector.injectModelFactory(
          instance, getViewModelProviderFactory());
      return instance;
    }
  }

  private final class DetailedFoodActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeDetailedFoodActivity
          .DetailedFoodActivitySubcomponent.Builder {
    private ProductSearchModule productSearchModule;

    private DetailedFoodActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeDetailedFoodActivity.DetailedFoodActivitySubcomponent
        build() {
      if (productSearchModule == null) {
        this.productSearchModule = new ProductSearchModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            DetailedFoodActivity.class.getCanonicalName() + " must be set");
      }
      return new DetailedFoodActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DetailedFoodActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DetailedFoodActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeDetailedFoodActivity
          .DetailedFoodActivitySubcomponent {
    private ProductSearchModule_ProvideSearchFoodRepositoryFactory
        provideSearchFoodRepositoryProvider;

    private DayRepository_Factory dayRepositoryProvider;

    private DetailedViewModel_Factory detailedViewModelProvider;

    private DetailedFoodActivitySubcomponentImpl(DetailedFoodActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          ImmutableMap
              .<Class<? extends androidx.fragment.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          DetailedViewModel.class, (Provider) detailedViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DetailedFoodActivitySubcomponentBuilder builder) {
      this.provideSearchFoodRepositoryProvider =
          ProductSearchModule_ProvideSearchFoodRepositoryFactory.create(
              builder.productSearchModule, DaggerAppComponent.this.provideFoodProductDaoProvider);
      this.dayRepositoryProvider =
          DayRepository_Factory.create(DaggerAppComponent.this.provideDayDaoProvider);
      this.detailedViewModelProvider =
          DetailedViewModel_Factory.create(
              provideSearchFoodRepositoryProvider,
              dayRepositoryProvider,
              DaggerAppComponent.this.provideRecentDelegateProvider);
    }

    @Override
    public void inject(DetailedFoodActivity arg0) {
      injectDetailedFoodActivity(arg0);
    }

    @CanIgnoreReturnValue
    private DetailedFoodActivity injectDetailedFoodActivity(DetailedFoodActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      DetailedFoodActivity_MembersInjector.injectModelFactory(
          instance, getViewModelProviderFactory());
      return instance;
    }
  }

  private final class MyMealsSearchActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeMyMealsSearchActivity
          .MyMealsSearchActivitySubcomponent.Builder {
    private MyMealsSearchActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeMyMealsSearchActivity.MyMealsSearchActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            MyMealsSearchActivity.class.getCanonicalName() + " must be set");
      }
      return new MyMealsSearchActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MyMealsSearchActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MyMealsSearchActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeMyMealsSearchActivity
          .MyMealsSearchActivitySubcomponent {
    private MyMealsSearchViewModel_Factory myMealsSearchViewModelProvider;

    private MyMealsSearchActivitySubcomponentImpl(
        MyMealsSearchActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          ImmutableMap
              .<Class<? extends androidx.fragment.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          MyMealsSearchViewModel.class, (Provider) myMealsSearchViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MyMealsSearchActivitySubcomponentBuilder builder) {
      this.myMealsSearchViewModelProvider =
          MyMealsSearchViewModel_Factory.create(
              DaggerAppComponent.this.provideFoodProductRepositoryProvider);
    }

    @Override
    public void inject(MyMealsSearchActivity arg0) {
      injectMyMealsSearchActivity(arg0);
    }

    @CanIgnoreReturnValue
    private MyMealsSearchActivity injectMyMealsSearchActivity(MyMealsSearchActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      MyMealsSearchActivity_MembersInjector.injectModelFactory(
          instance, getViewModelProviderFactory());
      return instance;
    }
  }

  private final class DetailedRecipeActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeRecipeDetailedActivity
          .DetailedRecipeActivitySubcomponent.Builder {
    private DetailedRecipeActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeRecipeDetailedActivity
            .DetailedRecipeActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            DetailedRecipeActivity.class.getCanonicalName() + " must be set");
      }
      return new DetailedRecipeActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DetailedRecipeActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DetailedRecipeActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeRecipeDetailedActivity
          .DetailedRecipeActivitySubcomponent {
    private DayRepository_Factory dayRepositoryProvider;

    private DetailedRecipeViewModel_Factory detailedRecipeViewModelProvider;

    private DetailedRecipeActivitySubcomponentImpl(
        DetailedRecipeActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          ImmutableMap
              .<Class<? extends androidx.fragment.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          DetailedRecipeViewModel.class, (Provider) detailedRecipeViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DetailedRecipeActivitySubcomponentBuilder builder) {
      this.dayRepositoryProvider =
          DayRepository_Factory.create(DaggerAppComponent.this.provideDayDaoProvider);
      this.detailedRecipeViewModelProvider =
          DetailedRecipeViewModel_Factory.create(
              DaggerAppComponent.this.provideRecipeSearchRepositoryProvider,
              DaggerAppComponent.this.provideUserRepositoryProvider,
              dayRepositoryProvider,
              DaggerAppComponent.this.provideDetailedRecipeRepoProvider);
    }

    @Override
    public void inject(DetailedRecipeActivity arg0) {
      injectDetailedRecipeActivity(arg0);
    }

    @CanIgnoreReturnValue
    private DetailedRecipeActivity injectDetailedRecipeActivity(DetailedRecipeActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      DetailedRecipeActivity_MembersInjector.injectStepAdapter(
          instance, DaggerAppComponent.this.provideStepRecyclerAdapterProvider.get());
      DetailedRecipeActivity_MembersInjector.injectIngAdapter(
          instance, DaggerAppComponent.this.provideRecipeIngredientAdapterProvider.get());
      DetailedRecipeActivity_MembersInjector.injectRequestManager(
          instance, DaggerAppComponent.this.provideGlideProvider.get());
      DetailedRecipeActivity_MembersInjector.injectModelFactory(
          instance, getViewModelProviderFactory());
      return instance;
    }
  }

  private final class StatisticsActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeRecipeHistoryActivity.StatisticsActivitySubcomponent
          .Builder {
    private StatisticsActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeRecipeHistoryActivity.StatisticsActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            StatisticsActivity.class.getCanonicalName() + " must be set");
      }
      return new StatisticsActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(StatisticsActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class StatisticsActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeRecipeHistoryActivity
          .StatisticsActivitySubcomponent {
    private Provider<
            StatisticsFragmentModule_ContributeMonthFragment.StatisticsMonthFragmentSubcomponent
                .Builder>
        statisticsMonthFragmentSubcomponentBuilderProvider;

    private Provider<
            StatisticsFragmentModule_ContributeDayFragment.StatisticsDayFragmentSubcomponent
                .Builder>
        statisticsDayFragmentSubcomponentBuilderProvider;

    private StatisticsRepository_Factory statisticsRepositoryProvider;

    private DayRepository_Factory dayRepositoryProvider;

    private StatisticsViewModel_Factory statisticsViewModelProvider;

    private StatisticsActivitySubcomponentImpl(StatisticsActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<
            Class<? extends androidx.fragment.app.Fragment>,
            Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return ImmutableMap
          .<Class<? extends androidx.fragment.app.Fragment>,
              Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
              of(
                  StatisticsMonthFragment.class,
                  (Provider) statisticsMonthFragmentSubcomponentBuilderProvider,
                  StatisticsDayFragment.class,
                  (Provider) statisticsDayFragmentSubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          StatisticsViewModel.class, (Provider) statisticsViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final StatisticsActivitySubcomponentBuilder builder) {
      this.statisticsMonthFragmentSubcomponentBuilderProvider =
          new Provider<
              StatisticsFragmentModule_ContributeMonthFragment.StatisticsMonthFragmentSubcomponent
                  .Builder>() {
            @Override
            public StatisticsFragmentModule_ContributeMonthFragment
                    .StatisticsMonthFragmentSubcomponent.Builder
                get() {
              return new StatisticsMonthFragmentSubcomponentBuilder();
            }
          };
      this.statisticsDayFragmentSubcomponentBuilderProvider =
          new Provider<
              StatisticsFragmentModule_ContributeDayFragment.StatisticsDayFragmentSubcomponent
                  .Builder>() {
            @Override
            public StatisticsFragmentModule_ContributeDayFragment.StatisticsDayFragmentSubcomponent
                    .Builder
                get() {
              return new StatisticsDayFragmentSubcomponentBuilder();
            }
          };
      this.statisticsRepositoryProvider =
          StatisticsRepository_Factory.create(
              DaggerAppComponent.this.provideDayDaoProvider,
              DaggerAppComponent.this.provideCalendarProvider);
      this.dayRepositoryProvider =
          DayRepository_Factory.create(DaggerAppComponent.this.provideDayDaoProvider);
      this.statisticsViewModelProvider =
          StatisticsViewModel_Factory.create(statisticsRepositoryProvider, dayRepositoryProvider);
    }

    @Override
    public void inject(StatisticsActivity arg0) {
      injectStatisticsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private StatisticsActivity injectStatisticsActivity(StatisticsActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      StatisticsActivity_MembersInjector.injectModelFactory(
          instance, getViewModelProviderFactory());
      return instance;
    }

    private final class StatisticsMonthFragmentSubcomponentBuilder
        extends StatisticsFragmentModule_ContributeMonthFragment.StatisticsMonthFragmentSubcomponent
            .Builder {
      private StatisticsMonthFragment seedInstance;

      @Override
      public StatisticsFragmentModule_ContributeMonthFragment.StatisticsMonthFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              StatisticsMonthFragment.class.getCanonicalName() + " must be set");
        }
        return new StatisticsMonthFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(StatisticsMonthFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class StatisticsMonthFragmentSubcomponentImpl
        implements StatisticsFragmentModule_ContributeMonthFragment
            .StatisticsMonthFragmentSubcomponent {
      private StatisticsMonthFragmentSubcomponentImpl(
          StatisticsMonthFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(StatisticsMonthFragment arg0) {
        injectStatisticsMonthFragment(arg0);
      }

      @CanIgnoreReturnValue
      private StatisticsMonthFragment injectStatisticsMonthFragment(
          StatisticsMonthFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            StatisticsActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        StatisticsMonthFragment_MembersInjector.injectModelFactory(
            instance, StatisticsActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }
    }

    private final class StatisticsDayFragmentSubcomponentBuilder
        extends StatisticsFragmentModule_ContributeDayFragment.StatisticsDayFragmentSubcomponent
            .Builder {
      private StatisticsDayFragment seedInstance;

      @Override
      public StatisticsFragmentModule_ContributeDayFragment.StatisticsDayFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              StatisticsDayFragment.class.getCanonicalName() + " must be set");
        }
        return new StatisticsDayFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(StatisticsDayFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class StatisticsDayFragmentSubcomponentImpl
        implements StatisticsFragmentModule_ContributeDayFragment
            .StatisticsDayFragmentSubcomponent {
      private StatisticsDayFragmentSubcomponentImpl(
          StatisticsDayFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(StatisticsDayFragment arg0) {
        injectStatisticsDayFragment(arg0);
      }

      @CanIgnoreReturnValue
      private StatisticsDayFragment injectStatisticsDayFragment(StatisticsDayFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            StatisticsActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        StatisticsDayFragment_MembersInjector.injectModelFactory(
            instance, StatisticsActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }
    }
  }

  private final class AboutActivitySubcomponentBuilder
      extends ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent.Builder {
    private AboutActivity seedInstance;

    @Override
    public ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(AboutActivity.class.getCanonicalName() + " must be set");
      }
      return new AboutActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(AboutActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class AboutActivitySubcomponentImpl
      implements ActivitiesBuilderModule_ContributeAboutActivity.AboutActivitySubcomponent {
    private AboutActivitySubcomponentImpl(AboutActivitySubcomponentBuilder builder) {}

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          ImmutableMap
              .<Class<? extends androidx.fragment.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of(),
          ImmutableMap
              .<String, Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                  of());
    }

    @Override
    public void inject(AboutActivity arg0) {
      injectAboutActivity(arg0);
    }

    @CanIgnoreReturnValue
    private AboutActivity injectAboutActivity(AboutActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      return instance;
    }
  }
}
