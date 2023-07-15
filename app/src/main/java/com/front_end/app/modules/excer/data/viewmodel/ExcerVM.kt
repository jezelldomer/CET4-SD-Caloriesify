package com.front_end.app.modules.excer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.front_end.app.modules.excer.`data`.model.ExcerModel
<<<<<<< HEAD
import com.front_end.app.modules.excer.`data`.model.ExcerRowModel
=======
import com.front_end.app.modules.excer.`data`.model.ListavocadoOneRowModel
import com.front_end.app.modules.excer.`data`.model.Listuntitleddesign2RowModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExcerVM : ViewModel(), KoinComponent {
  val excerModel: MutableLiveData<ExcerModel> = MutableLiveData(ExcerModel())

  var navArguments: Bundle? = null

<<<<<<< HEAD
  val excerList: MutableLiveData<MutableList<ExcerRowModel>> = MutableLiveData(mutableListOf())
=======
  val listuntitleddesignList: MutableLiveData<MutableList<Listuntitleddesign2RowModel>> =
      MutableLiveData(mutableListOf())

  val listavocadoOneList: MutableLiveData<MutableList<ListavocadoOneRowModel>> =
      MutableLiveData(mutableListOf())
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
}
