package com.front_end.app.modules.work.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.work.`data`.model.WorkModel
import com.front_end.app.modules.work.`data`.model.WorkRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WorkVM : ViewModel(), KoinComponent {
  val workModel: MutableLiveData<WorkModel> = MutableLiveData(WorkModel())

  var navArguments: Bundle? = null

  val workList: MutableLiveData<MutableList<WorkRowModel>> = MutableLiveData(mutableListOf())
}
