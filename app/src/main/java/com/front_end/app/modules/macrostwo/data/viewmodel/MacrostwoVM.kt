package com.front_end.app.modules.macrostwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.macrostwo.`data`.model.MacrostwoModel
import org.koin.core.KoinComponent

class MacrostwoVM : ViewModel(), KoinComponent {
  val macrostwoModel: MutableLiveData<MacrostwoModel> = MutableLiveData(MacrostwoModel())

  var navArguments: Bundle? = null
}
