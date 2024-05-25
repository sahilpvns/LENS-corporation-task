package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemRecentEventBinding

class RecentEventAdapter : RecyclerView.Adapter<RecentEventAdapter.RecentEventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentEventViewHolder {
        val binding = ItemRecentEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecentEventViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecentEventViewHolder, position: Int) {
        holder.binding.tvViewDetails.setOnClickListener {
            Toast.makeText(it.context, "View Details", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = 3

    class RecentEventViewHolder(var binding: ItemRecentEventBinding) : RecyclerView.ViewHolder(binding.root) {}

}