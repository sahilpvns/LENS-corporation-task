package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahilpvns.lenscorporation.adapter.ConstitutionAdapter
import com.sahilpvns.lenscorporation.databinding.FragmentConstitutionBinding


class ConstitutionFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentConstitutionBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentConstitutionBinding.inflate(inflater, container, false)



        binding.apply {
            rvConstitution.layoutManager = LinearLayoutManager(context)
            rvConstitution.adapter = ConstitutionAdapter()
        }


        return binding.root
    }


}