package com.front_end.app.modules.lunch.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class LunchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDinner: String? = MyApp.getInstance().resources.getString(R.string.lbl_dinner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended535One: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_535)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl8)

)
