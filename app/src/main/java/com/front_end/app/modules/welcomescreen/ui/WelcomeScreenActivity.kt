package com.front_end.app.modules.welcomescreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWelcomeScreenBinding
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.welcomescreen.`data`.viewmodel.WelcomeScreenVM
<<<<<<< HEAD
=======
import kotlin.Int
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.String
import kotlin.Unit

class WelcomeScreenActivity :
    BaseActivity<ActivityWelcomeScreenBinding>(R.layout.activity_welcome_screen) {
  private val viewModel: WelcomeScreenVM by viewModels<WelcomeScreenVM>()

<<<<<<< HEAD
=======
  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 106

>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnGetStarted.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
<<<<<<< HEAD
        startActivity(destIntent)
=======
        startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      }
    }

    companion object {
      const val TAG: String = "WELCOME_SCREEN_ACTIVITY"

    }
  }
