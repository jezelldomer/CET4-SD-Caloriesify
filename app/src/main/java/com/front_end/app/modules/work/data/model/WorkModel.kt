package com.front_end.app.modules.work.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class WorkModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodaysplan: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_s_plan)

)
