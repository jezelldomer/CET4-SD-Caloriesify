package com.front_end.app.modules.asex.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityAsexBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.asex.`data`.viewmodel.AsexVM
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.male.ui.MaleActivity
import com.front_end.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AsexActivity : BaseActivity<ActivityAsexBinding>(R.layout.activity_asex) {
  private val viewModel: AsexVM by viewModels<AsexVM>()

  private val REQUEST_CODE_MALE_ACTIVITY: Int = 840


  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 853


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.asexVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = MaleActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MALE_ACTIVITY)
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
    const val TAG: String = "ASEX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AsexActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
