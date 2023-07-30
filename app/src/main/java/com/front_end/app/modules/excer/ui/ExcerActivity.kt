package com.front_end.app.modules.excer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityExcerBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.`data`.model.ExcerRowModel
import com.front_end.app.modules.excer.`data`.viewmodel.ExcerVM
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.water.ui.WaterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExcerActivity : BaseActivity<ActivityExcerBinding>(R.layout.activity_excer) {
  private val viewModel: ExcerVM by viewModels<ExcerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val excerAdapter = ExcerAdapter(viewModel.excerList.value?:mutableListOf())
    binding.recyclerExcer.adapter = excerAdapter
    excerAdapter.setOnItemClickListener(
    object : ExcerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExcerRowModel) {
        onClickRecyclerExcer(view, position, item)
      }
    }
    )
    viewModel.excerList.observe(this) {
      excerAdapter.updateData(it)
    }
    binding.excerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumngroupfortyone.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerExcer(
    view: View,
    position: Int,
    item: ExcerRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerExcerLinearRowuntitleddesign(view, position, item)
      }
    }
  }

  fun onClickRecyclerExcerLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: ExcerRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = LunchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "EXCER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExcerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
