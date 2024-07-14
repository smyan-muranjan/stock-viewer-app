package com.example.stockviewer.remote.retrofit

import com.example.stockviewer.remote.body.CurrentDataResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Endpoint {
    @GET(CURRENT_DATA)
    suspend fun getCurrentData(@Query("symbol") symbol: String): Response<CurrentDataResponse>
}