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
import androidx.navigation.fragment.findNavController
import com.example.qoutiapp.R
import com.example.qoutiapp.databinding.ActivityLoginemailBinding
import com.example.qoutiapp.databinding.FragmentLoginEmailBinding


class loginEmailFragment : Fragment() {
    private lateinit var binding: FragmentLoginEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentLoginEmailBinding.inflate(inflater,container,false)
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

        binding.tvRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginEmailFragment_to_signUpFragment2)
        }

        return binding.root
    }

}