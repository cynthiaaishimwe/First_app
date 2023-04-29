package com.example.first_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    lateinit var p3buttonPage2: Button
    lateinit var p3button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        p3buttonPage2= findViewById(R.id.p3button2)
        p3buttonPage2.setOnClickListener {
            val intent = Intent(this, Page4::class.java)
            startActivity(intent)

        }

        p3buttonPage2 = findViewById(R.id.p3button3)
        p3buttonPage2.setOnClickListener {
            val intent = Intent(this, Page2::class.java)
            startActivity(intent)
        }

    }
}