package com.front_end.app.modules.dinner.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
<<<<<<< HEAD
import com.front_end.app.databinding.ActivityDinnerBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.`data`.model.DinnerRowModel
import com.front_end.app.modules.dinner.`data`.viewmodel.DinnerVM
import com.front_end.app.modules.home.ui.HomeActivity
=======
import com.front_end.app.appcomponents.views.DatePickerFragment
import com.front_end.app.databinding.ActivityDinnerBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.dinner.`data`.model.Listavocado1RowModel
import com.front_end.app.modules.dinner.`data`.model.ListuntitleddesignTwoRowModel
import com.front_end.app.modules.dinner.`data`.viewmodel.DinnerVM
import com.front_end.app.modules.excer.ui.ExcerActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.snacks.ui.SnacksActivity
import com.front_end.app.modules.water.ui.WaterActivity
import java.util.Date
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DinnerActivity : BaseActivity<ActivityDinnerBinding>(R.layout.activity_dinner) {
  private val viewModel: DinnerVM by viewModels<DinnerVM>()

<<<<<<< HEAD
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
=======
  private val REQUEST_CODE_LUNCH_ACTIVITY: Int = 302


  private val REQUEST_CODE_BREAKFAST_ACTIVITY: Int = 290


  private val REQUEST_CODE_WATER_ACTIVITY: Int = 441


  private val REQUEST_CODE_EXCER_ACTIVITY: Int = 105


  private val REQUEST_CODE_SNACKS_ACTIVITY: Int = 909


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listavocadoAdapter =
    ListavocadoAdapter(viewModel.listavocadoList.value?:mutableListOf())
    binding.recyclerListavocado.adapter = listavocadoAdapter
    listavocadoAdapter.setOnItemClickListener(
    object : ListavocadoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listavocado1RowModel) {
        onClickRecyclerListavocado(view, position, item)
      }
    }
    )
    viewModel.listavocadoList.observe(this) {
      listavocadoAdapter.updateData(it)
    }
    val listuntitleddesignTwoAdapter =
    ListuntitleddesignTwoAdapter(viewModel.listuntitleddesignTwoList.value?:mutableListOf())
    binding.recyclerListuntitleddesignTwo.adapter = listuntitleddesignTwoAdapter
    listuntitleddesignTwoAdapter.setOnItemClickListener(
    object : ListuntitleddesignTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListuntitleddesignTwoRowModel) {
        onClickRecyclerListuntitleddesignTwo(view, position, item)
      }
    }
    )
    viewModel.listuntitleddesignTwoList.observe(this) {
      listuntitleddesignTwoAdapter.updateData(it)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
    binding.dinnerVM = viewModel
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
=======
    binding.linearRowuntitleddesign.setOnClickListener {
      val destIntent = LunchActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LUNCH_ACTIVITY)
    }
    binding.linearRowarrowone.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearRowarrowone(selectedDate)
      }
    }
    binding.linearColumngroupfortyone.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_BREAKFAST_ACTIVITY)
    }
    binding.frameStackellipseten.setOnClickListener {
      val destIntent = DietActivity.getIntent(this, null)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
  }

  fun onClickRecyclerDinner(
    view: View,
    position: Int,
    item: DinnerRowModel
=======
    binding.linearRowwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WATER_ACTIVITY)
    }
  }

  fun onClickRecyclerListavocado(
    view: View,
    position: Int,
    item: Listavocado1RowModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  ): Unit {
    when(view.id) {
    }
  }

<<<<<<< HEAD
=======
  fun onClickRecyclerListuntitleddesignTwo(
    view: View,
    position: Int,
    item: ListuntitleddesignTwoRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesignTwo -> {
        onClickRecyclerListuntitleddesignTwoLinearRowuntitleddesignTwo(view, position, item)
      }
    }
  }

  private fun onDateSelectedLinearRowarrowone(selectedDate: Date): Unit {
  }

  fun onClickRecyclerListuntitleddesignTwoLinearRowuntitleddesignTwo(
    view: View,
    position: Int,
    item: ListuntitleddesignTwoRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ExcerActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_EXCER_ACTIVITY)
      }
      1 -> {
        val destIntent = SnacksActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_SNACKS_ACTIVITY)
      }
    }
  }

>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  companion object {
    const val TAG: String = "DINNER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DinnerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
