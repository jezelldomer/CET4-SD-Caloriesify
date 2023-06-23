package com.front_end.app.modules.homediet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityHomeDietBinding
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.homebmi.ui.HomeBmiActivity
import com.front_end.app.modules.homediet.`data`.viewmodel.HomeDietVM
import com.front_end.app.modules.homejournal.ui.HomeJournalActivity
import com.front_end.app.modules.homemacros.ui.HomeMacrosActivity
import com.front_end.app.modules.homework.ui.HomeWorkActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class HomeDietActivity : BaseActivity<ActivityHomeDietBinding>(R.layout.activity_home_diet) {
  private val viewModel: HomeDietVM by viewModels<HomeDietVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeDietVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = HomeMacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfavorite.setOnClickListener {
      val destIntent = HomeBmiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfire.setOnClickListener {
      val destIntent = HomeWorkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumn.setOnClickListener {
      val destIntent = HomeJournalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = DietActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_DIET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeDietActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
