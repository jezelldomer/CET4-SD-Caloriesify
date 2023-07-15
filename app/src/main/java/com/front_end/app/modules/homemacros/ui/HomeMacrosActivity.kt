package com.front_end.app.modules.homemacros.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityHomeMacrosBinding
import com.front_end.app.modules.homebmi.ui.HomeBmiActivity
import com.front_end.app.modules.homejournal.ui.HomeJournalActivity
import com.front_end.app.modules.homemacros.`data`.model.HomeMacrosRowModel
import com.front_end.app.modules.homemacros.`data`.viewmodel.HomeMacrosVM
import com.front_end.app.modules.homework.ui.HomeWorkActivity
import com.front_end.app.modules.macrosone.ui.MacrosoneActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeMacrosActivity : BaseActivity<ActivityHomeMacrosBinding>(R.layout.activity_home_macros) {
  private val viewModel: HomeMacrosVM by viewModels<HomeMacrosVM>()

  private val REQUEST_CODE_MACROSONE_ACTIVITY: Int = 757


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homemacrosAdapter = HomemacrosAdapter(viewModel.homemacrosList.value?:mutableListOf())
    binding.recyclerHomemacros.adapter = homemacrosAdapter
    homemacrosAdapter.setOnItemClickListener(
    object : HomemacrosAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeMacrosRowModel) {
        onClickRecyclerHomemacros(view, position, item)
      }
    }
    )
    viewModel.homemacrosList.observe(this) {
      homemacrosAdapter.updateData(it)
    }
    binding.homeMacrosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = MacrosoneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MACROSONE_ACTIVITY)
    }
  }

  fun onClickRecyclerHomemacros(
    view: View,
    position: Int,
    item: HomeMacrosRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnvolume -> {
        onClickRecyclerHomemacrosLinearColumnvolume(view, position, item)
      }
      R.id.linearColumn -> {
        onClickRecyclerHomemacrosLinearColumn(view, position, item)
      }
    }
  }

  fun onClickRecyclerHomemacrosLinearColumnvolume(
    view: View,
    position: Int,
    item: HomeMacrosRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = HomeJournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = HomeBmiActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerHomemacrosLinearColumn(
    view: View,
    position: Int,
    item: HomeMacrosRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = HomeJournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = HomeWorkActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_MACROS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeMacrosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
