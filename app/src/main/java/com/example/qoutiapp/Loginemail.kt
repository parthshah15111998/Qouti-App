package com.example.qoutiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Loginemail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginemail)

        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
        finish()
    }
}