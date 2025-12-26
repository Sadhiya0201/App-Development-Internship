package com.example.apexplanet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnContinue: Button = findViewById(R.id.btnContinue)
        btnContinue.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}