package com.front_end.app.modules.water.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowWaterBinding
import com.front_end.app.modules.water.`data`.model.WaterRowModel
import kotlin.Int
import kotlin.collections.List

class WaterAdapter(
  var list: List<WaterRowModel>
) : RecyclerView.Adapter<WaterAdapter.RowWaterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowWaterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_water,parent,false)
    return RowWaterVH(view)
  }

  override fun onBindViewHolder(holder: RowWaterVH, position: Int) {
    val waterRowModel = WaterRowModel()
    // TODO uncomment following line after integration with data source
    // val waterRowModel = list[position]
    holder.binding.waterRowModel = waterRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<WaterRowModel>) {
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
      item: WaterRowModel
    ) {
    }
  }

  inner class RowWaterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowWaterBinding = RowWaterBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, WaterRowModel())
      }
    }
  }
}
