package com.hanoch.coffe_shop.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hanoch.coffe_shop.Domain.BannerModel
import com.hanoch.coffe_shop.Repository.MainRepository

class MainModelView: ViewModel() {
    private val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }
}