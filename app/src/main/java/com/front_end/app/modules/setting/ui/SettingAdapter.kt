package com.front_end.app.modules.setting.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowSettingBinding
import com.front_end.app.modules.setting.`data`.model.SettingRowModel
import kotlin.Int
import kotlin.collections.List

class SettingAdapter(
  var list: List<SettingRowModel>
) : RecyclerView.Adapter<SettingAdapter.RowSettingVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSettingVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_setting,parent,false)
    return RowSettingVH(view)
  }

  override fun onBindViewHolder(holder: RowSettingVH, position: Int) {
    val settingRowModel = SettingRowModel()
    // TODO uncomment following line after integration with data source
    // val settingRowModel = list[position]
    holder.binding.settingRowModel = settingRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SettingRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SettingRowModel
    ) {
    }
  }

  inner class RowSettingVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSettingBinding = RowSettingBinding.bind(itemView)
    init {
      binding.linearRowgroup105.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, SettingRowModel())
      }
    }
  }
}
