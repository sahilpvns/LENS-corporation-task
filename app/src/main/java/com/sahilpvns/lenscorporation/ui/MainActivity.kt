package com.sahilpvns.lenscorporation.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.adapter.ImageSliderAdapter
import com.sahilpvns.lenscorporation.adapter.TabAdapter
import com.sahilpvns.lenscorporation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val handler = Handler(Looper.getMainLooper())
    private var runnable: Runnable? = null
    private lateinit var mLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dataList = listOf(
            "Links",
            "IRPOBF",
            "News/Article",
            "Circulars",
            "Seniority",
            "Events",
            "IRMS",
            "DITS/Panel",
            "Organization",
            "Home",
        )

        val sliderImages = listOf(
            R.drawable.homeimage1,
            R.drawable.homeimage2,
            R.drawable.homeimage3
        )

        binding?.apply {
            rvItem.setLayoutManager(LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, true))
            rvItem.adapter = TabAdapter(dataList)

            mLayoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            rvSlider.layoutManager = mLayoutManager
            rvSlider.adapter = ImageSliderAdapter(sliderImages)
            startAutoScroll()
            tvAutoRunning.setSelected(true)

        }

    }

    private fun startAutoScroll() {
        runnable = Runnable {
            val position = mLayoutManager.findFirstVisibleItemPosition()
            binding?.rvSlider?.smoothScrollToPosition(position + 1)
            handler.postDelayed(runnable!!, 2000) // scrolls every 3 seconds
        }
        handler.postDelayed(runnable!!, 2000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable!!)
    }
}