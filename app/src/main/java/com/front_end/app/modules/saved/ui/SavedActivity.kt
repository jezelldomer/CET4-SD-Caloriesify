package com.front_end.app.modules.saved.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySavedBinding
import com.front_end.app.modules.saved.`data`.viewmodel.SavedVM
import kotlin.String
import kotlin.Unit

class SavedActivity : BaseActivity<ActivitySavedBinding>(R.layout.activity_saved) {
  private val viewModel: SavedVM by viewModels<SavedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.savedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SAVED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SavedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
