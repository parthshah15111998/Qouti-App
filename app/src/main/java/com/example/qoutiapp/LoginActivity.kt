package com.example.qoutiapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import com.example.qoutiapp.databinding.ActivityLoginemailBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginemailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginemailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvRegister.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }




        val spannable = SpannableString("New user? Register")
        spannable.setSpan(
            UnderlineSpan(),
            10, // start
            17, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            StyleSpan(Typeface.BOLD_ITALIC),
            10, // start
            17, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        binding.tvRegister.text = spannable
    }
}