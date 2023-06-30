package com.front_end.app.modules.homediet.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class HomeDietModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodMorningUS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_good_morning_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsstartwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_start_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJournal: String? = MyApp.getInstance().resources.getString(R.string.lbl_journal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiet: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWorkout: String? = MyApp.getInstance().resources.getString(R.string.lbl_workout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBMI: String? = MyApp.getInstance().resources.getString(R.string.lbl_bmi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyourCus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_cus)

)
