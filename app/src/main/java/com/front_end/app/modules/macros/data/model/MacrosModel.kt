package com.front_end.app.modules.macros.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class MacrosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodMorningUS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_good_morning_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsstartwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_start_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyourCus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_cus)

)
