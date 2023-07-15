package com.front_end.app.modules.target.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityTargetBinding
<<<<<<< HEAD
import com.front_end.app.modules.weight.ui.WeightActivity
=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import com.front_end.app.modules.loadingpage.ui.LoadingPageActivity
import com.front_end.app.modules.target.`data`.viewmodel.TargetVM
import kotlin.String
import kotlin.Unit

class TargetActivity : BaseActivity<ActivityTargetBinding>(R.layout.activity_target) {
  private val viewModel: TargetVM by viewModels<TargetVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_WEIGHT_ACTIVITY: Int = 434

  private val REQUEST_CODE_LOADING_PAGE_ACTIVITY: Int = 303

=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.targetVM = viewModel
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
    binding.txtBack.setOnClickListener {
      val destIntent = WeightActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WEIGHT_ACTIVITY)
    }
    binding.txtNext.setOnClickListener {
      val destIntent = LoadingPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOADING_PAGE_ACTIVITY)
=======
    binding.txtNext.setOnClickListener {
      val destIntent = LoadingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBack.setOnClickListener {
      finish()
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
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
