package com.front_end.app.modules.notes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.notes.`data`.model.NotesModel
import org.koin.core.KoinComponent

class NotesVM : ViewModel(), KoinComponent {
  val notesModel: MutableLiveData<NotesModel> = MutableLiveData(NotesModel())

  var navArguments: Bundle? = null
}
