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
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.water.`data`.model.WaterRowModel
import com.front_end.app.modules.water.`data`.viewmodel.WaterVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WaterActivity : BaseActivity<ActivityWaterBinding>(R.layout.activity_water) {
  private val viewModel: WaterVM by viewModels<WaterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
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
    }
    binding.waterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
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
