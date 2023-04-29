package com.example.first_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    lateinit var p2nextpage:Button
    lateinit var p2previouspage:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        p2nextpage=findViewById(R.id.p2nextpage)
        p2nextpage.setOnClickListener {
            val intent = Intent(this, Page3::class.java)
            startActivity(intent)

        }

        p2previouspage = findViewById(R.id.p2previouspage)
        p2previouspage.setOnClickListener {
            val intent = Intent (this, MainActivity ::class.java)
            startActivity(intent)
        }
    }

}
