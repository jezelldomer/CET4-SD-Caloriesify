package com.front_end.app.modules.macros.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityMacrosBinding
import com.front_end.app.modules.bmi.ui.BmiActivity
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.journal.ui.JournalActivity
import com.front_end.app.modules.macros.`data`.model.MacrosRowModel
import com.front_end.app.modules.macros.`data`.viewmodel.MacrosVM
import com.front_end.app.modules.own.ui.OwnActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.ui.WorkActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MacrosActivity : BaseActivity<ActivityMacrosBinding>(R.layout.activity_macros) {
  private val viewModel: MacrosVM by viewModels<MacrosVM>()

  private val REQUEST_CODE_OWN_ACTIVITY: Int = 986


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.macrosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProceed.setOnClickListener {
      val destIntent = OwnActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OWN_ACTIVITY)
    }
    binding.linearColumnvolume.setOnClickListener {
      val destIntent = DietActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
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
      val destIntent = JournalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMacros(
    view: View,
    position: Int,
    item: MacrosRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnvolume -> {
        onClickRecyclerMacrosLinearColumnvolume(view, position, item)
      }
      R.id.linearColumn -> {
        onClickRecyclerMacrosLinearColumn(view, position, item)
      }
    }
  }

  fun onClickRecyclerMacrosLinearColumnvolume(
    view: View,
    position: Int,
    item: MacrosRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = DietActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = BmiActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerMacrosLinearColumn(
    view: View,
    position: Int,
    item: MacrosRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = JournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = WorkActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "MACROS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MacrosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
