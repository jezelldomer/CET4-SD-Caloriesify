package com.front_end.app.modules.carbs.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityCarbsBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.`data`.model.CarbsRowModel
import com.front_end.app.modules.carbs.`data`.viewmodel.CarbsVM
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.water.ui.WaterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarbsActivity : BaseActivity<ActivityCarbsBinding>(R.layout.activity_carbs) {
  private val viewModel: CarbsVM by viewModels<CarbsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carbsAdapter = CarbsAdapter(viewModel.carbsList.value?:mutableListOf())
    binding.recyclerCarbs.adapter = carbsAdapter
    carbsAdapter.setOnItemClickListener(
    object : CarbsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarbsRowModel) {
        onClickRecyclerCarbs(view, position, item)
      }
    }
    )
    viewModel.carbsList.observe(this) {
      carbsAdapter.updateData(it)
    }
    binding.carbsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCarbs(
    view: View,
    position: Int,
    item: CarbsRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerCarbsLinearRowuntitleddesign(view, position, item)
      }
    }
  }

  fun onClickRecyclerCarbsLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: CarbsRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = LunchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = ExcerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CARBS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarbsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
