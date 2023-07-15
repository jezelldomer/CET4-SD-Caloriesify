package com.front_end.app.modules.homemacros.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.homemacros.`data`.model.HomeMacrosModel
import com.front_end.app.modules.homemacros.`data`.model.HomeMacrosRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeMacrosVM : ViewModel(), KoinComponent {
  val homeMacrosModel: MutableLiveData<HomeMacrosModel> = MutableLiveData(HomeMacrosModel())

  var navArguments: Bundle? = null

  val homemacrosList: MutableLiveData<MutableList<HomeMacrosRowModel>> =
      MutableLiveData(mutableListOf())
}
