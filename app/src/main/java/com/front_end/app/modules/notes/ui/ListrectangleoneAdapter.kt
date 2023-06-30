package com.front_end.app.modules.notes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListrectangleoneBinding
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleoneAdapter(
  var list: List<ListrectangleoneRowModel>
) : RecyclerView.Adapter<ListrectangleoneAdapter.RowListrectangleoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleoneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleone,parent,false)
    return RowListrectangleoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleoneVH, position: Int) {
    val listrectangleoneRowModel = ListrectangleoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleoneRowModel = list[position]
    holder.binding.listrectangleoneRowModel = listrectangleoneRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleoneRowModel>) {
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
      item: ListrectangleoneRowModel
    ) {
    }
  }

  inner class RowListrectangleoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleoneBinding = RowListrectangleoneBinding.bind(itemView)
    init {
      binding.linearItemlist.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangleoneRowModel())
      }
    }
  }
}
