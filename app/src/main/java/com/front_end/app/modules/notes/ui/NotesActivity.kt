package com.front_end.app.modules.notes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
<<<<<<< HEAD
=======
import android.view.View
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityNotesBinding
<<<<<<< HEAD
import com.front_end.app.modules.neww.ui.NewActivity
import com.front_end.app.modules.notes.`data`.viewmodel.NotesVM
=======
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.neww.ui.NewwActivity
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneRowModel
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneSixRowModel
import com.front_end.app.modules.notes.`data`.viewmodel.NotesVM
import com.front_end.app.modules.old.ui.OldActivity
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotesActivity : BaseActivity<ActivityNotesBinding>(R.layout.activity_notes) {
  private val viewModel: NotesVM by viewModels<NotesVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_NEW_ACTIVITY: Int = 496


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
=======
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
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    binding.notesVM = viewModel
    setUpSearchViewSearchboxListener()
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = NewActivity.getIntent(this, null)
=======
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
    binding.btnTicket.setOnClickListener {
      val destIntent = NewwActivity.getIntent(this, null)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      startActivityForResult(destIntent, REQUEST_CODE_NEW_ACTIVITY)
    }
  }

<<<<<<< HEAD
=======
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

>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
