package com.front_end.app.modules.lunch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowLunchBinding
import com.front_end.app.modules.lunch.`data`.model.LunchRowModel
import kotlin.Int
import kotlin.collections.List

class LunchAdapter(
  var list: List<LunchRowModel>
) : RecyclerView.Adapter<LunchAdapter.RowLunchVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLunchVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lunch,parent,false)
    return RowLunchVH(view)
  }

  override fun onBindViewHolder(holder: RowLunchVH, position: Int) {
    val lunchRowModel = LunchRowModel()
    // TODO uncomment following line after integration with data source
    // val lunchRowModel = list[position]
    holder.binding.lunchRowModel = lunchRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LunchRowModel>) {
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
      item: LunchRowModel
    ) {
    }
  }

  inner class RowLunchVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLunchBinding = RowLunchBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesignOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, LunchRowModel())
      }
    }
  }
}
