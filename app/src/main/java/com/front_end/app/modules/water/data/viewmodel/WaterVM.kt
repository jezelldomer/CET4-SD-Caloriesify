package com.front_end.app.modules.water.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.water.`data`.model.Listavocado3RowModel
import com.front_end.app.modules.water.`data`.model.Listuntitleddesign3RowModel
import com.front_end.app.modules.water.`data`.model.WaterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WaterVM : ViewModel(), KoinComponent {
  val waterModel: MutableLiveData<WaterModel> = MutableLiveData(WaterModel())

  var navArguments: Bundle? = null

  val listuntitleddesignList: MutableLiveData<MutableList<Listuntitleddesign3RowModel>> =
      MutableLiveData(mutableListOf())

  val listavocadoList: MutableLiveData<MutableList<Listavocado3RowModel>> =
      MutableLiveData(mutableListOf())
}
