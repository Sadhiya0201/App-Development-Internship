package com.example.advancedfeaturesapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        val tvUserEmail = findViewById<TextView>(R.id.tvUserEmail)
        val btnViewProfile = findViewById<Button>(R.id.btnViewProfile)
        val btnNotifications = findViewById<Button>(R.id.btnNotifications)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        tvUserEmail.text = auth.currentUser?.email ?: "Unknown User"

        btnViewProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        btnNotifications.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        }

        btnLogout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, AuthActivity::class.java))
            finish()
        }
    }
}