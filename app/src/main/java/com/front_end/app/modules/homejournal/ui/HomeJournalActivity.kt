package com.front_end.app.modules.homejournal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityHomeJournalBinding
import com.front_end.app.modules.homebmi.ui.HomeBmiActivity
import com.front_end.app.modules.homediet.ui.HomeDietActivity
import com.front_end.app.modules.homejournal.`data`.viewmodel.HomeJournalVM
import com.front_end.app.modules.homemacros.ui.HomeMacrosActivity
import com.front_end.app.modules.homework.ui.HomeWorkActivity
import com.front_end.app.modules.notes.ui.NotesActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeJournalActivity : BaseActivity<ActivityHomeJournalBinding>(R.layout.activity_home_journal)
    {
  private val viewModel: HomeJournalVM by viewModels<HomeJournalVM>()

  private val REQUEST_CODE_NOTES_ACTIVITY: Int = 915


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeJournalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = NotesActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_NOTES_ACTIVITY)
    }
    binding.linearColumnvolume.setOnClickListener {
      val destIntent = HomeDietActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfire.setOnClickListener {
      val destIntent = HomeWorkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfavorite.setOnClickListener {
      val destIntent = HomeBmiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = HomeMacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_JOURNAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeJournalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
