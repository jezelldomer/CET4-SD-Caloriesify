package com.front_end.app.modules.bmi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityBmiBinding
import com.front_end.app.modules.bmi.`data`.model.BmiRowModel
import com.front_end.app.modules.bmi.`data`.viewmodel.BmiVM
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.journal.ui.JournalActivity
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.wasted.ui.WastedActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BmiActivity : BaseActivity<ActivityBmiBinding>(R.layout.activity_bmi) {
  private val viewModel: BmiVM by viewModels<BmiVM>()

  private val REQUEST_CODE_WASTED_ACTIVITY: Int = 222


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val bmiAdapter = BmiAdapter(viewModel.bmiList.value?:mutableListOf())
    binding.recyclerBmi.adapter = bmiAdapter
    bmiAdapter.setOnItemClickListener(
    object : BmiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BmiRowModel) {
        onClickRecyclerBmi(view, position, item)
      }
    }
    )
    viewModel.bmiList.observe(this) {
      bmiAdapter.updateData(it)
    }
    binding.bmiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProceed.setOnClickListener {
      val destIntent = WastedActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WASTED_ACTIVITY)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = MacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerBmi(
    view: View,
    position: Int,
    item: BmiRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumn -> {
        val destIntent = JournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearColumnvolume -> {
        val destIntent = DietActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "BMI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BmiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
