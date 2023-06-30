package com.front_end.app.modules.diet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.diet.`data`.model.DietModel
import com.front_end.app.modules.diet.`data`.model.DietRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DietVM : ViewModel(), KoinComponent {
  val dietModel: MutableLiveData<DietModel> = MutableLiveData(DietModel())

  var navArguments: Bundle? = null

  val dietList: MutableLiveData<MutableList<DietRowModel>> = MutableLiveData(mutableListOf())
}
