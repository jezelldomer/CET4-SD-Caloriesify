package com.front_end.app.modules.excer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListuntitleddesign2Binding
import com.front_end.app.modules.excer.`data`.model.Listuntitleddesign2RowModel
import kotlin.Int
import kotlin.collections.List

class ListuntitleddesignAdapter(
  var list: List<Listuntitleddesign2RowModel>
) : RecyclerView.Adapter<ListuntitleddesignAdapter.RowListuntitleddesign2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuntitleddesign2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuntitleddesign2,parent,false)
    return RowListuntitleddesign2VH(view)
  }

  override fun onBindViewHolder(holder: RowListuntitleddesign2VH, position: Int) {
    val listuntitleddesign2RowModel = Listuntitleddesign2RowModel()
    // TODO uncomment following line after integration with data source
    // val listuntitleddesign2RowModel = list[position]
    holder.binding.listuntitleddesign2RowModel = listuntitleddesign2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listuntitleddesign2RowModel>) {
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
      item: Listuntitleddesign2RowModel
    ) {
    }
  }

  inner class RowListuntitleddesign2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuntitleddesign2Binding = RowListuntitleddesign2Binding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listuntitleddesign2RowModel())
      }
    }
  }
}
