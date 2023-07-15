package com.front_end.app.modules.lunch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
<<<<<<< HEAD
import com.front_end.app.databinding.ActivityLunchBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.`data`.model.LunchRowModel
import com.front_end.app.modules.lunch.`data`.viewmodel.LunchVM
import com.front_end.app.modules.water.ui.WaterActivity
=======
import com.front_end.app.appcomponents.views.DatePickerFragment
import com.front_end.app.databinding.ActivityLunchBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.`data`.model.ListavocadoRowModel
import com.front_end.app.modules.lunch.`data`.model.ListuntitleddesignOneRowModel
import com.front_end.app.modules.lunch.`data`.viewmodel.LunchVM
import com.front_end.app.modules.snacks.ui.SnacksActivity
import com.front_end.app.modules.water.ui.WaterActivity
import java.util.Date
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LunchActivity : BaseActivity<ActivityLunchBinding>(R.layout.activity_lunch) {
  private val viewModel: LunchVM by viewModels<LunchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
<<<<<<< HEAD
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
=======
    val listavocadoAdapter =
    ListavocadoAdapter(viewModel.listavocadoList.value?:mutableListOf())
    binding.recyclerListavocado.adapter = listavocadoAdapter
    listavocadoAdapter.setOnItemClickListener(
    object : ListavocadoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListavocadoRowModel) {
        onClickRecyclerListavocado(view, position, item)
      }
    }
    )
    viewModel.listavocadoList.observe(this) {
      listavocadoAdapter.updateData(it)
    }
    val listuntitleddesignOneAdapter =
    ListuntitleddesignOneAdapter(viewModel.listuntitleddesignOneList.value?:mutableListOf())
    binding.recyclerListuntitleddesignOne.adapter = listuntitleddesignOneAdapter
    listuntitleddesignOneAdapter.setOnItemClickListener(
    object : ListuntitleddesignOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListuntitleddesignOneRowModel) {
        onClickRecyclerListuntitleddesignOne(view, position, item)
      }
    }
    )
    viewModel.listuntitleddesignOneList.observe(this) {
      listuntitleddesignOneAdapter.updateData(it)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
    binding.lunchVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
=======
    binding.linearRowarrowone.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearRowarrowone(selectedDate)
      }
    }
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    binding.txtGroupFortyOne.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
=======
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = DietActivity.getIntent(this, null)
      startActivity(destIntent)
    }
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
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
=======
  }

  fun onClickRecyclerListavocado(
    view: View,
    position: Int,
    item: ListavocadoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListuntitleddesignOne(
    view: View,
    position: Int,
    item: ListuntitleddesignOneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesignOne -> {
        onClickRecyclerListuntitleddesignOneLinearRowuntitleddesignOne(view, position, item)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      }
    }
  }

<<<<<<< HEAD
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
=======
  private fun onDateSelectedLinearRowarrowone(selectedDate: Date): Unit {
  }

  fun onClickRecyclerListuntitleddesignOneLinearRowuntitleddesignOne(
    view: View,
    position: Int,
    item: ListuntitleddesignOneRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = SnacksActivity.getIntent(this, null)
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
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
