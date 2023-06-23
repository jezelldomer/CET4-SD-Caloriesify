package com.front_end.app.modules.signupu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.signupu.`data`.model.SignUpuModel
import org.koin.core.KoinComponent

class SignUpuVM : ViewModel(), KoinComponent {
  val signUpuModel: MutableLiveData<SignUpuModel> = MutableLiveData(SignUpuModel())

  var navArguments: Bundle? = null
}
