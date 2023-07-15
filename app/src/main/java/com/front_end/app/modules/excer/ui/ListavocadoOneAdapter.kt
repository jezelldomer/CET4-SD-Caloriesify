package com.front_end.app.modules.excer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListavocadoOneBinding
import com.front_end.app.modules.excer.`data`.model.ListavocadoOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListavocadoOneAdapter(
  var list: List<ListavocadoOneRowModel>
) : RecyclerView.Adapter<ListavocadoOneAdapter.RowListavocadoOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavocadoOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavocado_one,parent,false)
    return RowListavocadoOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListavocadoOneVH, position: Int) {
    val listavocadoOneRowModel = ListavocadoOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listavocadoOneRowModel = list[position]
    holder.binding.listavocadoOneRowModel = listavocadoOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListavocadoOneRowModel>) {
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
      item: ListavocadoOneRowModel
    ) {
    }
  }

  inner class RowListavocadoOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavocadoOneBinding = RowListavocadoOneBinding.bind(itemView)
  }
}
