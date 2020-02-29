package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Activity4 : AppCompatActivity() {

    var score=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val intent= this.intent
        score= intent.getIntExtra("score", 0)
    }

    fun next4(view: View) {

        val intent= Intent(this, Activity5::class.java)
        score=score+1
        intent.putExtra("score", score)
        startActivity(intent)
    }

    fun incorrect4(view: View) {
        score=score
        Toast.makeText(this@Activity4,"Неверно", Toast.LENGTH_SHORT).show()
        val intent= Intent(this, Activity5::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
    }
}
