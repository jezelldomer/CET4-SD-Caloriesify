package com.front_end.app.modules.signup.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrSignUpwith: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_or_signup_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeSignUp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSIGNUP: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_pressing_su)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStackuserValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStackvectorValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStacklockValue: String? = null
)
