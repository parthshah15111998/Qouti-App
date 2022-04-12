package com.example.qoutiapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.qoutiapp.databinding.ActivitySplashBinding


class splashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPreferences = getSharedPreferences("pref", 0)
        val countryCode = sharedPreferences.getString("countryCode", "")
        val mobileNumber = sharedPreferences.getString("mobileNumber", "")

        Handler().postDelayed({
            if (countryCode.equals("") && mobileNumber.equals("")) {
                startActivity(Intent(this, LoginSignUpActivity::class.java))

            } else {
                startActivity(Intent(this, BrowserActivity::class.java))
            }
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }, 3000)

    }
}