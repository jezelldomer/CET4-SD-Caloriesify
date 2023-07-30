package com.front_end.app.modules.work.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowWorkBinding
import com.front_end.app.modules.work.`data`.model.WorkRowModel
import kotlin.Int
import kotlin.collections.List

class WorkAdapter(
  var list: List<WorkRowModel>
) : RecyclerView.Adapter<WorkAdapter.RowWorkVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowWorkVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_work,parent,false)
    return RowWorkVH(view)
  }

  override fun onBindViewHolder(holder: RowWorkVH, position: Int) {
    val workRowModel = WorkRowModel()
    // TODO uncomment following line after integration with data source
    // val workRowModel = list[position]
    holder.binding.workRowModel = workRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<WorkRowModel>) {
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
      item: WorkRowModel
    ) {
    }
  }

  inner class RowWorkVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowWorkBinding = RowWorkBinding.bind(itemView)
    init {
      binding.linearColumn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, WorkRowModel())
      }
      binding.linearColumnvolume.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, WorkRowModel())
      }
    }
  }
}
