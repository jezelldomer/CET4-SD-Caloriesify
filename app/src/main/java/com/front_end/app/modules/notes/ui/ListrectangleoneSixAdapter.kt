package com.front_end.app.modules.notes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListrectangleoneSixBinding
import com.front_end.app.modules.notes.`data`.model.ListrectangleoneSixRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleoneSixAdapter(
  var list: List<ListrectangleoneSixRowModel>
) : RecyclerView.Adapter<ListrectangleoneSixAdapter.RowListrectangleoneSixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleoneSixVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleone_six,parent,false)
    return RowListrectangleoneSixVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleoneSixVH, position: Int) {
    val listrectangleoneSixRowModel = ListrectangleoneSixRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleoneSixRowModel = list[position]
    holder.binding.listrectangleoneSixRowModel = listrectangleoneSixRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleoneSixRowModel>) {
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
      item: ListrectangleoneSixRowModel
    ) {
    }
  }

  inner class RowListrectangleoneSixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleoneSixBinding = RowListrectangleoneSixBinding.bind(itemView)
  }
}
