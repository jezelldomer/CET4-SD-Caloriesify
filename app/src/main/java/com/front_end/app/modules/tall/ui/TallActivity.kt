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
<<<<<<< HEAD
=======
import kotlin.Int
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.String
import kotlin.Unit

class TallActivity : BaseActivity<ActivityTallBinding>(R.layout.activity_tall) {
  private val viewModel: TallVM by viewModels<TallVM>()

<<<<<<< HEAD
=======
  private val REQUEST_CODE_WEIGHT_ACTIVITY: Int = 134


>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
<<<<<<< HEAD
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
=======
      startActivityForResult(destIntent, REQUEST_CODE_WEIGHT_ACTIVITY)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
