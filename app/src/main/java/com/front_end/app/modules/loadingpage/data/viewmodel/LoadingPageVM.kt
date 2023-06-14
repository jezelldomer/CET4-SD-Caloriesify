package com.front_end.app.modules.loadingpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.loadingpage.`data`.model.LoadingPageModel
import org.koin.core.KoinComponent

class LoadingPageVM : ViewModel(), KoinComponent {
  val loadingPageModel: MutableLiveData<LoadingPageModel> = MutableLiveData(LoadingPageModel())

  var navArguments: Bundle? = null
}
