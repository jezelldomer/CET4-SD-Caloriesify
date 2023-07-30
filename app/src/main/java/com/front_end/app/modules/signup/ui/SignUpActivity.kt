package com.front_end.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySignUpBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.asex.ui.AsexActivity
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.male.ui.MaleActivity
import com.front_end.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private val REQUEST_CODE_MALE_ACTIVITY: Int = 628


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
    binding.txtLOGIN.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = MaleActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MALE_ACTIVITY)
    }
    binding.imageIcons8lgbtSixtyFour.setOnClickListener {
      val destIntent = AsexActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
