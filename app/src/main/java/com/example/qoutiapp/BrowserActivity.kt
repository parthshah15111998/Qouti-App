package com.example.qoutiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qoutiapp.databinding.ActivityBrowserBinding

class BrowserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrowserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}