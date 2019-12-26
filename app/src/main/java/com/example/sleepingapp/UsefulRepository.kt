package com.example.sleepingapp

import androidx.lifecycle.LiveData

class UsefulRepository (private val usefulDao: UsefulDao) {
    //Maintance a copy of the LiveData
    val allUseful : LiveData<List<Useful>> = usefulDao.getAllUseful()

    //A function to insert useful record
    suspend fun insertUseful(useful: Useful){
        usefulDao.insertUseful(useful)
    }
}