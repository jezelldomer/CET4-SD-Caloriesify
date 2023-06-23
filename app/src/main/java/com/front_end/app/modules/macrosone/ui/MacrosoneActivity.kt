package com.front_end.app.modules.macrosone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityMacrosoneBinding
import com.front_end.app.modules.homemacros.ui.HomeMacrosActivity
import com.front_end.app.modules.macrosone.`data`.viewmodel.MacrosoneVM
import com.front_end.app.modules.macrostwo.ui.MacrostwoActivity
import kotlin.String
import kotlin.Unit

class MacrosoneActivity : BaseActivity<ActivityMacrosoneBinding>(R.layout.activity_macrosone) {
  private val viewModel: MacrosoneVM by viewModels<MacrosoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.macrosoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = HomeMacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = MacrostwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MACROSONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MacrosoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
