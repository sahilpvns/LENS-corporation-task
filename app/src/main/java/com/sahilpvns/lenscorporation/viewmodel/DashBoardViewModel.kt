package com.sahilpvns.lenscorporation.viewmodel

import com.sahilpvns.lenscorporation.network.DashboardRepo

class DashBoardViewModel {
    private val dashboardRepo by lazy { DashboardRepo() }
    fun getAllSliderItems() = dashboardRepo.getSliderItems()

    fun observerSliderItems() = dashboardRepo.observerSliderItems()
}