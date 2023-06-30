package com.front_end.app.modules.macrostwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityMacrostwoBinding
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.macrostwo.`data`.viewmodel.MacrostwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MacrostwoActivity : BaseActivity<ActivityMacrostwoBinding>(R.layout.activity_macrostwo) {
  private val viewModel: MacrostwoVM by viewModels<MacrostwoVM>()

  private val REQUEST_CODE_HOME_ACTIVITY: Int = 650

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.macrostwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.image360F247848348.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "MACROSTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MacrostwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
