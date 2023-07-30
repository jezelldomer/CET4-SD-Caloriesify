package com.feedapp.app.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0016H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0018H\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020#H\u0007J,\u0010$\u001a\u00020%2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010&\u001a\u00020!2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\'\u001a\u00020%H\u0007J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0010H\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020)H\u0007J\u0012\u0010.\u001a\u00020/2\b\b\u0001\u00100\u001a\u000201H\u0007J\u0010\u00102\u001a\u0002032\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u00104\u001a\u0002052\u0006\u0010\t\u001a\u00020\n2\u0006\u00106\u001a\u00020/H\u0007J\b\u00107\u001a\u00020\u001fH\u0007J\u0012\u00108\u001a\u0002012\b\b\u0001\u00109\u001a\u00020%H\u0007J\u0012\u0010:\u001a\u0002012\b\b\u0001\u00109\u001a\u00020%H\u0007J\u0010\u0010;\u001a\u00020<2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020<H\u0007J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020<H\u0007J\b\u0010C\u001a\u00020DH\u0007J\u0010\u0010E\u001a\u00020F2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010G\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020F2\u0006\u0010K\u001a\u00020#H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/feedapp/app/di/modules/AppModule;", "", "()V", "HEADER_CACHE_CONTROL", "", "HEADER_PRAGMA", "networkInterceptor", "Lokhttp3/Interceptor;", "offlineInterceptor", "application", "Landroid/app/Application;", "provideCalendar", "Ljava/util/Calendar;", "provideDayDao", "Lcom/feedapp/app/data/databases/daos/DayDao;", "database", "Lcom/feedapp/app/data/databases/dbclasses/UserDatabase;", "provideDayRecyclerAdapter", "Lcom/feedapp/app/ui/adapters/DayRecyclerAdapter;", "provideDetailedRecipeRepo", "Lcom/feedapp/app/data/models/calculations/RecipesDetailsCalculator;", "provideFoodDatabase", "Lcom/feedapp/app/data/databases/dbclasses/FoodDatabase;", "provideFoodProductDao", "Lcom/feedapp/app/data/databases/daos/FoodProductDao;", "provideFoodProductRepository", "Lcom/feedapp/app/data/repositories/FoodRepository;", "foodProductDao", "provideGlide", "Lcom/bumptech/glide/RequestManager;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideLeftNutrientCalculator", "Lcom/feedapp/app/data/models/calculations/LeftNutrientCalculator;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "provideOkHttpClientUSDA", "provideRecentDao", "Lcom/feedapp/app/data/databases/daos/RecentDao;", "userDatabase", "provideRecentDelegate", "Lcom/feedapp/app/data/repositories/RecentDelegate;", "recentDao", "provideRecipeApiSearchResult", "Lcom/feedapp/app/data/api/interfaces/RecipeApiSearch;", "retrofit", "Lretrofit2/Retrofit;", "provideRecipeIngredientAdapter", "Lcom/feedapp/app/ui/adapters/RecipeIngredientAdapter;", "provideRecipeSearchRepository", "Lcom/feedapp/app/data/repositories/RecipeSearchRepository;", "recipeApiSearch", "provideRequestOptions", "provideRetrofitInstance", "okHttpClient", "provideRetrofitInstanceSpoonacular", "provideSP", "Landroid/content/SharedPreferences;", "provideSPEditor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "provideSPHelper", "Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "sp", "provideStepRecyclerAdapter", "Lcom/feedapp/app/ui/adapters/RecipeStepAdapter;", "provideUserDao", "Lcom/feedapp/app/data/databases/daos/UserDao;", "provideUserDatabase", "provideUserRepository", "Lcom/feedapp/app/data/repositories/UserRepository;", "userDao", "leftCalculator", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final java.lang.String HEADER_CACHE_CONTROL = "Cache-Control";
    private final java.lang.String HEADER_PRAGMA = "Pragma";
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.request.RequestOptions provideRequestOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences provideSP(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences.Editor provideSPEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.util.Calendar provideCalendar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.models.prefs.SharedPrefsHelper provideSPHelper(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager provideGlide(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInstance(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "OkHttpClientUSDA")
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "OkHttpClientUSDA")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClientUSDA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.databases.dbclasses.FoodDatabase provideFoodDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.databases.dbclasses.UserDatabase provideUserDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.databases.daos.FoodProductDao provideFoodProductDao(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.dbclasses.FoodDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.databases.daos.DayDao provideDayDao(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.dbclasses.UserDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.databases.daos.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.dbclasses.UserDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.repositories.FoodRepository provideFoodProductRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.FoodProductDao foodProductDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.repositories.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.calculations.LeftNutrientCalculator leftCalculator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.feedapp.app.data.repositories.RecentDelegate provideRecentDelegate(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.RecentDao recentDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.feedapp.app.data.databases.daos.RecentDao provideRecentDao(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.dbclasses.UserDatabase userDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.feedapp.app.data.models.calculations.RecipesDetailsCalculator provideDetailedRecipeRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.ui.adapters.DayRecyclerAdapter provideDayRecyclerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.ui.adapters.RecipeIngredientAdapter provideRecipeIngredientAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.ui.adapters.RecipeStepAdapter provideStepRecyclerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.repositories.RecipeSearchRepository provideRecipeSearchRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.interfaces.RecipeApiSearch recipeApiSearch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "retrofitSpoonacular")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInstanceSpoonacular(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "OkHttpClientSpoonacular")
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.api.interfaces.RecipeApiSearch provideRecipeApiSearchResult(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "retrofitSpoonacular")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "OkHttpClientSpoonacular")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "networkInterceptor")
    okhttp3.Interceptor networkInterceptor, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "offlineInterceptor")
    okhttp3.Interceptor offlineInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    /**
     * This interceptor will be called ONLY if the network is available
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "networkInterceptor")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.Interceptor networkInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "offlineInterceptor")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.Interceptor offlineInterceptor(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.feedapp.app.data.models.calculations.LeftNutrientCalculator provideLeftNutrientCalculator() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}