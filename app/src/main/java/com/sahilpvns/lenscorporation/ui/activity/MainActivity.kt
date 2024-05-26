package com.sahilpvns.lenscorporation.ui.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.adapter.HeadingAdapter
import com.sahilpvns.lenscorporation.adapter.ImageSliderAdapter
import com.sahilpvns.lenscorporation.adapter.TabAdapter
import com.sahilpvns.lenscorporation.adapter.itemClickListener
import com.sahilpvns.lenscorporation.databinding.ActivityMainBinding


class MainActivity : BaseActivity(),itemClickListener{
    private var binding: ActivityMainBinding? = null
    private val handler = Handler(Looper.getMainLooper())
    private var runnable: Runnable? = null
    private lateinit var mLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        contactAction()
        openDefaultFragment()
        setLayoutTab()
        setLayoutImageSlider()
        setLayoutHeading()
        marqueeRepeatLimit()
    }

    private fun marqueeRepeatLimit() {
        binding?.tvAutoRunning?.setSelected(true)
    }

    private fun contactAction() {
        binding?.btnContact?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Contact us", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setLayoutHeading() {
        binding?.rvHeading?.layoutManager = LinearLayoutManager(this@MainActivity)
        binding?.rvHeading?.adapter = HeadingAdapter(dataHeading(),this@MainActivity)
    }

    private fun setLayoutImageSlider() {
        mLayoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        binding?.rvSlider?.layoutManager = mLayoutManager
        binding?.rvSlider?.adapter = ImageSliderAdapter(sliderImages())
        startAutoScroll()
    }

    private fun startAutoScroll() {
        runnable = Runnable {
            val position = mLayoutManager.findFirstVisibleItemPosition()
            binding?.rvSlider?.smoothScrollToPosition(position + 1)
            handler.postDelayed(runnable!!, 2000) // scrolls every 2 seconds
        }
        handler.postDelayed(runnable!!, 2000)
    }

    private fun setLayoutTab() {
        binding?.rvItem?.setLayoutManager(LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false))
        binding?.rvItem?.adapter = TabAdapter(dataList())
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable!!)
    }

    override fun onBtnClick(position: Int) {
        when (position) {
            0 -> {
                irpofFragment()
            }
            1 -> {
                missionFragment()
            }
            2 -> {
                recentFragment()
            }
            3 -> {
                imageFragment()
            }
            4 -> {
                videoFragment()
            }
        }
    }
}