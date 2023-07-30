package com.front_end.app.modules.loadingpage.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class LoadingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProcessingAn: String? = MyApp.getInstance().resources.getString(R.string.msg_processing_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEatwellasyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_eat_well_as_you)

)
