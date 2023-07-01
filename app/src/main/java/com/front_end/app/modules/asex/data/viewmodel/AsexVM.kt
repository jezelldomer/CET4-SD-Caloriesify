package com.front_end.app.modules.asex.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.asex.`data`.model.AsexModel
import org.koin.core.KoinComponent

class AsexVM : ViewModel(), KoinComponent {
  val asexModel: MutableLiveData<AsexModel> = MutableLiveData(AsexModel())

  var navArguments: Bundle? = null
}
