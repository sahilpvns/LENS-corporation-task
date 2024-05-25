package com.sahilpvns.lenscorporation.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahilpvns.lenscorporation.adapter.RecentEventAdapter
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

        binding.apply {
            rvRecentEvent.layoutManager = LinearLayoutManager(context)
            rvRecentEvent.adapter = RecentEventAdapter()
        }



        return binding.root
    }

}