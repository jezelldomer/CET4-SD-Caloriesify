package com.front_end.app.modules.work.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWorkBinding
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.journal.ui.JournalActivity
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.sched.ui.SchedActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.`data`.model.WorkRowModel
import com.front_end.app.modules.work.`data`.viewmodel.WorkVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WorkActivity : BaseActivity<ActivityWorkBinding>(R.layout.activity_work) {
  private val viewModel: WorkVM by viewModels<WorkVM>()

  private val REQUEST_CODE_SCHED_ACTIVITY: Int = 432


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val workAdapter = WorkAdapter(viewModel.workList.value?:mutableListOf())
    binding.recyclerWork.adapter = workAdapter
    workAdapter.setOnItemClickListener(
    object : WorkAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : WorkRowModel) {
        onClickRecyclerWork(view, position, item)
      }
    }
    )
    viewModel.workList.observe(this) {
      workAdapter.updateData(it)
    }
    binding.workVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = MacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = SchedActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCHED_ACTIVITY)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerWork(
    view: View,
    position: Int,
    item: WorkRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumn -> {
        val destIntent = JournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearColumnvolume -> {
        val destIntent = DietActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "WORK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WorkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
