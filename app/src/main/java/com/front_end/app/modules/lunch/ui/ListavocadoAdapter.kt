package com.front_end.app.modules.lunch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListavocadoBinding
import com.front_end.app.modules.lunch.`data`.model.ListavocadoRowModel
import kotlin.Int
import kotlin.collections.List

class ListavocadoAdapter(
  var list: List<ListavocadoRowModel>
) : RecyclerView.Adapter<ListavocadoAdapter.RowListavocadoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavocadoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavocado,parent,false)
    return RowListavocadoVH(view)
  }

  override fun onBindViewHolder(holder: RowListavocadoVH, position: Int) {
    val listavocadoRowModel = ListavocadoRowModel()
    // TODO uncomment following line after integration with data source
    // val listavocadoRowModel = list[position]
    holder.binding.listavocadoRowModel = listavocadoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListavocadoRowModel>) {
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
      item: ListavocadoRowModel
    ) {
    }
  }

  inner class RowListavocadoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavocadoBinding = RowListavocadoBinding.bind(itemView)
  }
}
