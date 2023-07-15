package com.front_end.app.modules.target.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class TargetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsyourTar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_s_your_tar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeusethisdat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_use_this_dat)
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
<<<<<<< HEAD

=======
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etColumnrectangletwentyfiveValue: String? = null
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
)
