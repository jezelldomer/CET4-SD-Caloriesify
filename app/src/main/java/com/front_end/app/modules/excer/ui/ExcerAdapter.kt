package com.front_end.app.modules.excer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowExcerBinding
import com.front_end.app.modules.excer.`data`.model.ExcerRowModel
import kotlin.Int
import kotlin.collections.List

class ExcerAdapter(
  var list: List<ExcerRowModel>
) : RecyclerView.Adapter<ExcerAdapter.RowExcerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExcerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_excer,parent,false)
    return RowExcerVH(view)
  }

  override fun onBindViewHolder(holder: RowExcerVH, position: Int) {
    val excerRowModel = ExcerRowModel()
    // TODO uncomment following line after integration with data source
    // val excerRowModel = list[position]
    holder.binding.excerRowModel = excerRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ExcerRowModel>) {
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
      item: ExcerRowModel
    ) {
    }
  }

  inner class RowExcerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowExcerBinding = RowExcerBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ExcerRowModel())
      }
    }
  }
}
