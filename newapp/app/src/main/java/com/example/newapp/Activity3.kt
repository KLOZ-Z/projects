package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Activity3 : AppCompatActivity() {

    var score=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent= this.intent
        score= intent.getIntExtra("score", 0)
        setContentView(R.layout.activity_3)
    }

    fun next3(view: View) {

        val intent= Intent(this, Activity4::class.java)
        score=score+1
        intent.putExtra("score", score)
        startActivity(intent)
    }

    fun incorrect3(view: View) {
        score=score
        Toast.makeText(this@Activity3,"Неверно", Toast.LENGTH_SHORT).show()
        val intent= Intent(this, Activity4::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
    }
}
