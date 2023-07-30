package com.front_end.app.modules.target.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.target.`data`.model.TargetModel
import org.koin.core.KoinComponent

class TargetVM : ViewModel(), KoinComponent {
  val targetModel: MutableLiveData<TargetModel> = MutableLiveData(TargetModel())

  var navArguments: Bundle? = null
}
