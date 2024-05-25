package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemHeadingBinding

class HeadingAdapter (private var dataList: List<String>, val mListener: itemClickListener) : RecyclerView.Adapter<HeadingAdapter.HeadingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeadingViewHolder {
        val binding = ItemHeadingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeadingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeadingViewHolder, position: Int) {
        val textValue = dataList[position]
        holder.binding.tvHeading.text = textValue
        holder.binding.tvHeading.setOnClickListener {
            mListener.onBtnClick(position)
        }
    }

    override fun getItemCount(): Int = dataList.size

    class HeadingViewHolder(var binding: ItemHeadingBinding) : RecyclerView.ViewHolder(binding.root) {}

}

interface itemClickListener{
    fun onBtnClick(position: Int)
}
