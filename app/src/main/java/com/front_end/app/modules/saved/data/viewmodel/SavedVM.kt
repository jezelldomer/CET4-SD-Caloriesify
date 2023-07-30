package com.front_end.app.modules.saved.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.saved.`data`.model.SavedModel
import org.koin.core.KoinComponent

class SavedVM : ViewModel(), KoinComponent {
  val savedModel: MutableLiveData<SavedModel> = MutableLiveData(SavedModel())

  var navArguments: Bundle? = null
}
