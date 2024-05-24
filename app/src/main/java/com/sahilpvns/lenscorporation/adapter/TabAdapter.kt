package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemListBinding

class TabAdapter(private var dataList: List<String>) : RecyclerView.Adapter<TabAdapter.PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val textValue = dataList[position]
        holder.binding.btnTab.text = textValue
        holder.binding.btnTab.setOnClickListener {
            Toast.makeText(it.context, textValue, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = dataList.size

    class PostViewHolder(var binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {}

}