package com.front_end.app.modules.lunch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListuntitleddesignOneBinding
import com.front_end.app.modules.lunch.`data`.model.ListuntitleddesignOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListuntitleddesignOneAdapter(
  var list: List<ListuntitleddesignOneRowModel>
) : RecyclerView.Adapter<ListuntitleddesignOneAdapter.RowListuntitleddesignOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuntitleddesignOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuntitleddesign_one,parent,false)
    return RowListuntitleddesignOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListuntitleddesignOneVH, position: Int) {
    val listuntitleddesignOneRowModel = ListuntitleddesignOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listuntitleddesignOneRowModel = list[position]
    holder.binding.listuntitleddesignOneRowModel = listuntitleddesignOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListuntitleddesignOneRowModel>) {
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
      item: ListuntitleddesignOneRowModel
    ) {
    }
  }

  inner class RowListuntitleddesignOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuntitleddesignOneBinding = RowListuntitleddesignOneBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesignOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListuntitleddesignOneRowModel())
      }
    }
  }
}
