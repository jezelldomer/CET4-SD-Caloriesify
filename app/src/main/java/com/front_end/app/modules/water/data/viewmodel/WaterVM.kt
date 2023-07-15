package com.front_end.app.modules.water.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
import com.front_end.app.modules.water.`data`.model.WaterModel
import com.front_end.app.modules.water.`data`.model.WaterRowModel
=======
import com.front_end.app.modules.water.`data`.model.Listavocado3RowModel
import com.front_end.app.modules.water.`data`.model.Listuntitleddesign3RowModel
import com.front_end.app.modules.water.`data`.model.WaterModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WaterVM : ViewModel(), KoinComponent {
  val waterModel: MutableLiveData<WaterModel> = MutableLiveData(WaterModel())

  var navArguments: Bundle? = null

<<<<<<< HEAD
  val waterList: MutableLiveData<MutableList<WaterRowModel>> = MutableLiveData(mutableListOf())
=======
  val listuntitleddesignList: MutableLiveData<MutableList<Listuntitleddesign3RowModel>> =
      MutableLiveData(mutableListOf())

  val listavocadoList: MutableLiveData<MutableList<Listavocado3RowModel>> =
      MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
