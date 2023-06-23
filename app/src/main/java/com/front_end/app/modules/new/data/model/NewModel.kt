package com.front_end.app.modules.new.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class NewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUntitled: String? = MyApp.getInstance().resources.getString(R.string.lbl_untitled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUntitledOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContentValue: String? = null
)
