package com.example.viewmodelproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewmodel:ViewModel() {

    private val _counter = MutableLiveData(0)
    val counterLiveData:LiveData<Int> = _counter

    fun incrementByOne(){

        _counter.value = _counter.value?.plus(1)
    }

}