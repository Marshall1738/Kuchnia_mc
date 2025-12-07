package com.example.polskagurom

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel: ViewModel() {

    private val _kwota = MutableLiveData<Int>(0)
    val kwota: LiveData<Int> get() = _kwota


    fun send(kwota: Int){
        _kwota.value += kwota
    }


}