package com.sahilpvns.lenscorporation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemConstitutionBinding

class ConstitutionAdapter() : RecyclerView.Adapter<ConstitutionAdapter.ConstitutionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConstitutionViewHolder {
        val binding = ItemConstitutionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConstitutionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConstitutionViewHolder, position: Int) {
        holder.binding.tvShowPDF.setOnClickListener {
            Toast.makeText(it.context, "Showing PDF", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int = 4

    class ConstitutionViewHolder(var binding: ItemConstitutionBinding) : RecyclerView.ViewHolder(binding.root) {}

}