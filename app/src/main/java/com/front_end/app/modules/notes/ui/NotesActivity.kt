package com.front_end.app.modules.notes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityNotesBinding
import com.front_end.app.modules.neww.ui.NewActivity
import com.front_end.app.modules.notes.`data`.viewmodel.NotesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotesActivity : BaseActivity<ActivityNotesBinding>(R.layout.activity_notes) {
  private val viewModel: NotesVM by viewModels<NotesVM>()

  private val REQUEST_CODE_NEW_ACTIVITY: Int = 496


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notesVM = viewModel
    setUpSearchViewSearchboxListener()
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = NewActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_NEW_ACTIVITY)
    }
  }

  private fun setUpSearchViewSearchboxListener(): Unit {
    binding.searchViewSearchbox.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "NOTES_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, NotesActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
