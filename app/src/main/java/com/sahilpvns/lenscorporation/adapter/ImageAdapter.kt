package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemImageBinding

class ImageAdapter(private var dataList: List<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageValue = dataList[position]
        holder.bind(imageValue)
    }

    override fun getItemCount(): Int = dataList.size

    class ImageViewHolder(var binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imageValue: Int) {
            binding.ivPic.setImageResource(imageValue)
            binding.ivPic.setOnClickListener {
                Toast.makeText(it.context, "Click Image $layoutPosition", Toast.LENGTH_SHORT).show()
            }
        }
    }

}