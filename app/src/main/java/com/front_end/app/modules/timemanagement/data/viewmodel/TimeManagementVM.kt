package com.front_end.app.modules.timemanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.timemanagement.`data`.model.TimeManagementModel
import org.koin.core.KoinComponent

class TimeManagementVM : ViewModel(), KoinComponent {
  val timeManagementModel: MutableLiveData<TimeManagementModel> =
      MutableLiveData(TimeManagementModel())

  var navArguments: Bundle? = null
}
