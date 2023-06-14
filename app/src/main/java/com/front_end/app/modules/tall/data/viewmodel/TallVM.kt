package com.front_end.app.modules.tall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.tall.`data`.model.TallModel
import org.koin.core.KoinComponent

class TallVM : ViewModel(), KoinComponent {
  val tallModel: MutableLiveData<TallModel> = MutableLiveData(TallModel())

  var navArguments: Bundle? = null
}
