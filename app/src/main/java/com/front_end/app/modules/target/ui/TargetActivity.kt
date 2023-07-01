package com.front_end.app.modules.target.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityTargetBinding
import com.front_end.app.modules.target.`data`.viewmodel.TargetVM
import kotlin.String
import kotlin.Unit

class TargetActivity : BaseActivity<ActivityTargetBinding>(R.layout.activity_target) {
  private val viewModel: TargetVM by viewModels<TargetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.targetVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TARGET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TargetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
