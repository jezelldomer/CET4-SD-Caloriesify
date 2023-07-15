package com.front_end.app.modules.dinner.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListavocado1Binding
import com.front_end.app.modules.dinner.`data`.model.Listavocado1RowModel
import kotlin.Int
import kotlin.collections.List

class ListavocadoAdapter(
  var list: List<Listavocado1RowModel>
) : RecyclerView.Adapter<ListavocadoAdapter.RowListavocado1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavocado1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavocado1,parent,false)
    return RowListavocado1VH(view)
  }

  override fun onBindViewHolder(holder: RowListavocado1VH, position: Int) {
    val listavocado1RowModel = Listavocado1RowModel()
    // TODO uncomment following line after integration with data source
    // val listavocado1RowModel = list[position]
    holder.binding.listavocado1RowModel = listavocado1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listavocado1RowModel>) {
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
      item: Listavocado1RowModel
    ) {
    }
  }

  inner class RowListavocado1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavocado1Binding = RowListavocado1Binding.bind(itemView)
  }
}
