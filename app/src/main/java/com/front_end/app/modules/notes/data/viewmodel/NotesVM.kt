package com.front_end.app.modules.notes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneRowModel
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneSixRowModel
import com.front_end.app.modules.notes.`data`.model.NotesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotesVM : ViewModel(), KoinComponent {
  val notesModel: MutableLiveData<NotesModel> = MutableLiveData(NotesModel())

  var navArguments: Bundle? = null

  val listrectangleoneList: MutableLiveData<MutableList<ListrectangleoneRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangleoneSixList: MutableLiveData<MutableList<ListrectangleoneSixRowModel>> =
      MutableLiveData(mutableListOf())
}
