package com.front_end.app.modules.work.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
import com.front_end.app.modules.work.`data`.model.WorkModel
import com.front_end.app.modules.work.`data`.model.WorkRowModel
=======
import com.front_end.app.modules.work.`data`.model.ListlineoneRowModel
import com.front_end.app.modules.work.`data`.model.ListweekdayRowModel
import com.front_end.app.modules.work.`data`.model.WorkModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WorkVM : ViewModel(), KoinComponent {
  val workModel: MutableLiveData<WorkModel> = MutableLiveData(WorkModel())

  var navArguments: Bundle? = null

<<<<<<< HEAD
  val workList: MutableLiveData<MutableList<WorkRowModel>> = MutableLiveData(mutableListOf())
=======
  val listlineoneList: MutableLiveData<MutableList<ListlineoneRowModel>> =
      MutableLiveData(mutableListOf())

  val listweekdayList: MutableLiveData<MutableList<ListweekdayRowModel>> =
      MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
