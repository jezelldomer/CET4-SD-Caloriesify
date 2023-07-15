package com.front_end.app.modules.diet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.diet.`data`.model.DietModel
<<<<<<< HEAD
=======
import com.front_end.app.modules.diet.`data`.model.DietRowModel
import kotlin.collections.MutableList
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import org.koin.core.KoinComponent

class DietVM : ViewModel(), KoinComponent {
  val dietModel: MutableLiveData<DietModel> = MutableLiveData(DietModel())

  var navArguments: Bundle? = null
<<<<<<< HEAD
=======

  val dietList: MutableLiveData<MutableList<DietRowModel>> = MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
