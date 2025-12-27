package com.example.advancedfeaturesapp2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val userEmail = FirebaseAuth.getInstance().currentUser?.email
        val tvProfileEmail = findViewById<TextView>(R.id.tvProfileEmail)
        tvProfileEmail.text = "Email: $userEmail"
    }
}