package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemImageBinding
import com.sahilpvns.lenscorporation.databinding.ItemVideoBinding

class VideoAdapter(private var dataList: List<Int>) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val binding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VideoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoValue = dataList[position]
        holder.binding.ivVideo.setImageResource(videoValue)
        holder.binding.ivVideo.setOnClickListener {
            Toast.makeText(it.context, " Click Video $position", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int = dataList.size

    class VideoViewHolder(var binding: ItemVideoBinding) : RecyclerView.ViewHolder(binding.root) {}

}