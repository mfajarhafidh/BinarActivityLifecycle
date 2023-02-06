package com.example.binarassignmentlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("onCreate Main Activity")

        val buttonSecond = findViewById<Button>(R.id.btn_second)
        buttonSecond.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        print("onStart Main Activity")
    }

    override fun onResume() {
        super.onResume()
        print("onResume Main Activity")
    }


    override fun onPause() {
        super.onPause()
        print("onPause Main Activity")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart Main Activity")
    }

    override fun onStop() {
        super.onStop()
        print("onStop Main Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy Main Activity")
    }

    private fun print(message: String){
        Log.i("Main Activity", message)
    }
}