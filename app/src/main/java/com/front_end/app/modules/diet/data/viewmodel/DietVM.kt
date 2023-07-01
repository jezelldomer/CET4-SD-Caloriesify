package com.front_end.app.modules.diet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.diet.`data`.model.DietModel
import org.koin.core.KoinComponent

class DietVM : ViewModel(), KoinComponent {
  val dietModel: MutableLiveData<DietModel> = MutableLiveData(DietModel())

  var navArguments: Bundle? = null
}
