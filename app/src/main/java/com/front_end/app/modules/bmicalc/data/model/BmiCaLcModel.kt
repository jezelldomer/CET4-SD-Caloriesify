package com.front_end.app.modules.bmicalc.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class BmiCaLcModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeHundredThirtyThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_33_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveObese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_obese)

)
