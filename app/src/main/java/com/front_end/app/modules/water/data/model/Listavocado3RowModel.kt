package com.front_end.app.modules.water.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class Listavocado3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvocado: String? = MyApp.getInstance().resources.getString(R.string.lbl_avocado)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_medium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_240)

)
