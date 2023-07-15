package com.front_end.app.modules.newtwo.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class NewtwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUntitled: String? = MyApp.getInstance().resources.getString(R.string.lbl_untitled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUntitledOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_untitled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContent: String? = MyApp.getInstance().resources.getString(R.string.lbl_content)

)
