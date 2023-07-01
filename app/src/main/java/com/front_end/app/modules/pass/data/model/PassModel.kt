package com.front_end.app.modules.pass.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class PassModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIncaseofForg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_case_of_forg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisthenam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisthenamOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisthenamTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisthenamThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup568: String? = MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhoisyourInt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_who_is_your_int)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup567: String? = MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam2)
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

)
