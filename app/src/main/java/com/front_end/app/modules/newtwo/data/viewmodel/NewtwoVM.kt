package com.front_end.app.modules.newtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.newtwo.`data`.model.NewtwoModel
import org.koin.core.KoinComponent

class NewtwoVM : ViewModel(), KoinComponent {
  val newtwoModel: MutableLiveData<NewtwoModel> = MutableLiveData(NewtwoModel())

  var navArguments: Bundle? = null
}
