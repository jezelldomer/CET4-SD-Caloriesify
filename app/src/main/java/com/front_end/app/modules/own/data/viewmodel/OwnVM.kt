package com.front_end.app.modules.own.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.own.`data`.model.OwnModel
import org.koin.core.KoinComponent

class OwnVM : ViewModel(), KoinComponent {
  val ownModel: MutableLiveData<OwnModel> = MutableLiveData(OwnModel())

  var navArguments: Bundle? = null
}
