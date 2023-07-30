  package com.front_end.app.modules.bmi.ui

  import android.view.LayoutInflater
  import android.view.View
  import android.view.ViewGroup
  import androidx.recyclerview.widget.RecyclerView
  import com.front_end.app.R
  import com.front_end.app.databinding.RowBmiBinding
  import com.front_end.app.modules.bmi.`data`.model.BmiRowModel
  import kotlin.Int
  import kotlin.collections.List

  class BmiAdapter(
    var list: List<BmiRowModel>
  ) : RecyclerView.Adapter<BmiAdapter.RowBmiVH>() {
    private var clickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBmiVH {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.row_bmi,parent,false)
      return RowBmiVH(view)
    }

    override fun onBindViewHolder(holder: RowBmiVH, position: Int) {
      val bmiRowModel = BmiRowModel()
      // TODO uncomment following line after integration with data source
      // val bmiRowModel = list[position]
      holder.binding.bmiRowModel = bmiRowModel
    }

    override fun getItemCount(): Int = 2
    // TODO uncomment following line after integration with data source
    // return list.size

    public fun updateData(newData: List<BmiRowModel>) {
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
        item: BmiRowModel
      ) {
      }
    }

    inner class RowBmiVH(
      view: View
    ) : RecyclerView.ViewHolder(view) {
      val binding: RowBmiBinding = RowBmiBinding.bind(itemView)
      init {
        binding.linearColumn.setOnClickListener {
          // TODO replace with value from datasource
          clickListener?.onItemClick(it, adapterPosition, BmiRowModel())
        }
        binding.linearColumnvolume.setOnClickListener {
          // TODO replace with value from datasource
          clickListener?.onItemClick(it, adapterPosition, BmiRowModel())
        }
      }
    }
  }
