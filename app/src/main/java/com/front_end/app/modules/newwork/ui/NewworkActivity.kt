package com.front_end.app.modules.newwork.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.appcomponents.views.TimePickerFragment
import com.front_end.app.databinding.ActivityNewworkBinding
import com.front_end.app.modules.newwork.`data`.viewmodel.NewworkVM
import com.front_end.app.modules.work.ui.WorkActivity
import java.util.Date
import kotlin.String
import kotlin.Unit

class NewworkActivity : BaseActivity<ActivityNewworkBinding>(R.layout.activity_newwork) {
  private val viewModel: NewworkVM by viewModels<NewworkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newworkVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = WorkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTime.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedTxtTime(selectedTime)
      }
    }
  }

  private fun onTimeSelectedTxtTime(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "NEWWORK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewworkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
