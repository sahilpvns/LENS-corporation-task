package com.sahilpvns.lenscorporation.ui.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.adapter.HeadingAdapter
import com.sahilpvns.lenscorporation.adapter.ImageSliderAdapter
import com.sahilpvns.lenscorporation.adapter.ItemClickListener
import com.sahilpvns.lenscorporation.adapter.TabAdapter
import com.sahilpvns.lenscorporation.databinding.ActivityMainBinding


class MainActivity : BaseActivity(), ItemClickListener {
    private lateinit var binding : ActivityMainBinding
    private val handler = Handler(Looper.getMainLooper())
    private var runnable: Runnable? = null
    private lateinit var mLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        contactAction()
        openDefaultFragment()
        setLayoutTab()
        setLayoutImageSlider()
        setLayoutHeading()
        marqueeRepeatLimit()
    }

    private fun marqueeRepeatLimit() {
        binding.tvAutoRunning.setSelected(true)
    }

    private fun contactAction() {
        binding.btnContact.setOnClickListener {
            Toast.makeText(this@MainActivity, "Contact us", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setLayoutHeading() {
        binding.rvHeading.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rvHeading.adapter = HeadingAdapter(dataHeading(),this@MainActivity)
    }

    private fun setLayoutImageSlider() {
        binding.rvSlider.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        binding.rvSlider.adapter = ImageSliderAdapter(sliderImages())
        startAutoScroll()
    }

    private fun startAutoScroll() {listOf(R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3)
        runnable = Runnable {
            val position = mLayoutManager.findFirstVisibleItemPosition()
            binding.rvSlider.smoothScrollToPosition(position + 1)
            handler.postDelayed(runnable!!, 2000) // scrolls every 2 seconds
        }
        handler.postDelayed(runnable!!, 2000)
    }

    private fun setLayoutTab() {
        binding.rvItem.layoutManager = LinearLayoutManager (this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        binding.rvItem.adapter = TabAdapter(tabList())
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
                constitutionFragment()
            }
        }
    }
}