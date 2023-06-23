package com.front_end.app.modules.homebmi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityHomeBmiBinding
import com.front_end.app.modules.bmicalc.ui.BmiCaLcActivity
import com.front_end.app.modules.homebmi.`data`.model.HomeBmiRowModel
import com.front_end.app.modules.homebmi.`data`.viewmodel.HomeBmiVM
import com.front_end.app.modules.homediet.ui.HomeDietActivity
import com.front_end.app.modules.homejournal.ui.HomeJournalActivity
import com.front_end.app.modules.homemacros.ui.HomeMacrosActivity
import com.front_end.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeBmiActivity : BaseActivity<ActivityHomeBmiBinding>(R.layout.activity_home_bmi) {
  private val viewModel: HomeBmiVM by viewModels<HomeBmiVM>()

  private val REQUEST_CODE_BMI_CA_LC_ACTIVITY: Int = 429


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homebmiAdapter = HomebmiAdapter(viewModel.homebmiList.value?:mutableListOf())
    binding.recyclerHomebmi.adapter = homebmiAdapter
    homebmiAdapter.setOnItemClickListener(
    object : HomebmiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeBmiRowModel) {
        onClickRecyclerHomebmi(view, position, item)
      }
    }
    )
    viewModel.homebmiList.observe(this) {
      homebmiAdapter.updateData(it)
    }
    binding.homeBmiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProceed.setOnClickListener {
      val destIntent = BmiCaLcActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_BMI_CA_LC_ACTIVITY)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = HomeMacrosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomebmi(
    view: View,
    position: Int,
    item: HomeBmiRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnvolume -> {
        val destIntent = HomeDietActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearColumn -> {
        val destIntent = HomeJournalActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_BMI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeBmiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
