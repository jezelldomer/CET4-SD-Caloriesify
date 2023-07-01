package com.front_end.app.modules.sched.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.sched.`data`.model.SchedModel
import org.koin.core.KoinComponent

class SchedVM : ViewModel(), KoinComponent {
  val schedModel: MutableLiveData<SchedModel> = MutableLiveData(SchedModel())

  var navArguments: Bundle? = null
}
