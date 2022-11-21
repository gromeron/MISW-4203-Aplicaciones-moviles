package com.uniandes.vynilsapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.data.repository.CollectorRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CollectorViewModel(application: Application): AndroidViewModel(application) {

    val collectorList = MutableLiveData<List<Collector>>()

    private val collectorRepository = CollectorRepository(application)

    val collectors: LiveData<List<Collector>>
        get() = collectorList

    init {
        getCollectors()
    }

    private fun getCollectors() {
        try {
            viewModelScope.launch(Dispatchers.IO) {
                collectorList.postValue(collectorRepository.getAllCollectors())
            }
        } catch (e: Exception) {
            Log.e("Error", e.message ?: "Failure service")
        }
    }

}