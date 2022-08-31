package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //       button with intent

        val btn = findViewById<TextView>(R.id.Back_intent)

        btn.setOnClickListener {
            val try_intent = Intent(this, SplashActivity::class.java )
            startActivity(try_intent)
        }
    }
}