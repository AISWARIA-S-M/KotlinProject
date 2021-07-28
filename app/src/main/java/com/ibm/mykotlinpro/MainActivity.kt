package com.ibm.mykotlinpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("before","setcontent")
        setContentView(R.layout.activity_main)
        Log.d("after","setcontent")
        printing()
        Log.d("Oncreate","Oncreate function")
    }
    fun printing() {
        println("hello")
    }
}