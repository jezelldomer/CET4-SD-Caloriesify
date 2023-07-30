package com.front_end.app.modules.under.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.under.`data`.model.UnderModel
import org.koin.core.KoinComponent

class UnderVM : ViewModel(), KoinComponent {
  val underModel: MutableLiveData<UnderModel> = MutableLiveData(UnderModel())

  var navArguments: Bundle? = null
}
