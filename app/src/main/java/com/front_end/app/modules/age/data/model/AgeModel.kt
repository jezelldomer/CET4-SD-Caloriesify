package com.front_end.app.modules.age.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class AgeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsyourage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_s_your_age)
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
  var etColumnrectangletwentyoneValue: String? = null
)
