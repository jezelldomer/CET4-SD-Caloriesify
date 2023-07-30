package com.front_end.app.modules.wasted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWastedBinding
import com.front_end.app.modules.details.ui.DetailsActivity
import com.front_end.app.modules.wasted.`data`.viewmodel.WastedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WastedActivity : BaseActivity<ActivityWastedBinding>(R.layout.activity_wasted) {
  private val viewModel: WastedVM by viewModels<WastedVM>()

  private val REQUEST_CODE_DETAILS_ACTIVITY: Int = 921


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.wastedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDetails.setOnClickListener {
      val destIntent = DetailsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DETAILS_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WASTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WastedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
