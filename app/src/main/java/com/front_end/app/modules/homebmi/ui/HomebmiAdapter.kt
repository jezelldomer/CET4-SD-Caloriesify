package com.front_end.app.modules.homebmi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowHomeBmiBinding
import com.front_end.app.modules.homebmi.`data`.model.HomeBmiRowModel
import kotlin.Int
import kotlin.collections.List

class HomebmiAdapter(
  var list: List<HomeBmiRowModel>
) : RecyclerView.Adapter<HomebmiAdapter.RowHomeBmiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeBmiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_bmi,parent,false)
    return RowHomeBmiVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeBmiVH, position: Int) {
    val homeBmiRowModel = HomeBmiRowModel()
    // TODO uncomment following line after integration with data source
    // val homeBmiRowModel = list[position]
    holder.binding.homeBmiRowModel = homeBmiRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeBmiRowModel>) {
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
      item: HomeBmiRowModel
    ) {
    }
  }

  inner class RowHomeBmiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeBmiBinding = RowHomeBmiBinding.bind(itemView)
    init {
      binding.linearColumn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeBmiRowModel())
      }
      binding.linearColumnvolume.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeBmiRowModel())
      }
    }
  }
}
