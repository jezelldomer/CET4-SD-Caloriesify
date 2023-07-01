package com.front_end.app.modules.timemanagement.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class TimeManagementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUntitled: String? = MyApp.getInstance().resources.getString(R.string.lbl_untitled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWith: String? = MyApp.getInstance().resources.getString(R.string.lbl_with)

)
