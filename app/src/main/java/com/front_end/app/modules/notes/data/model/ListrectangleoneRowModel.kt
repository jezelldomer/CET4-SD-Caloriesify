package com.front_end.app.modules.notes.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectangleoneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotesname: String? = MyApp.getInstance().resources.getString(R.string.lbl_notes_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)

)
