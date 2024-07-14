package com.example.stockviewer.remote

import com.example.stockviewer.remote.retrofit.BASE_URL
import com.example.stockviewer.remote.retrofit.Endpoint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

object ApiClient {
    val apiService: Endpoint by lazy {
            RetrofitClient.retrofit.create(Endpoint::class.java)
    }
}