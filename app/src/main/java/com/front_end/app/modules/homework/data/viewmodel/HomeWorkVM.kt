package com.front_end.app.modules.homework.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.homework.`data`.model.HomeWorkModel
import com.front_end.app.modules.homework.`data`.model.HomeWorkRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeWorkVM : ViewModel(), KoinComponent {
  val homeWorkModel: MutableLiveData<HomeWorkModel> = MutableLiveData(HomeWorkModel())

  var navArguments: Bundle? = null

  val homeworkList: MutableLiveData<MutableList<HomeWorkRowModel>> =
      MutableLiveData(mutableListOf())
}
