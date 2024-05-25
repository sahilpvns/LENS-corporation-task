package com.sahilpvns.lenscorporation.ui.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.adapter.HeadingAdapter
import com.sahilpvns.lenscorporation.adapter.ImageSliderAdapter
import com.sahilpvns.lenscorporation.adapter.TabAdapter
import com.sahilpvns.lenscorporation.adapter.itemClickListener
import com.sahilpvns.lenscorporation.databinding.ActivityMainBinding
import com.sahilpvns.lenscorporation.ui.fragment.ImageFragment
import com.sahilpvns.lenscorporation.ui.fragment.IrpofFragment
import com.sahilpvns.lenscorporation.ui.fragment.MissionFragment
import com.sahilpvns.lenscorporation.ui.fragment.RecentFragment
import com.sahilpvns.lenscorporation.ui.fragment.VideoFragment


class MainActivity : AppCompatActivity(),itemClickListener{
    private var binding: ActivityMainBinding? = null
    private val handler = Handler(Looper.getMainLooper())
    private var runnable: Runnable? = null
    private lateinit var mLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        if (savedInstanceState == null) {
            val fragment: Fragment = IrpofFragment()
            supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commitAllowingStateLoss()
        }

        val dataList = listOf(
            "Home",
            "Organization",
            "DITS/Panel",
            "IRMS",
            "Events",
            "Seniority",
            "Circulars",
            "News/Article",
            "IRPOBF",
            "Links",
        )

        val dataHeading = listOf(
            "Who we are: IRPOF",
            "Mission & Vision",
            "Recent Events",
            "Images",
            "Videos"
        )

        val sliderImages = listOf(
            R.drawable.homeimage1,
            R.drawable.homeimage2,
            R.drawable.homeimage3
        )

        binding?.apply {
            rvItem.setLayoutManager(LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false))
            rvItem.adapter = TabAdapter(dataList)

            mLayoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            rvSlider.layoutManager = mLayoutManager
            rvSlider.adapter = ImageSliderAdapter(sliderImages)
            startAutoScroll()
            tvAutoRunning.setSelected(true)


            rvHeading.layoutManager = LinearLayoutManager(this@MainActivity)
            rvHeading.adapter = HeadingAdapter(dataHeading,this@MainActivity)

        }


    }

    private fun videoFragment() {
        val fragment: Fragment = VideoFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    private fun imageFragment() {
        val fragment: Fragment = ImageFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    private fun recentFragment() {
        val fragment: Fragment = RecentFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    private fun missionFragment() {
        val fragment: Fragment = MissionFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    private fun irpofFragment() {
        val fragment: Fragment = IrpofFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }


    private fun startAutoScroll() {
        runnable = Runnable {
            val position = mLayoutManager.findFirstVisibleItemPosition()
            binding?.rvSlider?.smoothScrollToPosition(position + 1)
            handler.postDelayed(runnable!!, 2000) // scrolls every 2 seconds
        }
        handler.postDelayed(runnable!!, 2000)
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