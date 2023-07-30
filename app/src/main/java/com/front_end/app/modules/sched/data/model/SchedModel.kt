package com.front_end.app.modules.sched.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class SchedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTodaysplan: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_s_plan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.msg_group_run_wedne)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHinesDrive: String? = MyApp.getInstance().resources.getString(R.string.lbl_hines_drive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouKatieFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_you_katie_4)

)
