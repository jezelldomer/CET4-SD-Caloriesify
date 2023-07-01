package com.front_end.app.modules.breakfast.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityBreakfastBinding
import com.front_end.app.modules.breakfast.`data`.model.ListeggRowModel
import com.front_end.app.modules.breakfast.`data`.model.ListuntitleddesignRowModel
import com.front_end.app.modules.breakfast.`data`.viewmodel.BreakfastVM
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.water.ui.WaterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BreakfastActivity : BaseActivity<ActivityBreakfastBinding>(R.layout.activity_breakfast) {
  private val viewModel: BreakfastVM by viewModels<BreakfastVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listeggAdapter = ListeggAdapter(viewModel.listeggList.value?:mutableListOf())
    binding.recyclerListegg.adapter = listeggAdapter
    listeggAdapter.setOnItemClickListener(
    object : ListeggAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListeggRowModel) {
        onClickRecyclerListegg(view, position, item)
      }
    }
    )
    viewModel.listeggList.observe(this) {
      listeggAdapter.updateData(it)
    }
    val listuntitleddesignAdapter =
    ListuntitleddesignAdapter(viewModel.listuntitleddesignList.value?:mutableListOf())
    binding.recyclerListuntitleddesign.adapter = listuntitleddesignAdapter
    listuntitleddesignAdapter.setOnItemClickListener(
    object : ListuntitleddesignAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuntitleddesignRowModel) {
        onClickRecyclerListuntitleddesign(view, position, item)
      }
    }
    )
    viewModel.listuntitleddesignList.observe(this) {
      listuntitleddesignAdapter.updateData(it)
    }
    binding.breakfastVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
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

  fun onClickRecyclerListegg(
    view: View,
    position: Int,
    item: ListeggRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListuntitleddesign(
    view: View,
    position: Int,
    item: ListuntitleddesignRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerListuntitleddesignLinearRowuntitleddesign(view, position, item)
      }
    }
  }

  fun onClickRecyclerListuntitleddesignLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: ListuntitleddesignRowModel
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
    const val TAG: String = "BREAKFAST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BreakfastActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
