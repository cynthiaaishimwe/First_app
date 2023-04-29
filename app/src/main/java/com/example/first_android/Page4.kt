package com.example.first_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4 : AppCompatActivity() {
    lateinit var button4:Button
    lateinit var button4b: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        button4 = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            startActivity(intent)
        }

        button4b = findViewById(R.id.button4b)
        button4b.setOnClickListener {
            val intent = Intent(this, Page3::class.java)
            startActivity(intent)
        }
    }
}