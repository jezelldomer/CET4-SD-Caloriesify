package com.front_end.app.modules.homebmi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.homebmi.`data`.model.HomeBmiModel
import com.front_end.app.modules.homebmi.`data`.model.HomeBmiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeBmiVM : ViewModel(), KoinComponent {
  val homeBmiModel: MutableLiveData<HomeBmiModel> = MutableLiveData(HomeBmiModel())

  var navArguments: Bundle? = null

  val homebmiList: MutableLiveData<MutableList<HomeBmiRowModel>> = MutableLiveData(mutableListOf())
}
