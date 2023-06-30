package com.front_end.app.modules.notes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityNotesBinding
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.neww.ui.NewwActivity
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneRowModel
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneSixRowModel
import com.front_end.app.modules.notes.`data`.viewmodel.NotesVM
import com.front_end.app.modules.old.ui.OldActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotesActivity : BaseActivity<ActivityNotesBinding>(R.layout.activity_notes) {
  private val viewModel: NotesVM by viewModels<NotesVM>()

  private val REQUEST_CODE_HOME_ACTIVITY: Int = 199

  private val REQUEST_CODE_NEW_ACTIVITY: Int = 813

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangleoneAdapter =
    ListrectangleoneAdapter(viewModel.listrectangleoneList.value?:mutableListOf())
    binding.recyclerListrectangleone.adapter = listrectangleoneAdapter
    listrectangleoneAdapter.setOnItemClickListener(
    object : ListrectangleoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectangleoneRowModel) {
        onClickRecyclerListrectangleone(view, position, item)
      }
    }
    )
    viewModel.listrectangleoneList.observe(this) {
      listrectangleoneAdapter.updateData(it)
    }
    val listrectangleoneSixAdapter =
    ListrectangleoneSixAdapter(viewModel.listrectangleoneSixList.value?:mutableListOf())
    binding.recyclerListrectangleoneSix.adapter = listrectangleoneSixAdapter
    listrectangleoneSixAdapter.setOnItemClickListener(
    object : ListrectangleoneSixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectangleoneSixRowModel) {
        onClickRecyclerListrectangleoneSix(view, position, item)
      }
    }
    )
    viewModel.listrectangleoneSixList.observe(this) {
      listrectangleoneSixAdapter.updateData(it)
    }
    binding.notesVM = viewModel
    setUpSearchViewSearchboxListener()
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
    binding.btnTicket.setOnClickListener {
      val destIntent = NewwActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_NEW_ACTIVITY)
    }
  }

  fun onClickRecyclerListrectangleone(
    view: View,
    position: Int,
    item: ListrectangleoneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearItemlist ->  {
        val destIntent = OldActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectangleoneSix(
    view: View,
    position: Int,
    item: ListrectangleoneSixRowModel
  ): Unit {
    when(view.id) {
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
