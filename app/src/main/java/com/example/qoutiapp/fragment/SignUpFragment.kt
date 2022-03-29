package com.example.qoutiapp.fragment

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.qoutiapp.R
import com.example.qoutiapp.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSignUpBinding.inflate(inflater,container,false)

        binding.imgBtnArrow.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        val tv_login = SpannableString("Existing user? Login")
        val tv_loginclickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_signUpFragment_to_loginFragment)
            }
        }
        tv_login.setSpan(tv_loginclickableSpan, 15, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_login.setSpan(StyleSpan(Typeface.BOLD_ITALIC), 15, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvLogin.text = tv_login
        binding.tvLogin.movementMethod = LinkMovementMethod.getInstance()
        binding.tvLogin.highlightColor = Color.TRANSPARENT


        val tv_privice = SpannableString("By clicking on sign up button, you agree to our Terms Conditions & Privacy Policy")
        val tv_priviceclickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                Toast.makeText(context, "Terms Conditions & Privacy Policy.", Toast.LENGTH_SHORT).show();
            }
        }
        tv_privice.setSpan(tv_priviceclickableSpan, 48, 65, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_privice.setSpan(StyleSpan(Typeface.BOLD_ITALIC), 48, 65, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val tv_priviceclickableSpan2: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                Toast.makeText(context, "Terms Conditions & Privacy Policy.", Toast.LENGTH_SHORT).show();
            }
        }
        tv_privice.setSpan(tv_priviceclickableSpan2, 67, 81, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_privice.setSpan(StyleSpan(Typeface.BOLD_ITALIC), 67, 81, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)


        binding.tvTermCondition.text = tv_privice
        binding.tvTermCondition.movementMethod = LinkMovementMethod.getInstance()
        binding.tvTermCondition.highlightColor = Color.TRANSPARENT




        return binding.root
    }
}