package com.front_end.app.modules.own.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityOwnBinding
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.own.`data`.viewmodel.OwnVM
import com.front_end.app.modules.saved.ui.SavedActivity
import kotlin.String
import kotlin.Unit

class OwnActivity : BaseActivity<ActivityOwnBinding>(R.layout.activity_own) {
  private val viewModel: OwnVM by viewModels<OwnVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ownVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = MacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = SavedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OWN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OwnActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
