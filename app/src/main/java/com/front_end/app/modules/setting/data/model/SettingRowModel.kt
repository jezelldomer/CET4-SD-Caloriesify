package com.front_end.app.modules.setting.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class SettingRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdjustMacroNut: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adjust_macronut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarbsProtein: String? = MyApp.getInstance().resources.getString(R.string.msg_carbs_protein)

)
