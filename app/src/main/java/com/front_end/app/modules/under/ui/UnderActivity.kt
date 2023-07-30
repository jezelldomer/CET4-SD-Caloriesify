package com.front_end.app.modules.under.ui

import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityUnderBinding
import com.front_end.app.modules.details.ui.DetailsActivity
import com.front_end.app.modules.under.`data`.viewmodel.UnderVM
import kotlin.String
import kotlin.Unit

class UnderActivity : BaseActivity<ActivityUnderBinding>(R.layout.activity_under) {
  private val viewModel: UnderVM by viewModels<UnderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.underVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDetails.setOnClickListener {
      val destIntent = DetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "UNDER_ACTIVITY"

  }
}
