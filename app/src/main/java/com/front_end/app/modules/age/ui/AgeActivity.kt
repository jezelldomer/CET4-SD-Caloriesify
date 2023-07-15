package com.front_end.app.modules.age.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityAgeBinding
import com.front_end.app.modules.age.`data`.viewmodel.AgeVM
import com.front_end.app.modules.signup.ui.SignUpActivity
import com.front_end.app.modules.tall.ui.TallActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AgeActivity : BaseActivity<ActivityAgeBinding>(R.layout.activity_age) {
  private val viewModel: AgeVM by viewModels<AgeVM>()

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 575


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBack.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
    binding.txtNext.setOnClickListener {
      val destIntent = TallActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AgeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
