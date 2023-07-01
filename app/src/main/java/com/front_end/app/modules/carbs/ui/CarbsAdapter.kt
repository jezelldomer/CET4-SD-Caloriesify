package com.front_end.app.modules.carbs.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowCarbsBinding
import com.front_end.app.modules.carbs.`data`.model.CarbsRowModel
import kotlin.Int
import kotlin.collections.List

class CarbsAdapter(
  var list: List<CarbsRowModel>
) : RecyclerView.Adapter<CarbsAdapter.RowCarbsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarbsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_carbs,parent,false)
    return RowCarbsVH(view)
  }

  override fun onBindViewHolder(holder: RowCarbsVH, position: Int) {
    val carbsRowModel = CarbsRowModel()
    // TODO uncomment following line after integration with data source
    // val carbsRowModel = list[position]
    holder.binding.carbsRowModel = carbsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarbsRowModel>) {
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
      item: CarbsRowModel
    ) {
    }
  }

  inner class RowCarbsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarbsBinding = RowCarbsBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CarbsRowModel())
      }
    }
  }
}
