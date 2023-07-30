package com.front_end.app.modules.obese.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class ObeseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtObsesse: String? = MyApp.getInstance().resources.getString(R.string.lbl_obsesse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveObese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_obese)

)
