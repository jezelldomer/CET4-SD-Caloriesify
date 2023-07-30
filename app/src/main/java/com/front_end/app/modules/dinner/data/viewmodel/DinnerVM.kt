package com.front_end.app.modules.dinner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.dinner.`data`.model.DinnerModel
import com.front_end.app.modules.dinner.`data`.model.DinnerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DinnerVM : ViewModel(), KoinComponent {
  val dinnerModel: MutableLiveData<DinnerModel> = MutableLiveData(DinnerModel())

  var navArguments: Bundle? = null

  val dinnerList: MutableLiveData<MutableList<DinnerRowModel>> = MutableLiveData(mutableListOf())
}
