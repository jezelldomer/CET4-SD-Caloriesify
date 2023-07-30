package com.front_end.app.modules.diet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityDietBinding
import com.front_end.app.modules.bmi.ui.BmiActivity
import com.front_end.app.modules.carbs.ui.CarbsActivity
import com.front_end.app.modules.diet.`data`.viewmodel.DietVM
import com.front_end.app.modules.journal.ui.JournalActivity
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.notes.ui.NotesActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.ui.WorkActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DietActivity : BaseActivity<ActivityDietBinding>(R.layout.activity_diet) {
  private val viewModel: DietVM by viewModels<DietVM>()

  private val REQUEST_CODE_CARBS_ACTIVITY: Int = 466

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dietVM = viewModel
  }

  override fun setUpClicks(): Unit {
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
    }
    binding.linearColumn.setOnClickListener {
      val destIntent = JournalActivity.getIntent(this, null)
      startActivity(destIntent)
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
