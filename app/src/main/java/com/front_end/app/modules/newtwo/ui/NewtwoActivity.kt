package com.front_end.app.modules.newtwo.ui

import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityNewtwoBinding
import com.front_end.app.modules.newtwo.`data`.viewmodel.NewtwoVM
import com.front_end.app.modules.notes.ui.NotesActivity
import kotlin.String
import kotlin.Unit

class NewtwoActivity : BaseActivity<ActivityNewtwoBinding>(R.layout.activity_newtwo) {
  private val viewModel: NewtwoVM by viewModels<NewtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = NotesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NEWTWO_ACTIVITY"

  }
}
