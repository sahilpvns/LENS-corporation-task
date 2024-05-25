package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.databinding.FragmentImageBinding
import com.sahilpvns.lenscorporation.databinding.FragmentIrpofBinding


class IrpofFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentIrpofBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentIrpofBinding.inflate(inflater, container, false)

//        binding.tvText.text = "Irpof fragment"


        return binding.root
    }

}