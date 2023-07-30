package com.feedapp.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.feedapp.app.databinding.ActivityDetailedFoodBindingImpl;
import com.feedapp.app.databinding.ActivityDetailedRecipeBindingImpl;
import com.feedapp.app.databinding.ActivityHomeBindingImpl;
import com.feedapp.app.databinding.ActivityMyMealsSearchBindingImpl;
import com.feedapp.app.databinding.ActivitySearchBindingImpl;
import com.feedapp.app.databinding.ActivityStatisticsBindingImpl;
import com.feedapp.app.databinding.FragmentDayBindingImpl;
import com.feedapp.app.databinding.FragmentDayBindingV28Impl;
import com.feedapp.app.databinding.FragmentHomeBindingImpl;
import com.feedapp.app.databinding.FragmentHomeDownMenuBindingImpl;
import com.feedapp.app.databinding.FragmentHomeUpMenuBindingImpl;
import com.feedapp.app.databinding.FragmentMyMealsBindingImpl;
import com.feedapp.app.databinding.FragmentRecipesBindingImpl;
import com.feedapp.app.databinding.FragmentStatisticsDayBindingImpl;
import com.feedapp.app.databinding.FragmentStatisticsMonthBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAILEDFOOD = 1;

  private static final int LAYOUT_ACTIVITYDETAILEDRECIPE = 2;

  private static final int LAYOUT_ACTIVITYHOME = 3;

  private static final int LAYOUT_ACTIVITYMYMEALSSEARCH = 4;

  private static final int LAYOUT_ACTIVITYSEARCH = 5;

  private static final int LAYOUT_ACTIVITYSTATISTICS = 6;

  private static final int LAYOUT_FRAGMENTDAY = 7;

  private static final int LAYOUT_FRAGMENTHOME = 8;

  private static final int LAYOUT_FRAGMENTHOMEDOWNMENU = 9;

  private static final int LAYOUT_FRAGMENTHOMEUPMENU = 10;

  private static final int LAYOUT_FRAGMENTMYMEALS = 11;

  private static final int LAYOUT_FRAGMENTRECIPES = 12;

  private static final int LAYOUT_FRAGMENTSTATISTICSDAY = 13;

  private static final int LAYOUT_FRAGMENTSTATISTICSMONTH = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.activity_detailed_food, LAYOUT_ACTIVITYDETAILEDFOOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.activity_detailed_recipe, LAYOUT_ACTIVITYDETAILEDRECIPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.activity_my_meals_search, LAYOUT_ACTIVITYMYMEALSSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.activity_statistics, LAYOUT_ACTIVITYSTATISTICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_day, LAYOUT_FRAGMENTDAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_home_down_menu, LAYOUT_FRAGMENTHOMEDOWNMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_home_up_menu, LAYOUT_FRAGMENTHOMEUPMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_my_meals, LAYOUT_FRAGMENTMYMEALS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_recipes, LAYOUT_FRAGMENTRECIPES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_statistics_day, LAYOUT_FRAGMENTSTATISTICSDAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.feedapp.app.R.layout.fragment_statistics_month, LAYOUT_FRAGMENTSTATISTICSMONTH);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAILEDFOOD: {
          if ("layout/activity_detailed_food_0".equals(tag)) {
            return new ActivityDetailedFoodBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detailed_food is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAILEDRECIPE: {
          if ("layout/activity_detailed_recipe_0".equals(tag)) {
            return new ActivityDetailedRecipeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detailed_recipe is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMYMEALSSEARCH: {
          if ("layout/activity_my_meals_search_0".equals(tag)) {
            return new ActivityMyMealsSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_meals_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTATISTICS: {
          if ("layout/activity_statistics_0".equals(tag)) {
            return new ActivityStatisticsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_statistics is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDAY: {
          if ("layout/fragment_day_0".equals(tag)) {
            return new FragmentDayBindingImpl(component, view);
          }
          if ("layout-v28/fragment_day_0".equals(tag)) {
            return new FragmentDayBindingV28Impl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_day is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMEDOWNMENU: {
          if ("layout/fragment_home_down_menu_0".equals(tag)) {
            return new FragmentHomeDownMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_down_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMEUPMENU: {
          if ("layout/fragment_home_up_menu_0".equals(tag)) {
            return new FragmentHomeUpMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_up_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYMEALS: {
          if ("layout/fragment_my_meals_0".equals(tag)) {
            return new FragmentMyMealsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_meals is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRECIPES: {
          if ("layout/fragment_recipes_0".equals(tag)) {
            return new FragmentRecipesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_recipes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATISTICSDAY: {
          if ("layout/fragment_statistics_day_0".equals(tag)) {
            return new FragmentStatisticsDayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_statistics_day is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATISTICSMONTH: {
          if ("layout/fragment_statistics_month_0".equals(tag)) {
            return new FragmentStatisticsMonthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_statistics_month is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "mealsVM");
      sKeys.put(2, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_detailed_food_0", com.feedapp.app.R.layout.activity_detailed_food);
      sKeys.put("layout/activity_detailed_recipe_0", com.feedapp.app.R.layout.activity_detailed_recipe);
      sKeys.put("layout/activity_home_0", com.feedapp.app.R.layout.activity_home);
      sKeys.put("layout/activity_my_meals_search_0", com.feedapp.app.R.layout.activity_my_meals_search);
      sKeys.put("layout/activity_search_0", com.feedapp.app.R.layout.activity_search);
      sKeys.put("layout/activity_statistics_0", com.feedapp.app.R.layout.activity_statistics);
      sKeys.put("layout/fragment_day_0", com.feedapp.app.R.layout.fragment_day);
      sKeys.put("layout-v28/fragment_day_0", com.feedapp.app.R.layout.fragment_day);
      sKeys.put("layout/fragment_home_0", com.feedapp.app.R.layout.fragment_home);
      sKeys.put("layout/fragment_home_down_menu_0", com.feedapp.app.R.layout.fragment_home_down_menu);
      sKeys.put("layout/fragment_home_up_menu_0", com.feedapp.app.R.layout.fragment_home_up_menu);
      sKeys.put("layout/fragment_my_meals_0", com.feedapp.app.R.layout.fragment_my_meals);
      sKeys.put("layout/fragment_recipes_0", com.feedapp.app.R.layout.fragment_recipes);
      sKeys.put("layout/fragment_statistics_day_0", com.feedapp.app.R.layout.fragment_statistics_day);
      sKeys.put("layout/fragment_statistics_month_0", com.feedapp.app.R.layout.fragment_statistics_month);
    }
  }
}
