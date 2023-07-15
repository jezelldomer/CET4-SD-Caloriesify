package com.front_end.app.modules.notes.`data`.model

import com.front_end.app.R
import com.front_end.app.appcomponents.di.MyApp
import kotlin.String

data class NotesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotes: String? = MyApp.getInstance().resources.getString(R.string.lbl_notes)

)
