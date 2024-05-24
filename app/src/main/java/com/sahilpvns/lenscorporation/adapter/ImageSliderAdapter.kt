package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.SliderViewBinding

class ImageSliderAdapter(private val images: List<Int>) : RecyclerView.Adapter<ImageSliderAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = SliderViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.binding.sliderItem.setImageResource(images[position % images.size])
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE // to make it look like an infinite loop
    }

    inner class ImageViewHolder(var binding: SliderViewBinding) : RecyclerView.ViewHolder(binding.root) {
    }
}
