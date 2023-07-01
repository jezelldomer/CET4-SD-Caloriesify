package com.front_end.app.modules.breakfast.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class ListeggRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEgg: String? = MyApp.getInstance().resources.getString(R.string.lbl_egg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLargeCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_large)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_143)

)
