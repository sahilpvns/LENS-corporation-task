package com.sahilpvns.lenscorporation.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sahilpvns.lenscorporation.R

class DashboardDataSource {

    private val _sliderItems = MutableLiveData<List<Int>>()
    fun observerSliderItems(): LiveData<List<Int>> = _sliderItems
    fun getSliderItems() {
        _sliderItems.postValue(listOf(R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3))
    }

}