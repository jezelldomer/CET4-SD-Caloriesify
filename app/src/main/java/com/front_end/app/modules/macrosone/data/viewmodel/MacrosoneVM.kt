package com.front_end.app.modules.macrosone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.macrosone.`data`.model.MacrosoneModel
import org.koin.core.KoinComponent

class MacrosoneVM : ViewModel(), KoinComponent {
  val macrosoneModel: MutableLiveData<MacrosoneModel> = MutableLiveData(MacrosoneModel())

  var navArguments: Bundle? = null
}
