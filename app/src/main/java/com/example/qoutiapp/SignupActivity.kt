package com.example.qoutiapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import com.example.qoutiapp.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spannable = SpannableString("By clicking on sign up button, you agree to our Terms Conditions & Privacy Policy")
        val spannable2= SpannableString("Existing user? Login")
        spannable.setSpan(UnderlineSpan(),
            48, // start
            64, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            StyleSpan(Typeface.BOLD_ITALIC),
            48, // start
            64, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(UnderlineSpan(),
            67, // start
            80, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            StyleSpan(Typeface.BOLD_ITALIC),
            67, // start
            80, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        spannable2.setSpan(UnderlineSpan(),
            15, // start
            20, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        spannable2.setSpan(
            StyleSpan(Typeface.BOLD_ITALIC),
            15, // start
            20, // end
            Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        )
        binding.tvTermCondition.text = spannable
        binding.tvLogin.text=spannable2
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, BrowserActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}