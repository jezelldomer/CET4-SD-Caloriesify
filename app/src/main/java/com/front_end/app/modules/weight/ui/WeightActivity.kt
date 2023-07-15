package com.front_end.app.modules.weight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWeightBinding
<<<<<<< HEAD
import com.front_end.app.modules.tall.ui.TallActivity
=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import com.front_end.app.modules.target.ui.TargetActivity
import com.front_end.app.modules.weight.`data`.viewmodel.WeightVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WeightActivity : BaseActivity<ActivityWeightBinding>(R.layout.activity_weight) {
  private val viewModel: WeightVM by viewModels<WeightVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_TALL_ACTIVITY: Int = 434

  private val REQUEST_CODE_TARGET_ACTIVITY: Int = 303
=======
  private val REQUEST_CODE_TARGET_ACTIVITY: Int = 901
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.weightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBack.setOnClickListener {
<<<<<<< HEAD
      val destIntent = TallActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TALL_ACTIVITY)
=======
      finish()
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
    binding.txtNext.setOnClickListener {
      val destIntent = TargetActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TARGET_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WEIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WeightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
