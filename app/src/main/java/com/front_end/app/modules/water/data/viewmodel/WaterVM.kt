package com.front_end.app.modules.water.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.water.`data`.model.WaterModel
import com.front_end.app.modules.water.`data`.model.WaterRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WaterVM : ViewModel(), KoinComponent {
  val waterModel: MutableLiveData<WaterModel> = MutableLiveData(WaterModel())

  var navArguments: Bundle? = null

  val waterList: MutableLiveData<MutableList<WaterRowModel>> = MutableLiveData(mutableListOf())
}
