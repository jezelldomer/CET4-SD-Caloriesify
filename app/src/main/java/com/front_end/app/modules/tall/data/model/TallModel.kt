package com.front_end.app.modules.tall.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class TallModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowTallareyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_tall_are_yo)
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
  var etColumnrectangletwentyfiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etColumnrectangletwentysixValue: String? = null
)
