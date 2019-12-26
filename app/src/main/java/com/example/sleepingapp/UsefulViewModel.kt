package com.example.sleepingapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UsefulViewModel (application: Application) : AndroidViewModel(application){
    //Maintance a reference to the Repository
    private val usefulRepository: UsefulRepository
    //Maintance a copy of there useful record
    val allUseful: LiveData<List<Useful>>

    init{
        val usefulDao = UsefulDatabase.getDatabase(application).usefulDao()

        usefulRepository = UsefulRepository(usefulDao)
        allUseful = usefulRepository.allUseful
    }

    //Create a coroutine function to insert data in
    //backgroud thread
    fun insertUseful(useful: Useful) = viewModelScope.launch {

    }
}