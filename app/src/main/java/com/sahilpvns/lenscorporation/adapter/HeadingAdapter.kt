package com.sahilpvns.lenscorporation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.databinding.ItemHeadingBinding

class HeadingAdapter (private var dataList: List<String>, private val mListener: ItemClickListener) : RecyclerView.Adapter<HeadingAdapter.HeadingViewHolder>() {
    private var currentItem = -1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeadingViewHolder {
        val binding = ItemHeadingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeadingViewHolder(binding)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: HeadingViewHolder, position: Int) {
        holder.bindItem(dataList[position], holder.adapterPosition, currentItem)
        holder.binding.tvHeading.setOnClickListener {
            mListener.onBtnClick(position)
            currentItem = holder.adapterPosition
            notifyDataSetChanged()
        }


    }

    override fun getItemCount(): Int = dataList.size

    class HeadingViewHolder(var binding: ItemHeadingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(item: String, adapterPosition: Int, currentItem: Int) {
            binding.apply {
                tvHeading.text = item
                viewSelect.isVisible = adapterPosition == currentItem
                cvCard.setBackgroundColor(
                    ContextCompat.getColor(this.root.context, if (adapterPosition == currentItem) R.color.light_alpha_blue else R.color.white))
            }
        }
    }

}

interface ItemClickListener{
    fun onBtnClick(position: Int)
}
