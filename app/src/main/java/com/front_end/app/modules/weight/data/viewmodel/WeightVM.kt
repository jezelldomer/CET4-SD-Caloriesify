package com.front_end.app.modules.weight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.weight.`data`.model.WeightModel
import org.koin.core.KoinComponent

class WeightVM : ViewModel(), KoinComponent {
  val weightModel: MutableLiveData<WeightModel> = MutableLiveData(WeightModel())

  var navArguments: Bundle? = null
}
