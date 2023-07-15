package com.front_end.app.modules.neww.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.neww.`data`.model.NewModel
import org.koin.core.KoinComponent

class NewVM : ViewModel(), KoinComponent {
  val newModel: MutableLiveData<NewModel> = MutableLiveData(NewModel())

  var navArguments: Bundle? = null
}
