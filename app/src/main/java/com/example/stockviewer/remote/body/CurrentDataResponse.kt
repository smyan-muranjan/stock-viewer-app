package com.example.stockviewer.remote.body

import com.google.gson.annotations.SerializedName

data class CurrentDataResponse(
    @SerializedName("Global Quote")
    val currentData: CurrentData
)