package com.front_end.app.modules.loadingpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityLoadingPageBinding
<<<<<<< HEAD
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.loadingpage.`data`.viewmodel.LoadingPageVM
import kotlin.Int
=======
import com.front_end.app.modules.loadingpage.`data`.viewmodel.LoadingPageVM
>>>>>>> 2c33a75c6a824ae5f2a16e7fce6b719586bfcf9b
import kotlin.String
import kotlin.Unit

class LoadingPageActivity : BaseActivity<ActivityLoadingPageBinding>(R.layout.activity_loading_page)
    {
  private val viewModel: LoadingPageVM by viewModels<LoadingPageVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_HOME_ACTIVITY: Int = 923

=======
>>>>>>> 2c33a75c6a824ae5f2a16e7fce6b719586bfcf9b
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
    binding.txtEatwellasyou.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
=======
>>>>>>> 2c33a75c6a824ae5f2a16e7fce6b719586bfcf9b
  }

  companion object {
    const val TAG: String = "LOADING_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoadingPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
