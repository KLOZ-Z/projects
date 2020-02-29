package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Activity1 : AppCompatActivity() {
    var score=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
    }

    fun next1(view: View) {
        score=score+1
        val intent= Intent(this, Activity2::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
    }

    fun incorrect1(view: View) {
        score=score
        Toast.makeText(this@Activity1,"Неверно", Toast.LENGTH_SHORT).show()
        val intent= Intent(this, Activity2::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
    }


}
