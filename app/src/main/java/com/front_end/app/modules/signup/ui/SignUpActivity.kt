package com.front_end.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySignUpBinding
import com.front_end.app.modules.age.ui.AgeActivity
<<<<<<< HEAD
import com.front_end.app.modules.asex.ui.AsexActivity
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.male.ui.MaleActivity
import com.front_end.app.modules.signup.`data`.viewmodel.SignUpVM
=======
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.signup.`data`.viewmodel.SignUpVM
import com.front_end.app.modules.signupm.ui.SignUpmActivity
import com.front_end.app.modules.signupu.ui.SignUpuActivity
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_MALE_ACTIVITY: Int = 845
=======
  private val REQUEST_CODE_SIGN_UPM_ACTIVITY: Int = 912


  private val REQUEST_CODE_SIGN_UPU_ACTIVITY: Int = 716
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
<<<<<<< HEAD
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      startActivity(destIntent)
    }
    binding.txtLOGIN.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
<<<<<<< HEAD
      val destIntent = MaleActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MALE_ACTIVITY)
    }
    binding.imageIcons8lgbtSixtyFour.setOnClickListener {
      val destIntent = AsexActivity.getIntent(this, null)
      startActivity(destIntent)
=======
      val destIntent = SignUpmActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UPM_ACTIVITY)
    }
    binding.imageIcons8lgbtSixtyFour.setOnClickListener {
      val destIntent = SignUpuActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UPU_ACTIVITY)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
