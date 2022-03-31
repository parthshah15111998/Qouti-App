package com.example.qoutiapp.fragment

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.qoutiapp.R
import com.example.qoutiapp.api.ApiInterFace
import com.example.qoutiapp.api.ApiRetrofitHelper
import com.example.qoutiapp.databinding.FragmentLoginBinding
import com.example.qoutiapp.modelclass.Login
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        val ss = SpannableString("New user? Register")
        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_loginFragment_to_signUpFragment)
            }
        }
        ss.setSpan(clickableSpan, 10, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(StyleSpan(Typeface.BOLD_ITALIC), 10, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvRegister.text = ss
        binding.tvRegister.movementMethod = LinkMovementMethod.getInstance()
        binding.tvRegister.highlightColor = Color.TRANSPARENT

        binding.btnLogin.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_loginFragment_to_browserFragment2)

        }


        return binding.root
    }

    private fun LoginApi(country_code:String,user_mobile:String,password:String) {
        val apiInterFace=ApiRetrofitHelper.retrofit.create(ApiInterFace::class.java)

        val call:Call<Login.Data?>?=apiInterFace.createPost(Login.Data(country_code,user_mobile,password))

        call!!.enqueue(object : Callback<Login.Data?> {
            override fun onResponse(call: Call<Login.Data?>, response: Response<Login.Data?>) {
                val responseFromApi:Login.Data=response.body()!!

                if (response.isSuccessful){
                    val responseString = """
              ${response.code()}
              ${responseFromApi.country_code}
             ${responseFromApi.user_mobile}
              ${responseFromApi.password}
             """.trimIndent()

                Toast.makeText(context, responseString.toString(), Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(context, "message", Toast.LENGTH_SHORT).show()
                }

            }

            override fun onFailure(call: Call<Login.Data?>, t: Throwable) {
                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
            }
        })

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                getActivity()?.finish ()
            }
        })
    }

}