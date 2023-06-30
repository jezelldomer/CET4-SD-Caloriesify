package com.front_end.app.modules.dinner.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListuntitleddesignTwoBinding
import com.front_end.app.modules.dinner.`data`.model.ListuntitleddesignTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListuntitleddesignTwoAdapter(
  var list: List<ListuntitleddesignTwoRowModel>
) : RecyclerView.Adapter<ListuntitleddesignTwoAdapter.RowListuntitleddesignTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuntitleddesignTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuntitleddesign_two,parent,false)
    return RowListuntitleddesignTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListuntitleddesignTwoVH, position: Int) {
    val listuntitleddesignTwoRowModel = ListuntitleddesignTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listuntitleddesignTwoRowModel = list[position]
    holder.binding.listuntitleddesignTwoRowModel = listuntitleddesignTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListuntitleddesignTwoRowModel>) {
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
      item: ListuntitleddesignTwoRowModel
    ) {
    }
  }

  inner class RowListuntitleddesignTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuntitleddesignTwoBinding = RowListuntitleddesignTwoBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesignTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListuntitleddesignTwoRowModel())
      }
    }
  }
}
