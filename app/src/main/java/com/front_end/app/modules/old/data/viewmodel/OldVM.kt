package com.front_end.app.modules.old.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.old.`data`.model.OldModel
import org.koin.core.KoinComponent

class OldVM : ViewModel(), KoinComponent {
  val oldModel: MutableLiveData<OldModel> = MutableLiveData(OldModel())

  var navArguments: Bundle? = null
}
