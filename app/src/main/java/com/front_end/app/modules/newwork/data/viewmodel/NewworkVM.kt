package com.front_end.app.modules.newwork.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.newwork.`data`.model.NewworkModel
import org.koin.core.KoinComponent

class NewworkVM : ViewModel(), KoinComponent {
  val newworkModel: MutableLiveData<NewworkModel> = MutableLiveData(NewworkModel())

  var navArguments: Bundle? = null
}
