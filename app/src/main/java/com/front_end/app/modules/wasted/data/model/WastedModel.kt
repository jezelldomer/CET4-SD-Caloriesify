package com.front_end.app.modules.wasted.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class WastedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUnderweight: String? = MyApp.getInstance().resources.getString(R.string.lbl_underweight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveUnderw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_underw)

)
