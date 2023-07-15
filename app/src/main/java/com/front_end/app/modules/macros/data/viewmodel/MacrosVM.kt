package com.front_end.app.modules.macros.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.macros.`data`.model.MacrosModel
import com.front_end.app.modules.macros.`data`.model.MacrosRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MacrosVM : ViewModel(), KoinComponent {
  val macrosModel: MutableLiveData<MacrosModel> = MutableLiveData(MacrosModel())

  var navArguments: Bundle? = null

  val macrosList: MutableLiveData<MutableList<MacrosRowModel>> = MutableLiveData(mutableListOf())
}
