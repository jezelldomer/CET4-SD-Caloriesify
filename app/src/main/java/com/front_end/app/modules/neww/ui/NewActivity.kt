package com.front_end.app.modules.neww.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityNewwBinding
import com.front_end.app.modules.neww.`data`.viewmodel.NewVM
import com.front_end.app.modules.saved.ui.SavedActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NewActivity : BaseActivity<ActivityNewwBinding>(R.layout.activity_neww) {
  private val viewModel: NewVM by viewModels<NewVM>()

  private val REQUEST_CODE_SAVED_ACTIVITY: Int = 173


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCheckmark.setOnClickListener {
      val destIntent = SavedActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAVED_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
