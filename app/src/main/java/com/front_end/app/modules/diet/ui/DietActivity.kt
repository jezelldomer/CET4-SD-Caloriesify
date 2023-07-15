package com.front_end.app.modules.diet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
<<<<<<< HEAD
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityDietBinding
import com.front_end.app.modules.bmi.ui.BmiActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.diet.`data`.viewmodel.DietVM
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.notes.ui.NotesActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.ui.WorkActivity
=======
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.appcomponents.views.DatePickerFragment
import com.front_end.app.databinding.ActivityDietBinding
import com.front_end.app.modules.breakfast.ui.BreakfastActivity
import com.front_end.app.modules.diet.`data`.model.DietRowModel
import com.front_end.app.modules.diet.`data`.viewmodel.DietVM
import com.front_end.app.modules.dinner.ui.DinnerActivity
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

class DietActivity : BaseActivity<ActivityDietBinding>(R.layout.activity_diet) {
  private val viewModel: DietVM by viewModels<DietVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_CARBS_ACTIVITY: Int = 846

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
=======
  private val REQUEST_CODE_BREAKFAST_ACTIVITY: Int = 835


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dietAdapter = DietAdapter(viewModel.dietList.value?:mutableListOf())
    binding.recyclerDiet.adapter = dietAdapter
    dietAdapter.setOnItemClickListener(
    object : DietAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DietRowModel) {
        onClickRecyclerDiet(view, position, item)
      }
    }
    )
    viewModel.dietList.observe(this) {
      dietAdapter.updateData(it)
    }
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    binding.dietVM = viewModel
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = MacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfavorite.setOnClickListener {
      val destIntent = BmiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfire.setOnClickListener {
      val destIntent = WorkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumn.setOnClickListener {
      val destIntent = NotesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = CarbsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CARBS_ACTIVITY)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
=======
    binding.linearColumngroupfortyone.setOnClickListener {
      val destIntent = BreakfastActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_BREAKFAST_ACTIVITY)
    }
    binding.frameStackwater.setOnClickListener {
      val destIntent = WaterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowone.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearRowarrowone(selectedDate)
      }
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDiet(
    view: View,
    position: Int,
    item: DietRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowuntitleddesign -> {
        onClickRecyclerDietLinearRowuntitleddesign(view, position, item)
      }
    }
  }

  private fun onDateSelectedLinearRowarrowone(selectedDate: Date): Unit {
  }

  fun onClickRecyclerDietLinearRowuntitleddesign(
    view: View,
    position: Int,
    item: DietRowModel
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
      3 -> {
        val destIntent = SnacksActivity.getIntent(this, null)
        startActivity(destIntent)
      }
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
  }

  companion object {
    const val TAG: String = "DIET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DietActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
