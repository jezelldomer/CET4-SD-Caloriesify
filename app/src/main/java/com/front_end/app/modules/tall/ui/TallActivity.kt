package com.front_end.app.modules.tall.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityTallBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.tall.`data`.viewmodel.TallVM
import com.front_end.app.modules.weight.ui.WeightActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TallActivity : BaseActivity<ActivityTallBinding>(R.layout.activity_tall) {
  private val viewModel: TallVM by viewModels<TallVM>()

  private val REQUEST_CODE_WEIGHT_ACTIVITY: Int = 134


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tallVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBack.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNext.setOnClickListener {
      val destIntent = WeightActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WEIGHT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "TALL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TallActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
