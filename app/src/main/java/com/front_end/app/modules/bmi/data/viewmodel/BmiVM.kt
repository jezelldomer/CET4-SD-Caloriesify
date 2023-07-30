package com.front_end.app.modules.bmi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.bmi.`data`.model.BmiModel
import com.front_end.app.modules.bmi.`data`.model.BmiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BmiVM : ViewModel(), KoinComponent {
  val bmiModel: MutableLiveData<BmiModel> = MutableLiveData(BmiModel())

  var navArguments: Bundle? = null

  val bmiList: MutableLiveData<MutableList<BmiRowModel>> = MutableLiveData(mutableListOf())
}
