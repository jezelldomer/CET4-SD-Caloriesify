package com.front_end.app.modules.normal.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class NormalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNormal: String? = MyApp.getInstance().resources.getString(R.string.lbl_normal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveNormal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_normal)

)
