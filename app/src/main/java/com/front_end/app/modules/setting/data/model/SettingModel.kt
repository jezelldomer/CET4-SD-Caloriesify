package com.front_end.app.modules.setting.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class SettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamePirate: String? = MyApp.getInstance().resources.getString(R.string.lbl_name_pirate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAgeCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_age_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmaildatapir: String? =
      MyApp.getInstance().resources.getString(R.string.msg_email_data_pir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentweight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_current_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_80_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoal: String? = MyApp.getInstance().resources.getString(R.string.lbl_goal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoseWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_lose_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTargetWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_target_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_69_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalDetail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_detail)

)
