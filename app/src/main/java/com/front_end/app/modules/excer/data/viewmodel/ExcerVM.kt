package com.front_end.app.modules.excer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.excer.`data`.model.ExcerModel
import com.front_end.app.modules.excer.`data`.model.ListavocadoOneRowModel
import com.front_end.app.modules.excer.`data`.model.Listuntitleddesign2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExcerVM : ViewModel(), KoinComponent {
  val excerModel: MutableLiveData<ExcerModel> = MutableLiveData(ExcerModel())

  var navArguments: Bundle? = null

  val listuntitleddesignList: MutableLiveData<MutableList<Listuntitleddesign2RowModel>> =
      MutableLiveData(mutableListOf())

  val listavocadoOneList: MutableLiveData<MutableList<ListavocadoOneRowModel>> =
      MutableLiveData(mutableListOf())
}
