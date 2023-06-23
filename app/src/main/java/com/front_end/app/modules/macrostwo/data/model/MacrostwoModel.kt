package com.front_end.app.modules.macrostwo.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class MacrostwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSAVED: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved)

)
