package com.front_end.app.modules.weight.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class WeightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsyourCur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_s_your_cur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeusethisdat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_use_this_dat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwentyOneValue: String? = null
)
