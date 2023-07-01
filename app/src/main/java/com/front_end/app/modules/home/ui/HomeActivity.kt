package com.front_end.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityHomeBinding
import com.front_end.app.modules.bmi.ui.BmiActivity
import com.front_end.app.modules.home.`data`.model.HomeRowModel
import com.front_end.app.modules.home.`data`.viewmodel.HomeVM
import com.front_end.app.modules.journal.ui.JournalActivity
import com.front_end.app.modules.macros.ui.MacrosActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import com.front_end.app.modules.work.ui.WorkActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = MacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHome(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnvolume -> {
        val destIntent = BmiActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearColumn -> {
        onClickRecyclerHomeLinearColumn(view, position, item)
      }
    }
  }

  fun onClickRecyclerHomeLinearColumn(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = WorkActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = JournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
