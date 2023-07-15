package com.front_end.app.modules.lunch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityLunchBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.`data`.model.LunchRowModel
import com.front_end.app.modules.lunch.`data`.viewmodel.LunchVM
import com.front_end.app.modules.water.ui.WaterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LunchActivity : BaseActivity<ActivityLunchBinding>(R.layout.activity_lunch) {
  private val viewModel: LunchVM by viewModels<LunchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val lunchAdapter = LunchAdapter(viewModel.lunchList.value?:mutableListOf())
    binding.recyclerLunch.adapter = lunchAdapter
    lunchAdapter.setOnItemClickListener(
    object : LunchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LunchRowModel) {
        onClickRecyclerLunch(view, position, item)
      }
    }
    )
    viewModel.lunchList.observe(this) {
      lunchAdapter.updateData(it)
    }
    binding.lunchVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
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
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerLunch(
    view: View,
    position: Int,
    item: LunchRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesignOne ->  {
        onClickRecyclerLunchLinearRowuntitleddesignOne(view, position, item)
      }
    }
  }

  fun onClickRecyclerLunchLinearRowuntitleddesignOne(
    view: View,
    position: Int,
    item: LunchRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = ExcerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "LUNCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LunchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
