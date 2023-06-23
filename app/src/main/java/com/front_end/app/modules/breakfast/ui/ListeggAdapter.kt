package com.front_end.app.modules.breakfast.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.front_end.app.R
import com.front_end.app.databinding.RowListeggBinding
import com.front_end.app.modules.breakfast.`data`.model.ListeggRowModel
import kotlin.Int
import kotlin.collections.List

class ListeggAdapter(
  var list: List<ListeggRowModel>
) : RecyclerView.Adapter<ListeggAdapter.RowListeggVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListeggVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listegg,parent,false)
    return RowListeggVH(view)
  }

  override fun onBindViewHolder(holder: RowListeggVH, position: Int) {
    val listeggRowModel = ListeggRowModel()
    // TODO uncomment following line after integration with data source
    // val listeggRowModel = list[position]
    holder.binding.listeggRowModel = listeggRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListeggRowModel>) {
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
      item: ListeggRowModel
    ) {
    }
  }

  inner class RowListeggVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListeggBinding = RowListeggBinding.bind(itemView)
  }
}
