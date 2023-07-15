package com.front_end.app.modules.snacks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.appcomponents.views.DatePickerFragment
import com.front_end.app.databinding.ActivitySnacksBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.snacks.`data`.model.Listavocado2RowModel
import com.front_end.app.modules.snacks.`data`.model.Listuntitleddesign1RowModel
import com.front_end.app.modules.snacks.`data`.viewmodel.SnacksVM
import com.front_end.app.modules.water.ui.WaterActivity
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SnacksActivity : BaseActivity<ActivitySnacksBinding>(R.layout.activity_snacks) {
  private val viewModel: SnacksVM by viewModels<SnacksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuntitleddesignAdapter =
    ListuntitleddesignAdapter(viewModel.listuntitleddesignList.value?:mutableListOf())
    binding.recyclerListuntitleddesign.adapter = listuntitleddesignAdapter
    listuntitleddesignAdapter.setOnItemClickListener(
    object : ListuntitleddesignAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listuntitleddesign1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listavocado2RowModel) {
        onClickRecyclerListavocado(view, position, item)
      }
    }
    )
    viewModel.listavocadoList.observe(this) {
      listavocadoAdapter.updateData(it)
    }
    binding.snacksVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowone.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowarrowone(selectedDate)
      }
    }
    binding.linearRowuntitleddesignThree.setOnClickListener {
      val destIntent = ExcerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = DietActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumngroupfortyone.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListuntitleddesign(
    view: View,
    position: Int,
    item: Listuntitleddesign1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign ->  {
        onClickRecyclerListuntitleddesignLinearRowuntitleddesign(view, position, item)
      }
    }
  }

  fun onClickRecyclerListavocado(
    view: View,
    position: Int,
    item: Listavocado2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onDateSelectedLinearRowarrowone(selectedDate: Date) {
  }

  fun onClickRecyclerListuntitleddesignLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: Listuntitleddesign1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = LunchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SNACKS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SnacksActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
