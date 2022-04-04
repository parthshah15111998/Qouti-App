package com.example.qoutiapp.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRetrofitHelper {

    companion object{
        val BASE_URL = "http://159.89.167.87/qouti/api/"

       val interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
           level = HttpLoggingInterceptor.Level.BODY
       }

        val client : OkHttpClient = OkHttpClient.Builder().apply {
            addInterceptor(interceptor)
        }.build()


        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    }


}