package com.front_end.app.modules.snacks.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.snacks.`data`.model.Listavocado2RowModel
import com.front_end.app.modules.snacks.`data`.model.Listuntitleddesign1RowModel
import com.front_end.app.modules.snacks.`data`.model.SnacksModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SnacksVM : ViewModel(), KoinComponent {
  val snacksModel: MutableLiveData<SnacksModel> = MutableLiveData(SnacksModel())

  var navArguments: Bundle? = null

  val listuntitleddesignList: MutableLiveData<MutableList<Listuntitleddesign1RowModel>> =
      MutableLiveData(mutableListOf())

  val listavocadoList: MutableLiveData<MutableList<Listavocado2RowModel>> =
      MutableLiveData(mutableListOf())
}
