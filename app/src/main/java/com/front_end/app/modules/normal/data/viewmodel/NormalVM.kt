package com.front_end.app.modules.normal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.normal.`data`.model.NormalModel
import org.koin.core.KoinComponent

class NormalVM : ViewModel(), KoinComponent {
  val normalModel: MutableLiveData<NormalModel> = MutableLiveData(NormalModel())

  var navArguments: Bundle? = null
}
