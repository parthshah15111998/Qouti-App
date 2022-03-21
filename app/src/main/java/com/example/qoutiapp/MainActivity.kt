package com.example.qoutiapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.qoutiapp.databinding.ActivityMainBinding
import com.example.qoutiapp.fragment.loginEmailFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = loginEmailFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()



    }
}

