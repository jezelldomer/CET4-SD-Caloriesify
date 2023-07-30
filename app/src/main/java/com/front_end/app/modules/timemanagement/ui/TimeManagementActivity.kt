package com.front_end.app.modules.timemanagement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityTimeManagementBinding
import com.front_end.app.modules.saved.ui.SavedActivity
import com.front_end.app.modules.sched.ui.SchedActivity
import com.front_end.app.modules.timemanagement.`data`.viewmodel.TimeManagementVM
import kotlin.String
import kotlin.Unit

class TimeManagementActivity :
    BaseActivity<ActivityTimeManagementBinding>(R.layout.activity_time_management) {
  private val viewModel: TimeManagementVM by viewModels<TimeManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.timeManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = SchedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckmark.setOnClickListener {
      val destIntent = SavedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TIME_MANAGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TimeManagementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
