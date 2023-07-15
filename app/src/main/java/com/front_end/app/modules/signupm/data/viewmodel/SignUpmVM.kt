package com.front_end.app.modules.signupm.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.signupm.`data`.model.SignUpmModel
import org.koin.core.KoinComponent

class SignUpmVM : ViewModel(), KoinComponent {
  val signUpmModel: MutableLiveData<SignUpmModel> = MutableLiveData(SignUpmModel())

  var navArguments: Bundle? = null
}
