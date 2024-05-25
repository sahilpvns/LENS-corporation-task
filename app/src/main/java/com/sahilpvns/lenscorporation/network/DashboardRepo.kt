package com.sahilpvns.lenscorporation.network

import androidx.lifecycle.LiveData

class DashboardRepo : DashboardRepoInterface {
    private val dataSource by lazy { DashboardDataSource() }
    override fun getSliderItems() = dataSource.getSliderItems()

    override fun observerSliderItems(): LiveData<List<String>> = dataSource.observerSliderItems()
}


interface DashboardRepoInterface {
    fun getSliderItems()
    fun observerSliderItems(): LiveData<List<String>>
}