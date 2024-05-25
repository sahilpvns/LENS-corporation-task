package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.databinding.FragmentMissionBinding
import com.sahilpvns.lenscorporation.databinding.FragmentRecentBinding


class RecentFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentRecentBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentRecentBinding.inflate(inflater, container, false)

        binding.tvText.text = "Recent Fragment"


        return binding.root
    }

}