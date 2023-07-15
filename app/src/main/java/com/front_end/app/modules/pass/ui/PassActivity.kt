package com.front_end.app.modules.pass.ui

import android.content.Intent
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityPassBinding
import com.front_end.app.modules.loadingpage.ui.LoadingPageActivity
import com.front_end.app.modules.pass.`data`.viewmodel.PassVM
import kotlin.String
import kotlin.Unit

class PassActivity : BaseActivity<ActivityPassBinding>(R.layout.activity_pass) {
  private val viewModel: PassVM by viewModels<PassVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBack.setOnClickListener {
      finish()
    }
    binding.txtNext.setOnClickListener {
      val destIntent = LoadingPageActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PASS_ACTIVITY"

  }
}
