package com.front_end.app.modules.male.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityMaleBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.asex.ui.AsexActivity
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.male.`data`.viewmodel.MaleVM
import com.front_end.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MaleActivity : BaseActivity<ActivityMaleBinding>(R.layout.activity_male) {
  private val viewModel: MaleVM by viewModels<MaleVM>()

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 213


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.maleVM = viewModel
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
      val destIntent = AsexActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MALE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MaleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
