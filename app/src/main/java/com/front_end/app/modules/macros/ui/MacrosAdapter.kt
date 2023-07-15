package com.front_end.app.modules.macros.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowMacrosBinding
import com.front_end.app.modules.macros.`data`.model.MacrosRowModel
import kotlin.Int
import kotlin.collections.List

class MacrosAdapter(
  var list: List<MacrosRowModel>
) : RecyclerView.Adapter<MacrosAdapter.RowMacrosVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMacrosVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_macros,parent,false)
    return RowMacrosVH(view)
  }

  override fun onBindViewHolder(holder: RowMacrosVH, position: Int) {
    val macrosRowModel = MacrosRowModel()
    // TODO uncomment following line after integration with data source
    // val macrosRowModel = list[position]
    holder.binding.macrosRowModel = macrosRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MacrosRowModel>) {
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
      item: MacrosRowModel
    ) {
    }
  }

  inner class RowMacrosVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMacrosBinding = RowMacrosBinding.bind(itemView)
    init {
      binding.linearColumn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MacrosRowModel())
      }
      binding.linearColumnvolume.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MacrosRowModel())
      }
    }
  }
}
