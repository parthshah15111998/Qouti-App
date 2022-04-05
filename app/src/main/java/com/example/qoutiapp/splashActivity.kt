package com.example.qoutiapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.qoutiapp.databinding.ActivitySplashBinding


class splashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    lateinit var sharedPreferences: SharedPreferences
    private val SPLASH_TIME_OUT = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPreferences = getSharedPreferences("pref", 0)
        val countryCode =  sharedPreferences.getString("countryCode", "")
        val mobileNumber =  sharedPreferences.getString("mobileNumber", "")


        if (countryCode.equals("") && mobileNumber.equals("")){
            Handler().postDelayed({
                val intent = Intent(this, LoginSignUpActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
            }, 2000)
        }else{
            Handler().postDelayed({
                val intent = Intent(this, BrowserActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
            }, 2000)
        }



    }
}