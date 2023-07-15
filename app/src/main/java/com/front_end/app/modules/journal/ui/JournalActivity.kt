package com.front_end.app.modules.journal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityJournalBinding
import com.front_end.app.modules.bmi.ui.BmiActivity
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.journal.`data`.viewmodel.JournalVM
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.notes.ui.NotesActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.ui.WorkActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JournalActivity : BaseActivity<ActivityJournalBinding>(R.layout.activity_journal) {
  private val viewModel: JournalVM by viewModels<JournalVM>()

  private val REQUEST_CODE_NOTES_ACTIVITY: Int = 694


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.journalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnvolume.setOnClickListener {
      val destIntent = DietActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = NotesActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_NOTES_ACTIVITY)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = MacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfavorite.setOnClickListener {
      val destIntent = BmiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfire.setOnClickListener {
      val destIntent = WorkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "JOURNAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JournalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
