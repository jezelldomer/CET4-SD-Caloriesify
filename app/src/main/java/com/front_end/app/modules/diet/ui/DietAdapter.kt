package com.front_end.app.modules.diet.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowDietBinding
import com.front_end.app.modules.diet.`data`.model.DietRowModel
import kotlin.Int
import kotlin.collections.List

class DietAdapter(
  var list: List<DietRowModel>
) : RecyclerView.Adapter<DietAdapter.RowDietVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDietVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_diet,parent,false)
    return RowDietVH(view)
  }

  override fun onBindViewHolder(holder: RowDietVH, position: Int) {
    val dietRowModel = DietRowModel()
    // TODO uncomment following line after integration with data source
    // val dietRowModel = list[position]
    holder.binding.dietRowModel = dietRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DietRowModel>) {
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
      item: DietRowModel
    ) {
    }
  }

  inner class RowDietVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDietBinding = RowDietBinding.bind(itemView)
    init {
      binding.linearRowuntitleddesign.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DietRowModel())
      }
    }
  }
}
