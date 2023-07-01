package com.front_end.app.modules.carbs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.carbs.`data`.model.CarbsModel
import com.front_end.app.modules.carbs.`data`.model.CarbsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarbsVM : ViewModel(), KoinComponent {
  val carbsModel: MutableLiveData<CarbsModel> = MutableLiveData(CarbsModel())

  var navArguments: Bundle? = null

  val carbsList: MutableLiveData<MutableList<CarbsRowModel>> = MutableLiveData(mutableListOf())
}
