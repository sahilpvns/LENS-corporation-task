package com.sahilpvns.lenscorporation.network

class DashBoardViewModel {
    private val dashboardRepo by lazy { DashboardRepo() }
    fun getAllSliderItems() = dashboardRepo.getSliderItems()

    fun observerSliderItems() = dashboardRepo.observerSliderItems()
}