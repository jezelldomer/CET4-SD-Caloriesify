package com.front_end.app.modules.snacks.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListavocado2Binding
import com.front_end.app.modules.snacks.`data`.model.Listavocado2RowModel
import kotlin.Int
import kotlin.collections.List

class ListavocadoAdapter(
  var list: List<Listavocado2RowModel>
) : RecyclerView.Adapter<ListavocadoAdapter.RowListavocado2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavocado2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavocado2,parent,false)
    return RowListavocado2VH(view)
  }

  override fun onBindViewHolder(holder: RowListavocado2VH, position: Int) {
    val listavocado2RowModel = Listavocado2RowModel()
    // TODO uncomment following line after integration with data source
    // val listavocado2RowModel = list[position]
    holder.binding.listavocado2RowModel = listavocado2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listavocado2RowModel>) {
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
      item: Listavocado2RowModel
    ) {
    }
  }

  inner class RowListavocado2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavocado2Binding = RowListavocado2Binding.bind(itemView)
  }
}
