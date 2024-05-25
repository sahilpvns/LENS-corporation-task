package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.databinding.FragmentRecentBinding
import com.sahilpvns.lenscorporation.databinding.FragmentVideoBinding


class VideoFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentVideoBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentVideoBinding.inflate(inflater, container, false)

        binding.tvText.text = "Video Fragment"


        return binding.root
    }


}