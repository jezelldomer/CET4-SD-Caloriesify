package com.front_end.app.modules.signupu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySignUpuBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.signup.ui.SignUpActivity
import com.front_end.app.modules.signupm.ui.SignUpmActivity
import com.front_end.app.modules.signupu.`data`.viewmodel.SignUpuVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpuActivity : BaseActivity<ActivitySignUpuBinding>(R.layout.activity_sign_upu) {
  private val viewModel: SignUpuVM by viewModels<SignUpuVM>()

  private val REQUEST_CODE_SIGN_UPM_ACTIVITY: Int = 389


  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 768


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = SignUpmActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UPM_ACTIVITY)
    }
    binding.txtLOGIN.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLightbulb.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UPU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
