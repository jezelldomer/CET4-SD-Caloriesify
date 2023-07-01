package com.front_end.app.modules.dinner.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityDinnerBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.`data`.model.DinnerRowModel
import com.front_end.app.modules.dinner.`data`.viewmodel.DinnerVM
import com.front_end.app.modules.home.ui.HomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DinnerActivity : BaseActivity<ActivityDinnerBinding>(R.layout.activity_dinner) {
  private val viewModel: DinnerVM by viewModels<DinnerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dinnerAdapter = DinnerAdapter(viewModel.dinnerList.value?:mutableListOf())
    binding.recyclerDinner.adapter = dinnerAdapter
    dinnerAdapter.setOnItemClickListener(
    object : DinnerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DinnerRowModel) {
        onClickRecyclerDinner(view, position, item)
      }
    }
    )
    viewModel.dinnerList.observe(this) {
      dinnerAdapter.updateData(it)
    }
    binding.dinnerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDinner(
    view: View,
    position: Int,
    item: DinnerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DINNER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DinnerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
