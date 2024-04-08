package com.example.immotep.modules.pagedaccueil.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.immotep.app.R
import com.immotep.app.appcomponents.di.MyApp
import com.immotep.app.databinding.RowEstatescardBinding
import com.immotep.app.modules.pagedaccueil.data.model.EstatescardRowModel
import kotlin.Int
import kotlin.collections.List

class EstatescardAdapter(
    var list: List<EstatescardRowModel>
) : RecyclerView.Adapter<EstatescardAdapter.RowEstatescardVH>() {
    private var clickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEstatescardVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_estatescard, parent, false)
        return RowEstatescardVH(view)
    }

    override fun onBindViewHolder(holder: RowEstatescardVH, position: Int) {
        val estatescardRowModel = EstatescardRowModel()
        // TODO uncomment following line after integration with data source
        // val estatescardRowModel = list[position]
        holder.binding.estatescardRowModel = estatescardRowModel
    }

    override fun getItemCount(): Int = 3 // TODO replace with dynamic size after integration with data source
    // return list.size

    public fun updateData(newData: List<EstatescardRowModel>) {
        list = newData
        notifyDataSetChanged()
    }

    fun setOnItemClickListener(clickListener: OnItemClickListener) {
        this.clickListener = clickListener
    }

    interface OnItemClickListener {
        fun onItemClicked(view: View, position: Int, item: EstatescardRowModel)
    }

    inner class RowEstatescardVH(view: View) : RecyclerView.ViewHolder(view) {
        val binding: RowEstatescardBinding = RowEstatescardBinding.bind(itemView)
    }
}
