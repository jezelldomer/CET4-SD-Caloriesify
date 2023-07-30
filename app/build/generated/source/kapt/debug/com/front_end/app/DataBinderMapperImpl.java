package com.front_end.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.front_end.app.databinding.ActivityAgeBindingImpl;
import com.front_end.app.databinding.ActivityAsexBindingImpl;
import com.front_end.app.databinding.ActivityBmiBindingImpl;
import com.front_end.app.databinding.ActivityBreakfastBindingImpl;
import com.front_end.app.databinding.ActivityCarbsBindingImpl;
import com.front_end.app.databinding.ActivityDetailsBindingImpl;
import com.front_end.app.databinding.ActivityDietBindingImpl;
import com.front_end.app.databinding.ActivityDinnerBindingImpl;
import com.front_end.app.databinding.ActivityExcerBindingImpl;
import com.front_end.app.databinding.ActivityHomeBindingImpl;
import com.front_end.app.databinding.ActivityJournalBindingImpl;
import com.front_end.app.databinding.ActivityLoadingPageBindingImpl;
import com.front_end.app.databinding.ActivityLoginBindingImpl;
import com.front_end.app.databinding.ActivityLunchBindingImpl;
import com.front_end.app.databinding.ActivityMacrosBindingImpl;
import com.front_end.app.databinding.ActivityMaleBindingImpl;
import com.front_end.app.databinding.ActivityNewwBindingImpl;
import com.front_end.app.databinding.ActivityNormalBindingImpl;
import com.front_end.app.databinding.ActivityNotesBindingImpl;
import com.front_end.app.databinding.ActivityObeseBindingImpl;
import com.front_end.app.databinding.ActivityOwnBindingImpl;
import com.front_end.app.databinding.ActivityPassBindingImpl;
import com.front_end.app.databinding.ActivitySavedBindingImpl;
import com.front_end.app.databinding.ActivitySchedBindingImpl;
import com.front_end.app.databinding.ActivitySettingBindingImpl;
import com.front_end.app.databinding.ActivitySignUpBindingImpl;
import com.front_end.app.databinding.ActivityTallBindingImpl;
import com.front_end.app.databinding.ActivityTargetBindingImpl;
import com.front_end.app.databinding.ActivityTimeManagementBindingImpl;
import com.front_end.app.databinding.ActivityUnderBindingImpl;
import com.front_end.app.databinding.ActivityWastedBindingImpl;
import com.front_end.app.databinding.ActivityWaterBindingImpl;
import com.front_end.app.databinding.ActivityWeightBindingImpl;
import com.front_end.app.databinding.ActivityWelcomeScreenBindingImpl;
import com.front_end.app.databinding.ActivityWorkBindingImpl;
import com.front_end.app.databinding.LayoutProgressDialogBindingImpl;
import com.front_end.app.databinding.RowBmiBindingImpl;
import com.front_end.app.databinding.RowCarbsBindingImpl;
import com.front_end.app.databinding.RowDinnerBindingImpl;
import com.front_end.app.databinding.RowExcerBindingImpl;
import com.front_end.app.databinding.RowHomeBindingImpl;
import com.front_end.app.databinding.RowListeggBindingImpl;
import com.front_end.app.databinding.RowListuntitleddesignBindingImpl;
import com.front_end.app.databinding.RowLunchBindingImpl;
import com.front_end.app.databinding.RowMacrosBindingImpl;
import com.front_end.app.databinding.RowSettingBindingImpl;
import com.front_end.app.databinding.RowWaterBindingImpl;
import com.front_end.app.databinding.RowWorkBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAGE = 1;

  private static final int LAYOUT_ACTIVITYASEX = 2;

  private static final int LAYOUT_ACTIVITYBMI = 3;

  private static final int LAYOUT_ACTIVITYBREAKFAST = 4;

  private static final int LAYOUT_ACTIVITYCARBS = 5;

  private static final int LAYOUT_ACTIVITYDETAILS = 6;

  private static final int LAYOUT_ACTIVITYDIET = 7;

  private static final int LAYOUT_ACTIVITYDINNER = 8;

  private static final int LAYOUT_ACTIVITYEXCER = 9;

  private static final int LAYOUT_ACTIVITYHOME = 10;

  private static final int LAYOUT_ACTIVITYJOURNAL = 11;

  private static final int LAYOUT_ACTIVITYLOADINGPAGE = 12;

  private static final int LAYOUT_ACTIVITYLOGIN = 13;

  private static final int LAYOUT_ACTIVITYLUNCH = 14;

  private static final int LAYOUT_ACTIVITYMACROS = 15;

  private static final int LAYOUT_ACTIVITYMALE = 16;

  private static final int LAYOUT_ACTIVITYNEWW = 17;

  private static final int LAYOUT_ACTIVITYNORMAL = 18;

  private static final int LAYOUT_ACTIVITYNOTES = 19;

  private static final int LAYOUT_ACTIVITYOBESE = 20;

  private static final int LAYOUT_ACTIVITYOWN = 21;

  private static final int LAYOUT_ACTIVITYPASS = 22;

  private static final int LAYOUT_ACTIVITYSAVED = 23;

  private static final int LAYOUT_ACTIVITYSCHED = 24;

  private static final int LAYOUT_ACTIVITYSETTING = 25;

  private static final int LAYOUT_ACTIVITYSIGNUP = 26;

  private static final int LAYOUT_ACTIVITYTALL = 27;

  private static final int LAYOUT_ACTIVITYTARGET = 28;

  private static final int LAYOUT_ACTIVITYTIMEMANAGEMENT = 29;

  private static final int LAYOUT_ACTIVITYUNDER = 30;

  private static final int LAYOUT_ACTIVITYWASTED = 31;

  private static final int LAYOUT_ACTIVITYWATER = 32;

  private static final int LAYOUT_ACTIVITYWEIGHT = 33;

  private static final int LAYOUT_ACTIVITYWELCOMESCREEN = 34;

  private static final int LAYOUT_ACTIVITYWORK = 35;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 36;

  private static final int LAYOUT_ROWBMI = 37;

  private static final int LAYOUT_ROWCARBS = 38;

  private static final int LAYOUT_ROWDINNER = 39;

  private static final int LAYOUT_ROWEXCER = 40;

  private static final int LAYOUT_ROWHOME = 41;

  private static final int LAYOUT_ROWLISTEGG = 42;

  private static final int LAYOUT_ROWLISTUNTITLEDDESIGN = 43;

  private static final int LAYOUT_ROWLUNCH = 44;

  private static final int LAYOUT_ROWMACROS = 45;

  private static final int LAYOUT_ROWSETTING = 46;

  private static final int LAYOUT_ROWWATER = 47;

  private static final int LAYOUT_ROWWORK = 48;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(48);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_age, LAYOUT_ACTIVITYAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_asex, LAYOUT_ACTIVITYASEX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_bmi, LAYOUT_ACTIVITYBMI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_breakfast, LAYOUT_ACTIVITYBREAKFAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_carbs, LAYOUT_ACTIVITYCARBS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_details, LAYOUT_ACTIVITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_diet, LAYOUT_ACTIVITYDIET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_dinner, LAYOUT_ACTIVITYDINNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_excer, LAYOUT_ACTIVITYEXCER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_journal, LAYOUT_ACTIVITYJOURNAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_loading_page, LAYOUT_ACTIVITYLOADINGPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_lunch, LAYOUT_ACTIVITYLUNCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_macros, LAYOUT_ACTIVITYMACROS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_male, LAYOUT_ACTIVITYMALE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_neww, LAYOUT_ACTIVITYNEWW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_normal, LAYOUT_ACTIVITYNORMAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_notes, LAYOUT_ACTIVITYNOTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_obese, LAYOUT_ACTIVITYOBESE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_own, LAYOUT_ACTIVITYOWN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_pass, LAYOUT_ACTIVITYPASS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_saved, LAYOUT_ACTIVITYSAVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_sched, LAYOUT_ACTIVITYSCHED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_sign_up, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_tall, LAYOUT_ACTIVITYTALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_target, LAYOUT_ACTIVITYTARGET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_time_management, LAYOUT_ACTIVITYTIMEMANAGEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_under, LAYOUT_ACTIVITYUNDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_wasted, LAYOUT_ACTIVITYWASTED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_water, LAYOUT_ACTIVITYWATER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_weight, LAYOUT_ACTIVITYWEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_welcome_screen, LAYOUT_ACTIVITYWELCOMESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.activity_work, LAYOUT_ACTIVITYWORK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_bmi, LAYOUT_ROWBMI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_carbs, LAYOUT_ROWCARBS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_dinner, LAYOUT_ROWDINNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_excer, LAYOUT_ROWEXCER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_home, LAYOUT_ROWHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_listegg, LAYOUT_ROWLISTEGG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_listuntitleddesign, LAYOUT_ROWLISTUNTITLEDDESIGN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_lunch, LAYOUT_ROWLUNCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_macros, LAYOUT_ROWMACROS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_setting, LAYOUT_ROWSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_water, LAYOUT_ROWWATER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.front_end.app.R.layout.row_work, LAYOUT_ROWWORK);
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
        case  LAYOUT_ACTIVITYAGE: {
          if ("layout/activity_age_0".equals(tag)) {
            return new ActivityAgeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_age is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYASEX: {
          if ("layout/activity_asex_0".equals(tag)) {
            return new ActivityAsexBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_asex is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBMI: {
          if ("layout/activity_bmi_0".equals(tag)) {
            return new ActivityBmiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_bmi is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBREAKFAST: {
          if ("layout/activity_breakfast_0".equals(tag)) {
            return new ActivityBreakfastBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_breakfast is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCARBS: {
          if ("layout/activity_carbs_0".equals(tag)) {
            return new ActivityCarbsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_carbs is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAILS: {
          if ("layout/activity_details_0".equals(tag)) {
            return new ActivityDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDIET: {
          if ("layout/activity_diet_0".equals(tag)) {
            return new ActivityDietBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_diet is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDINNER: {
          if ("layout/activity_dinner_0".equals(tag)) {
            return new ActivityDinnerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dinner is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEXCER: {
          if ("layout/activity_excer_0".equals(tag)) {
            return new ActivityExcerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_excer is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYJOURNAL: {
          if ("layout/activity_journal_0".equals(tag)) {
            return new ActivityJournalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_journal is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOADINGPAGE: {
          if ("layout/activity_loading_page_0".equals(tag)) {
            return new ActivityLoadingPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_loading_page is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLUNCH: {
          if ("layout/activity_lunch_0".equals(tag)) {
            return new ActivityLunchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_lunch is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMACROS: {
          if ("layout/activity_macros_0".equals(tag)) {
            return new ActivityMacrosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_macros is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMALE: {
          if ("layout/activity_male_0".equals(tag)) {
            return new ActivityMaleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_male is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNEWW: {
          if ("layout/activity_neww_0".equals(tag)) {
            return new ActivityNewwBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_neww is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNORMAL: {
          if ("layout/activity_normal_0".equals(tag)) {
            return new ActivityNormalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_normal is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNOTES: {
          if ("layout/activity_notes_0".equals(tag)) {
            return new ActivityNotesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_notes is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYOBESE: {
          if ("layout/activity_obese_0".equals(tag)) {
            return new ActivityObeseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_obese is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYOWN: {
          if ("layout/activity_own_0".equals(tag)) {
            return new ActivityOwnBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_own is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPASS: {
          if ("layout/activity_pass_0".equals(tag)) {
            return new ActivityPassBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pass is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSAVED: {
          if ("layout/activity_saved_0".equals(tag)) {
            return new ActivitySavedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_saved is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSCHED: {
          if ("layout/activity_sched_0".equals(tag)) {
            return new ActivitySchedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sched is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTING: {
          if ("layout/activity_setting_0".equals(tag)) {
            return new ActivitySettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_sign_up_0".equals(tag)) {
            return new ActivitySignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTALL: {
          if ("layout/activity_tall_0".equals(tag)) {
            return new ActivityTallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tall is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTARGET: {
          if ("layout/activity_target_0".equals(tag)) {
            return new ActivityTargetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_target is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTIMEMANAGEMENT: {
          if ("layout/activity_time_management_0".equals(tag)) {
            return new ActivityTimeManagementBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_time_management is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUNDER: {
          if ("layout/activity_under_0".equals(tag)) {
            return new ActivityUnderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_under is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWASTED: {
          if ("layout/activity_wasted_0".equals(tag)) {
            return new ActivityWastedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_wasted is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWATER: {
          if ("layout/activity_water_0".equals(tag)) {
            return new ActivityWaterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_water is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWEIGHT: {
          if ("layout/activity_weight_0".equals(tag)) {
            return new ActivityWeightBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_weight is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWELCOMESCREEN: {
          if ("layout/activity_welcome_screen_0".equals(tag)) {
            return new ActivityWelcomeScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_welcome_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWORK: {
          if ("layout/activity_work_0".equals(tag)) {
            return new ActivityWorkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_work is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWBMI: {
          if ("layout/row_bmi_0".equals(tag)) {
            return new RowBmiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_bmi is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCARBS: {
          if ("layout/row_carbs_0".equals(tag)) {
            return new RowCarbsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_carbs is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWDINNER: {
          if ("layout/row_dinner_0".equals(tag)) {
            return new RowDinnerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_dinner is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWEXCER: {
          if ("layout/row_excer_0".equals(tag)) {
            return new RowExcerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_excer is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWHOME: {
          if ("layout/row_home_0".equals(tag)) {
            return new RowHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLISTEGG: {
          if ("layout/row_listegg_0".equals(tag)) {
            return new RowListeggBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_listegg is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLISTUNTITLEDDESIGN: {
          if ("layout/row_listuntitleddesign_0".equals(tag)) {
            return new RowListuntitleddesignBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_listuntitleddesign is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLUNCH: {
          if ("layout/row_lunch_0".equals(tag)) {
            return new RowLunchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_lunch is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWMACROS: {
          if ("layout/row_macros_0".equals(tag)) {
            return new RowMacrosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_macros is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSETTING: {
          if ("layout/row_setting_0".equals(tag)) {
            return new RowSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWWATER: {
          if ("layout/row_water_0".equals(tag)) {
            return new RowWaterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_water is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWWORK: {
          if ("layout/row_work_0".equals(tag)) {
            return new RowWorkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_work is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(49);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "ageVM");
      sKeys.put(2, "asexVM");
      sKeys.put(3, "bmiRowModel");
      sKeys.put(4, "bmiVM");
      sKeys.put(5, "breakfastVM");
      sKeys.put(6, "carbsRowModel");
      sKeys.put(7, "carbsVM");
      sKeys.put(8, "detailsVM");
      sKeys.put(9, "dietVM");
      sKeys.put(10, "dinnerRowModel");
      sKeys.put(11, "dinnerVM");
      sKeys.put(12, "excerRowModel");
      sKeys.put(13, "excerVM");
      sKeys.put(14, "homeRowModel");
      sKeys.put(15, "homeVM");
      sKeys.put(16, "journalVM");
      sKeys.put(17, "listeggRowModel");
      sKeys.put(18, "listuntitleddesignRowModel");
      sKeys.put(19, "loadingPageVM");
      sKeys.put(20, "loginVM");
      sKeys.put(21, "lunchRowModel");
      sKeys.put(22, "lunchVM");
      sKeys.put(23, "macrosRowModel");
      sKeys.put(24, "macrosVM");
      sKeys.put(25, "maleVM");
      sKeys.put(26, "message");
      sKeys.put(27, "newVM");
      sKeys.put(28, "normalVM");
      sKeys.put(29, "notesVM");
      sKeys.put(30, "obeseVM");
      sKeys.put(31, "ownVM");
      sKeys.put(32, "passVM");
      sKeys.put(33, "savedVM");
      sKeys.put(34, "schedVM");
      sKeys.put(35, "settingRowModel");
      sKeys.put(36, "settingVM");
      sKeys.put(37, "signUpVM");
      sKeys.put(38, "tallVM");
      sKeys.put(39, "targetVM");
      sKeys.put(40, "timeManagementVM");
      sKeys.put(41, "underVM");
      sKeys.put(42, "wastedVM");
      sKeys.put(43, "waterRowModel");
      sKeys.put(44, "waterVM");
      sKeys.put(45, "weightVM");
      sKeys.put(46, "welcomeScreenVM");
      sKeys.put(47, "workRowModel");
      sKeys.put(48, "workVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(48);

    static {
      sKeys.put("layout/activity_age_0", com.front_end.app.R.layout.activity_age);
      sKeys.put("layout/activity_asex_0", com.front_end.app.R.layout.activity_asex);
      sKeys.put("layout/activity_bmi_0", com.front_end.app.R.layout.activity_bmi);
      sKeys.put("layout/activity_breakfast_0", com.front_end.app.R.layout.activity_breakfast);
      sKeys.put("layout/activity_carbs_0", com.front_end.app.R.layout.activity_carbs);
      sKeys.put("layout/activity_details_0", com.front_end.app.R.layout.activity_details);
      sKeys.put("layout/activity_diet_0", com.front_end.app.R.layout.activity_diet);
      sKeys.put("layout/activity_dinner_0", com.front_end.app.R.layout.activity_dinner);
      sKeys.put("layout/activity_excer_0", com.front_end.app.R.layout.activity_excer);
      sKeys.put("layout/activity_home_0", com.front_end.app.R.layout.activity_home);
      sKeys.put("layout/activity_journal_0", com.front_end.app.R.layout.activity_journal);
      sKeys.put("layout/activity_loading_page_0", com.front_end.app.R.layout.activity_loading_page);
      sKeys.put("layout/activity_login_0", com.front_end.app.R.layout.activity_login);
      sKeys.put("layout/activity_lunch_0", com.front_end.app.R.layout.activity_lunch);
      sKeys.put("layout/activity_macros_0", com.front_end.app.R.layout.activity_macros);
      sKeys.put("layout/activity_male_0", com.front_end.app.R.layout.activity_male);
      sKeys.put("layout/activity_neww_0", com.front_end.app.R.layout.activity_neww);
      sKeys.put("layout/activity_normal_0", com.front_end.app.R.layout.activity_normal);
      sKeys.put("layout/activity_notes_0", com.front_end.app.R.layout.activity_notes);
      sKeys.put("layout/activity_obese_0", com.front_end.app.R.layout.activity_obese);
      sKeys.put("layout/activity_own_0", com.front_end.app.R.layout.activity_own);
      sKeys.put("layout/activity_pass_0", com.front_end.app.R.layout.activity_pass);
      sKeys.put("layout/activity_saved_0", com.front_end.app.R.layout.activity_saved);
      sKeys.put("layout/activity_sched_0", com.front_end.app.R.layout.activity_sched);
      sKeys.put("layout/activity_setting_0", com.front_end.app.R.layout.activity_setting);
      sKeys.put("layout/activity_sign_up_0", com.front_end.app.R.layout.activity_sign_up);
      sKeys.put("layout/activity_tall_0", com.front_end.app.R.layout.activity_tall);
      sKeys.put("layout/activity_target_0", com.front_end.app.R.layout.activity_target);
      sKeys.put("layout/activity_time_management_0", com.front_end.app.R.layout.activity_time_management);
      sKeys.put("layout/activity_under_0", com.front_end.app.R.layout.activity_under);
      sKeys.put("layout/activity_wasted_0", com.front_end.app.R.layout.activity_wasted);
      sKeys.put("layout/activity_water_0", com.front_end.app.R.layout.activity_water);
      sKeys.put("layout/activity_weight_0", com.front_end.app.R.layout.activity_weight);
      sKeys.put("layout/activity_welcome_screen_0", com.front_end.app.R.layout.activity_welcome_screen);
      sKeys.put("layout/activity_work_0", com.front_end.app.R.layout.activity_work);
      sKeys.put("layout/layout_progress_dialog_0", com.front_end.app.R.layout.layout_progress_dialog);
      sKeys.put("layout/row_bmi_0", com.front_end.app.R.layout.row_bmi);
      sKeys.put("layout/row_carbs_0", com.front_end.app.R.layout.row_carbs);
      sKeys.put("layout/row_dinner_0", com.front_end.app.R.layout.row_dinner);
      sKeys.put("layout/row_excer_0", com.front_end.app.R.layout.row_excer);
      sKeys.put("layout/row_home_0", com.front_end.app.R.layout.row_home);
      sKeys.put("layout/row_listegg_0", com.front_end.app.R.layout.row_listegg);
      sKeys.put("layout/row_listuntitleddesign_0", com.front_end.app.R.layout.row_listuntitleddesign);
      sKeys.put("layout/row_lunch_0", com.front_end.app.R.layout.row_lunch);
      sKeys.put("layout/row_macros_0", com.front_end.app.R.layout.row_macros);
      sKeys.put("layout/row_setting_0", com.front_end.app.R.layout.row_setting);
      sKeys.put("layout/row_water_0", com.front_end.app.R.layout.row_water);
      sKeys.put("layout/row_work_0", com.front_end.app.R.layout.row_work);
    }
  }
}
