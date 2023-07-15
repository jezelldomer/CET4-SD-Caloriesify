package com.front_end.app.modules.water.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWaterBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
<<<<<<< HEAD
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.water.`data`.model.WaterRowModel
=======
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.snacks.ui.SnacksActivity
import com.front_end.app.modules.water.`data`.model.Listavocado3RowModel
import com.front_end.app.modules.water.`data`.model.Listuntitleddesign3RowModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import com.front_end.app.modules.water.`data`.viewmodel.WaterVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WaterActivity : BaseActivity<ActivityWaterBinding>(R.layout.activity_water) {
  private val viewModel: WaterVM by viewModels<WaterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
<<<<<<< HEAD
    val waterAdapter = WaterAdapter(viewModel.waterList.value?:mutableListOf())
    binding.recyclerWater.adapter = waterAdapter
    waterAdapter.setOnItemClickListener(
    object : WaterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : WaterRowModel) {
        onClickRecyclerWater(view, position, item)
      }
    }
    )
    viewModel.waterList.observe(this) {
      waterAdapter.updateData(it)
=======
    val listuntitleddesignAdapter =
    ListuntitleddesignAdapter(viewModel.listuntitleddesignList.value?:mutableListOf())
    binding.recyclerListuntitleddesign.adapter = listuntitleddesignAdapter
    listuntitleddesignAdapter.setOnItemClickListener(
    object : ListuntitleddesignAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listuntitleddesign3RowModel) {
        onClickRecyclerListuntitleddesign(view, position, item)
      }
    }
    )
    viewModel.listuntitleddesignList.observe(this) {
      listuntitleddesignAdapter.updateData(it)
    }
    val listavocadoAdapter =
    ListavocadoAdapter(viewModel.listavocadoList.value?:mutableListOf())
    binding.recyclerListavocado.adapter = listavocadoAdapter
    listavocadoAdapter.setOnItemClickListener(
    object : ListavocadoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listavocado3RowModel) {
        onClickRecyclerListavocado(view, position, item)
      }
    }
    )
    viewModel.listavocadoList.observe(this) {
      listavocadoAdapter.updateData(it)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
    binding.waterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackellipseten.setOnClickListener {
<<<<<<< HEAD
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
=======
      val destIntent = DietActivity.getIntent(this, null)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      startActivity(destIntent)
    }
    binding.linearRowuntitleddesignFour.setOnClickListener {
      val destIntent = ExcerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackgroupfortyone.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

<<<<<<< HEAD
  fun onClickRecyclerWater(
    view: View,
    position: Int,
    item: WaterRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
=======
  fun onClickRecyclerListuntitleddesign(
    view: View,
    position: Int,
    item: Listuntitleddesign3RowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerListuntitleddesignLinearRowuntitleddesign(view, position, item)
      }
    }
  }

  fun onClickRecyclerListavocado(
    view: View,
    position: Int,
    item: Listavocado3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListuntitleddesignLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: Listuntitleddesign3RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = SnacksActivity.getIntent(this, null)
        startActivity(destIntent)
      }
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
  }

  companion object {
    const val TAG: String = "WATER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WaterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
