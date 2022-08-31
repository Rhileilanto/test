package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       button with intent

         val btn = findViewById<Button>(R.id.button_intent)

        btn.setOnClickListener {
            val try_intent = Intent(this, HomeActivity::class.java )
            startActivity(try_intent)
        }
    }
}