package com.example.binarassignmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        print("onCreate Second Activity")
    }

    override fun onStart() {
        super.onStart()
        print("onStart Second Activity")
    }

    override fun onResume() {
        super.onResume()
        print("onResume Second Activity")
    }


    override fun onPause() {
        super.onPause()
        print("onPause Second Activity")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart Second Activity")
    }

    override fun onStop() {
        super.onStop()
        print("onStop Second Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy Second Activity")
    }

    private fun print(message: String){
        Log.i("Second Activity", message)
    }
}