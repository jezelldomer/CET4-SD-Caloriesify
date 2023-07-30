package com.front_end.app.modules.obese.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.obese.`data`.model.ObeseModel
import org.koin.core.KoinComponent

class ObeseVM : ViewModel(), KoinComponent {
  val obeseModel: MutableLiveData<ObeseModel> = MutableLiveData(ObeseModel())

  var navArguments: Bundle? = null
}
