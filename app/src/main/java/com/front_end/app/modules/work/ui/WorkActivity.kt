package com.front_end.app.modules.work.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWorkBinding
<<<<<<< HEAD
import com.front_end.app.modules.diet.ui.DietActivity
import com.front_end.app.modules.journal.ui.JournalActivity
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.sched.ui.SchedActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.`data`.model.WorkRowModel
=======
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.newwork.ui.NewworkActivity
import com.front_end.app.modules.work.`data`.model.ListlineoneRowModel
import com.front_end.app.modules.work.`data`.model.ListweekdayRowModel
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import com.front_end.app.modules.work.`data`.viewmodel.WorkVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WorkActivity : BaseActivity<ActivityWorkBinding>(R.layout.activity_work) {
  private val viewModel: WorkVM by viewModels<WorkVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_SCHED_ACTIVITY: Int = 659
=======
  private val REQUEST_CODE_NEWWORK_ACTIVITY: Int = 173
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
<<<<<<< HEAD
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
=======
    val listlineoneAdapter =
    ListlineoneAdapter(viewModel.listlineoneList.value?:mutableListOf())
    binding.recyclerListlineone.adapter = listlineoneAdapter
    listlineoneAdapter.setOnItemClickListener(
    object : ListlineoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlineoneRowModel) {
        onClickRecyclerListlineone(view, position, item)
      }
    }
    )
    viewModel.listlineoneList.observe(this) {
      listlineoneAdapter.updateData(it)
    }
    val listweekdayAdapter =
    ListweekdayAdapter(viewModel.listweekdayList.value?:mutableListOf())
    binding.recyclerListweekday.adapter = listweekdayAdapter
    listweekdayAdapter.setOnItemClickListener(
    object : ListweekdayAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListweekdayRowModel) {
        onClickRecyclerListweekday(view, position, item)
      }
    }
    )
    viewModel.listweekdayList.observe(this) {
      listweekdayAdapter.updateData(it)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
    }
    binding.workVM = viewModel
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
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
=======
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
      startActivity(destIntent)
    }
  }

<<<<<<< HEAD
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
=======
  fun onClickRecyclerListlineone(
    view: View,
    position: Int,
    item: ListlineoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListweekday(
    view: View,
    position: Int,
    item: ListweekdayRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnweekday -> {
        val destIntent = NewworkActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_NEWWORK_ACTIVITY)
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
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
