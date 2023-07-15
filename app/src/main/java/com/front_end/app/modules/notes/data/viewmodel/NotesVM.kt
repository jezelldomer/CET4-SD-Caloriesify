package com.front_end.app.modules.notes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
import com.front_end.app.modules.notes.`data`.model.NotesModel
=======
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneRowModel
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneSixRowModel
import com.front_end.app.modules.notes.`data`.model.NotesModel
import kotlin.collections.MutableList
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import org.koin.core.KoinComponent

class NotesVM : ViewModel(), KoinComponent {
  val notesModel: MutableLiveData<NotesModel> = MutableLiveData(NotesModel())

  var navArguments: Bundle? = null
<<<<<<< HEAD
=======

  val listrectangleoneList: MutableLiveData<MutableList<ListrectangleoneRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangleoneSixList: MutableLiveData<MutableList<ListrectangleoneSixRowModel>> =
      MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
