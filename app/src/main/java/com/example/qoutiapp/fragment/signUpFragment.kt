package com.example.qoutiapp.fragment

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qoutiapp.R
import com.example.qoutiapp.databinding.ActivitySignupBinding
import com.example.qoutiapp.databinding.FragmentSignUpBinding

class signUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSignUpBinding.inflate(inflater,container,false)
        val spannable = SpannableString("By clicking on sign up button, you agree to our Terms Conditions & Privacy Policy")
        val spannable2= SpannableString("Existing user? Login")
        spannable.setSpan(
            UnderlineSpan(),
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
        spannable.setSpan(
            UnderlineSpan(),
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
        spannable2.setSpan(
            UnderlineSpan(),
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
        return binding.root
    }
}