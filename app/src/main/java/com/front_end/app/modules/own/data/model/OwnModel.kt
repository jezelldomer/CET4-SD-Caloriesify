package com.front_end.app.modules.own.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class OwnModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyourOwn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_own)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarbs: String? = MyApp.getInstance().resources.getString(R.string.lbl_carbs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFats: String? = MyApp.getInstance().resources.getString(R.string.lbl_fats)

)
