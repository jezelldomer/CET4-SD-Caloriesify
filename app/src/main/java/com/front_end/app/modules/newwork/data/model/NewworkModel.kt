package com.front_end.app.modules.newwork.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class NewworkModel(
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
  var etActivityValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etWithValue: String? = null
)
