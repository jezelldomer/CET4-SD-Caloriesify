package com.front_end.app.modules.homemacros.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowHomeMacrosBinding
import com.front_end.app.modules.homemacros.`data`.model.HomeMacrosRowModel
import kotlin.Int
import kotlin.collections.List

class HomemacrosAdapter(
  var list: List<HomeMacrosRowModel>
) : RecyclerView.Adapter<HomemacrosAdapter.RowHomeMacrosVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeMacrosVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_macros,parent,false)
    return RowHomeMacrosVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeMacrosVH, position: Int) {
    val homeMacrosRowModel = HomeMacrosRowModel()
    // TODO uncomment following line after integration with data source
    // val homeMacrosRowModel = list[position]
    holder.binding.homeMacrosRowModel = homeMacrosRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeMacrosRowModel>) {
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
      item: HomeMacrosRowModel
    ) {
    }
  }

  inner class RowHomeMacrosVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeMacrosBinding = RowHomeMacrosBinding.bind(itemView)
    init {
      binding.linearColumn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeMacrosRowModel())
      }
      binding.linearColumnvolume.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeMacrosRowModel())
      }
    }
  }
}
