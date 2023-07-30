package com.front_end.app.modules.macros.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class MacrosRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJournal: String? = MyApp.getInstance().resources.getString(R.string.lbl_journal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiet: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet)

)
