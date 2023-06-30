package com.front_end.app.modules.bmicalc.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityBmiCaLcBinding
import com.front_end.app.modules.bmicalc.`data`.viewmodel.BmiCaLcVM
import com.front_end.app.modules.details.ui.DetailsActivity
import kotlin.String
import kotlin.Unit

class BmiCaLcActivity : BaseActivity<ActivityBmiCaLcBinding>(R.layout.activity_bmi_ca_lc) {
  private val viewModel: BmiCaLcVM by viewModels<BmiCaLcVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bmiCaLcVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDetails.setOnClickListener {
      val destIntent = DetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BMI_CA_LC_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BmiCaLcActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
