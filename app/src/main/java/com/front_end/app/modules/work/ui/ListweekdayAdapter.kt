package com.front_end.app.modules.work.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListweekdayBinding
import com.front_end.app.modules.work.`data`.model.ListweekdayRowModel
import kotlin.Int
import kotlin.collections.List

class ListweekdayAdapter(
  var list: List<ListweekdayRowModel>
) : RecyclerView.Adapter<ListweekdayAdapter.RowListweekdayVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListweekdayVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listweekday,parent,false)
    return RowListweekdayVH(view)
  }

  override fun onBindViewHolder(holder: RowListweekdayVH, position: Int) {
    val listweekdayRowModel = ListweekdayRowModel()
    // TODO uncomment following line after integration with data source
    // val listweekdayRowModel = list[position]
    holder.binding.listweekdayRowModel = listweekdayRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListweekdayRowModel>) {
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
      item: ListweekdayRowModel
    ) {
    }
  }

  inner class RowListweekdayVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListweekdayBinding = RowListweekdayBinding.bind(itemView)
    init {
      binding.linearColumnweekday.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListweekdayRowModel())
      }
    }
  }
}
