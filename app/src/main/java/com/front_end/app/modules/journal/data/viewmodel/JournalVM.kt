package com.front_end.app.modules.journal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.journal.`data`.model.JournalModel
import org.koin.core.KoinComponent

class JournalVM : ViewModel(), KoinComponent {
  val journalModel: MutableLiveData<JournalModel> = MutableLiveData(JournalModel())

  var navArguments: Bundle? = null
}
