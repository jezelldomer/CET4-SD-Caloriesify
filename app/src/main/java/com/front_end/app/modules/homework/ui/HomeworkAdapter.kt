package com.front_end.app.modules.homework.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowHomeWorkBinding
import com.front_end.app.modules.homework.`data`.model.HomeWorkRowModel
import kotlin.Int
import kotlin.collections.List

class HomeworkAdapter(
  var list: List<HomeWorkRowModel>
) : RecyclerView.Adapter<HomeworkAdapter.RowHomeWorkVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeWorkVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_work,parent,false)
    return RowHomeWorkVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeWorkVH, position: Int) {
    val homeWorkRowModel = HomeWorkRowModel()
    // TODO uncomment following line after integration with data source
    // val homeWorkRowModel = list[position]
    holder.binding.homeWorkRowModel = homeWorkRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeWorkRowModel>) {
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
      item: HomeWorkRowModel
    ) {
    }
  }

  inner class RowHomeWorkVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeWorkBinding = RowHomeWorkBinding.bind(itemView)
    init {
      binding.linearColumn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeWorkRowModel())
      }
      binding.linearColumnvolume.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeWorkRowModel())
      }
    }
  }
}
