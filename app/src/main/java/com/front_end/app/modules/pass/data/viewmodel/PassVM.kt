package com.front_end.app.modules.pass.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.pass.`data`.model.PassModel
import org.koin.core.KoinComponent

class PassVM : ViewModel(), KoinComponent {
  val passModel: MutableLiveData<PassModel> = MutableLiveData(PassModel())

  var navArguments: Bundle? = null
}
