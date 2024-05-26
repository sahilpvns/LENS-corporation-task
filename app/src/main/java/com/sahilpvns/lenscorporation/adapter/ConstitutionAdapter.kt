package com.sahilpvns.lenscorporation.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.databinding.ItemConstitutionBinding
import com.sahilpvns.lenscorporation.ui.activity.PdfActivity

class ConstitutionAdapter() : RecyclerView.Adapter<ConstitutionAdapter.ConstitutionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConstitutionViewHolder {
        val binding = ItemConstitutionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConstitutionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConstitutionViewHolder, position: Int) {
        holder.binding.apply {
            tvShowPDF.setOnClickListener {
                it.context.startActivity(Intent(it.context, PdfActivity::class.java))
            }
            tvViewDetails.setOnClickListener {
                it.context.startActivity(Intent(it.context, PdfActivity::class.java))
            }
            ivDownload.setOnClickListener {
                it.context.startActivity(Intent(it.context, PdfActivity::class.java))
            }
        }

    }

    override fun getItemCount(): Int = 4

    class ConstitutionViewHolder(var binding: ItemConstitutionBinding) : RecyclerView.ViewHolder(binding.root) {}

}