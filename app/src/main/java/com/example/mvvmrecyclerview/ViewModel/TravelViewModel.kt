package com.example.mvvmrecyclerview.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmrecyclerview.Repository.TravelRepository
import com.example.mvvmrecyclerview.Model.Travel

class TravelViewModel : ViewModel() {

    val travellingdata : MutableLiveData<List<Travel>> = MutableLiveData()


    fun getData(){
        val response = TravelRepository.setTravelData()
        travellingdata.value = response
    }
}