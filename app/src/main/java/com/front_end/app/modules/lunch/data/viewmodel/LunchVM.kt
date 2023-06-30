package com.front_end.app.modules.lunch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.lunch.`data`.model.ListavocadoRowModel
import com.front_end.app.modules.lunch.`data`.model.ListuntitleddesignOneRowModel
import com.front_end.app.modules.lunch.`data`.model.LunchModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LunchVM : ViewModel(), KoinComponent {
  val lunchModel: MutableLiveData<LunchModel> = MutableLiveData(LunchModel())

  var navArguments: Bundle? = null

  val listavocadoList: MutableLiveData<MutableList<ListavocadoRowModel>> =
      MutableLiveData(mutableListOf())

  val listuntitleddesignOneList: MutableLiveData<MutableList<ListuntitleddesignOneRowModel>> =
      MutableLiveData(mutableListOf())
}
