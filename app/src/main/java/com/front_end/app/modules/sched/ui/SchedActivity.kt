package com.front_end.app.modules.sched.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySchedBinding
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.sched.`data`.viewmodel.SchedVM
import com.front_end.app.modules.timemanagement.ui.TimeManagementActivity
import kotlin.String
import kotlin.Unit

class SchedActivity : BaseActivity<ActivitySchedBinding>(R.layout.activity_sched) {
  private val viewModel: SchedVM by viewModels<SchedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.schedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = TimeManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCHED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SchedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
