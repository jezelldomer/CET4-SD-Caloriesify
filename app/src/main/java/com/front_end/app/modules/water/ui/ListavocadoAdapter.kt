package com.front_end.app.modules.water.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListavocado3Binding
import com.front_end.app.modules.water.`data`.model.Listavocado3RowModel
import kotlin.Int
import kotlin.collections.List

class ListavocadoAdapter(
  var list: List<Listavocado3RowModel>
) : RecyclerView.Adapter<ListavocadoAdapter.RowListavocado3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavocado3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavocado3,parent,false)
    return RowListavocado3VH(view)
  }

  override fun onBindViewHolder(holder: RowListavocado3VH, position: Int) {
    val listavocado3RowModel = Listavocado3RowModel()
    // TODO uncomment following line after integration with data source
    // val listavocado3RowModel = list[position]
    holder.binding.listavocado3RowModel = listavocado3RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listavocado3RowModel>) {
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
      item: Listavocado3RowModel
    ) {
    }
  }

  inner class RowListavocado3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavocado3Binding = RowListavocado3Binding.bind(itemView)
  }
}
