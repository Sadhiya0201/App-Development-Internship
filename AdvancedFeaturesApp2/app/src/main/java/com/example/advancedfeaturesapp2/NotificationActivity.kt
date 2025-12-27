package com.example.advancedfeaturesapp2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "🎉 No new notifications!"
        tv.textSize = 20f
        tv.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        setContentView(tv)
    }
}