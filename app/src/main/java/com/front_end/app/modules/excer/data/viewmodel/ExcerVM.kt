package com.front_end.app.modules.excer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.excer.`data`.model.ExcerModel
import com.front_end.app.modules.excer.`data`.model.ExcerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExcerVM : ViewModel(), KoinComponent {
  val excerModel: MutableLiveData<ExcerModel> = MutableLiveData(ExcerModel())

  var navArguments: Bundle? = null

  val excerList: MutableLiveData<MutableList<ExcerRowModel>> = MutableLiveData(mutableListOf())
}
