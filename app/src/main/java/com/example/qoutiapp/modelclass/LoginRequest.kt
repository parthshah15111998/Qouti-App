package com.example.qoutiapp.modelclass

data class LoginRequest(
    val `data`: Data
) {
    data class Data(
        val country_code: String,
        val password: String,
        val user_mobile: String
    )
}