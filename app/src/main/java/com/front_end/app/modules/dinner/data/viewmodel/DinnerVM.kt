package com.front_end.app.modules.dinner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.dinner.`data`.model.DinnerModel
<<<<<<< HEAD
import com.front_end.app.modules.dinner.`data`.model.DinnerRowModel
=======
import com.front_end.app.modules.dinner.`data`.model.Listavocado1RowModel
import com.front_end.app.modules.dinner.`data`.model.ListuntitleddesignTwoRowModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DinnerVM : ViewModel(), KoinComponent {
  val dinnerModel: MutableLiveData<DinnerModel> = MutableLiveData(DinnerModel())

  var navArguments: Bundle? = null

<<<<<<< HEAD
  val dinnerList: MutableLiveData<MutableList<DinnerRowModel>> = MutableLiveData(mutableListOf())
=======
  val listavocadoList: MutableLiveData<MutableList<Listavocado1RowModel>> =
      MutableLiveData(mutableListOf())

  val listuntitleddesignTwoList: MutableLiveData<MutableList<ListuntitleddesignTwoRowModel>> =
      MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
