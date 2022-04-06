package com.example.qoutiapp.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
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
import com.example.qoutiapp.BrowserActivity
import com.example.qoutiapp.LoginSignUpActivity
import com.example.qoutiapp.R
import com.example.qoutiapp.api.ApiInterFace
import com.example.qoutiapp.api.ApiRetrofitHelper
import com.example.qoutiapp.databinding.FragmentLoginBinding
import com.example.qoutiapp.modelclass.LoginRequest
import com.example.qoutiapp.modelclass.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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

            if (binding.etPhoneNumber.editText?.text?.isEmpty()!! &&
                binding.etPassword.editText?.text?.isEmpty()!!
            ) {
                Toast.makeText(context, "Please enter both the values", Toast.LENGTH_SHORT).show()
            } else {
                binding.progressBar.visibility=View.VISIBLE
                LoginApi(
                    binding.etPhoneNumber.prefixText.toString(),
                    binding.etPhoneNumber.editText?.text.toString(),
                    binding.etPassword.editText?.text.toString()
                )
            }//9638134029","password": "Letsdoit@123
        }
        return binding.root
    }

    private fun LoginApi(country_code: String, user_mobile: String, password: String) {

        val apiInterFace = ApiRetrofitHelper.retrofit.create(ApiInterFace::class.java)

        val call: Call<LoginResponse?>? = apiInterFace.createPost(
            LoginRequest(
                LoginRequest.Data(
                    country_code, user_mobile, password
                )
            )
        )

        call!!.enqueue(object : Callback<LoginResponse?> {
            @SuppressLint("CommitPrefEdits")
            override fun onResponse(
                call: Call<LoginResponse?>,
                response: Response<LoginResponse?>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    val responseFromApi = response.body()!!
                    binding.progressBar.visibility=View.GONE
                    if (responseFromApi.status == 1) {
                        val editor: SharedPreferences.Editor = sharedPreferences.edit()
                        editor.putString("countryCode", responseFromApi.data.country_code)
                        editor.putString("mobileNumber", responseFromApi.data.user_mobile)
                        editor.apply()
                        val intent = Intent(activity, BrowserActivity::class.java)
                        startActivity(intent)
                        activity?.finish()
                        Toast.makeText(context, responseFromApi.message, Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(context, "Unsuccessful message", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {
                Toast.makeText(context, "Wrong Password And MobileNumber", Toast.LENGTH_SHORT).show()
            }
        })

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                getActivity()?.finish()
            }
        })
    }

}