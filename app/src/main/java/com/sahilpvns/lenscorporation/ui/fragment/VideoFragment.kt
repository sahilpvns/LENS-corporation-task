package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.adapter.ImageAdapter
import com.sahilpvns.lenscorporation.adapter.VideoAdapter
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

        val videoList = listOf(
            R.drawable.image5,
            R.drawable.image4,
            R.drawable.image3,
            R.drawable.image2,
            R.drawable.image1
        )

        binding.apply {
            rvVideo.layoutManager = GridLayoutManager(context,2)
            rvVideo.adapter = VideoAdapter(videoList)
        }


        return binding.root
    }


}