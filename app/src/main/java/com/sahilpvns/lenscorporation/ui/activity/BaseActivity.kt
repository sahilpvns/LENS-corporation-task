package com.sahilpvns.lenscorporation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.ui.fragment.ImageFragment
import com.sahilpvns.lenscorporation.ui.fragment.IrpofFragment
import com.sahilpvns.lenscorporation.ui.fragment.MissionFragment
import com.sahilpvns.lenscorporation.ui.fragment.RecentFragment
import com.sahilpvns.lenscorporation.ui.fragment.VideoFragment

open class BaseActivity() : AppCompatActivity() {

    fun dataList() = listOf(
        "Home",
        "Organization",
        "DITS/Panel",
        "IRMS",
        "Events",
        "Seniority",
        "Circulars",
        "News/Article",
        "IRPOBF",
        "Links"
    )

    fun dataHeading() =
        listOf("Who we are: IRPOF", "Mission & Vision", "Recent Events", "Images", "Videos")


    fun sliderImages() = listOf(R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3)

    fun openDefaultFragment() {
        val fragment: Fragment = IrpofFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commitAllowingStateLoss()
    }

    fun videoFragment() {
        val fragment: Fragment = VideoFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    fun imageFragment() {
        val fragment: Fragment = ImageFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    fun recentFragment() {
        val fragment: Fragment = RecentFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    fun missionFragment() {
        val fragment: Fragment = MissionFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    fun irpofFragment() {
        val fragment: Fragment = IrpofFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }


}



