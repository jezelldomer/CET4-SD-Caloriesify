package com.front_end.app.modules.macrosone.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class MacrosoneModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var et00Value: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var et00OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var et00TwoValue: String? = null
)
