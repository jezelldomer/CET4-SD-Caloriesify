package com.front_end.app.modules.homediet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.homediet.`data`.model.HomeDietModel
import org.koin.core.KoinComponent

class HomeDietVM : ViewModel(), KoinComponent {
  val homeDietModel: MutableLiveData<HomeDietModel> = MutableLiveData(HomeDietModel())

  var navArguments: Bundle? = null
}
