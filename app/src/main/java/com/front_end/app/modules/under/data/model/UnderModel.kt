package com.front_end.app.modules.under.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class UnderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOverweight: String? = MyApp.getInstance().resources.getString(R.string.lbl_overweight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveNormal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_normal)

)
