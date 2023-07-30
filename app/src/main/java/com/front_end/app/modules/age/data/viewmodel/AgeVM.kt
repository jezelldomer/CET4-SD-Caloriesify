package com.front_end.app.modules.age.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.age.`data`.model.AgeModel
import org.koin.core.KoinComponent

class AgeVM : ViewModel(), KoinComponent {
  val ageModel: MutableLiveData<AgeModel> = MutableLiveData(AgeModel())

  var navArguments: Bundle? = null
}
