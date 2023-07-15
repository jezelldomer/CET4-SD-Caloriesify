package com.front_end.app.modules.excer.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class ListavocadoOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvocadoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_avocado)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_medium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_240)

)
