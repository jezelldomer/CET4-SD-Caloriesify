package com.front_end.app.modules.signupm.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySignUpmBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.signup.ui.SignUpActivity
import com.front_end.app.modules.signupm.`data`.viewmodel.SignUpmVM
import com.front_end.app.modules.signupu.ui.SignUpuActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpmActivity : BaseActivity<ActivitySignUpmBinding>(R.layout.activity_sign_upm) {
  private val viewModel: SignUpmVM by viewModels<SignUpmVM>()

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 271


  private val REQUEST_CODE_SIGN_UPU_ACTIVITY: Int = 460


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpmVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLOGIN.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLightbulb.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
    binding.imageIcons8lgbtSixtyFour.setOnClickListener {
      val destIntent = SignUpuActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UPU_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UPM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpmActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
