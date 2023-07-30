package com.front_end.app.modules.wasted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.wasted.`data`.model.WastedModel
import org.koin.core.KoinComponent

class WastedVM : ViewModel(), KoinComponent {
  val wastedModel: MutableLiveData<WastedModel> = MutableLiveData(WastedModel())

  var navArguments: Bundle? = null
}
