package com.example.easytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LaunchScreen : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 4000L // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)

        Handler().postDelayed({
            val intent = Intent(this@LaunchScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)
    }
}