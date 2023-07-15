package com.front_end.app.modules.lunch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
import com.front_end.app.modules.lunch.`data`.model.LunchModel
import com.front_end.app.modules.lunch.`data`.model.LunchRowModel
=======
import com.front_end.app.modules.lunch.`data`.model.ListavocadoRowModel
import com.front_end.app.modules.lunch.`data`.model.ListuntitleddesignOneRowModel
import com.front_end.app.modules.lunch.`data`.model.LunchModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LunchVM : ViewModel(), KoinComponent {
  val lunchModel: MutableLiveData<LunchModel> = MutableLiveData(LunchModel())

  var navArguments: Bundle? = null

<<<<<<< HEAD
  val lunchList: MutableLiveData<MutableList<LunchRowModel>> = MutableLiveData(mutableListOf())
=======
  val listavocadoList: MutableLiveData<MutableList<ListavocadoRowModel>> =
      MutableLiveData(mutableListOf())

  val listuntitleddesignOneList: MutableLiveData<MutableList<ListuntitleddesignOneRowModel>> =
      MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
