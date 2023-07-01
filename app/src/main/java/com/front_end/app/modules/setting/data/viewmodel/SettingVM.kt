package com.front_end.app.modules.setting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.setting.`data`.model.SettingModel
import com.front_end.app.modules.setting.`data`.model.SettingRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingVM : ViewModel(), KoinComponent {
  val settingModel: MutableLiveData<SettingModel> = MutableLiveData(SettingModel())

  var navArguments: Bundle? = null

  val settingList: MutableLiveData<MutableList<SettingRowModel>> = MutableLiveData(mutableListOf())
}
