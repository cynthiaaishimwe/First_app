package com.example.first_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var p1btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        p1btn = findViewById(R.id.p1btn)
        p1btn.setOnClickListener {
            val intent = Intent(this, Page2::class.java)
            startActivity(intent)
        }
    }
}