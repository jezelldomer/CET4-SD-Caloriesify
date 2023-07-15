package com.front_end.app.modules.dinner.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class ListuntitleddesignTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSnacks: String? = MyApp.getInstance().resources.getString(R.string.lbl_snacks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommendedEightyNine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_89)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOneTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl8)

)
