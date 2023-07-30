package com.front_end.app.modules.lunch.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class LunchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCarbs: String? = MyApp.getInstance().resources.getString(R.string.lbl_carbs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFat: String? = MyApp.getInstance().resources.getString(R.string.lbl_fat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_36_223g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_59_89g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_59g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_18_nov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended356: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_356)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLunch: String? = MyApp.getInstance().resources.getString(R.string.lbl_lunch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended535: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_535)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWater: String? = MyApp.getInstance().resources.getString(R.string.lbl_water)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended5Lt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_5lt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOneFour: String? = MyApp.getInstance().resources.getString(R.string.lbl8)

)
