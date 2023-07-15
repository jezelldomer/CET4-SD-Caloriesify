package com.front_end.app.modules.login.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrLoginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeLogin: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSIGNUP: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
<<<<<<< HEAD
  var etStackuserValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStacklockValue: String? = null,
=======
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
<<<<<<< HEAD
  var etGroupFiveValue: String? = null
=======
  var etGroupFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStackuserValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStacklockValue: String? = null
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
)
