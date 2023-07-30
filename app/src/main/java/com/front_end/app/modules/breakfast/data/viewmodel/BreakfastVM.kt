package com.front_end.app.modules.breakfast.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.breakfast.`data`.model.BreakfastModel
import com.front_end.app.modules.breakfast.`data`.model.ListeggRowModel
import com.front_end.app.modules.breakfast.`data`.model.ListuntitleddesignRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BreakfastVM : ViewModel(), KoinComponent {
  val breakfastModel: MutableLiveData<BreakfastModel> = MutableLiveData(BreakfastModel())

  var navArguments: Bundle? = null

  val listeggList: MutableLiveData<MutableList<ListeggRowModel>> = MutableLiveData(mutableListOf())

  val listuntitleddesignList: MutableLiveData<MutableList<ListuntitleddesignRowModel>> =
      MutableLiveData(mutableListOf())
}
