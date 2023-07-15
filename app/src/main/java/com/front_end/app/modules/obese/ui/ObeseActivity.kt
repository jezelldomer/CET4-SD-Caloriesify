package com.front_end.app.modules.obese.ui

import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityObeseBinding
import com.front_end.app.modules.obese.`data`.viewmodel.ObeseVM
import kotlin.String
import kotlin.Unit

class ObeseActivity : BaseActivity<ActivityObeseBinding>(R.layout.activity_obese) {
  private val viewModel: ObeseVM by viewModels<ObeseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.obeseVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OBESE_ACTIVITY"

  }
}
