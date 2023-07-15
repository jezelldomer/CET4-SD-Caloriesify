package com.front_end.app.modules.lunch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.lunch.`data`.model.LunchModel
import com.front_end.app.modules.lunch.`data`.model.LunchRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LunchVM : ViewModel(), KoinComponent {
  val lunchModel: MutableLiveData<LunchModel> = MutableLiveData(LunchModel())

  var navArguments: Bundle? = null

  val lunchList: MutableLiveData<MutableList<LunchRowModel>> = MutableLiveData(mutableListOf())
}
