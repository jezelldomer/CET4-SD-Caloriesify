package com.front_end.app.modules.homework.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityHomeWorkBinding
import com.front_end.app.modules.homediet.ui.HomeDietActivity
import com.front_end.app.modules.homejournal.ui.HomeJournalActivity
import com.front_end.app.modules.homemacros.ui.HomeMacrosActivity
import com.front_end.app.modules.homework.`data`.model.HomeWorkRowModel
import com.front_end.app.modules.homework.`data`.viewmodel.HomeWorkVM
import com.front_end.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeWorkActivity : BaseActivity<ActivityHomeWorkBinding>(R.layout.activity_home_work) {
  private val viewModel: HomeWorkVM by viewModels<HomeWorkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeworkAdapter = HomeworkAdapter(viewModel.homeworkList.value?:mutableListOf())
    binding.recyclerHomework.adapter = homeworkAdapter
    homeworkAdapter.setOnItemClickListener(
    object : HomeworkAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeWorkRowModel) {
        onClickRecyclerHomework(view, position, item)
      }
    }
    )
    viewModel.homeworkList.observe(this) {
      homeworkAdapter.updateData(it)
    }
    binding.homeWorkVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = HomeMacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomework(
    view: View,
    position: Int,
    item: HomeWorkRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumn -> {
        val destIntent = HomeJournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearColumnvolume -> {
        val destIntent = HomeDietActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_WORK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeWorkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
