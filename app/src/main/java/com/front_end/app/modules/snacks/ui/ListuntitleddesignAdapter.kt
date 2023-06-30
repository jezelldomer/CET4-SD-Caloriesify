package com.front_end.app.modules.snacks.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListuntitleddesign1Binding
import com.front_end.app.modules.snacks.`data`.model.Listuntitleddesign1RowModel
import kotlin.Int
import kotlin.collections.List

class ListuntitleddesignAdapter(
  var list: List<Listuntitleddesign1RowModel>
) : RecyclerView.Adapter<ListuntitleddesignAdapter.RowListuntitleddesign1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuntitleddesign1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuntitleddesign1,parent,false)
    return RowListuntitleddesign1VH(view)
  }

  override fun onBindViewHolder(holder: RowListuntitleddesign1VH, position: Int) {
    val listuntitleddesign1RowModel = Listuntitleddesign1RowModel()
    // TODO uncomment following line after integration with data source
    // val listuntitleddesign1RowModel = list[position]
    holder.binding.listuntitleddesign1RowModel = listuntitleddesign1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listuntitleddesign1RowModel>) {
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
      item: Listuntitleddesign1RowModel
    ) {
    }
  }

  inner class RowListuntitleddesign1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuntitleddesign1Binding = RowListuntitleddesign1Binding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listuntitleddesign1RowModel())
      }
    }
  }
}
