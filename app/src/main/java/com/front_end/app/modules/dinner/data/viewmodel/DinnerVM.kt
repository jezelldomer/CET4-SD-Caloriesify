package com.front_end.app.modules.dinner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.dinner.`data`.model.DinnerModel
import com.front_end.app.modules.dinner.`data`.model.Listavocado1RowModel
import com.front_end.app.modules.dinner.`data`.model.ListuntitleddesignTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DinnerVM : ViewModel(), KoinComponent {
  val dinnerModel: MutableLiveData<DinnerModel> = MutableLiveData(DinnerModel())

  var navArguments: Bundle? = null

  val listavocadoList: MutableLiveData<MutableList<Listavocado1RowModel>> =
      MutableLiveData(mutableListOf())

  val listuntitleddesignTwoList: MutableLiveData<MutableList<ListuntitleddesignTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
