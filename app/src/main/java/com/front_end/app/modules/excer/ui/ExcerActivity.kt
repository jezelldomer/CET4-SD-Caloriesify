package com.front_end.app.modules.excer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
<<<<<<< HEAD
import com.front_end.app.databinding.ActivityExcerBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.`data`.model.ExcerRowModel
import com.front_end.app.modules.excer.`data`.viewmodel.ExcerVM
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.water.ui.WaterActivity
=======
import com.front_end.app.appcomponents.views.DatePickerFragment
import com.front_end.app.databinding.ActivityExcerBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.dinner.ui.DinnerActivity
import com.front_end.app.modules.excer.`data`.model.ListavocadoOneRowModel
import com.front_end.app.modules.excer.`data`.model.Listuntitleddesign2RowModel
import com.front_end.app.modules.excer.`data`.viewmodel.ExcerVM
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.lunch.ui.LunchActivity
import com.front_end.app.modules.snacks.ui.SnacksActivity
import com.front_end.app.modules.water.ui.WaterActivity
import java.util.Date
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExcerActivity : BaseActivity<ActivityExcerBinding>(R.layout.activity_excer) {
  private val viewModel: ExcerVM by viewModels<ExcerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
<<<<<<< HEAD
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
=======
    val listuntitleddesignAdapter =
    ListuntitleddesignAdapter(viewModel.listuntitleddesignList.value?:mutableListOf())
    binding.recyclerListuntitleddesign.adapter = listuntitleddesignAdapter
    listuntitleddesignAdapter.setOnItemClickListener(
    object : ListuntitleddesignAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listuntitleddesign2RowModel) {
        onClickRecyclerListuntitleddesign(view, position, item)
      }
    }
    )
    viewModel.listuntitleddesignList.observe(this) {
      listuntitleddesignAdapter.updateData(it)
    }
    val listavocadoOneAdapter =
    ListavocadoOneAdapter(viewModel.listavocadoOneList.value?:mutableListOf())
    binding.recyclerListavocadoOne.adapter = listavocadoOneAdapter
    listavocadoOneAdapter.setOnItemClickListener(
    object : ListavocadoOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListavocadoOneRowModel) {
        onClickRecyclerListavocadoOne(view, position, item)
      }
    }
    )
    viewModel.listavocadoOneList.observe(this) {
      listavocadoOneAdapter.updateData(it)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
    binding.excerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipseten.setOnClickListener {
<<<<<<< HEAD
      val destIntent = CarbsActivity.getIntent(this, null)
=======
      val destIntent = DietActivity.getIntent(this, null)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    binding.linearColumngroupfortyone.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
  }

  fun onClickRecyclerExcer(
    view: View,
    position: Int,
    item: ExcerRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerExcerLinearRowuntitleddesign(view, position, item)
=======
    binding.linearRowarrowone.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearRowarrowone(selectedDate)
      }
    }
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListuntitleddesign(
    view: View,
    position: Int,
    item: Listuntitleddesign2RowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerListuntitleddesignLinearRowuntitleddesign(view, position, item)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      }
    }
  }

<<<<<<< HEAD
  fun onClickRecyclerExcerLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: ExcerRowModel
=======
  fun onClickRecyclerListavocadoOne(
    view: View,
    position: Int,
    item: ListavocadoOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onDateSelectedLinearRowarrowone(selectedDate: Date): Unit {
  }

  fun onClickRecyclerListuntitleddesignLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: Listuntitleddesign2RowModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
<<<<<<< HEAD
        val destIntent = DinnerActivity.getIntent(this, null)
=======
        val destIntent = SnacksActivity.getIntent(this, null)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = LunchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
<<<<<<< HEAD
=======
      2 -> {
        val destIntent = DinnerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
