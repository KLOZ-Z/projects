package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Activity7 : AppCompatActivity() {

    var score=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)
        val intent= this.intent
        score= intent.getIntExtra("score", 0)
        Log.d("score",score.toString())
        findViewById<TextView>(R.id.points).text = score.toString()
    }
}
