package com.front_end.app.modules.neww.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.neww.`data`.model.NewwModel
import org.koin.core.KoinComponent

class NewwVM : ViewModel(), KoinComponent {
  val newModel: MutableLiveData<NewwModel> = MutableLiveData(NewwModel())

  var navArguments: Bundle? = null
}
