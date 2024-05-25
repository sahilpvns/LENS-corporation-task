package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.adapter.ImageAdapter
import com.sahilpvns.lenscorporation.adapter.TabAdapter
import com.sahilpvns.lenscorporation.databinding.FragmentImageBinding


class ImageFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentImageBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentImageBinding.inflate(inflater, container, false)

        val imageList = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5
        )

        binding.apply {
            rvImage.layoutManager = GridLayoutManager(context,2)
            rvImage.adapter = ImageAdapter(imageList)
        }

        return binding.root
    }

}