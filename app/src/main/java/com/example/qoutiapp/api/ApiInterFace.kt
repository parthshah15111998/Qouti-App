package com.example.qoutiapp.api

import com.example.qoutiapp.modelclass.Login
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterFace {

    @POST("/login")
    fun createPost(@Body modelClass: Login.Data?): Call<Login.Data?>?
}