package com.sahilpvns.lenscorporation.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DashboardDataSource {

    private val _sliderItems = MutableLiveData<List<String>>()
    fun observerSliderItems(): LiveData<List<String>> = _sliderItems
    fun getSliderItems() {
        _sliderItems.postValue(
            listOf(
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
        )
    }
}