package com.front_end.app.modules.male.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.male.`data`.model.MaleModel
import org.koin.core.KoinComponent

class MaleVM : ViewModel(), KoinComponent {
  val maleModel: MutableLiveData<MaleModel> = MutableLiveData(MaleModel())

  var navArguments: Bundle? = null
}
