package com.front_end.app.modules.setting.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySettingBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.home.ui.HomeActivity
import com.front_end.app.modules.macrosone.ui.MacrosoneActivity
import com.front_end.app.modules.setting.`data`.model.SettingRowModel
import com.front_end.app.modules.setting.`data`.viewmodel.SettingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettingActivity : BaseActivity<ActivitySettingBinding>(R.layout.activity_setting) {
  private val viewModel: SettingVM by viewModels<SettingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val settingAdapter = SettingAdapter(viewModel.settingList.value?:mutableListOf())
    binding.recyclerSetting.adapter = settingAdapter
    settingAdapter.setOnItemClickListener(
    object : SettingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SettingRowModel) {
        onClickRecyclerSetting(view, position, item)
      }
    }
    )
    viewModel.settingList.observe(this) {
      settingAdapter.updateData(it)
    }
    binding.settingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowuserOne.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSetting(
    view: View,
    position: Int,
    item: SettingRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowgroup105 ->  {
        val destIntent = MacrosoneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SETTING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
