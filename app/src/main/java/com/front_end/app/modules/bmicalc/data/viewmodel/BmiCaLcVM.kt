package com.front_end.app.modules.bmicalc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.bmicalc.`data`.model.BmiCaLcModel
import org.koin.core.KoinComponent

class BmiCaLcVM : ViewModel(), KoinComponent {
  val bmiCaLcModel: MutableLiveData<BmiCaLcModel> = MutableLiveData(BmiCaLcModel())

  var navArguments: Bundle? = null
}
