package com.front_end.app.modules.old.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityOldBinding
import com.front_end.app.modules.old.`data`.viewmodel.OldVM
import kotlin.String
import kotlin.Unit

class OldActivity : BaseActivity<ActivityOldBinding>(R.layout.activity_old) {
  private val viewModel: OldVM by viewModels<OldVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.oldVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "OLD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OldActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
