package com.front_end.app.modules.excer.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class ExcerRowModel(
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
  var txtGroupFortyOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl8)

)
