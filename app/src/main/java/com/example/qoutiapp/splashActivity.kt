package com.example.qoutiapp

import android.content.Intent
import android.hardware.lights.Light
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat


class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        
        Handler().postDelayed({
            val intent = Intent(this, LoginSignUpActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}