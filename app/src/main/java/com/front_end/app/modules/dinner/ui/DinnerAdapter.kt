package com.front_end.app.modules.dinner.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowDinnerBinding
import com.front_end.app.modules.dinner.`data`.model.DinnerRowModel
import kotlin.Int
import kotlin.collections.List

class DinnerAdapter(
  var list: List<DinnerRowModel>
) : RecyclerView.Adapter<DinnerAdapter.RowDinnerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDinnerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dinner,parent,false)
    return RowDinnerVH(view)
  }

  override fun onBindViewHolder(holder: RowDinnerVH, position: Int) {
    val dinnerRowModel = DinnerRowModel()
    // TODO uncomment following line after integration with data source
    // val dinnerRowModel = list[position]
    holder.binding.dinnerRowModel = dinnerRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DinnerRowModel>) {
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
      item: DinnerRowModel
    ) {
    }
  }

  inner class RowDinnerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDinnerBinding = RowDinnerBinding.bind(itemView)
  }
}
