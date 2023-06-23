package com.front_end.app.modules.work.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListlineoneBinding
import com.front_end.app.modules.work.`data`.model.ListlineoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListlineoneAdapter(
  var list: List<ListlineoneRowModel>
) : RecyclerView.Adapter<ListlineoneAdapter.RowListlineoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlineoneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlineone,parent,false)
    return RowListlineoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListlineoneVH, position: Int) {
    val listlineoneRowModel = ListlineoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listlineoneRowModel = list[position]
    holder.binding.listlineoneRowModel = listlineoneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlineoneRowModel>) {
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
      item: ListlineoneRowModel
    ) {
    }
  }

  inner class RowListlineoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlineoneBinding = RowListlineoneBinding.bind(itemView)
  }
}
