package com.example.qoutiapp

import android.content.Intent
import android.hardware.lights.Light
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.qoutiapp.databinding.ActivitySplashBinding


class splashActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.to_right)
        binding.SplashScreenImage.startAnimation(slideAnimation)
        
        Handler().postDelayed({
            val intent = Intent(this, LoginSignUpActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}