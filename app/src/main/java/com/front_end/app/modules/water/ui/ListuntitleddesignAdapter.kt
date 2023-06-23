package com.front_end.app.modules.water.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListuntitleddesign3Binding
import com.front_end.app.modules.water.`data`.model.Listuntitleddesign3RowModel
import kotlin.Int
import kotlin.collections.List

class ListuntitleddesignAdapter(
  var list: List<Listuntitleddesign3RowModel>
) : RecyclerView.Adapter<ListuntitleddesignAdapter.RowListuntitleddesign3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuntitleddesign3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuntitleddesign3,parent,false)
    return RowListuntitleddesign3VH(view)
  }

  override fun onBindViewHolder(holder: RowListuntitleddesign3VH, position: Int) {
    val listuntitleddesign3RowModel = Listuntitleddesign3RowModel()
    // TODO uncomment following line after integration with data source
    // val listuntitleddesign3RowModel = list[position]
    holder.binding.listuntitleddesign3RowModel = listuntitleddesign3RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listuntitleddesign3RowModel>) {
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
      item: Listuntitleddesign3RowModel
    ) {
    }
  }

  inner class RowListuntitleddesign3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuntitleddesign3Binding = RowListuntitleddesign3Binding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listuntitleddesign3RowModel())
      }
    }
  }
}
