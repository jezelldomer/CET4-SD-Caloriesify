package com.front_end.app.modules.old.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class OldModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNOTESNAME: String? = MyApp.getInstance().resources.getString(R.string.lbl_notes_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUntitledValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContentValue: String? = null
)
