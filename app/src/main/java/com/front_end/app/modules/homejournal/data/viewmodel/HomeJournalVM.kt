package com.front_end.app.modules.homejournal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.homejournal.`data`.model.HomeJournalModel
import org.koin.core.KoinComponent

class HomeJournalVM : ViewModel(), KoinComponent {
  val homeJournalModel: MutableLiveData<HomeJournalModel> = MutableLiveData(HomeJournalModel())

  var navArguments: Bundle? = null
}
