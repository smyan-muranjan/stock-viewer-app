package com.example.stockviewer.remote.retrofit

internal const val API_KEY = "11FAEEIWQ3T7LB1O"
internal const val BASE_URL = "https://www.alphavantage.co/https://www.alphavantage.co/"
internal const val CURRENT_DATA = "query?function=GLOBAL_QUOTE&apikey=${API_KEY}"
internal const val DAILY_DATA = "query?function=TIME_SERIES_DAILY&apikey=${API_KEY}"
internal const val WEEKLY_DATA = "query?function=TIME_SERIES_WEEKLY&apikey=${API_KEY}"
internal const val MONTHLY_DATA = "query?function=TIME_SERIES_MONTHLY&apikey=${API_KEY}"
