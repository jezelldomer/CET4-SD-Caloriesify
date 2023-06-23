package com.front_end.app.modules.work.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityWorkBinding
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.newwork.ui.NewworkActivity
import com.front_end.app.modules.work.`data`.model.ListlineoneRowModel
import com.front_end.app.modules.work.`data`.model.ListweekdayRowModel
import com.front_end.app.modules.work.`data`.viewmodel.WorkVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WorkActivity : BaseActivity<ActivityWorkBinding>(R.layout.activity_work) {
  private val viewModel: WorkVM by viewModels<WorkVM>()

  private val REQUEST_CODE_NEWWORK_ACTIVITY: Int = 575


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
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
    }
    binding.workVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

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
