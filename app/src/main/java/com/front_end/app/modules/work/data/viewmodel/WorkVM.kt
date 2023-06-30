package com.front_end.app.modules.work.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.work.`data`.model.ListlineoneRowModel
import com.front_end.app.modules.work.`data`.model.ListweekdayRowModel
import com.front_end.app.modules.work.`data`.model.WorkModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WorkVM : ViewModel(), KoinComponent {
  val workModel: MutableLiveData<WorkModel> = MutableLiveData(WorkModel())

  var navArguments: Bundle? = null

  val listlineoneList: MutableLiveData<MutableList<ListlineoneRowModel>> =
      MutableLiveData(mutableListOf())

  val listweekdayList: MutableLiveData<MutableList<ListweekdayRowModel>> =
      MutableLiveData(mutableListOf())
}
