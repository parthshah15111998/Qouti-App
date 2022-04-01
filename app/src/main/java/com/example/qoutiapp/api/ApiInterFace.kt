package com.example.qoutiapp.api

import com.example.qoutiapp.modelclass.LoginRequest
import com.example.qoutiapp.modelclass.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterFace {

    @POST("login")
    fun createPost(@Body modelClass: LoginRequest.Data): Call<LoginResponse?>?
}