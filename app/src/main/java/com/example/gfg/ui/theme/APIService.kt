package com.example.gfg.ui.theme

import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): GetProducts
}
