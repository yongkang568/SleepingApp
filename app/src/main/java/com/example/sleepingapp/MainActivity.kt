package com.example.sleepingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var userfulViewModel: UsefulViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize a Recycler View adapter
        fab.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)

            startActivityForResult(intent, REQUEST_CODE)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            if(requestCode == REQUEST_CODE){
                //TODO : Save a useful record to the database
                Toast.makeText(
                    this,
                    "Record saved",
                    Toast.LENGTH_SHORT
                )
            }
            super.onActivityResult(requestCode, resultCode, data)
        }



    companion object  {
        const val REQUEST_CODE = 1
    }
}
