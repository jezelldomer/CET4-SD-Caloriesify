package com.front_end.app.modules.breakfast.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListuntitleddesignBinding
import com.front_end.app.modules.breakfast.`data`.model.ListuntitleddesignRowModel
import kotlin.Int
import kotlin.collections.List

class ListuntitleddesignAdapter(
  var list: List<ListuntitleddesignRowModel>
) : RecyclerView.Adapter<ListuntitleddesignAdapter.RowListuntitleddesignVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuntitleddesignVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuntitleddesign,parent,false)
    return RowListuntitleddesignVH(view)
  }

  override fun onBindViewHolder(holder: RowListuntitleddesignVH, position: Int) {
    val listuntitleddesignRowModel = ListuntitleddesignRowModel()
    // TODO uncomment following line after integration with data source
    // val listuntitleddesignRowModel = list[position]
    holder.binding.listuntitleddesignRowModel = listuntitleddesignRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListuntitleddesignRowModel>) {
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
      item: ListuntitleddesignRowModel
    ) {
    }
  }

  inner class RowListuntitleddesignVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuntitleddesignBinding = RowListuntitleddesignBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListuntitleddesignRowModel())
      }
    }
  }
}
