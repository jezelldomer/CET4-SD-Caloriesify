package com.front_end.app.modules.normal.ui

import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityNormalBinding
import com.front_end.app.modules.normal.`data`.viewmodel.NormalVM
import kotlin.String
import kotlin.Unit

class NormalActivity : BaseActivity<ActivityNormalBinding>(R.layout.activity_normal) {
  private val viewModel: NormalVM by viewModels<NormalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.normalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NORMAL_ACTIVITY"

  }
}
